import { IGenerator, IGeneratorResult } from 'jsoncodegen-types-for-generator'
import { generateInterface } from './fun/generateInterface.js'
import { generateNumberEnum } from './fun/generateNumberEnum.js'
import { generateStringEnum } from './fun/generateStringEnum.js'

export interface IConfig {
	package?: string
}

export const generator: IGenerator = {
	async generate(config: IConfig, namedTypesById) {
		const rootPackageName =
			config.package != null ? config.package.split('.') : []
		let result: IGeneratorResult[] = []
		for (const namedType of namedTypesById.values()) {
			switch (namedType.kind) {
				case 'Interface':
					result = [
						...result,
						...(await generateInterface({
							rootPackageName,
							info: namedType,
						})),
					]
					break
				case 'NumberEnum':
					result = [
						...result,
						...(await generateNumberEnum({
							rootPackageName,
							info: namedType,
						})),
					]
					break
				case 'StringEnum':
					result = [
						...result,
						...(await generateStringEnum({
							rootPackageName,
							info: namedType,
						})),
					]
					break
			}
		}
		return result
	},
}
