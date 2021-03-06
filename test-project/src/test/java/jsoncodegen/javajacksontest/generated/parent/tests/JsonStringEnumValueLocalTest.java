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
public final class JsonStringEnumValueLocalTest {

	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum enumValue = jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum enumValueWithDescription = jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum enumValueOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValues;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNulls;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValues;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValues;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValuesOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValuesOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

	public JsonStringEnumValueLocalTest(Builder<
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__,
			JsonStringEnumValueLocalTest.__OK__
			> builder) {
		Validate.notNull(builder.arrayOfEnumValues, "Argument 'arrayOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfEnumValuesAndNulls, "Argument 'arrayOfEnumValuesAndNulls' must not be null.");
		Validate.notNull(builder.mapOfEnumValues, "Argument 'mapOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfNullsAndEnumValues, "Argument 'mapOfNullsAndEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfEnumValues, "Argument 'arrayOfMapsOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfEnumValues, "Argument 'arrayOfNullsAndMapsOfEnumValues' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndEnumValues, "Argument 'arrayOfMapsOfNullsAndEnumValues' must not be null.");
		Validate.notNull(builder.mapOfArraysOfEnumValues, "Argument 'mapOfArraysOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfEnumValues, "Argument 'mapOfNullsAndArraysOfEnumValues' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndEnumValues, "Argument 'mapOfArraysOfNullsAndEnumValues' must not be null.");
		this.enumValueOrNull = builder.enumValueOrNull;
		this.arrayOfEnumValues = builder.arrayOfEnumValues;
		this.arrayOfEnumValuesAndNulls = builder.arrayOfEnumValuesAndNulls;
		this.arrayOfEnumValuesOrNull = builder.arrayOfEnumValuesOrNull;
		this.arrayOfEnumValuesAndNullsOrNull = builder.arrayOfEnumValuesAndNullsOrNull;
		this.mapOfEnumValues = builder.mapOfEnumValues;
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
			.append(this.arrayOfEnumValuesAndNulls)
			.append(this.arrayOfEnumValuesOrNull)
			.append(this.arrayOfEnumValuesAndNullsOrNull)
			.append(this.mapOfEnumValues)
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
		JsonStringEnumValueLocalTest rhs = (JsonStringEnumValueLocalTest) other;
		return new EqualsBuilder()
			.append(this.enumValueOrNull, rhs.enumValueOrNull)
			.append(this.arrayOfEnumValues, rhs.arrayOfEnumValues)
			.append(this.arrayOfEnumValuesAndNulls, rhs.arrayOfEnumValuesAndNulls)
			.append(this.arrayOfEnumValuesOrNull, rhs.arrayOfEnumValuesOrNull)
			.append(this.arrayOfEnumValuesAndNullsOrNull, rhs.arrayOfEnumValuesAndNullsOrNull)
			.append(this.mapOfEnumValues, rhs.mapOfEnumValues)
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
			.append("arrayOfEnumValuesAndNulls", this.arrayOfEnumValuesAndNulls)
			.append("arrayOfEnumValuesOrNull", this.arrayOfEnumValuesOrNull)
			.append("arrayOfEnumValuesAndNullsOrNull", this.arrayOfEnumValuesAndNullsOrNull)
			.append("mapOfEnumValues", this.mapOfEnumValues)
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

	public jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum getEnumValue() { return this.enumValue; }
	/**
	 * This is an enum value.
	 */
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum getEnumValueWithDescription() { return this.enumValueWithDescription; }
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum getEnumValueOrNull() { return this.enumValueOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getArrayOfEnumValues() { return this.arrayOfEnumValues; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getArrayOfEnumValuesAndNulls() { return this.arrayOfEnumValuesAndNulls; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getArrayOfEnumValuesOrNull() { return this.arrayOfEnumValuesOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getArrayOfEnumValuesAndNullsOrNull() { return this.arrayOfEnumValuesAndNullsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getMapOfEnumValues() { return this.mapOfEnumValues; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getMapOfNullsAndEnumValues() { return this.mapOfNullsAndEnumValues; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getMapOfEnumValuesOrNull() { return this.mapOfEnumValuesOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> getMapOfNullsAndEnumValuesOrNull() { return this.mapOfNullsAndEnumValuesOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getArrayOfMapsOfEnumValues() { return this.arrayOfMapsOfEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getArrayOfMapsOfEnumValuesOrNull() { return this.arrayOfMapsOfEnumValuesOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getArrayOfNullsAndMapsOfEnumValues() { return this.arrayOfNullsAndMapsOfEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getArrayOfMapsOfNullsAndEnumValues() { return this.arrayOfMapsOfNullsAndEnumValues; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull() { return this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getMapOfArraysOfEnumValues() { return this.mapOfArraysOfEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getMapOfArraysOfEnumValuesOrNull() { return this.mapOfArraysOfEnumValuesOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getMapOfNullsAndArraysOfEnumValues() { return this.mapOfNullsAndArraysOfEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getMapOfArraysOfNullsAndEnumValues() { return this.mapOfArraysOfNullsAndEnumValues; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> getMapOfNullsAndArraysOfNullsAndEnumValuesOrNull() { return this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull; }

	@JsonCreator
	public static JsonStringEnumValueLocalTest jacksonHelper(
			@JsonProperty("enumValueOrNull") jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum enumValueOrNull,
			@JsonProperty("arrayOfEnumValues") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValues,
			@JsonProperty("arrayOfEnumValuesAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNulls,
			@JsonProperty("arrayOfEnumValuesOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesOrNull,
			@JsonProperty("arrayOfEnumValuesAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull,
			@JsonProperty("mapOfEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValues,
			@JsonProperty("mapOfNullsAndEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValues,
			@JsonProperty("mapOfEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValuesOrNull,
			@JsonProperty("arrayOfMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfNullsAndEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull,
			@JsonProperty("mapOfArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfNullsAndEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull
	) {
		return new JsonStringEnumValueLocalTest(JsonStringEnumValueLocalTest.Builder.create()
				.withEnumValueOrNull(enumValueOrNull)
				.withArrayOfEnumValues(arrayOfEnumValues)
				.withArrayOfEnumValuesAndNulls(arrayOfEnumValuesAndNulls)
				.withArrayOfEnumValuesOrNull(arrayOfEnumValuesOrNull)
				.withArrayOfEnumValuesAndNullsOrNull(arrayOfEnumValuesAndNullsOrNull)
				.withMapOfEnumValues(mapOfEnumValues)
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
	private static final class __MISSING_arrayOfEnumValuesAndNulls__ {}
	private static final class __MISSING_mapOfEnumValues__ {}
	private static final class __MISSING_mapOfNullsAndEnumValues__ {}
	private static final class __MISSING_arrayOfMapsOfEnumValues__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfEnumValues__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndEnumValues__ {}
	private static final class __MISSING_mapOfArraysOfEnumValues__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfEnumValues__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndEnumValues__ {}

	public static final class Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> {

		private jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum enumValueOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValues;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> arrayOfEnumValuesAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfEnumValuesOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> mapOfNullsAndEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfMapsOfNullsAndEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfArraysOfNullsAndEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_arrayOfEnumValues__,
				__MISSING_arrayOfEnumValuesAndNulls__,
				__MISSING_mapOfEnumValues__,
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
				__MISSING_arrayOfEnumValuesAndNulls__,
				__MISSING_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withEnumValueOrNull(jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum value) {
			this.enumValueOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValues(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.arrayOfEnumValues = value;
			return (Builder<
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.arrayOfEnumValuesAndNulls = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.arrayOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.arrayOfEnumValuesAndNullsOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.mapOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				JsonStringEnumValueLocalTest.__OK__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.mapOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.mapOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum> value) {
			this.mapOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfNullsAndMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfNullsAndEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.arrayOfMapsOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.mapOfArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfArraysOfEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.mapOfArraysOfEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__
				> withMapOfArraysOfNullsAndEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.mapOfArraysOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				JsonStringEnumValueLocalTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
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
