import { IGeneratorResult, IStringEnum } from 'jsoncodegen-types-for-generator'
import { stringEnumTemplate } from '../template/stringEnumTemplate.js'
import { makeComment } from './makeComment.js'
import { makeFilePath } from './makeFilePath.js'
import { makePackageName } from './makePackageName.js'

export async function generateStringEnum({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: IStringEnum
}): Promise<IGeneratorResult[]> {
	const result: IGeneratorResult[] = []
	const { values, directoryPath, name, description } = info
	const valuesString = values
		.map((value) => {
			const comment = makeComment({
				text: value.description,
				indent: '\t',
			})
			const declaration = `\t${value.name}(${JSON.stringify(value.value)}),`
			return [comment, declaration].filter(Boolean).join(`\n`)
		})
		.join('\n')
	result.push({
		filePath: makeFilePath(directoryPath, name),
		content: stringEnumTemplate({
			packageName: makePackageName(rootPackageName, directoryPath),
			comment: makeComment({ text: description }),
			enumName: name,
			values: valuesString,
		}),
	})
	return result
}
