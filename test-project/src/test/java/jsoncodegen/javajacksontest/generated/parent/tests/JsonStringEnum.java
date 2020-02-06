package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonValue;
/**
 * This is a string enum.
 */
public enum JsonStringEnum {
	Name("Value"),
	/**
	 * This is a value.
	 */
	NameWithDescription("ValueWithDescription"),
	NameOfEmptyValue(""),
	;
	private final String value;

	private JsonStringEnum(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}
}