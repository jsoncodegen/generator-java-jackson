export function stringEnumTemplate({
	packageName,
	comment,
	enumName,
	values,
}: {
	packageName: string
	comment: string
	enumName: string
	values: string
}) {
	return `package ${packageName};

import com.fasterxml.jackson.annotation.JsonValue;
${comment}
public enum ${enumName} {
${values}
	;
	private final String value;

	private ${enumName}(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}
}`
}
