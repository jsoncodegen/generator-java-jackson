import { IInterfaceField } from 'jsoncodegen-types-for-generator'

export function getBuilderGenerics({
	interfaceName,
	requiredFields,
	okFieldName,
	indent = '\t\t\t\t',
	prefix = 'HAS',
}: {
	interfaceName: string
	requiredFields: IInterfaceField[]
	okFieldName?: string
	indent?: string
	prefix?: string
}) {
	return requiredFields.length
		? `<\n${requiredFields
				.map(({ name }) =>
					name === okFieldName
						? `${indent}${interfaceName}.__OK__`
						: `${indent}__${prefix}_${name}__`,
				)
				.join(`,\n`)}\n${indent}>`
		: ''
}
