import { IGeneratorResult, INumberEnum } from 'jsoncodegen-types-for-generator'
import { numberEnumTemplate } from '../template/numberEnumTemplate.js'
import { makeComment } from './makeComment.js'
import { makeFilePath } from './makeFilePath.js'
import { makePackageName } from './makePackageName.js'

export async function generateNumberEnum({
	rootPackageName,
	info,
}: {
	rootPackageName: string[]
	info: INumberEnum
}): Promise<IGeneratorResult[]> {
	const result: IGeneratorResult[] = []
	const { values, directoryPath, name, description } = info
	const valuesString = values
		.map((value) => {
			const comment = makeComment({
				text: value.description,
				indent: '\t',
			})
			const declaration = `\t${value.name}(${value.value}d),`
			return [comment, declaration].filter(Boolean).join(`\n`)
		})
		.join('\n')
	result.push({
		filePath: makeFilePath(directoryPath, name),
		content: numberEnumTemplate({
			packageName: makePackageName(rootPackageName, directoryPath),
			comment: makeComment({ text: description }),
			enumName: name,
			values: valuesString,
		}),
	})
	return result
}
