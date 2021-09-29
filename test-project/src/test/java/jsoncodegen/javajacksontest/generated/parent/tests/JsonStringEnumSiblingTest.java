package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests string enum fields.
 */
public final class JsonStringEnumSiblingTest {

	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enum_;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumWithDescription;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnums;
	private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfArraysOfEnums;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNulls;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNullsOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnums;
	private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfMapsOfEnums;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnums;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnumsOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnumsOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnums;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnumsOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfEnums;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfNullsAndEnums;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnums;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnumsOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfEnums;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfNullsAndEnums;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull;

	public JsonStringEnumSiblingTest(Builder<
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__,
			JsonStringEnumSiblingTest.__OK__
			> builder) {
		Validate.notNull(builder.enum_, "Argument 'enum_' must not be null.");
		Validate.notNull(builder.enumWithDescription, "Argument 'enumWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfEnums, "Argument 'arrayOfEnums' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfEnums, "Argument 'arrayOfArraysOfEnums' must not be null.");
		Validate.notNull(builder.arrayOfEnumsAndNulls, "Argument 'arrayOfEnumsAndNulls' must not be null.");
		Validate.notNull(builder.mapOfEnums, "Argument 'mapOfEnums' must not be null.");
		Validate.notNull(builder.mapOfMapsOfEnums, "Argument 'mapOfMapsOfEnums' must not be null.");
		Validate.notNull(builder.mapOfNullsAndEnums, "Argument 'mapOfNullsAndEnums' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfEnums, "Argument 'arrayOfMapsOfEnums' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfEnums, "Argument 'arrayOfNullsAndMapsOfEnums' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndEnums, "Argument 'arrayOfMapsOfNullsAndEnums' must not be null.");
		Validate.notNull(builder.mapOfArraysOfEnums, "Argument 'mapOfArraysOfEnums' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfEnums, "Argument 'mapOfNullsAndArraysOfEnums' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndEnums, "Argument 'mapOfArraysOfNullsAndEnums' must not be null.");
		this.enum_ = builder.enum_;
		this.enumWithDescription = builder.enumWithDescription;
		this.enumOrNull = builder.enumOrNull;
		this.arrayOfEnums = builder.arrayOfEnums;
		this.arrayOfArraysOfEnums = builder.arrayOfArraysOfEnums;
		this.arrayOfEnumsAndNulls = builder.arrayOfEnumsAndNulls;
		this.arrayOfEnumsOrNull = builder.arrayOfEnumsOrNull;
		this.arrayOfEnumsAndNullsOrNull = builder.arrayOfEnumsAndNullsOrNull;
		this.mapOfEnums = builder.mapOfEnums;
		this.mapOfMapsOfEnums = builder.mapOfMapsOfEnums;
		this.mapOfNullsAndEnums = builder.mapOfNullsAndEnums;
		this.mapOfEnumsOrNull = builder.mapOfEnumsOrNull;
		this.mapOfNullsAndEnumsOrNull = builder.mapOfNullsAndEnumsOrNull;
		this.arrayOfMapsOfEnums = builder.arrayOfMapsOfEnums;
		this.arrayOfMapsOfEnumsOrNull = builder.arrayOfMapsOfEnumsOrNull;
		this.arrayOfNullsAndMapsOfEnums = builder.arrayOfNullsAndMapsOfEnums;
		this.arrayOfMapsOfNullsAndEnums = builder.arrayOfMapsOfNullsAndEnums;
		this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull = builder.arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
		this.mapOfArraysOfEnums = builder.mapOfArraysOfEnums;
		this.mapOfArraysOfEnumsOrNull = builder.mapOfArraysOfEnumsOrNull;
		this.mapOfNullsAndArraysOfEnums = builder.mapOfNullsAndArraysOfEnums;
		this.mapOfArraysOfNullsAndEnums = builder.mapOfArraysOfNullsAndEnums;
		this.mapOfNullsAndArraysOfNullsAndEnumsOrNull = builder.mapOfNullsAndArraysOfNullsAndEnumsOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.enum_)
			.append(this.enumWithDescription)
			.append(this.enumOrNull)
			.append(this.arrayOfEnums)
			.append(this.arrayOfArraysOfEnums)
			.append(this.arrayOfEnumsAndNulls)
			.append(this.arrayOfEnumsOrNull)
			.append(this.arrayOfEnumsAndNullsOrNull)
			.append(this.mapOfEnums)
			.append(this.mapOfMapsOfEnums)
			.append(this.mapOfNullsAndEnums)
			.append(this.mapOfEnumsOrNull)
			.append(this.mapOfNullsAndEnumsOrNull)
			.append(this.arrayOfMapsOfEnums)
			.append(this.arrayOfMapsOfEnumsOrNull)
			.append(this.arrayOfNullsAndMapsOfEnums)
			.append(this.arrayOfMapsOfNullsAndEnums)
			.append(this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull)
			.append(this.mapOfArraysOfEnums)
			.append(this.mapOfArraysOfEnumsOrNull)
			.append(this.mapOfNullsAndArraysOfEnums)
			.append(this.mapOfArraysOfNullsAndEnums)
			.append(this.mapOfNullsAndArraysOfNullsAndEnumsOrNull)
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
		JsonStringEnumSiblingTest rhs = (JsonStringEnumSiblingTest) other;
		return new EqualsBuilder()
			.append(this.enum_, rhs.enum_)
			.append(this.enumWithDescription, rhs.enumWithDescription)
			.append(this.enumOrNull, rhs.enumOrNull)
			.append(this.arrayOfEnums, rhs.arrayOfEnums)
			.append(this.arrayOfArraysOfEnums, rhs.arrayOfArraysOfEnums)
			.append(this.arrayOfEnumsAndNulls, rhs.arrayOfEnumsAndNulls)
			.append(this.arrayOfEnumsOrNull, rhs.arrayOfEnumsOrNull)
			.append(this.arrayOfEnumsAndNullsOrNull, rhs.arrayOfEnumsAndNullsOrNull)
			.append(this.mapOfEnums, rhs.mapOfEnums)
			.append(this.mapOfMapsOfEnums, rhs.mapOfMapsOfEnums)
			.append(this.mapOfNullsAndEnums, rhs.mapOfNullsAndEnums)
			.append(this.mapOfEnumsOrNull, rhs.mapOfEnumsOrNull)
			.append(this.mapOfNullsAndEnumsOrNull, rhs.mapOfNullsAndEnumsOrNull)
			.append(this.arrayOfMapsOfEnums, rhs.arrayOfMapsOfEnums)
			.append(this.arrayOfMapsOfEnumsOrNull, rhs.arrayOfMapsOfEnumsOrNull)
			.append(this.arrayOfNullsAndMapsOfEnums, rhs.arrayOfNullsAndMapsOfEnums)
			.append(this.arrayOfMapsOfNullsAndEnums, rhs.arrayOfMapsOfNullsAndEnums)
			.append(this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull, rhs.arrayOfNullsAndMapsOfNullsAndEnumsOrNull)
			.append(this.mapOfArraysOfEnums, rhs.mapOfArraysOfEnums)
			.append(this.mapOfArraysOfEnumsOrNull, rhs.mapOfArraysOfEnumsOrNull)
			.append(this.mapOfNullsAndArraysOfEnums, rhs.mapOfNullsAndArraysOfEnums)
			.append(this.mapOfArraysOfNullsAndEnums, rhs.mapOfArraysOfNullsAndEnums)
			.append(this.mapOfNullsAndArraysOfNullsAndEnumsOrNull, rhs.mapOfNullsAndArraysOfNullsAndEnumsOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("enum_", this.enum_)
			.append("enumWithDescription", this.enumWithDescription)
			.append("enumOrNull", this.enumOrNull)
			.append("arrayOfEnums", this.arrayOfEnums)
			.append("arrayOfArraysOfEnums", this.arrayOfArraysOfEnums)
			.append("arrayOfEnumsAndNulls", this.arrayOfEnumsAndNulls)
			.append("arrayOfEnumsOrNull", this.arrayOfEnumsOrNull)
			.append("arrayOfEnumsAndNullsOrNull", this.arrayOfEnumsAndNullsOrNull)
			.append("mapOfEnums", this.mapOfEnums)
			.append("mapOfMapsOfEnums", this.mapOfMapsOfEnums)
			.append("mapOfNullsAndEnums", this.mapOfNullsAndEnums)
			.append("mapOfEnumsOrNull", this.mapOfEnumsOrNull)
			.append("mapOfNullsAndEnumsOrNull", this.mapOfNullsAndEnumsOrNull)
			.append("arrayOfMapsOfEnums", this.arrayOfMapsOfEnums)
			.append("arrayOfMapsOfEnumsOrNull", this.arrayOfMapsOfEnumsOrNull)
			.append("arrayOfNullsAndMapsOfEnums", this.arrayOfNullsAndMapsOfEnums)
			.append("arrayOfMapsOfNullsAndEnums", this.arrayOfMapsOfNullsAndEnums)
			.append("arrayOfNullsAndMapsOfNullsAndEnumsOrNull", this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull)
			.append("mapOfArraysOfEnums", this.mapOfArraysOfEnums)
			.append("mapOfArraysOfEnumsOrNull", this.mapOfArraysOfEnumsOrNull)
			.append("mapOfNullsAndArraysOfEnums", this.mapOfNullsAndArraysOfEnums)
			.append("mapOfArraysOfNullsAndEnums", this.mapOfArraysOfNullsAndEnums)
			.append("mapOfNullsAndArraysOfNullsAndEnumsOrNull", this.mapOfNullsAndArraysOfNullsAndEnumsOrNull)
			.toString();
	}
	
	public JsonStringEnumSiblingTest clone() {
		return new JsonStringEnumSiblingTest(JsonStringEnumSiblingTest.Builder.create()
				.withEnum_(this.enum_)
				.withEnumWithDescription(this.enumWithDescription)
				.withEnumOrNull(this.enumOrNull)
				.withArrayOfEnums(this.arrayOfEnums)
				.withArrayOfArraysOfEnums(this.arrayOfArraysOfEnums)
				.withArrayOfEnumsAndNulls(this.arrayOfEnumsAndNulls)
				.withArrayOfEnumsOrNull(this.arrayOfEnumsOrNull)
				.withArrayOfEnumsAndNullsOrNull(this.arrayOfEnumsAndNullsOrNull)
				.withMapOfEnums(this.mapOfEnums)
				.withMapOfMapsOfEnums(this.mapOfMapsOfEnums)
				.withMapOfNullsAndEnums(this.mapOfNullsAndEnums)
				.withMapOfEnumsOrNull(this.mapOfEnumsOrNull)
				.withMapOfNullsAndEnumsOrNull(this.mapOfNullsAndEnumsOrNull)
				.withArrayOfMapsOfEnums(this.arrayOfMapsOfEnums)
				.withArrayOfMapsOfEnumsOrNull(this.arrayOfMapsOfEnumsOrNull)
				.withArrayOfNullsAndMapsOfEnums(this.arrayOfNullsAndMapsOfEnums)
				.withArrayOfMapsOfNullsAndEnums(this.arrayOfMapsOfNullsAndEnums)
				.withArrayOfNullsAndMapsOfNullsAndEnumsOrNull(this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull)
				.withMapOfArraysOfEnums(this.mapOfArraysOfEnums)
				.withMapOfArraysOfEnumsOrNull(this.mapOfArraysOfEnumsOrNull)
				.withMapOfNullsAndArraysOfEnums(this.mapOfNullsAndArraysOfEnums)
				.withMapOfArraysOfNullsAndEnums(this.mapOfArraysOfNullsAndEnums)
				.withMapOfNullsAndArraysOfNullsAndEnumsOrNull(this.mapOfNullsAndArraysOfNullsAndEnumsOrNull)
		);
	}

	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum getEnum_() {
		return this.enum_;
	}

	public void setEnum_(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.enum_ = value;
	}

	/**
	 * This is an enum.
	 */
	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum getEnumWithDescription() {
		return this.enumWithDescription;
	}

	/**
	 * This is an enum.
	 */
	public void setEnumWithDescription(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.enumWithDescription = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum getEnumOrNull() {
		return this.enumOrNull;
	}

	public void setEnumOrNull(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
		this.enumOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getArrayOfEnums() {
		return this.arrayOfEnums;
	}

	public void setArrayOfEnums(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfEnums = value;
	}

	public java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfArraysOfEnums() {
		return this.arrayOfArraysOfEnums;
	}

	public void setArrayOfArraysOfEnums(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfArraysOfEnums = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getArrayOfEnumsAndNulls() {
		return this.arrayOfEnumsAndNulls;
	}

	public void setArrayOfEnumsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfEnumsAndNulls = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getArrayOfEnumsOrNull() {
		return this.arrayOfEnumsOrNull;
	}

	public void setArrayOfEnumsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		this.arrayOfEnumsOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getArrayOfEnumsAndNullsOrNull() {
		return this.arrayOfEnumsAndNullsOrNull;
	}

	public void setArrayOfEnumsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		this.arrayOfEnumsAndNullsOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getMapOfEnums() {
		return this.mapOfEnums;
	}

	public void setMapOfEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfEnums = value;
	}

	public java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfMapsOfEnums() {
		return this.mapOfMapsOfEnums;
	}

	public void setMapOfMapsOfEnums(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfMapsOfEnums = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getMapOfNullsAndEnums() {
		return this.mapOfNullsAndEnums;
	}

	public void setMapOfNullsAndEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndEnums = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getMapOfEnumsOrNull() {
		return this.mapOfEnumsOrNull;
	}

	public void setMapOfEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		this.mapOfEnumsOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> getMapOfNullsAndEnumsOrNull() {
		return this.mapOfNullsAndEnumsOrNull;
	}

	public void setMapOfNullsAndEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
		this.mapOfNullsAndEnumsOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfMapsOfEnums() {
		return this.arrayOfMapsOfEnums;
	}

	public void setArrayOfMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfEnums = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfMapsOfEnumsOrNull() {
		return this.arrayOfMapsOfEnumsOrNull;
	}

	public void setArrayOfMapsOfEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		this.arrayOfMapsOfEnumsOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfNullsAndMapsOfEnums() {
		return this.arrayOfNullsAndMapsOfEnums;
	}

	public void setArrayOfNullsAndMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfNullsAndMapsOfEnums = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfMapsOfNullsAndEnums() {
		return this.arrayOfMapsOfNullsAndEnums;
	}

	public void setArrayOfMapsOfNullsAndEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfNullsAndEnums = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getArrayOfNullsAndMapsOfNullsAndEnumsOrNull() {
		return this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
	}

	public void setArrayOfNullsAndMapsOfNullsAndEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfArraysOfEnums() {
		return this.mapOfArraysOfEnums;
	}

	public void setMapOfArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfEnums = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfArraysOfEnumsOrNull() {
		return this.mapOfArraysOfEnumsOrNull;
	}

	public void setMapOfArraysOfEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		this.mapOfArraysOfEnumsOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfNullsAndArraysOfEnums() {
		return this.mapOfNullsAndArraysOfEnums;
	}

	public void setMapOfNullsAndArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndArraysOfEnums = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfArraysOfNullsAndEnums() {
		return this.mapOfArraysOfNullsAndEnums;
	}

	public void setMapOfArraysOfNullsAndEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfNullsAndEnums = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> getMapOfNullsAndArraysOfNullsAndEnumsOrNull() {
		return this.mapOfNullsAndArraysOfNullsAndEnumsOrNull;
	}

	public void setMapOfNullsAndArraysOfNullsAndEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
		this.mapOfNullsAndArraysOfNullsAndEnumsOrNull = value;
	}

	@JsonCreator
	public static JsonStringEnumSiblingTest jacksonHelper(
			@JsonProperty("enum_") jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enum_,
			@JsonProperty("enumWithDescription") jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumWithDescription,
			@JsonProperty("enumOrNull") jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumOrNull,
			@JsonProperty("arrayOfEnums") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnums,
			@JsonProperty("arrayOfArraysOfEnums") java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfArraysOfEnums,
			@JsonProperty("arrayOfEnumsAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNulls,
			@JsonProperty("arrayOfEnumsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsOrNull,
			@JsonProperty("arrayOfEnumsAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNullsOrNull,
			@JsonProperty("mapOfEnums") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnums,
			@JsonProperty("mapOfMapsOfEnums") java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfMapsOfEnums,
			@JsonProperty("mapOfNullsAndEnums") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnums,
			@JsonProperty("mapOfEnumsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnumsOrNull,
			@JsonProperty("mapOfNullsAndEnumsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnumsOrNull,
			@JsonProperty("arrayOfMapsOfEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnums,
			@JsonProperty("arrayOfMapsOfEnumsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnumsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfEnums,
			@JsonProperty("arrayOfMapsOfNullsAndEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfNullsAndEnums,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndEnumsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull,
			@JsonProperty("mapOfArraysOfEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnums,
			@JsonProperty("mapOfArraysOfEnumsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnumsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfEnums,
			@JsonProperty("mapOfArraysOfNullsAndEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfNullsAndEnums,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndEnumsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull
	) {
		return new JsonStringEnumSiblingTest(JsonStringEnumSiblingTest.Builder.create()
				.withEnum_(enum_)
				.withEnumWithDescription(enumWithDescription)
				.withEnumOrNull(enumOrNull)
				.withArrayOfEnums(arrayOfEnums)
				.withArrayOfArraysOfEnums(arrayOfArraysOfEnums)
				.withArrayOfEnumsAndNulls(arrayOfEnumsAndNulls)
				.withArrayOfEnumsOrNull(arrayOfEnumsOrNull)
				.withArrayOfEnumsAndNullsOrNull(arrayOfEnumsAndNullsOrNull)
				.withMapOfEnums(mapOfEnums)
				.withMapOfMapsOfEnums(mapOfMapsOfEnums)
				.withMapOfNullsAndEnums(mapOfNullsAndEnums)
				.withMapOfEnumsOrNull(mapOfEnumsOrNull)
				.withMapOfNullsAndEnumsOrNull(mapOfNullsAndEnumsOrNull)
				.withArrayOfMapsOfEnums(arrayOfMapsOfEnums)
				.withArrayOfMapsOfEnumsOrNull(arrayOfMapsOfEnumsOrNull)
				.withArrayOfNullsAndMapsOfEnums(arrayOfNullsAndMapsOfEnums)
				.withArrayOfMapsOfNullsAndEnums(arrayOfMapsOfNullsAndEnums)
				.withArrayOfNullsAndMapsOfNullsAndEnumsOrNull(arrayOfNullsAndMapsOfNullsAndEnumsOrNull)
				.withMapOfArraysOfEnums(mapOfArraysOfEnums)
				.withMapOfArraysOfEnumsOrNull(mapOfArraysOfEnumsOrNull)
				.withMapOfNullsAndArraysOfEnums(mapOfNullsAndArraysOfEnums)
				.withMapOfArraysOfNullsAndEnums(mapOfArraysOfNullsAndEnums)
				.withMapOfNullsAndArraysOfNullsAndEnumsOrNull(mapOfNullsAndArraysOfNullsAndEnumsOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_enum___ {}
	private static final class __MISSING_enumWithDescription__ {}
	private static final class __MISSING_arrayOfEnums__ {}
	private static final class __MISSING_arrayOfArraysOfEnums__ {}
	private static final class __MISSING_arrayOfEnumsAndNulls__ {}
	private static final class __MISSING_mapOfEnums__ {}
	private static final class __MISSING_mapOfMapsOfEnums__ {}
	private static final class __MISSING_mapOfNullsAndEnums__ {}
	private static final class __MISSING_arrayOfMapsOfEnums__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfEnums__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndEnums__ {}
	private static final class __MISSING_mapOfArraysOfEnums__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfEnums__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndEnums__ {}

	public static final class Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> {

		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enum_;
		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumWithDescription;
		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum enumOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnums;
		private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfArraysOfEnums;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> arrayOfEnumsAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnums;
		private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfMapsOfEnums;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnums;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfEnumsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> mapOfNullsAndEnumsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfEnumsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfMapsOfNullsAndEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfEnumsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfArraysOfNullsAndEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_enum___,
				__MISSING_enumWithDescription__,
				__MISSING_arrayOfEnums__,
				__MISSING_arrayOfArraysOfEnums__,
				__MISSING_arrayOfEnumsAndNulls__,
				__MISSING_mapOfEnums__,
				__MISSING_mapOfMapsOfEnums__,
				__MISSING_mapOfNullsAndEnums__,
				__MISSING_arrayOfMapsOfEnums__,
				__MISSING_arrayOfNullsAndMapsOfEnums__,
				__MISSING_arrayOfMapsOfNullsAndEnums__,
				__MISSING_mapOfArraysOfEnums__,
				__MISSING_mapOfNullsAndArraysOfEnums__,
				__MISSING_mapOfArraysOfNullsAndEnums__
				> create() {
			return new Builder<
				__MISSING_enum___,
				__MISSING_enumWithDescription__,
				__MISSING_arrayOfEnums__,
				__MISSING_arrayOfArraysOfEnums__,
				__MISSING_arrayOfEnumsAndNulls__,
				__MISSING_mapOfEnums__,
				__MISSING_mapOfMapsOfEnums__,
				__MISSING_mapOfNullsAndEnums__,
				__MISSING_arrayOfMapsOfEnums__,
				__MISSING_arrayOfNullsAndMapsOfEnums__,
				__MISSING_arrayOfMapsOfNullsAndEnums__,
				__MISSING_mapOfArraysOfEnums__,
				__MISSING_mapOfNullsAndArraysOfEnums__,
				__MISSING_mapOfArraysOfNullsAndEnums__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonStringEnumSiblingTest.__OK__,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withEnum_(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
			this.enum_ = value;
			return (Builder<
				JsonStringEnumSiblingTest.__OK__,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		/**
		 * This is an enum.
		 */
		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withEnumWithDescription(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
			this.enumWithDescription = value;
			return (Builder<
				__HAS_enum___,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withEnumOrNull(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
			this.enumOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfEnums(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.arrayOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfArraysOfEnums(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfArraysOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfEnumsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.arrayOfEnumsAndNulls = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfEnumsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.arrayOfEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfEnumsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.arrayOfEnumsAndNullsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.mapOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfMapsOfEnums(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfMapsOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.mapOfNullsAndEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.mapOfEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum> value) {
			this.mapOfNullsAndEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfMapsOfEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfMapsOfEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfNullsAndMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfMapsOfNullsAndEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfMapsOfNullsAndEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfNullsAndMapsOfNullsAndEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfArraysOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfArraysOfEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfArraysOfEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__
				> withMapOfArraysOfNullsAndEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfArraysOfNullsAndEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				JsonStringEnumSiblingTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndArraysOfNullsAndEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum>> value) {
			this.mapOfNullsAndArraysOfNullsAndEnumsOrNull = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				>) this;
		}
	}
}
