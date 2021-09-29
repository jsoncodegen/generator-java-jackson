package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests boolean values.
 */
public final class JsonBooleanTest {

	private Boolean flag;
	private Boolean flagWithDescription;
	private Boolean flagOrNull;
	private java.util.List<Boolean> arrayOfFlags;
	private java.util.List<java.util.List<Boolean>> arrayOfArraysOfFlags;
	private java.util.List<Boolean> arrayOfFlagsAndNulls;
	private java.util.List<Boolean> arrayOfFlagsOrNull;
	private java.util.List<Boolean> arrayOfFlagsAndNullsOrNull;
	private java.util.Map<String, Boolean> mapOfFlags;
	private java.util.Map<String, java.util.Map<String, Boolean>> mapOfMapsOfFlags;
	private java.util.Map<String, Boolean> mapOfNullsAndFlags;
	private java.util.Map<String, Boolean> mapOfFlagsOrNull;
	private java.util.Map<String, Boolean> mapOfNullsAndFlagsOrNull;
	private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlags;
	private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlagsOrNull;
	private java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfFlags;
	private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfNullsAndFlags;
	private java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfNullsAndFlagsOrNull;
	private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlags;
	private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlagsOrNull;
	private java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfFlags;
	private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfNullsAndFlags;
	private java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfNullsAndFlagsOrNull;

