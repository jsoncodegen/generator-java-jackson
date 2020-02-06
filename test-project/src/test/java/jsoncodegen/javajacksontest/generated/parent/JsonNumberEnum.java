package jsoncodegen.javajacksontest.generated.parent;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * This is a number enum.
 */
public enum JsonNumberEnum {
	Name(0d),
	/**
	 * This is a value.
	 */
	NameWithDescription(1d),
	NameOfFractionValue(3.14d),
	;

	private final double value;

	private final static Map<Double, JsonNumberEnum> enumsByValues = new HashMap<Double, JsonNumberEnum>();
	static {
		for (JsonNumberEnum e : values()) {
			enumsByValues.put(e.value, e);
		}
	}

	private JsonNumberEnum(double value) {
		this.value = value;
	}

	@JsonValue
	public double getValue() {
		return this.value;
	}

	@JsonCreator
	public static JsonNumberEnum fromValue(double value) {
		JsonNumberEnum e = enumsByValues.get(value);
		if (e == null) {
			throw new IllegalArgumentException(value + "");
		} else {
			return e;
		}
	}
}
