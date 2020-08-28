package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests string values.
 */
public final class JsonStringTest {

	private final String name;
	private final String nameWithDescription;
	private final String nameOrNull;
	private final java.util.List<String> arrayOfNames;
	private final java.util.List<java.util.List<String>> arrayOfArraysOfNames;
	private final java.util.List<String> arrayOfNamesAndNulls;
	private final java.util.List<String> arrayOfNamesOrNull;
	private final java.util.List<String> arrayOfNamesAndNullsOrNull;
	private final java.util.Map<String, String> mapOfNames;
	private final java.util.Map<String, java.util.Map<String, String>> mapOfMapsOfNames;
	private final java.util.Map<String, String> mapOfNullsAndNames;
	private final java.util.Map<String, String> mapOfNamesOrNull;
	private final java.util.Map<String, String> mapOfNullsAndNamesOrNull;
	private final java.util.List<java.util.Map<String, String>> arrayOfMapsOfNames;
	private final java.util.List<java.util.Map<String, String>> arrayOfMapsOfNamesOrNull;
	private final java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNames;
	private final java.util.List<java.util.Map<String, String>> arrayOfMapsOfNullsAndNames;
	private final java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNullsAndNamesOrNull;
	private final java.util.Map<String, java.util.List<String>> mapOfArraysOfNames;
	private final java.util.Map<String, java.util.List<String>> mapOfArraysOfNamesOrNull;
	private final java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNames;
	private final java.util.Map<String, java.util.List<String>> mapOfArraysOfNullsAndNames;
	private final java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNullsAndNamesOrNull;