	public JsonBooleanTest(Builder<
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__,
			JsonBooleanTest.__OK__
			> builder) {
		Validate.notNull(builder.flag, "Argument 'flag' must not be null.");
		Validate.notNull(builder.flagWithDescription, "Argument 'flagWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfFlags, "Argument 'arrayOfFlags' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfFlags, "Argument 'arrayOfArraysOfFlags' must not be null.");
		Validate.notNull(builder.arrayOfFlagsAndNulls, "Argument 'arrayOfFlagsAndNulls' must not be null.");
		Validate.notNull(builder.mapOfFlags, "Argument 'mapOfFlags' must not be null.");
		Validate.notNull(builder.mapOfMapsOfFlags, "Argument 'mapOfMapsOfFlags' must not be null.");
		Validate.notNull(builder.mapOfNullsAndFlags, "Argument 'mapOfNullsAndFlags' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfFlags, "Argument 'arrayOfMapsOfFlags' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfFlags, "Argument 'arrayOfNullsAndMapsOfFlags' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndFlags, "Argument 'arrayOfMapsOfNullsAndFlags' must not be null.");
		Validate.notNull(builder.mapOfArraysOfFlags, "Argument 'mapOfArraysOfFlags' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfFlags, "Argument 'mapOfNullsAndArraysOfFlags' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndFlags, "Argument 'mapOfArraysOfNullsAndFlags' must not be null.");
		this.flag = builder.flag;
		this.flagWithDescription = builder.flagWithDescription;
		this.flagOrNull = builder.flagOrNull;
		this.arrayOfFlags = builder.arrayOfFlags;
		this.arrayOfArraysOfFlags = builder.arrayOfArraysOfFlags;
		this.arrayOfFlagsAndNulls = builder.arrayOfFlagsAndNulls;
		this.arrayOfFlagsOrNull = builder.arrayOfFlagsOrNull;
		this.arrayOfFlagsAndNullsOrNull = builder.arrayOfFlagsAndNullsOrNull;
		this.mapOfFlags = builder.mapOfFlags;
		this.mapOfMapsOfFlags = builder.mapOfMapsOfFlags;
		this.mapOfNullsAndFlags = builder.mapOfNullsAndFlags;
		this.mapOfFlagsOrNull = builder.mapOfFlagsOrNull;
		this.mapOfNullsAndFlagsOrNull = builder.mapOfNullsAndFlagsOrNull;
		this.arrayOfMapsOfFlags = builder.arrayOfMapsOfFlags;
		this.arrayOfMapsOfFlagsOrNull = builder.arrayOfMapsOfFlagsOrNull;
		this.arrayOfNullsAndMapsOfFlags = builder.arrayOfNullsAndMapsOfFlags;
		this.arrayOfMapsOfNullsAndFlags = builder.arrayOfMapsOfNullsAndFlags;
		this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull = builder.arrayOfNullsAndMapsOfNullsAndFlagsOrNull;
		this.mapOfArraysOfFlags = builder.mapOfArraysOfFlags;
		this.mapOfArraysOfFlagsOrNull = builder.mapOfArraysOfFlagsOrNull;
		this.mapOfNullsAndArraysOfFlags = builder.mapOfNullsAndArraysOfFlags;
		this.mapOfArraysOfNullsAndFlags = builder.mapOfArraysOfNullsAndFlags;
		this.mapOfNullsAndArraysOfNullsAndFlagsOrNull = builder.mapOfNullsAndArraysOfNullsAndFlagsOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.flag)
			.append(this.flagWithDescription)
			.append(this.flagOrNull)
			.append(this.arrayOfFlags)
			.append(this.arrayOfArraysOfFlags)
			.append(this.arrayOfFlagsAndNulls)
			.append(this.arrayOfFlagsOrNull)
			.append(this.arrayOfFlagsAndNullsOrNull)
			.append(this.mapOfFlags)
			.append(this.mapOfMapsOfFlags)
			.append(this.mapOfNullsAndFlags)
			.append(this.mapOfFlagsOrNull)
			.append(this.mapOfNullsAndFlagsOrNull)
			.append(this.arrayOfMapsOfFlags)
			.append(this.arrayOfMapsOfFlagsOrNull)
			.append(this.arrayOfNullsAndMapsOfFlags)
			.append(this.arrayOfMapsOfNullsAndFlags)
			.append(this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull)
			.append(this.mapOfArraysOfFlags)
			.append(this.mapOfArraysOfFlagsOrNull)
			.append(this.mapOfNullsAndArraysOfFlags)
			.append(this.mapOfArraysOfNullsAndFlags)
			.append(this.mapOfNullsAndArraysOfNullsAndFlagsOrNull)
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
		JsonBooleanTest rhs = (JsonBooleanTest) other;
		return new EqualsBuilder()
			.append(this.flag, rhs.flag)
			.append(this.flagWithDescription, rhs.flagWithDescription)
			.append(this.flagOrNull, rhs.flagOrNull)
			.append(this.arrayOfFlags, rhs.arrayOfFlags)
			.append(this.arrayOfArraysOfFlags, rhs.arrayOfArraysOfFlags)
			.append(this.arrayOfFlagsAndNulls, rhs.arrayOfFlagsAndNulls)
			.append(this.arrayOfFlagsOrNull, rhs.arrayOfFlagsOrNull)
			.append(this.arrayOfFlagsAndNullsOrNull, rhs.arrayOfFlagsAndNullsOrNull)
			.append(this.mapOfFlags, rhs.mapOfFlags)
			.append(this.mapOfMapsOfFlags, rhs.mapOfMapsOfFlags)
			.append(this.mapOfNullsAndFlags, rhs.mapOfNullsAndFlags)
			.append(this.mapOfFlagsOrNull, rhs.mapOfFlagsOrNull)
			.append(this.mapOfNullsAndFlagsOrNull, rhs.mapOfNullsAndFlagsOrNull)
			.append(this.arrayOfMapsOfFlags, rhs.arrayOfMapsOfFlags)
			.append(this.arrayOfMapsOfFlagsOrNull, rhs.arrayOfMapsOfFlagsOrNull)
			.append(this.arrayOfNullsAndMapsOfFlags, rhs.arrayOfNullsAndMapsOfFlags)
			.append(this.arrayOfMapsOfNullsAndFlags, rhs.arrayOfMapsOfNullsAndFlags)
			.append(this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull, rhs.arrayOfNullsAndMapsOfNullsAndFlagsOrNull)
			.append(this.mapOfArraysOfFlags, rhs.mapOfArraysOfFlags)
			.append(this.mapOfArraysOfFlagsOrNull, rhs.mapOfArraysOfFlagsOrNull)
			.append(this.mapOfNullsAndArraysOfFlags, rhs.mapOfNullsAndArraysOfFlags)
			.append(this.mapOfArraysOfNullsAndFlags, rhs.mapOfArraysOfNullsAndFlags)
			.append(this.mapOfNullsAndArraysOfNullsAndFlagsOrNull, rhs.mapOfNullsAndArraysOfNullsAndFlagsOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("flag", this.flag)
			.append("flagWithDescription", this.flagWithDescription)
			.append("flagOrNull", this.flagOrNull)
			.append("arrayOfFlags", this.arrayOfFlags)
			.append("arrayOfArraysOfFlags", this.arrayOfArraysOfFlags)
			.append("arrayOfFlagsAndNulls", this.arrayOfFlagsAndNulls)
			.append("arrayOfFlagsOrNull", this.arrayOfFlagsOrNull)
			.append("arrayOfFlagsAndNullsOrNull", this.arrayOfFlagsAndNullsOrNull)
			.append("mapOfFlags", this.mapOfFlags)
			.append("mapOfMapsOfFlags", this.mapOfMapsOfFlags)
			.append("mapOfNullsAndFlags", this.mapOfNullsAndFlags)
			.append("mapOfFlagsOrNull", this.mapOfFlagsOrNull)
			.append("mapOfNullsAndFlagsOrNull", this.mapOfNullsAndFlagsOrNull)
			.append("arrayOfMapsOfFlags", this.arrayOfMapsOfFlags)
			.append("arrayOfMapsOfFlagsOrNull", this.arrayOfMapsOfFlagsOrNull)
			.append("arrayOfNullsAndMapsOfFlags", this.arrayOfNullsAndMapsOfFlags)
			.append("arrayOfMapsOfNullsAndFlags", this.arrayOfMapsOfNullsAndFlags)
			.append("arrayOfNullsAndMapsOfNullsAndFlagsOrNull", this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull)
			.append("mapOfArraysOfFlags", this.mapOfArraysOfFlags)
			.append("mapOfArraysOfFlagsOrNull", this.mapOfArraysOfFlagsOrNull)
			.append("mapOfNullsAndArraysOfFlags", this.mapOfNullsAndArraysOfFlags)
			.append("mapOfArraysOfNullsAndFlags", this.mapOfArraysOfNullsAndFlags)
			.append("mapOfNullsAndArraysOfNullsAndFlagsOrNull", this.mapOfNullsAndArraysOfNullsAndFlagsOrNull)
			.toString();
	}
	
	public JsonBooleanTest clone() {
		return new JsonBooleanTest(JsonBooleanTest.Builder.create()
				.withFlag(this.flag)
				.withFlagWithDescription(this.flagWithDescription)
				.withFlagOrNull(this.flagOrNull)
				.withArrayOfFlags(this.arrayOfFlags)
				.withArrayOfArraysOfFlags(this.arrayOfArraysOfFlags)
				.withArrayOfFlagsAndNulls(this.arrayOfFlagsAndNulls)
				.withArrayOfFlagsOrNull(this.arrayOfFlagsOrNull)
				.withArrayOfFlagsAndNullsOrNull(this.arrayOfFlagsAndNullsOrNull)
				.withMapOfFlags(this.mapOfFlags)
				.withMapOfMapsOfFlags(this.mapOfMapsOfFlags)
				.withMapOfNullsAndFlags(this.mapOfNullsAndFlags)
				.withMapOfFlagsOrNull(this.mapOfFlagsOrNull)
				.withMapOfNullsAndFlagsOrNull(this.mapOfNullsAndFlagsOrNull)
				.withArrayOfMapsOfFlags(this.arrayOfMapsOfFlags)
				.withArrayOfMapsOfFlagsOrNull(this.arrayOfMapsOfFlagsOrNull)
				.withArrayOfNullsAndMapsOfFlags(this.arrayOfNullsAndMapsOfFlags)
				.withArrayOfMapsOfNullsAndFlags(this.arrayOfMapsOfNullsAndFlags)
				.withArrayOfNullsAndMapsOfNullsAndFlagsOrNull(this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull)
				.withMapOfArraysOfFlags(this.mapOfArraysOfFlags)
				.withMapOfArraysOfFlagsOrNull(this.mapOfArraysOfFlagsOrNull)
				.withMapOfNullsAndArraysOfFlags(this.mapOfNullsAndArraysOfFlags)
				.withMapOfArraysOfNullsAndFlags(this.mapOfArraysOfNullsAndFlags)
				.withMapOfNullsAndArraysOfNullsAndFlagsOrNull(this.mapOfNullsAndArraysOfNullsAndFlagsOrNull)
		);
	}

	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.flag = value;
	}

