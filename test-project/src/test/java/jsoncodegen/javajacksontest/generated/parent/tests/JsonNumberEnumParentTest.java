package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests number enum fields.
 */
public final class JsonNumberEnumParentTest {

	private final jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enum_;
	private final jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumWithDescription;
	private final jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnums;
	private final java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfArraysOfEnums;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNulls;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNullsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnums;
	private final java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfMapsOfEnums;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnums;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnumsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnumsOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnums;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnumsOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfEnums;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfNullsAndEnums;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnums;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnumsOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfEnums;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfNullsAndEnums;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull;

	public JsonNumberEnumParentTest(Builder<
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__,
			JsonNumberEnumParentTest.__OK__
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
		JsonNumberEnumParentTest rhs = (JsonNumberEnumParentTest) other;
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

	public jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum getEnum_() { return this.enum_; }
	/**
	 * This is an enum.
	 */
	public jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum getEnumWithDescription() { return this.enumWithDescription; }
	public jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum getEnumOrNull() { return this.enumOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getArrayOfEnums() { return this.arrayOfEnums; }
	public java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfArraysOfEnums() { return this.arrayOfArraysOfEnums; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getArrayOfEnumsAndNulls() { return this.arrayOfEnumsAndNulls; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getArrayOfEnumsOrNull() { return this.arrayOfEnumsOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getArrayOfEnumsAndNullsOrNull() { return this.arrayOfEnumsAndNullsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getMapOfEnums() { return this.mapOfEnums; }
	public java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfMapsOfEnums() { return this.mapOfMapsOfEnums; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getMapOfNullsAndEnums() { return this.mapOfNullsAndEnums; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getMapOfEnumsOrNull() { return this.mapOfEnumsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> getMapOfNullsAndEnumsOrNull() { return this.mapOfNullsAndEnumsOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfMapsOfEnums() { return this.arrayOfMapsOfEnums; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfMapsOfEnumsOrNull() { return this.arrayOfMapsOfEnumsOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfNullsAndMapsOfEnums() { return this.arrayOfNullsAndMapsOfEnums; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfMapsOfNullsAndEnums() { return this.arrayOfMapsOfNullsAndEnums; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getArrayOfNullsAndMapsOfNullsAndEnumsOrNull() { return this.arrayOfNullsAndMapsOfNullsAndEnumsOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfArraysOfEnums() { return this.mapOfArraysOfEnums; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfArraysOfEnumsOrNull() { return this.mapOfArraysOfEnumsOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfNullsAndArraysOfEnums() { return this.mapOfNullsAndArraysOfEnums; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfArraysOfNullsAndEnums() { return this.mapOfArraysOfNullsAndEnums; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> getMapOfNullsAndArraysOfNullsAndEnumsOrNull() { return this.mapOfNullsAndArraysOfNullsAndEnumsOrNull; }

	@JsonCreator
	public static JsonNumberEnumParentTest jacksonHelper(
			@JsonProperty("enum_") jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enum_,
			@JsonProperty("enumWithDescription") jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumWithDescription,
			@JsonProperty("enumOrNull") jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumOrNull,
			@JsonProperty("arrayOfEnums") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnums,
			@JsonProperty("arrayOfArraysOfEnums") java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfArraysOfEnums,
			@JsonProperty("arrayOfEnumsAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNulls,
			@JsonProperty("arrayOfEnumsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsOrNull,
			@JsonProperty("arrayOfEnumsAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNullsOrNull,
			@JsonProperty("mapOfEnums") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnums,
			@JsonProperty("mapOfMapsOfEnums") java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfMapsOfEnums,
			@JsonProperty("mapOfNullsAndEnums") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnums,
			@JsonProperty("mapOfEnumsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnumsOrNull,
			@JsonProperty("mapOfNullsAndEnumsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnumsOrNull,
			@JsonProperty("arrayOfMapsOfEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnums,
			@JsonProperty("arrayOfMapsOfEnumsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnumsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfEnums,
			@JsonProperty("arrayOfMapsOfNullsAndEnums") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfNullsAndEnums,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndEnumsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull,
			@JsonProperty("mapOfArraysOfEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnums,
			@JsonProperty("mapOfArraysOfEnumsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnumsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfEnums,
			@JsonProperty("mapOfArraysOfNullsAndEnums") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfNullsAndEnums,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndEnumsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull
	) {
		return new JsonNumberEnumParentTest(JsonNumberEnumParentTest.Builder.create()
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

		private jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enum_;
		private jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumWithDescription;
		private jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum enumOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnums;
		private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfArraysOfEnums;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> arrayOfEnumsAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnums;
		private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfMapsOfEnums;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnums;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfEnumsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> mapOfNullsAndEnumsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfEnumsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfMapsOfNullsAndEnums;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> arrayOfNullsAndMapsOfNullsAndEnumsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfEnumsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfArraysOfNullsAndEnums;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> mapOfNullsAndArraysOfNullsAndEnumsOrNull;

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
				JsonNumberEnumParentTest.__OK__,
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
				> withEnum_(jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum value) {
			this.enum_ = value;
			return (Builder<
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
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
				> withEnumWithDescription(jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum value) {
			this.enumWithDescription = value;
			return (Builder<
				__HAS_enum___,
				JsonNumberEnumParentTest.__OK__,
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
				> withEnumOrNull(jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				> withArrayOfEnums(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
			this.arrayOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
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
				> withArrayOfArraysOfEnums(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
			this.arrayOfArraysOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfEnumsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
			this.arrayOfEnumsAndNulls = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				JsonNumberEnumParentTest.__OK__,
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
				> withArrayOfEnumsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
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
				> withArrayOfEnumsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfMapsOfEnums__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
			this.mapOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfNullsAndEnums__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfMapsOfEnums(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
			this.mapOfMapsOfEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_arrayOfMapsOfEnums__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndEnums(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
			this.mapOfNullsAndEnums = value;
			return (Builder<
				__HAS_enum___,
				__HAS_enumWithDescription__,
				__HAS_arrayOfEnums__,
				__HAS_arrayOfArraysOfEnums__,
				__HAS_arrayOfEnumsAndNulls__,
				__HAS_mapOfEnums__,
				__HAS_mapOfMapsOfEnums__,
				JsonNumberEnumParentTest.__OK__,
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
				> withMapOfEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
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
				> withMapOfNullsAndEnumsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum> value) {
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfEnums__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				> withArrayOfMapsOfEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndEnums__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfNullsAndMapsOfEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfArraysOfEnums__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withArrayOfMapsOfNullsAndEnums(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				> withArrayOfNullsAndMapsOfNullsAndEnumsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfNullsAndArraysOfEnums__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				> withMapOfArraysOfEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
				__HAS_mapOfArraysOfNullsAndEnums__
				> withMapOfNullsAndArraysOfEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__,
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
				JsonNumberEnumParentTest.__OK__
				> withMapOfArraysOfNullsAndEnums(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
				JsonNumberEnumParentTest.__OK__
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
				> withMapOfNullsAndArraysOfNullsAndEnumsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum>> value) {
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
