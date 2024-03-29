import { IGeneratorResult, IInterface } from 'jsoncodegen-types-for-generator'
import { reservedKeywords } from '../reservedKeywords.js'
import { interfaceTemplate } from '../template/interfaceTemplate.js'
import { capitalize } from './capitalize.js'
import { getBuilderGenerics } from './getBuilderGenerics.js'
import { getType } from './getType.js'
import { indent } from './indent.js'
import { join } from './join.js'
import { joinWith } from './joinWith.js'
import { makeComment } from './makeComment.js'
import { makeFilePath } from './makeFilePath.js'
import { makePackageName } from './makePackageName.js'

export async function generateInterface({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: IInterface
}): Promise<IGeneratorResult[]> {
	const result: IGeneratorResult[] = []
	const { fields, directoryPath, name, description } = info
	const fieldDeclarations = fields
		.map((field) => {
			if (reservedKeywords.has(field.name)) {
				throw new Error(
					`[q161tl] Reserved keyword cannot be used as identifier in Java: ${
						field.name
					} (in ${[...directoryPath, name].join('/')})`,
				)
			}
			const declaration = `\tprivate ${getType(
				rootPackageName,
				field.fieldType,
			)} ${field.name}${
				(field.fieldType.kind === 'NumberEnumValueReference' ||
					field.fieldType.kind === 'StringEnumValueReference') &&
				!field.fieldType.isNullable
					? ` = ${makePackageName(
							rootPackageName,
							field.fieldType.absoluteDirectoryPath,
					  )}.${field.fieldType.name}.${field.fieldType.valueName}`
					: ``
			};`
			return declaration
		})
		.join(`\n`)
	const nonFinalFields = fields.filter(
		(field) =>
			!(
				field.fieldType.kind === 'NumberEnumValueReference' ||
				field.fieldType.kind === 'StringEnumValueReference'
			) || field.fieldType.isNullable,
	)
	const requiredFields = nonFinalFields.filter(
		(field) => !field.fieldType.isNullable,
	)
	const hashAppends = nonFinalFields
		.map(({ name }) => `\t\t\t.append(this.${name})`)
		.join(`\n`)
	const equalsAppends = nonFinalFields
		.map(({ name }) => `\t\t\t.append(this.${name}, rhs.${name})`)
		.join(`\n`)
	const toStringAppends = nonFinalFields
		.map(({ name }) => `\t\t\t.append(${JSON.stringify(name)}, this.${name})`)
		.join(`\n`)
	const builderGenericsAllOk = requiredFields.length
		? `<\n${requiredFields
				.map(() => `\t\t\t${name}.__OK__`)
				.join(`,\n`)}\n\t\t\t>`
		: ''
	const validations = requiredFields
		.map(
			({ name }) =>
				`\t\tValidate.notNull(builder.${name}, "Argument '${name}' must not be null.");`,
		)
		.join(`\n`)
	const copyValuesFromBuilder = nonFinalFields
		.map(({ name }) => `\t\tthis.${name} = builder.${name};`)
		.join(`\n`)
	const jacksonHelperProperties = nonFinalFields
		.map(
			(field) =>
				`\t\t\t@JsonProperty("${field.name}") ${getType(
					rootPackageName,
					field.fieldType,
				)} ${field.name}`,
		)
		.join(`,\n`)
	const builderWithCalls = nonFinalFields
		.map(({ name }) => `\t\t\t\t.with${capitalize(name)}(${name})`)
		.join(`\n`)
	const cloneWithCalls = nonFinalFields
		.map(({ name }) => `\t\t\t\t.with${capitalize(name)}(this.${name})`)
		.join(`\n`)
	const missingClasses = requiredFields
		.map(({ name }) => `\tprivate static final class __MISSING_${name}__ {}`)
		.join(`\n`)
	const builderGenerics = getBuilderGenerics({
		interfaceName: name,
		requiredFields,
	})
	const gettersAndSetters = fields
		.map((field) => {
			return joinWith(`\n\n`)(
				indent(
					joinWith(`\n`)(
						makeComment({
							text: field.description,
						}),
						join(
							`public `,
							getType(rootPackageName, field.fieldType),
							` get${capitalize(field.name)}() {`,
						),
						indent(`return this.${field.name};`),
						`}`,
					),
				),
				indent(
					joinWith(`\n`)(
						makeComment({
							text: field.description,
						}),
						join(
							`public void set`,
							capitalize(field.name),
							`(`,
							getType(rootPackageName, field.fieldType),
							` value) {`,
						),
						indent(
							joinWith(`\n`)(
								!field.fieldType.isNullable &&
									`Validate.notNull(value, "Argument 'value' must not be null.");`,
								`this.${field.name} = value;`,
							),
						),
						`}`,
					),
				),
			)
		})
		.join(`\n\n`)
	const builderFields = nonFinalFields
		.map(
			(field) =>
				`\t\tprivate ${getType(rootPackageName, field.fieldType)} ${
					field.name
				};`,
		)
		.join(`\n`)
	const builderGenericsAllMissing = getBuilderGenerics({
		requiredFields,
		interfaceName: name,
		prefix: 'MISSING',
	})
	const builderWithMethods = nonFinalFields
		.map((field) => {
			const comment = makeComment({
				text: field.description,
				indent: '\t\t',
			})
			const builderGenerics = getBuilderGenerics({
				interfaceName: name,
				requiredFields,
				okFieldName: field.name,
			})
			const declaration = `\t\t@SuppressWarnings("unchecked")\n\t\tpublic Builder${builderGenerics} with${capitalize(
				field.name,
			)}(${getType(rootPackageName, field.fieldType)} value) {\n\t\t\tthis.${
				field.name
			} = value;\n\t\t\treturn (Builder${builderGenerics}) this;\n\t\t}`
			return [comment, declaration].filter(Boolean).join(`\n`)
		})
		.join(`\n\n`)
	result.push({
		filePath: makeFilePath(directoryPath, name),
		content: interfaceTemplate({
			packageName: makePackageName(rootPackageName, directoryPath),
			comment: makeComment({
				text: description,
			}),
			interfaceName: name,
			fieldDeclarations,
			hashAppends,
			equalsAppends,
			toStringAppends,
			builderGenericsAllOk,
			validations,
			copyValuesFromBuilder,
			jacksonHelperProperties,
			builderWithCalls,
			missingClasses,
			builderGenerics,
			gettersAndSetters,
			builderFields,
			builderGenericsAllMissing,
			builderWithMethods,
			cloneWithCalls,
		}),
	})
	return result
}