	/**
	 * This is a flag.
	 */
	public Boolean getFlagWithDescription() {
		return this.flagWithDescription;
	}

	/**
	 * This is a flag.
	 */
	public void setFlagWithDescription(Boolean value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.flagWithDescription = value;
	}

	public Boolean getFlagOrNull() {
		return this.flagOrNull;
	}

	public void setFlagOrNull(Boolean value) {
		this.flagOrNull = value;
	}

	public java.util.List<Boolean> getArrayOfFlags() {
		return this.arrayOfFlags;
	}

	public void setArrayOfFlags(java.util.List<Boolean> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfFlags = value;
	}

	public java.util.List<java.util.List<Boolean>> getArrayOfArraysOfFlags() {
		return this.arrayOfArraysOfFlags;
	}

	public void setArrayOfArraysOfFlags(java.util.List<java.util.List<Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfArraysOfFlags = value;
	}

	public java.util.List<Boolean> getArrayOfFlagsAndNulls() {
		return this.arrayOfFlagsAndNulls;
	}

	public void setArrayOfFlagsAndNulls(java.util.List<Boolean> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfFlagsAndNulls = value;
	}

	public java.util.List<Boolean> getArrayOfFlagsOrNull() {
		return this.arrayOfFlagsOrNull;
	}

	public void setArrayOfFlagsOrNull(java.util.List<Boolean> value) {
		this.arrayOfFlagsOrNull = value;
	}

