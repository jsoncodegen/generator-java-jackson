import { reservedKeywords } from '../reservedKeywords'

export function makePackageName(rootPackageName: string[], dir: string[]) {
	const path = [...rootPackageName, ...dir].filter(Boolean)
	const result = path.join('.')
	for (const elem of path) {
		if (reservedKeywords.has(elem)) {
			throw new Error(
				`[q161m4] Reserved keyword cannot be used as identifier in Java: ${elem} (in package name ${result})`,
			)
		}
	}
	return result
}
