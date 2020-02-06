export function makeComment({
	text,
	indent = '',
}: {
	text: string
	indent?: string
}) {
	return text
		? `${indent}/**\n${text
				.replace(/\*\//g, '* /')
				.replace(/^/gm, `${indent} * `)}\n${indent} */`
		: ''
}