	public java.util.List<Boolean> getArrayOfFlagsAndNullsOrNull() {
		return this.arrayOfFlagsAndNullsOrNull;
	}

	public void setArrayOfFlagsAndNullsOrNull(java.util.List<Boolean> value) {
		this.arrayOfFlagsAndNullsOrNull = value;
	}

	public java.util.Map<String, Boolean> getMapOfFlags() {
		return this.mapOfFlags;
	}

	public void setMapOfFlags(java.util.Map<String, Boolean> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfFlags = value;
	}

	public java.util.Map<String, java.util.Map<String, Boolean>> getMapOfMapsOfFlags() {
		return this.mapOfMapsOfFlags;
	}

	public void setMapOfMapsOfFlags(java.util.Map<String, java.util.Map<String, Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfMapsOfFlags = value;
	}

	public java.util.Map<String, Boolean> getMapOfNullsAndFlags() {
		return this.mapOfNullsAndFlags;
	}

	public void setMapOfNullsAndFlags(java.util.Map<String, Boolean> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndFlags = value;
	}

	public java.util.Map<String, Boolean> getMapOfFlagsOrNull() {
		return this.mapOfFlagsOrNull;
	}

	public void setMapOfFlagsOrNull(java.util.Map<String, Boolean> value) {
		this.mapOfFlagsOrNull = value;
	}

	public java.util.Map<String, Boolean> getMapOfNullsAndFlagsOrNull() {
		return this.mapOfNullsAndFlagsOrNull;
	}

