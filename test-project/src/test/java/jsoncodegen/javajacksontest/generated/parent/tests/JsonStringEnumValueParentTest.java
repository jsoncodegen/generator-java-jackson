package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests string enum value fields.
 */
public final class JsonStringEnumValueParentTest {

	private final jsoncodegen.javajacksontest.generated.parent.JsonStringEnum enumValue = jsoncodegen.javajacksontest.generated.parent.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.JsonStringEnum enumValueWithDescription = jsoncodegen.javajacksontest.generated.parent.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.JsonStringEnum enumValueOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValues;
	private final java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfArraysOfEnumValues;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNulls;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValues;
	private final java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfMapsOfEnumValues;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValues;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValuesOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValuesOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

	public JsonStringEnumValueParentTest(Builder<
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__,
			JsonStringEnumValueParentTest.__OK__
			> builder) {
		Validate.notNull(builder.arrayOfEnumValues, "Argument 'arrayOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfEnumValues, "Argument 'arrayOfArraysOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfEnumValuesAndNulls, "Argument 'arrayOfEnumValuesAndNulls' must not be null.");
		Validate.notNull(builder.mapOfEnumValues, "Argument 'mapOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfMapsOfEnumValues, "Argument 'mapOfMapsOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfNullsAndEnumValues, "Argument 'mapOfNullsAndEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfEnumValues, "Argument 'arrayOfMapsOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfEnumValues, "Argument 'arrayOfNullsAndMapsOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndEnumValues, "Argument 'arrayOfMapsOfNullsAndEnumValues' must not be null.");
		Validate.notNull(builder.mapOfArraysOfEnumValues, "Argument 'mapOfArraysOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfEnumValues, "Argument 'mapOfNullsAndArraysOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndEnumValues, "Argument 'mapOfArraysOfNullsAndEnumValues' must not be null.");
		this.enumValueOrNull = builder.enumValueOrNull;
		this.arrayOfEnumValues = builder.arrayOfEnumValues;
		this.arrayOfArraysOfEnumValues = builder.arrayOfArraysOfEnumValues;
		this.arrayOfEnumValuesAndNulls = builder.arrayOfEnumValuesAndNulls;
		this.arrayOfEnumValuesOrNull = builder.arrayOfEnumValuesOrNull;
		this.arrayOfEnumValuesAndNullsOrNull = builder.arrayOfEnumValuesAndNullsOrNull;
		this.mapOfEnumValues = builder.mapOfEnumValues;
		this.mapOfMapsOfEnumValues = builder.mapOfMapsOfEnumValues;
		this.mapOfNullsAndEnumValues = builder.mapOfNullsAndEnumValues;
		this.mapOfEnumValuesOrNull = builder.mapOfEnumValuesOrNull;
		this.mapOfNullsAndEnumValuesOrNull = builder.mapOfNullsAndEnumValuesOrNull;
		this.arrayOfMapsOfEnumValues = builder.arrayOfMapsOfEnumValues;
		this.arrayOfMapsOfEnumValuesOrNull = builder.arrayOfMapsOfEnumValuesOrNull;
		this.arrayOfNullsAndMapsOfEnumValues = builder.arrayOfNullsAndMapsOfEnumValues;
		this.arrayOfMapsOfNullsAndEnumValues = builder.arrayOfMapsOfNullsAndEnumValues;
		this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull = builder.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
		this.mapOfArraysOfEnumValues = builder.mapOfArraysOfEnumValues;
		this.mapOfArraysOfEnumValuesOrNull = builder.mapOfArraysOfEnumValuesOrNull;
		this.mapOfNullsAndArraysOfEnumValues = builder.mapOfNullsAndArraysOfEnumValues;
		this.mapOfArraysOfNullsAndEnumValues = builder.mapOfArraysOfNullsAndEnumValues;
		this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull = builder.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.enumValueOrNull)
			.append(this.arrayOfEnumValues)
			.append(this.arrayOfArraysOfEnumValues)
			.append(this.arrayOfEnumValuesAndNulls)
			.append(this.arrayOfEnumValuesOrNull)
			.append(this.arrayOfEnumValuesAndNullsOrNull)
			.append(this.mapOfEnumValues)
			.append(this.mapOfMapsOfEnumValues)
			.append(this.mapOfNullsAndEnumValues)
			.append(this.mapOfEnumValuesOrNull)
			.append(this.mapOfNullsAndEnumValuesOrNull)
			.append(this.arrayOfMapsOfEnumValues)
			.append(this.arrayOfMapsOfEnumValuesOrNull)
			.append(this.arrayOfNullsAndMapsOfEnumValues)
			.append(this.arrayOfMapsOfNullsAndEnumValues)
			.append(this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull)
			.append(this.mapOfArraysOfEnumValues)
			.append(this.mapOfArraysOfEnumValuesOrNull)
			.append(this.mapOfNullsAndArraysOfEnumValues)
			.append(this.mapOfArraysOfNullsAndEnumValues)
			.append(this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull)
			.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (other == this) {
			return true;
		}
		if (other.getClass() != getClass()) {
			return false;
		}
		JsonStringEnumValueParentTest rhs = (JsonStringEnumValueParentTest) other;
		return new EqualsBuilder()
			.append(this.enumValueOrNull, rhs.enumValueOrNull)
			.append(this.arrayOfEnumValues, rhs.arrayOfEnumValues)
			.append(this.arrayOfArraysOfEnumValues, rhs.arrayOfArraysOfEnumValues)
			.append(this.arrayOfEnumValuesAndNulls, rhs.arrayOfEnumValuesAndNulls)
			.append(this.arrayOfEnumValuesOrNull, rhs.arrayOfEnumValuesOrNull)
			.append(this.arrayOfEnumValuesAndNullsOrNull, rhs.arrayOfEnumValuesAndNullsOrNull)
			.append(this.mapOfEnumValues, rhs.mapOfEnumValues)
			.append(this.mapOfMapsOfEnumValues, rhs.mapOfMapsOfEnumValues)
			.append(this.mapOfNullsAndEnumValues, rhs.mapOfNullsAndEnumValues)
			.append(this.mapOfEnumValuesOrNull, rhs.mapOfEnumValuesOrNull)
			.append(this.mapOfNullsAndEnumValuesOrNull, rhs.mapOfNullsAndEnumValuesOrNull)
			.append(this.arrayOfMapsOfEnumValues, rhs.arrayOfMapsOfEnumValues)
			.append(this.arrayOfMapsOfEnumValuesOrNull, rhs.arrayOfMapsOfEnumValuesOrNull)
			.append(this.arrayOfNullsAndMapsOfEnumValues, rhs.arrayOfNullsAndMapsOfEnumValues)
			.append(this.arrayOfMapsOfNullsAndEnumValues, rhs.arrayOfMapsOfNullsAndEnumValues)
			.append(this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull, rhs.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull)
			.append(this.mapOfArraysOfEnumValues, rhs.mapOfArraysOfEnumValues)
			.append(this.mapOfArraysOfEnumValuesOrNull, rhs.mapOfArraysOfEnumValuesOrNull)
			.append(this.mapOfNullsAndArraysOfEnumValues, rhs.mapOfNullsAndArraysOfEnumValues)
			.append(this.mapOfArraysOfNullsAndEnumValues, rhs.mapOfArraysOfNullsAndEnumValues)
			.append(this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull, rhs.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("enumValueOrNull", this.enumValueOrNull)
			.append("arrayOfEnumValues", this.arrayOfEnumValues)
			.append("arrayOfArraysOfEnumValues", this.arrayOfArraysOfEnumValues)
			.append("arrayOfEnumValuesAndNulls", this.arrayOfEnumValuesAndNulls)
			.append("arrayOfEnumValuesOrNull", this.arrayOfEnumValuesOrNull)
			.append("arrayOfEnumValuesAndNullsOrNull", this.arrayOfEnumValuesAndNullsOrNull)
			.append("mapOfEnumValues", this.mapOfEnumValues)
			.append("mapOfMapsOfEnumValues", this.mapOfMapsOfEnumValues)
			.append("mapOfNullsAndEnumValues", this.mapOfNullsAndEnumValues)
			.append("mapOfEnumValuesOrNull", this.mapOfEnumValuesOrNull)
			.append("mapOfNullsAndEnumValuesOrNull", this.mapOfNullsAndEnumValuesOrNull)
			.append("arrayOfMapsOfEnumValues", this.arrayOfMapsOfEnumValues)
			.append("arrayOfMapsOfEnumValuesOrNull", this.arrayOfMapsOfEnumValuesOrNull)
			.append("arrayOfNullsAndMapsOfEnumValues", this.arrayOfNullsAndMapsOfEnumValues)
			.append("arrayOfMapsOfNullsAndEnumValues", this.arrayOfMapsOfNullsAndEnumValues)
			.append("arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull", this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull)
			.append("mapOfArraysOfEnumValues", this.mapOfArraysOfEnumValues)
			.append("mapOfArraysOfEnumValuesOrNull", this.mapOfArraysOfEnumValuesOrNull)
			.append("mapOfNullsAndArraysOfEnumValues", this.mapOfNullsAndArraysOfEnumValues)
			.append("mapOfArraysOfNullsAndEnumValues", this.mapOfArraysOfNullsAndEnumValues)
			.append("mapOfNullsAndArraysOfNullsAndEnumValuesOrNull", this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull)
			.toString();
	}

	public jsoncodegen.javajacksontest.generated.parent.JsonStringEnum getEnumValue() { return this.enumValue; }
	/**
	 * This is an enum value.
	 */
	public jsoncodegen.javajacksontest.generated.parent.JsonStringEnum getEnumValueWithDescription() { return this.enumValueWithDescription; }
	public jsoncodegen.javajacksontest.generated.parent.JsonStringEnum getEnumValueOrNull() { return this.enumValueOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getArrayOfEnumValues() { return this.arrayOfEnumValues; }
	public java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfArraysOfEnumValues() { return this.arrayOfArraysOfEnumValues; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getArrayOfEnumValuesAndNulls() { return this.arrayOfEnumValuesAndNulls; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getArrayOfEnumValuesOrNull() { return this.arrayOfEnumValuesOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getArrayOfEnumValuesAndNullsOrNull() { return this.arrayOfEnumValuesAndNullsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getMapOfEnumValues() { return this.mapOfEnumValues; }
	public java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfMapsOfEnumValues() { return this.mapOfMapsOfEnumValues; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getMapOfNullsAndEnumValues() { return this.mapOfNullsAndEnumValues; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getMapOfEnumValuesOrNull() { return this.mapOfEnumValuesOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> getMapOfNullsAndEnumValuesOrNull() { return this.mapOfNullsAndEnumValuesOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfMapsOfEnumValues() { return this.arrayOfMapsOfEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfMapsOfEnumValuesOrNull() { return this.arrayOfMapsOfEnumValuesOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfNullsAndMapsOfEnumValues() { return this.arrayOfNullsAndMapsOfEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfMapsOfNullsAndEnumValues() { return this.arrayOfMapsOfNullsAndEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull() { return this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfArraysOfEnumValues() { return this.mapOfArraysOfEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfArraysOfEnumValuesOrNull() { return this.mapOfArraysOfEnumValuesOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfNullsAndArraysOfEnumValues() { return this.mapOfNullsAndArraysOfEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfArraysOfNullsAndEnumValues() { return this.mapOfArraysOfNullsAndEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> getMapOfNullsAndArraysOfNullsAndEnumValuesOrNull() { return this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull; }

	@JsonCreator
	public static JsonStringEnumValueParentTest jacksonHelper(
			@JsonProperty("enumValueOrNull") jsoncodegen.javajacksontest.generated.parent.JsonStringEnum enumValueOrNull,
			@JsonProperty("arrayOfEnumValues") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValues,
			@JsonProperty("arrayOfArraysOfEnumValues") java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfArraysOfEnumValues,
			@JsonProperty("arrayOfEnumValuesAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNulls,
			@JsonProperty("arrayOfEnumValuesOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesOrNull,
			@JsonProperty("arrayOfEnumValuesAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull,
			@JsonProperty("mapOfEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValues,
			@JsonProperty("mapOfMapsOfEnumValues") java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfMapsOfEnumValues,
			@JsonProperty("mapOfNullsAndEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValues,
			@JsonProperty("mapOfEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValuesOrNull,
			@JsonProperty("arrayOfMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfNullsAndEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull,
			@JsonProperty("mapOfArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfNullsAndEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull
	) {
		return new JsonStringEnumValueParentTest(JsonStringEnumValueParentTest.Builder.create()
				.withEnumValueOrNull(enumValueOrNull)
				.withArrayOfEnumValues(arrayOfEnumValues)
				.withArrayOfArraysOfEnumValues(arrayOfArraysOfEnumValues)
				.withArrayOfEnumValuesAndNulls(arrayOfEnumValuesAndNulls)
				.withArrayOfEnumValuesOrNull(arrayOfEnumValuesOrNull)
				.withArrayOfEnumValuesAndNullsOrNull(arrayOfEnumValuesAndNullsOrNull)
				.withMapOfEnumValues(mapOfEnumValues)
				.withMapOfMapsOfEnumValues(mapOfMapsOfEnumValues)
				.withMapOfNullsAndEnumValues(mapOfNullsAndEnumValues)
				.withMapOfEnumValuesOrNull(mapOfEnumValuesOrNull)
				.withMapOfNullsAndEnumValuesOrNull(mapOfNullsAndEnumValuesOrNull)
				.withArrayOfMapsOfEnumValues(arrayOfMapsOfEnumValues)
				.withArrayOfMapsOfEnumValuesOrNull(arrayOfMapsOfEnumValuesOrNull)
				.withArrayOfNullsAndMapsOfEnumValues(arrayOfNullsAndMapsOfEnumValues)
				.withArrayOfMapsOfNullsAndEnumValues(arrayOfMapsOfNullsAndEnumValues)
				.withArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull)
				.withMapOfArraysOfEnumValues(mapOfArraysOfEnumValues)
				.withMapOfArraysOfEnumValuesOrNull(mapOfArraysOfEnumValuesOrNull)
				.withMapOfNullsAndArraysOfEnumValues(mapOfNullsAndArraysOfEnumValues)
				.withMapOfArraysOfNullsAndEnumValues(mapOfArraysOfNullsAndEnumValues)
				.withMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(mapOfNullsAndArraysOfNullsAndEnumValuesOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_arrayOfEnumValues__ {}
	private static final class __MISSING_arrayOfArraysOfEnumValues__ {}
	private static final class __MISSING_arrayOfEnumValuesAndNulls__ {}
	private static final class __MISSING_mapOfEnumValues__ {}
	private static final class __MISSING_mapOfMapsOfEnumValues__ {}
	private static final class __MISSING_mapOfNullsAndEnumValues__ {}
	private static final class __MISSING_arrayOfMapsOfEnumValues__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfEnumValues__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndEnumValues__ {}
	private static final class __MISSING_mapOfArraysOfEnumValues__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfEnumValues__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndEnumValues__ {}

	public static final class Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> {

		private jsoncodegen.javajacksontest.generated.parent.JsonStringEnum enumValueOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValues;
		private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfArraysOfEnumValues;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValues;
		private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfMapsOfEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfEnumValuesOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> mapOfNullsAndEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_arrayOfEnumValues__,
				__MISSING_arrayOfArraysOfEnumValues__,
				__MISSING_arrayOfEnumValuesAndNulls__,
				__MISSING_mapOfEnumValues__,
				__MISSING_mapOfMapsOfEnumValues__,
				__MISSING_mapOfNullsAndEnumValues__,
				__MISSING_arrayOfMapsOfEnumValues__,
				__MISSING_arrayOfNullsAndMapsOfEnumValues__,
				__MISSING_arrayOfMapsOfNullsAndEnumValues__,
				__MISSING_mapOfArraysOfEnumValues__,
				__MISSING_mapOfNullsAndArraysOfEnumValues__,
				__MISSING_mapOfArraysOfNullsAndEnumValues__
				> create() {
			return new Builder<
				__MISSING_arrayOfEnumValues__,
				__MISSING_arrayOfArraysOfEnumValues__,
				__MISSING_arrayOfEnumValuesAndNulls__,
				__MISSING_mapOfEnumValues__,
				__MISSING_mapOfMapsOfEnumValues__,
				__MISSING_mapOfNullsAndEnumValues__,
				__MISSING_arrayOfMapsOfEnumValues__,
				__MISSING_arrayOfNullsAndMapsOfEnumValues__,
				__MISSING_arrayOfMapsOfNullsAndEnumValues__,
				__MISSING_mapOfArraysOfEnumValues__,
				__MISSING_mapOfNullsAndArraysOfEnumValues__,
				__MISSING_mapOfArraysOfNullsAndEnumValues__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withEnumValueOrNull(jsoncodegen.javajacksontest.generated.parent.JsonStringEnum value) {
			this.enumValueOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValues(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.arrayOfEnumValues = value;
			return (Builder<
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfArraysOfEnumValues(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.arrayOfEnumValuesAndNulls = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.arrayOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.arrayOfEnumValuesAndNullsOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.mapOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfMapsOfEnumValues(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.mapOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.mapOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum> value) {
			this.mapOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfNullsAndMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfNullsAndEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfMapsOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfArraysOfEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfArraysOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__
				> withMapOfArraysOfNullsAndEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfArraysOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				JsonStringEnumValueParentTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}
	}
}
