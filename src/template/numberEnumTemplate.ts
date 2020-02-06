export function numberEnumTemplate({
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

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
${comment}
public enum ${enumName} {
${values}
	;

	private final double value;

	private final static Map<Double, ${enumName}> enumsByValues = new HashMap<Double, ${enumName}>();
	static {
		for (${enumName} e : values()) {
			enumsByValues.put(e.value, e);
		}
	}

	private ${enumName}(double value) {
		this.value = value;
	}

	@JsonValue
	public double getValue() {
		return this.value;
	}

	@JsonCreator
	public static ${enumName} fromValue(double value) {
		${enumName} e = enumsByValues.get(value);
		if (e == null) {
			throw new IllegalArgumentException(value + "");
		} else {
			return e;
		}
	}
}
`
}