	public void setMapOfNullsAndFlagsOrNull(java.util.Map<String, Boolean> value) {
		this.mapOfNullsAndFlagsOrNull = value;
	}

	public java.util.List<java.util.Map<String, Boolean>> getArrayOfMapsOfFlags() {
		return this.arrayOfMapsOfFlags;
	}

	public void setArrayOfMapsOfFlags(java.util.List<java.util.Map<String, Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfFlags = value;
	}

	public java.util.List<java.util.Map<String, Boolean>> getArrayOfMapsOfFlagsOrNull() {
		return this.arrayOfMapsOfFlagsOrNull;
	}

	public void setArrayOfMapsOfFlagsOrNull(java.util.List<java.util.Map<String, Boolean>> value) {
		this.arrayOfMapsOfFlagsOrNull = value;
	}

	public java.util.List<java.util.Map<String, Boolean>> getArrayOfNullsAndMapsOfFlags() {
		return this.arrayOfNullsAndMapsOfFlags;
	}

	public void setArrayOfNullsAndMapsOfFlags(java.util.List<java.util.Map<String, Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfNullsAndMapsOfFlags = value;
	}

	public java.util.List<java.util.Map<String, Boolean>> getArrayOfMapsOfNullsAndFlags() {
		return this.arrayOfMapsOfNullsAndFlags;
	}

	public void setArrayOfMapsOfNullsAndFlags(java.util.List<java.util.Map<String, Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfNullsAndFlags = value;
	}

	public java.util.List<java.util.Map<String, Boolean>> getArrayOfNullsAndMapsOfNullsAndFlagsOrNull() {
		return this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull;
	}

	public void setArrayOfNullsAndMapsOfNullsAndFlagsOrNull(java.util.List<java.util.Map<String, Boolean>> value) {
		this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull = value;
	}

	public java.util.Map<String, java.util.List<Boolean>> getMapOfArraysOfFlags() {
		return this.mapOfArraysOfFlags;
	}

	public void setMapOfArraysOfFlags(java.util.Map<String, java.util.List<Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfFlags = value;
	}

	public java.util.Map<String, java.util.List<Boolean>> getMapOfArraysOfFlagsOrNull() {
		return this.mapOfArraysOfFlagsOrNull;
	}

	public void setMapOfArraysOfFlagsOrNull(java.util.Map<String, java.util.List<Boolean>> value) {
		this.mapOfArraysOfFlagsOrNull = value;
	}

	public java.util.Map<String, java.util.List<Boolean>> getMapOfNullsAndArraysOfFlags() {
		return this.mapOfNullsAndArraysOfFlags;
	}

	public void setMapOfNullsAndArraysOfFlags(java.util.Map<String, java.util.List<Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndArraysOfFlags = value;
	}

	public java.util.Map<String, java.util.List<Boolean>> getMapOfArraysOfNullsAndFlags() {
		return this.mapOfArraysOfNullsAndFlags;
	}

	public void setMapOfArraysOfNullsAndFlags(java.util.Map<String, java.util.List<Boolean>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfNullsAndFlags = value;
	}

	public java.util.Map<String, java.util.List<Boolean>> getMapOfNullsAndArraysOfNullsAndFlagsOrNull() {
		return this.mapOfNullsAndArraysOfNullsAndFlagsOrNull;
	}

	public void setMapOfNullsAndArraysOfNullsAndFlagsOrNull(java.util.Map<String, java.util.List<Boolean>> value) {
		this.mapOfNullsAndArraysOfNullsAndFlagsOrNull = value;
	}

