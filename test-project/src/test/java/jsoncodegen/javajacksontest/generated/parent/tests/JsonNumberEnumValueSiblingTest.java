package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests number enum value fields.
 */
public final class JsonNumberEnumValueSiblingTest {

	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum enumValue = jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum.Name;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum enumValueWithDescription = jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum.Name;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum enumValueOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValues;
	private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfArraysOfEnumValues;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNulls;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNullsOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValues;
	private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfMapsOfEnumValues;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValues;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValuesOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValuesOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValues;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValuesOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfEnumValues;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfNullsAndEnumValues;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValues;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValuesOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfEnumValues;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfNullsAndEnumValues;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

	public JsonNumberEnumValueSiblingTest(Builder<
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__,
			JsonNumberEnumValueSiblingTest.__OK__
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
		JsonNumberEnumValueSiblingTest rhs = (JsonNumberEnumValueSiblingTest) other;
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
	
	public JsonNumberEnumValueSiblingTest clone() {
		return new JsonNumberEnumValueSiblingTest(JsonNumberEnumValueSiblingTest.Builder.create()
				.withEnumValueOrNull(this.enumValueOrNull)
				.withArrayOfEnumValues(this.arrayOfEnumValues)
				.withArrayOfArraysOfEnumValues(this.arrayOfArraysOfEnumValues)
				.withArrayOfEnumValuesAndNulls(this.arrayOfEnumValuesAndNulls)
				.withArrayOfEnumValuesOrNull(this.arrayOfEnumValuesOrNull)
				.withArrayOfEnumValuesAndNullsOrNull(this.arrayOfEnumValuesAndNullsOrNull)
				.withMapOfEnumValues(this.mapOfEnumValues)
				.withMapOfMapsOfEnumValues(this.mapOfMapsOfEnumValues)
				.withMapOfNullsAndEnumValues(this.mapOfNullsAndEnumValues)
				.withMapOfEnumValuesOrNull(this.mapOfEnumValuesOrNull)
				.withMapOfNullsAndEnumValuesOrNull(this.mapOfNullsAndEnumValuesOrNull)
				.withArrayOfMapsOfEnumValues(this.arrayOfMapsOfEnumValues)
				.withArrayOfMapsOfEnumValuesOrNull(this.arrayOfMapsOfEnumValuesOrNull)
				.withArrayOfNullsAndMapsOfEnumValues(this.arrayOfNullsAndMapsOfEnumValues)
				.withArrayOfMapsOfNullsAndEnumValues(this.arrayOfMapsOfNullsAndEnumValues)
				.withArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull)
				.withMapOfArraysOfEnumValues(this.mapOfArraysOfEnumValues)
				.withMapOfArraysOfEnumValuesOrNull(this.mapOfArraysOfEnumValuesOrNull)
				.withMapOfNullsAndArraysOfEnumValues(this.mapOfNullsAndArraysOfEnumValues)
				.withMapOfArraysOfNullsAndEnumValues(this.mapOfArraysOfNullsAndEnumValues)
				.withMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull)
		);
	}

	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum getEnumValue() {
		return this.enumValue;
	}

	public void setEnumValue(jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.enumValue = value;
	}

	/**
	 * This is an enum value.
	 */
	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum getEnumValueWithDescription() {
		return this.enumValueWithDescription;
	}

	/**
	 * This is an enum value.
	 */
	public void setEnumValueWithDescription(jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.enumValueWithDescription = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum getEnumValueOrNull() {
		return this.enumValueOrNull;
	}

	public void setEnumValueOrNull(jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum value) {
		this.enumValueOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getArrayOfEnumValues() {
		return this.arrayOfEnumValues;
	}

	public void setArrayOfEnumValues(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfEnumValues = value;
	}

	public java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfArraysOfEnumValues() {
		return this.arrayOfArraysOfEnumValues;
	}

	public void setArrayOfArraysOfEnumValues(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfArraysOfEnumValues = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getArrayOfEnumValuesAndNulls() {
		return this.arrayOfEnumValuesAndNulls;
	}

	public void setArrayOfEnumValuesAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfEnumValuesAndNulls = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getArrayOfEnumValuesOrNull() {
		return this.arrayOfEnumValuesOrNull;
	}

	public void setArrayOfEnumValuesOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		this.arrayOfEnumValuesOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getArrayOfEnumValuesAndNullsOrNull() {
		return this.arrayOfEnumValuesAndNullsOrNull;
	}

	public void setArrayOfEnumValuesAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		this.arrayOfEnumValuesAndNullsOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getMapOfEnumValues() {
		return this.mapOfEnumValues;
	}

	public void setMapOfEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfEnumValues = value;
	}

	public java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfMapsOfEnumValues() {
		return this.mapOfMapsOfEnumValues;
	}

	public void setMapOfMapsOfEnumValues(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfMapsOfEnumValues = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getMapOfNullsAndEnumValues() {
		return this.mapOfNullsAndEnumValues;
	}

	public void setMapOfNullsAndEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndEnumValues = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getMapOfEnumValuesOrNull() {
		return this.mapOfEnumValuesOrNull;
	}

	public void setMapOfEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		this.mapOfEnumValuesOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> getMapOfNullsAndEnumValuesOrNull() {
		return this.mapOfNullsAndEnumValuesOrNull;
	}

	public void setMapOfNullsAndEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
		this.mapOfNullsAndEnumValuesOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfMapsOfEnumValues() {
		return this.arrayOfMapsOfEnumValues;
	}

	public void setArrayOfMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfEnumValues = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfMapsOfEnumValuesOrNull() {
		return this.arrayOfMapsOfEnumValuesOrNull;
	}

	public void setArrayOfMapsOfEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		this.arrayOfMapsOfEnumValuesOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfNullsAndMapsOfEnumValues() {
		return this.arrayOfNullsAndMapsOfEnumValues;
	}

	public void setArrayOfNullsAndMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfNullsAndMapsOfEnumValues = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfMapsOfNullsAndEnumValues() {
		return this.arrayOfMapsOfNullsAndEnumValues;
	}

	public void setArrayOfMapsOfNullsAndEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfNullsAndEnumValues = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull() {
		return this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
	}

	public void setArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		this.arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfArraysOfEnumValues() {
		return this.mapOfArraysOfEnumValues;
	}

	public void setMapOfArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfEnumValues = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfArraysOfEnumValuesOrNull() {
		return this.mapOfArraysOfEnumValuesOrNull;
	}

	public void setMapOfArraysOfEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		this.mapOfArraysOfEnumValuesOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfNullsAndArraysOfEnumValues() {
		return this.mapOfNullsAndArraysOfEnumValues;
	}

	public void setMapOfNullsAndArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndArraysOfEnumValues = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfArraysOfNullsAndEnumValues() {
		return this.mapOfArraysOfNullsAndEnumValues;
	}

	public void setMapOfArraysOfNullsAndEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfNullsAndEnumValues = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> getMapOfNullsAndArraysOfNullsAndEnumValuesOrNull() {
		return this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;
	}

	public void setMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
		this.mapOfNullsAndArraysOfNullsAndEnumValuesOrNull = value;
	}

	@JsonCreator
	public static JsonNumberEnumValueSiblingTest jacksonHelper(
			@JsonProperty("enumValueOrNull") jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum enumValueOrNull,
			@JsonProperty("arrayOfEnumValues") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValues,
			@JsonProperty("arrayOfArraysOfEnumValues") java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfArraysOfEnumValues,
			@JsonProperty("arrayOfEnumValuesAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNulls,
			@JsonProperty("arrayOfEnumValuesOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesOrNull,
			@JsonProperty("arrayOfEnumValuesAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNullsOrNull,
			@JsonProperty("mapOfEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValues,
			@JsonProperty("mapOfMapsOfEnumValues") java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfMapsOfEnumValues,
			@JsonProperty("mapOfNullsAndEnumValues") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValues,
			@JsonProperty("mapOfEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndEnumValuesOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValuesOrNull,
			@JsonProperty("arrayOfMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValuesOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfEnumValues,
			@JsonProperty("arrayOfMapsOfNullsAndEnumValues") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfNullsAndEnumValues,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull,
			@JsonProperty("mapOfArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValuesOrNull,
			@JsonProperty("mapOfNullsAndArraysOfEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfEnumValues,
			@JsonProperty("mapOfArraysOfNullsAndEnumValues") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfNullsAndEnumValues,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndEnumValuesOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull
	) {
		return new JsonNumberEnumValueSiblingTest(JsonNumberEnumValueSiblingTest.Builder.create()
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

		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum enumValueOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValues;
		private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfArraysOfEnumValues;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> arrayOfEnumValuesAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValues;
		private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfMapsOfEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValues;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfEnumValuesOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> mapOfNullsAndEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfEnumValuesOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfMapsOfNullsAndEnumValues;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfEnumValuesOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfArraysOfNullsAndEnumValues;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumValuesOrNull;

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
				> withEnumValueOrNull(jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withArrayOfEnumValues(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
			this.arrayOfEnumValues = value;
			return (Builder<
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withArrayOfArraysOfEnumValues(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
			this.arrayOfArraysOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfEnumValuesAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
			this.arrayOfEnumValuesAndNulls = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withArrayOfEnumValuesOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
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
				> withArrayOfEnumValuesAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
			this.mapOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfMapsOfEnumValues(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
			this.mapOfMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_arrayOfMapsOfEnumValues__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndEnumValues(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
			this.mapOfNullsAndEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withMapOfEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
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
				> withMapOfNullsAndEnumValuesOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnumValues__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
			this.arrayOfMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withArrayOfMapsOfEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnumValues__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfNullsAndMapsOfEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
			this.arrayOfNullsAndMapsOfEnumValues = value;
			return (Builder<
				__HAS_arrayOfEnumValues__,
				__HAS_arrayOfArraysOfEnumValues__,
				__HAS_arrayOfEnumValuesAndNulls__,
				__HAS_mapOfEnumValues__,
				__HAS_mapOfMapsOfEnumValues__,
				__HAS_mapOfNullsAndEnumValues__,
				__HAS_arrayOfMapsOfEnumValues__,
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfArraysOfEnumValues__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withArrayOfMapsOfNullsAndEnumValues(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withArrayOfNullsAndMapsOfNullsAndEnumValuesOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnumValues__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
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
				> withMapOfArraysOfEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnumValues__
				> withMapOfNullsAndArraysOfEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__,
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
				JsonNumberEnumValueSiblingTest.__OK__
				> withMapOfArraysOfNullsAndEnumValues(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
				JsonNumberEnumValueSiblingTest.__OK__
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
				> withMapOfNullsAndArraysOfNullsAndEnumValuesOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum>> value) {
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