	public JsonStringTest(Builder<
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__,
			JsonStringTest.__OK__
			> builder) {
		Validate.notNull(builder.name, "Argument 'name' must not be null.");
		Validate.notNull(builder.nameWithDescription, "Argument 'nameWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfNames, "Argument 'arrayOfNames' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfNames, "Argument 'arrayOfArraysOfNames' must not be null.");
		Validate.notNull(builder.arrayOfNamesAndNulls, "Argument 'arrayOfNamesAndNulls' must not be null.");
		Validate.notNull(builder.mapOfNames, "Argument 'mapOfNames' must not be null.");
		Validate.notNull(builder.mapOfMapsOfNames, "Argument 'mapOfMapsOfNames' must not be null.");
		Validate.notNull(builder.mapOfNullsAndNames, "Argument 'mapOfNullsAndNames' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNames, "Argument 'arrayOfMapsOfNames' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfNames, "Argument 'arrayOfNullsAndMapsOfNames' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndNames, "Argument 'arrayOfMapsOfNullsAndNames' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNames, "Argument 'mapOfArraysOfNames' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfNames, "Argument 'mapOfNullsAndArraysOfNames' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndNames, "Argument 'mapOfArraysOfNullsAndNames' must not be null.");
		this.name = builder.name;
		this.nameWithDescription = builder.nameWithDescription;
		this.nameOrNull = builder.nameOrNull;
		this.arrayOfNames = builder.arrayOfNames;
		this.arrayOfArraysOfNames = builder.arrayOfArraysOfNames;
		this.arrayOfNamesAndNulls = builder.arrayOfNamesAndNulls;
		this.arrayOfNamesOrNull = builder.arrayOfNamesOrNull;
		this.arrayOfNamesAndNullsOrNull = builder.arrayOfNamesAndNullsOrNull;
		this.mapOfNames = builder.mapOfNames;
		this.mapOfMapsOfNames = builder.mapOfMapsOfNames;
		this.mapOfNullsAndNames = builder.mapOfNullsAndNames;
		this.mapOfNamesOrNull = builder.mapOfNamesOrNull;
		this.mapOfNullsAndNamesOrNull = builder.mapOfNullsAndNamesOrNull;
		this.arrayOfMapsOfNames = builder.arrayOfMapsOfNames;
		this.arrayOfMapsOfNamesOrNull = builder.arrayOfMapsOfNamesOrNull;
		this.arrayOfNullsAndMapsOfNames = builder.arrayOfNullsAndMapsOfNames;
		this.arrayOfMapsOfNullsAndNames = builder.arrayOfMapsOfNullsAndNames;
		this.arrayOfNullsAndMapsOfNullsAndNamesOrNull = builder.arrayOfNullsAndMapsOfNullsAndNamesOrNull;
		this.mapOfArraysOfNames = builder.mapOfArraysOfNames;
		this.mapOfArraysOfNamesOrNull = builder.mapOfArraysOfNamesOrNull;
		this.mapOfNullsAndArraysOfNames = builder.mapOfNullsAndArraysOfNames;
		this.mapOfArraysOfNullsAndNames = builder.mapOfArraysOfNullsAndNames;
		this.mapOfNullsAndArraysOfNullsAndNamesOrNull = builder.mapOfNullsAndArraysOfNullsAndNamesOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.nameWithDescription)
			.append(this.nameOrNull)
			.append(this.arrayOfNames)
			.append(this.arrayOfArraysOfNames)
			.append(this.arrayOfNamesAndNulls)
			.append(this.arrayOfNamesOrNull)
			.append(this.arrayOfNamesAndNullsOrNull)
			.append(this.mapOfNames)
			.append(this.mapOfMapsOfNames)
			.append(this.mapOfNullsAndNames)
			.append(this.mapOfNamesOrNull)
			.append(this.mapOfNullsAndNamesOrNull)
			.append(this.arrayOfMapsOfNames)
			.append(this.arrayOfMapsOfNamesOrNull)
			.append(this.arrayOfNullsAndMapsOfNames)
			.append(this.arrayOfMapsOfNullsAndNames)
			.append(this.arrayOfNullsAndMapsOfNullsAndNamesOrNull)
			.append(this.mapOfArraysOfNames)
			.append(this.mapOfArraysOfNamesOrNull)
			.append(this.mapOfNullsAndArraysOfNames)
			.append(this.mapOfArraysOfNullsAndNames)
			.append(this.mapOfNullsAndArraysOfNullsAndNamesOrNull)
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
		JsonStringTest rhs = (JsonStringTest) other;
		return new EqualsBuilder()
			.append(this.name, rhs.name)
			.append(this.nameWithDescription, rhs.nameWithDescription)
			.append(this.nameOrNull, rhs.nameOrNull)
			.append(this.arrayOfNames, rhs.arrayOfNames)
			.append(this.arrayOfArraysOfNames, rhs.arrayOfArraysOfNames)
			.append(this.arrayOfNamesAndNulls, rhs.arrayOfNamesAndNulls)
			.append(this.arrayOfNamesOrNull, rhs.arrayOfNamesOrNull)
			.append(this.arrayOfNamesAndNullsOrNull, rhs.arrayOfNamesAndNullsOrNull)
			.append(this.mapOfNames, rhs.mapOfNames)
			.append(this.mapOfMapsOfNames, rhs.mapOfMapsOfNames)
			.append(this.mapOfNullsAndNames, rhs.mapOfNullsAndNames)
			.append(this.mapOfNamesOrNull, rhs.mapOfNamesOrNull)
			.append(this.mapOfNullsAndNamesOrNull, rhs.mapOfNullsAndNamesOrNull)
			.append(this.arrayOfMapsOfNames, rhs.arrayOfMapsOfNames)
			.append(this.arrayOfMapsOfNamesOrNull, rhs.arrayOfMapsOfNamesOrNull)
			.append(this.arrayOfNullsAndMapsOfNames, rhs.arrayOfNullsAndMapsOfNames)
			.append(this.arrayOfMapsOfNullsAndNames, rhs.arrayOfMapsOfNullsAndNames)
			.append(this.arrayOfNullsAndMapsOfNullsAndNamesOrNull, rhs.arrayOfNullsAndMapsOfNullsAndNamesOrNull)
			.append(this.mapOfArraysOfNames, rhs.mapOfArraysOfNames)
			.append(this.mapOfArraysOfNamesOrNull, rhs.mapOfArraysOfNamesOrNull)
			.append(this.mapOfNullsAndArraysOfNames, rhs.mapOfNullsAndArraysOfNames)
			.append(this.mapOfArraysOfNullsAndNames, rhs.mapOfArraysOfNullsAndNames)
			.append(this.mapOfNullsAndArraysOfNullsAndNamesOrNull, rhs.mapOfNullsAndArraysOfNullsAndNamesOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", this.name)
			.append("nameWithDescription", this.nameWithDescription)
			.append("nameOrNull", this.nameOrNull)
			.append("arrayOfNames", this.arrayOfNames)
			.append("arrayOfArraysOfNames", this.arrayOfArraysOfNames)
			.append("arrayOfNamesAndNulls", this.arrayOfNamesAndNulls)
			.append("arrayOfNamesOrNull", this.arrayOfNamesOrNull)
			.append("arrayOfNamesAndNullsOrNull", this.arrayOfNamesAndNullsOrNull)
			.append("mapOfNames", this.mapOfNames)
			.append("mapOfMapsOfNames", this.mapOfMapsOfNames)
			.append("mapOfNullsAndNames", this.mapOfNullsAndNames)
			.append("mapOfNamesOrNull", this.mapOfNamesOrNull)
			.append("mapOfNullsAndNamesOrNull", this.mapOfNullsAndNamesOrNull)
			.append("arrayOfMapsOfNames", this.arrayOfMapsOfNames)
			.append("arrayOfMapsOfNamesOrNull", this.arrayOfMapsOfNamesOrNull)
			.append("arrayOfNullsAndMapsOfNames", this.arrayOfNullsAndMapsOfNames)
			.append("arrayOfMapsOfNullsAndNames", this.arrayOfMapsOfNullsAndNames)
			.append("arrayOfNullsAndMapsOfNullsAndNamesOrNull", this.arrayOfNullsAndMapsOfNullsAndNamesOrNull)
			.append("mapOfArraysOfNames", this.mapOfArraysOfNames)
			.append("mapOfArraysOfNamesOrNull", this.mapOfArraysOfNamesOrNull)
			.append("mapOfNullsAndArraysOfNames", this.mapOfNullsAndArraysOfNames)
			.append("mapOfArraysOfNullsAndNames", this.mapOfArraysOfNullsAndNames)
			.append("mapOfNullsAndArraysOfNullsAndNamesOrNull", this.mapOfNullsAndArraysOfNullsAndNamesOrNull)
			.toString();
	}