	@JsonCreator
	public static JsonBooleanTest jacksonHelper(
			@JsonProperty("flag") Boolean flag,
			@JsonProperty("flagWithDescription") Boolean flagWithDescription,
			@JsonProperty("flagOrNull") Boolean flagOrNull,
			@JsonProperty("arrayOfFlags") java.util.List<Boolean> arrayOfFlags,
			@JsonProperty("arrayOfArraysOfFlags") java.util.List<java.util.List<Boolean>> arrayOfArraysOfFlags,
			@JsonProperty("arrayOfFlagsAndNulls") java.util.List<Boolean> arrayOfFlagsAndNulls,
			@JsonProperty("arrayOfFlagsOrNull") java.util.List<Boolean> arrayOfFlagsOrNull,
			@JsonProperty("arrayOfFlagsAndNullsOrNull") java.util.List<Boolean> arrayOfFlagsAndNullsOrNull,
			@JsonProperty("mapOfFlags") java.util.Map<String, Boolean> mapOfFlags,
			@JsonProperty("mapOfMapsOfFlags") java.util.Map<String, java.util.Map<String, Boolean>> mapOfMapsOfFlags,
			@JsonProperty("mapOfNullsAndFlags") java.util.Map<String, Boolean> mapOfNullsAndFlags,
			@JsonProperty("mapOfFlagsOrNull") java.util.Map<String, Boolean> mapOfFlagsOrNull,
			@JsonProperty("mapOfNullsAndFlagsOrNull") java.util.Map<String, Boolean> mapOfNullsAndFlagsOrNull,
			@JsonProperty("arrayOfMapsOfFlags") java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlags,
			@JsonProperty("arrayOfMapsOfFlagsOrNull") java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlagsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfFlags") java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfFlags,
			@JsonProperty("arrayOfMapsOfNullsAndFlags") java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfNullsAndFlags,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndFlagsOrNull") java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfNullsAndFlagsOrNull,
			@JsonProperty("mapOfArraysOfFlags") java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlags,
			@JsonProperty("mapOfArraysOfFlagsOrNull") java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlagsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfFlags") java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfFlags,
			@JsonProperty("mapOfArraysOfNullsAndFlags") java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfNullsAndFlags,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndFlagsOrNull") java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfNullsAndFlagsOrNull
	) {
		return new JsonBooleanTest(JsonBooleanTest.Builder.create()
				.withFlag(flag)
				.withFlagWithDescription(flagWithDescription)
				.withFlagOrNull(flagOrNull)
				.withArrayOfFlags(arrayOfFlags)
				.withArrayOfArraysOfFlags(arrayOfArraysOfFlags)
				.withArrayOfFlagsAndNulls(arrayOfFlagsAndNulls)
				.withArrayOfFlagsOrNull(arrayOfFlagsOrNull)
				.withArrayOfFlagsAndNullsOrNull(arrayOfFlagsAndNullsOrNull)
				.withMapOfFlags(mapOfFlags)
				.withMapOfMapsOfFlags(mapOfMapsOfFlags)
				.withMapOfNullsAndFlags(mapOfNullsAndFlags)
				.withMapOfFlagsOrNull(mapOfFlagsOrNull)
				.withMapOfNullsAndFlagsOrNull(mapOfNullsAndFlagsOrNull)
				.withArrayOfMapsOfFlags(arrayOfMapsOfFlags)
				.withArrayOfMapsOfFlagsOrNull(arrayOfMapsOfFlagsOrNull)
				.withArrayOfNullsAndMapsOfFlags(arrayOfNullsAndMapsOfFlags)
				.withArrayOfMapsOfNullsAndFlags(arrayOfMapsOfNullsAndFlags)
				.withArrayOfNullsAndMapsOfNullsAndFlagsOrNull(arrayOfNullsAndMapsOfNullsAndFlagsOrNull)
				.withMapOfArraysOfFlags(mapOfArraysOfFlags)
				.withMapOfArraysOfFlagsOrNull(mapOfArraysOfFlagsOrNull)
				.withMapOfNullsAndArraysOfFlags(mapOfNullsAndArraysOfFlags)
				.withMapOfArraysOfNullsAndFlags(mapOfArraysOfNullsAndFlags)
				.withMapOfNullsAndArraysOfNullsAndFlagsOrNull(mapOfNullsAndArraysOfNullsAndFlagsOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_flag__ {}
	private static final class __MISSING_flagWithDescription__ {}
	private static final class __MISSING_arrayOfFlags__ {}
	private static final class __MISSING_arrayOfArraysOfFlags__ {}
	private static final class __MISSING_arrayOfFlagsAndNulls__ {}
	private static final class __MISSING_mapOfFlags__ {}
	private static final class __MISSING_mapOfMapsOfFlags__ {}
	private static final class __MISSING_mapOfNullsAndFlags__ {}
	private static final class __MISSING_arrayOfMapsOfFlags__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfFlags__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndFlags__ {}
	private static final class __MISSING_mapOfArraysOfFlags__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfFlags__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndFlags__ {}

	public static final class Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> {

		private Boolean flag;
		private Boolean flagWithDescription;
		private Boolean flagOrNull;
		private java.util.List<Boolean> arrayOfFlags;
		private java.util.List<java.util.List<Boolean>> arrayOfArraysOfFlags;
		private java.util.List<Boolean> arrayOfFlagsAndNulls;
		private java.util.List<Boolean> arrayOfFlagsOrNull;
		private java.util.List<Boolean> arrayOfFlagsAndNullsOrNull;
		private java.util.Map<String, Boolean> mapOfFlags;
		private java.util.Map<String, java.util.Map<String, Boolean>> mapOfMapsOfFlags;
		private java.util.Map<String, Boolean> mapOfNullsAndFlags;
		private java.util.Map<String, Boolean> mapOfFlagsOrNull;
		private java.util.Map<String, Boolean> mapOfNullsAndFlagsOrNull;
		private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlags;
		private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfFlagsOrNull;
		private java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfFlags;
		private java.util.List<java.util.Map<String, Boolean>> arrayOfMapsOfNullsAndFlags;
		private java.util.List<java.util.Map<String, Boolean>> arrayOfNullsAndMapsOfNullsAndFlagsOrNull;
		private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlags;
		private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfFlagsOrNull;
		private java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfFlags;
		private java.util.Map<String, java.util.List<Boolean>> mapOfArraysOfNullsAndFlags;
		private java.util.Map<String, java.util.List<Boolean>> mapOfNullsAndArraysOfNullsAndFlagsOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_flag__,
				__MISSING_flagWithDescription__,
				__MISSING_arrayOfFlags__,
				__MISSING_arrayOfArraysOfFlags__,
				__MISSING_arrayOfFlagsAndNulls__,
				__MISSING_mapOfFlags__,
				__MISSING_mapOfMapsOfFlags__,
				__MISSING_mapOfNullsAndFlags__,
				__MISSING_arrayOfMapsOfFlags__,
				__MISSING_arrayOfNullsAndMapsOfFlags__,
				__MISSING_arrayOfMapsOfNullsAndFlags__,
				__MISSING_mapOfArraysOfFlags__,
				__MISSING_mapOfNullsAndArraysOfFlags__,
				__MISSING_mapOfArraysOfNullsAndFlags__
				> create() {
			return new Builder<
				__MISSING_flag__,
				__MISSING_flagWithDescription__,
				__MISSING_arrayOfFlags__,
				__MISSING_arrayOfArraysOfFlags__,
				__MISSING_arrayOfFlagsAndNulls__,
				__MISSING_mapOfFlags__,
				__MISSING_mapOfMapsOfFlags__,
				__MISSING_mapOfNullsAndFlags__,
				__MISSING_arrayOfMapsOfFlags__,
				__MISSING_arrayOfNullsAndMapsOfFlags__,
				__MISSING_arrayOfMapsOfNullsAndFlags__,
				__MISSING_mapOfArraysOfFlags__,
				__MISSING_mapOfNullsAndArraysOfFlags__,
				__MISSING_mapOfArraysOfNullsAndFlags__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonBooleanTest.__OK__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withFlag(Boolean value) {
			this.flag = value;
			return (Builder<
				JsonBooleanTest.__OK__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		/**
		 * This is a flag.
		 */
		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withFlagWithDescription(Boolean value) {
			this.flagWithDescription = value;
			return (Builder<
				__HAS_flag__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withFlagOrNull(Boolean value) {
			this.flagOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfFlags(java.util.List<Boolean> value) {
			this.arrayOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfArraysOfFlags(java.util.List<java.util.List<Boolean>> value) {
			this.arrayOfArraysOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfFlagsAndNulls(java.util.List<Boolean> value) {
			this.arrayOfFlagsAndNulls = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfFlagsOrNull(java.util.List<Boolean> value) {
			this.arrayOfFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfFlagsAndNullsOrNull(java.util.List<Boolean> value) {
			this.arrayOfFlagsAndNullsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfFlags(java.util.Map<String, Boolean> value) {
			this.mapOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfMapsOfFlags(java.util.Map<String, java.util.Map<String, Boolean>> value) {
			this.mapOfMapsOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfNullsAndFlags(java.util.Map<String, Boolean> value) {
			this.mapOfNullsAndFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfFlagsOrNull(java.util.Map<String, Boolean> value) {
			this.mapOfFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfNullsAndFlagsOrNull(java.util.Map<String, Boolean> value) {
			this.mapOfNullsAndFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfMapsOfFlags(java.util.List<java.util.Map<String, Boolean>> value) {
			this.arrayOfMapsOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfMapsOfFlagsOrNull(java.util.List<java.util.Map<String, Boolean>> value) {
			this.arrayOfMapsOfFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfNullsAndMapsOfFlags(java.util.List<java.util.Map<String, Boolean>> value) {
			this.arrayOfNullsAndMapsOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfMapsOfNullsAndFlags(java.util.List<java.util.Map<String, Boolean>> value) {
			this.arrayOfMapsOfNullsAndFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withArrayOfNullsAndMapsOfNullsAndFlagsOrNull(java.util.List<java.util.Map<String, Boolean>> value) {
			this.arrayOfNullsAndMapsOfNullsAndFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfArraysOfFlags(java.util.Map<String, java.util.List<Boolean>> value) {
			this.mapOfArraysOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfArraysOfFlagsOrNull(java.util.Map<String, java.util.List<Boolean>> value) {
			this.mapOfArraysOfFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfNullsAndArraysOfFlags(java.util.Map<String, java.util.List<Boolean>> value) {
			this.mapOfNullsAndArraysOfFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				JsonBooleanTest.__OK__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				JsonBooleanTest.__OK__
				> withMapOfArraysOfNullsAndFlags(java.util.Map<String, java.util.List<Boolean>> value) {
			this.mapOfArraysOfNullsAndFlags = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				JsonBooleanTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				> withMapOfNullsAndArraysOfNullsAndFlagsOrNull(java.util.Map<String, java.util.List<Boolean>> value) {
			this.mapOfNullsAndArraysOfNullsAndFlagsOrNull = value;
			return (Builder<
				__HAS_flag__,
				__HAS_flagWithDescription__,
				__HAS_arrayOfFlags__,
				__HAS_arrayOfArraysOfFlags__,
				__HAS_arrayOfFlagsAndNulls__,
				__HAS_mapOfFlags__,
				__HAS_mapOfMapsOfFlags__,
				__HAS_mapOfNullsAndFlags__,
				__HAS_arrayOfMapsOfFlags__,
				__HAS_arrayOfNullsAndMapsOfFlags__,
				__HAS_arrayOfMapsOfNullsAndFlags__,
				__HAS_mapOfArraysOfFlags__,
				__HAS_mapOfNullsAndArraysOfFlags__,
				__HAS_mapOfArraysOfNullsAndFlags__
				>) this;
		}
	}
}
