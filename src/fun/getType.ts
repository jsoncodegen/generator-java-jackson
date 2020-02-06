import { TFieldType } from 'jsoncodegen-types-for-generator'
import { makePackageName } from './makePackageName'

export function getType(
	rootPackageName: string[],
	fieldType: TFieldType,
): string {
	switch (fieldType.kind) {
		case 'PrimitiveValue':
			switch (fieldType.name) {
				case 'boolean':
					return 'Boolean'
				case 'number':
					return 'Double'
				case 'string':
					return 'String'
				default:
					throw new Error(
						`[q15wo3] Unknown primitive value: ${fieldType.name}`,
					)
			}
		case 'InterfaceReference':
		case 'NumberEnumReference':
		case 'StringEnumReference':
		case 'NumberEnumValueReference':
		case 'StringEnumValueReference':
			return (
				makePackageName(
					rootPackageName,
					fieldType.absoluteDirectoryPath,
				) +
				'.' +
				fieldType.name
			)
		case 'Array':
			return `java.util.List<${getType(
				rootPackageName,
				fieldType.fieldType,
			)}>`
		case 'Map':
			return `java.util.Map<String, ${getType(
				rootPackageName,
				fieldType.fieldType,
			)}>`
		default:
			throw new Error(
				`[q56d3n] Unknown type: ${(fieldType as TFieldType).kind}`,
			)
	}
}