	public String getName() { return this.name; }
	/**
	 * This is a name.
	 */
	public String getNameWithDescription() { return this.nameWithDescription; }
	public String getNameOrNull() { return this.nameOrNull; }
	public java.util.List<String> getArrayOfNames() { return this.arrayOfNames; }
	public java.util.List<java.util.List<String>> getArrayOfArraysOfNames() { return this.arrayOfArraysOfNames; }
	public java.util.List<String> getArrayOfNamesAndNulls() { return this.arrayOfNamesAndNulls; }
	public java.util.List<String> getArrayOfNamesOrNull() { return this.arrayOfNamesOrNull; }
	public java.util.List<String> getArrayOfNamesAndNullsOrNull() { return this.arrayOfNamesAndNullsOrNull; }
	public java.util.Map<String, String> getMapOfNames() { return this.mapOfNames; }
	public java.util.Map<String, java.util.Map<String, String>> getMapOfMapsOfNames() { return this.mapOfMapsOfNames; }
	public java.util.Map<String, String> getMapOfNullsAndNames() { return this.mapOfNullsAndNames; }
	public java.util.Map<String, String> getMapOfNamesOrNull() { return this.mapOfNamesOrNull; }
	public java.util.Map<String, String> getMapOfNullsAndNamesOrNull() { return this.mapOfNullsAndNamesOrNull; }
	public java.util.List<java.util.Map<String, String>> getArrayOfMapsOfNames() { return this.arrayOfMapsOfNames; }
	public java.util.List<java.util.Map<String, String>> getArrayOfMapsOfNamesOrNull() { return this.arrayOfMapsOfNamesOrNull; }
	public java.util.List<java.util.Map<String, String>> getArrayOfNullsAndMapsOfNames() { return this.arrayOfNullsAndMapsOfNames; }
	public java.util.List<java.util.Map<String, String>> getArrayOfMapsOfNullsAndNames() { return this.arrayOfMapsOfNullsAndNames; }
	public java.util.List<java.util.Map<String, String>> getArrayOfNullsAndMapsOfNullsAndNamesOrNull() { return this.arrayOfNullsAndMapsOfNullsAndNamesOrNull; }
	public java.util.Map<String, java.util.List<String>> getMapOfArraysOfNames() { return this.mapOfArraysOfNames; }
	public java.util.Map<String, java.util.List<String>> getMapOfArraysOfNamesOrNull() { return this.mapOfArraysOfNamesOrNull; }
	public java.util.Map<String, java.util.List<String>> getMapOfNullsAndArraysOfNames() { return this.mapOfNullsAndArraysOfNames; }
	public java.util.Map<String, java.util.List<String>> getMapOfArraysOfNullsAndNames() { return this.mapOfArraysOfNullsAndNames; }
	public java.util.Map<String, java.util.List<String>> getMapOfNullsAndArraysOfNullsAndNamesOrNull() { return this.mapOfNullsAndArraysOfNullsAndNamesOrNull; }

