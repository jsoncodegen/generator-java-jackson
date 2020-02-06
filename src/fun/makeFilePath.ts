export function makeFilePath(dir: string[], name: string) {
	return [...dir, name + '.java']
}