	@JsonCreator
	public static JsonStringTest jacksonHelper(
			@JsonProperty("name") String name,
			@JsonProperty("nameWithDescription") String nameWithDescription,
			@JsonProperty("nameOrNull") String nameOrNull,
			@JsonProperty("arrayOfNames") java.util.List<String> arrayOfNames,
			@JsonProperty("arrayOfArraysOfNames") java.util.List<java.util.List<String>> arrayOfArraysOfNames,
			@JsonProperty("arrayOfNamesAndNulls") java.util.List<String> arrayOfNamesAndNulls,
			@JsonProperty("arrayOfNamesOrNull") java.util.List<String> arrayOfNamesOrNull,
			@JsonProperty("arrayOfNamesAndNullsOrNull") java.util.List<String> arrayOfNamesAndNullsOrNull,
			@JsonProperty("mapOfNames") java.util.Map<String, String> mapOfNames,
			@JsonProperty("mapOfMapsOfNames") java.util.Map<String, java.util.Map<String, String>> mapOfMapsOfNames,
			@JsonProperty("mapOfNullsAndNames") java.util.Map<String, String> mapOfNullsAndNames,
			@JsonProperty("mapOfNamesOrNull") java.util.Map<String, String> mapOfNamesOrNull,
			@JsonProperty("mapOfNullsAndNamesOrNull") java.util.Map<String, String> mapOfNullsAndNamesOrNull,
			@JsonProperty("arrayOfMapsOfNames") java.util.List<java.util.Map<String, String>> arrayOfMapsOfNames,
			@JsonProperty("arrayOfMapsOfNamesOrNull") java.util.List<java.util.Map<String, String>> arrayOfMapsOfNamesOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfNames") java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNames,
			@JsonProperty("arrayOfMapsOfNullsAndNames") java.util.List<java.util.Map<String, String>> arrayOfMapsOfNullsAndNames,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndNamesOrNull") java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNullsAndNamesOrNull,
			@JsonProperty("mapOfArraysOfNames") java.util.Map<String, java.util.List<String>> mapOfArraysOfNames,
			@JsonProperty("mapOfArraysOfNamesOrNull") java.util.Map<String, java.util.List<String>> mapOfArraysOfNamesOrNull,
			@JsonProperty("mapOfNullsAndArraysOfNames") java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNames,
			@JsonProperty("mapOfArraysOfNullsAndNames") java.util.Map<String, java.util.List<String>> mapOfArraysOfNullsAndNames,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndNamesOrNull") java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNullsAndNamesOrNull
	) {
		return new JsonStringTest(JsonStringTest.Builder.create()
				.withName(name)
				.withNameWithDescription(nameWithDescription)
				.withNameOrNull(nameOrNull)
				.withArrayOfNames(arrayOfNames)
				.withArrayOfArraysOfNames(arrayOfArraysOfNames)
				.withArrayOfNamesAndNulls(arrayOfNamesAndNulls)
				.withArrayOfNamesOrNull(arrayOfNamesOrNull)
				.withArrayOfNamesAndNullsOrNull(arrayOfNamesAndNullsOrNull)
				.withMapOfNames(mapOfNames)
				.withMapOfMapsOfNames(mapOfMapsOfNames)
				.withMapOfNullsAndNames(mapOfNullsAndNames)
				.withMapOfNamesOrNull(mapOfNamesOrNull)
				.withMapOfNullsAndNamesOrNull(mapOfNullsAndNamesOrNull)
				.withArrayOfMapsOfNames(arrayOfMapsOfNames)
				.withArrayOfMapsOfNamesOrNull(arrayOfMapsOfNamesOrNull)
				.withArrayOfNullsAndMapsOfNames(arrayOfNullsAndMapsOfNames)
				.withArrayOfMapsOfNullsAndNames(arrayOfMapsOfNullsAndNames)
				.withArrayOfNullsAndMapsOfNullsAndNamesOrNull(arrayOfNullsAndMapsOfNullsAndNamesOrNull)
				.withMapOfArraysOfNames(mapOfArraysOfNames)
				.withMapOfArraysOfNamesOrNull(mapOfArraysOfNamesOrNull)
				.withMapOfNullsAndArraysOfNames(mapOfNullsAndArraysOfNames)
				.withMapOfArraysOfNullsAndNames(mapOfArraysOfNullsAndNames)
				.withMapOfNullsAndArraysOfNullsAndNamesOrNull(mapOfNullsAndArraysOfNullsAndNamesOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_name__ {}
	private static final class __MISSING_nameWithDescription__ {}
	private static final class __MISSING_arrayOfNames__ {}
	private static final class __MISSING_arrayOfArraysOfNames__ {}
	private static final class __MISSING_arrayOfNamesAndNulls__ {}
	private static final class __MISSING_mapOfNames__ {}
	private static final class __MISSING_mapOfMapsOfNames__ {}
	private static final class __MISSING_mapOfNullsAndNames__ {}
	private static final class __MISSING_arrayOfMapsOfNames__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfNames__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndNames__ {}
	private static final class __MISSING_mapOfArraysOfNames__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfNames__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndNames__ {}

	public static final class Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> {

		private String name;
		private String nameWithDescription;
		private String nameOrNull;
		private java.util.List<String> arrayOfNames;
		private java.util.List<java.util.List<String>> arrayOfArraysOfNames;
		private java.util.List<String> arrayOfNamesAndNulls;
		private java.util.List<String> arrayOfNamesOrNull;
		private java.util.List<String> arrayOfNamesAndNullsOrNull;
		private java.util.Map<String, String> mapOfNames;
		private java.util.Map<String, java.util.Map<String, String>> mapOfMapsOfNames;
		private java.util.Map<String, String> mapOfNullsAndNames;
		private java.util.Map<String, String> mapOfNamesOrNull;
		private java.util.Map<String, String> mapOfNullsAndNamesOrNull;
		private java.util.List<java.util.Map<String, String>> arrayOfMapsOfNames;
		private java.util.List<java.util.Map<String, String>> arrayOfMapsOfNamesOrNull;
		private java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNames;
		private java.util.List<java.util.Map<String, String>> arrayOfMapsOfNullsAndNames;
		private java.util.List<java.util.Map<String, String>> arrayOfNullsAndMapsOfNullsAndNamesOrNull;
		private java.util.Map<String, java.util.List<String>> mapOfArraysOfNames;
		private java.util.Map<String, java.util.List<String>> mapOfArraysOfNamesOrNull;
		private java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNames;
		private java.util.Map<String, java.util.List<String>> mapOfArraysOfNullsAndNames;
		private java.util.Map<String, java.util.List<String>> mapOfNullsAndArraysOfNullsAndNamesOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_name__,
				__MISSING_nameWithDescription__,
				__MISSING_arrayOfNames__,
				__MISSING_arrayOfArraysOfNames__,
				__MISSING_arrayOfNamesAndNulls__,
				__MISSING_mapOfNames__,
				__MISSING_mapOfMapsOfNames__,
				__MISSING_mapOfNullsAndNames__,
				__MISSING_arrayOfMapsOfNames__,
				__MISSING_arrayOfNullsAndMapsOfNames__,
				__MISSING_arrayOfMapsOfNullsAndNames__,
				__MISSING_mapOfArraysOfNames__,
				__MISSING_mapOfNullsAndArraysOfNames__,
				__MISSING_mapOfArraysOfNullsAndNames__
				> create() {
			return new Builder<
				__MISSING_name__,
				__MISSING_nameWithDescription__,
				__MISSING_arrayOfNames__,
				__MISSING_arrayOfArraysOfNames__,
				__MISSING_arrayOfNamesAndNulls__,
				__MISSING_mapOfNames__,
				__MISSING_mapOfMapsOfNames__,
				__MISSING_mapOfNullsAndNames__,
				__MISSING_arrayOfMapsOfNames__,
				__MISSING_arrayOfNullsAndMapsOfNames__,
				__MISSING_arrayOfMapsOfNullsAndNames__,
				__MISSING_mapOfArraysOfNames__,
				__MISSING_mapOfNullsAndArraysOfNames__,
				__MISSING_mapOfArraysOfNullsAndNames__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonStringTest.__OK__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withName(String value) {
			this.name = value;
			return (Builder<
				JsonStringTest.__OK__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		/**
		 * This is a name.
		 */
		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withNameWithDescription(String value) {
			this.nameWithDescription = value;
			return (Builder<
				__HAS_name__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withNameOrNull(String value) {
			this.nameOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				JsonStringTest.__OK__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNames(java.util.List<String> value) {
			this.arrayOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				JsonStringTest.__OK__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfArraysOfNames(java.util.List<java.util.List<String>> value) {
			this.arrayOfArraysOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNamesAndNulls(java.util.List<String> value) {
			this.arrayOfNamesAndNulls = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNamesOrNull(java.util.List<String> value) {
			this.arrayOfNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNamesAndNullsOrNull(java.util.List<String> value) {
			this.arrayOfNamesAndNullsOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				JsonStringTest.__OK__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNames(java.util.Map<String, String> value) {
			this.mapOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				JsonStringTest.__OK__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfMapsOfNames(java.util.Map<String, java.util.Map<String, String>> value) {
			this.mapOfMapsOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNullsAndNames(java.util.Map<String, String> value) {
			this.mapOfNullsAndNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNamesOrNull(java.util.Map<String, String> value) {
			this.mapOfNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNullsAndNamesOrNull(java.util.Map<String, String> value) {
			this.mapOfNullsAndNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfMapsOfNames(java.util.List<java.util.Map<String, String>> value) {
			this.arrayOfMapsOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfMapsOfNamesOrNull(java.util.List<java.util.Map<String, String>> value) {
			this.arrayOfMapsOfNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNullsAndMapsOfNames(java.util.List<java.util.Map<String, String>> value) {
			this.arrayOfNullsAndMapsOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfMapsOfNullsAndNames(java.util.List<java.util.Map<String, String>> value) {
			this.arrayOfMapsOfNullsAndNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withArrayOfNullsAndMapsOfNullsAndNamesOrNull(java.util.List<java.util.Map<String, String>> value) {
			this.arrayOfNullsAndMapsOfNullsAndNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfArraysOfNames(java.util.Map<String, java.util.List<String>> value) {
			this.mapOfArraysOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfArraysOfNamesOrNull(java.util.Map<String, java.util.List<String>> value) {
			this.mapOfArraysOfNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNullsAndArraysOfNames(java.util.Map<String, java.util.List<String>> value) {
			this.mapOfNullsAndArraysOfNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				JsonStringTest.__OK__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				JsonStringTest.__OK__
				> withMapOfArraysOfNullsAndNames(java.util.Map<String, java.util.List<String>> value) {
			this.mapOfArraysOfNullsAndNames = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				JsonStringTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				> withMapOfNullsAndArraysOfNullsAndNamesOrNull(java.util.Map<String, java.util.List<String>> value) {
			this.mapOfNullsAndArraysOfNullsAndNamesOrNull = value;
			return (Builder<
				__HAS_name__,
				__HAS_nameWithDescription__,
				__HAS_arrayOfNames__,
				__HAS_arrayOfArraysOfNames__,
				__HAS_arrayOfNamesAndNulls__,
				__HAS_mapOfNames__,
				__HAS_mapOfMapsOfNames__,
				__HAS_mapOfNullsAndNames__,
				__HAS_arrayOfMapsOfNames__,
				__HAS_arrayOfNullsAndMapsOfNames__,
				__HAS_arrayOfMapsOfNullsAndNames__,
				__HAS_mapOfArraysOfNames__,
				__HAS_mapOfNullsAndArraysOfNames__,
				__HAS_mapOfArraysOfNullsAndNames__
				>) this;
		}
	}
}
