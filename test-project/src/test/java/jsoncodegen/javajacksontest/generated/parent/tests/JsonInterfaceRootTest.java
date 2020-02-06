package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests interface fields.
 */
public final class JsonInterfaceRootTest {

	private final jsoncodegen.javajacksontest.generated.JsonInterface object_;
	private final jsoncodegen.javajacksontest.generated.JsonInterface objectWithDescription;
	private final jsoncodegen.javajacksontest.generated.JsonInterface objectOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjects;
	private final java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNulls;
	private final java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsOrNull;
	private final java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNullsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjects;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjects;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjectsOrNull;
	private final java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjectsOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjects;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjectsOrNull;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfObjects;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfNullsAndObjects;
	private final java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjects;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjectsOrNull;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfObjects;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfNullsAndObjects;
	private final java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull;

	public JsonInterfaceRootTest(Builder<
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__,
			JsonInterfaceRootTest.__OK__
			> builder) {
		Validate.notNull(builder.object_, "Argument 'object_' must not be null.");
		Validate.notNull(builder.objectWithDescription, "Argument 'objectWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfObjects, "Argument 'arrayOfObjects' must not be null.");
		Validate.notNull(builder.arrayOfObjectsAndNulls, "Argument 'arrayOfObjectsAndNulls' must not be null.");
		Validate.notNull(builder.mapOfObjects, "Argument 'mapOfObjects' must not be null.");
		Validate.notNull(builder.mapOfNullsAndObjects, "Argument 'mapOfNullsAndObjects' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfObjects, "Argument 'arrayOfMapsOfObjects' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfObjects, "Argument 'arrayOfNullsAndMapsOfObjects' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndObjects, "Argument 'arrayOfMapsOfNullsAndObjects' must not be null.");
		Validate.notNull(builder.mapOfArraysOfObjects, "Argument 'mapOfArraysOfObjects' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfObjects, "Argument 'mapOfNullsAndArraysOfObjects' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndObjects, "Argument 'mapOfArraysOfNullsAndObjects' must not be null.");
		this.object_ = builder.object_;
		this.objectWithDescription = builder.objectWithDescription;
		this.objectOrNull = builder.objectOrNull;
		this.arrayOfObjects = builder.arrayOfObjects;
		this.arrayOfObjectsAndNulls = builder.arrayOfObjectsAndNulls;
		this.arrayOfObjectsOrNull = builder.arrayOfObjectsOrNull;
		this.arrayOfObjectsAndNullsOrNull = builder.arrayOfObjectsAndNullsOrNull;
		this.mapOfObjects = builder.mapOfObjects;
		this.mapOfNullsAndObjects = builder.mapOfNullsAndObjects;
		this.mapOfObjectsOrNull = builder.mapOfObjectsOrNull;
		this.mapOfNullsAndObjectsOrNull = builder.mapOfNullsAndObjectsOrNull;
		this.arrayOfMapsOfObjects = builder.arrayOfMapsOfObjects;
		this.arrayOfMapsOfObjectsOrNull = builder.arrayOfMapsOfObjectsOrNull;
		this.arrayOfNullsAndMapsOfObjects = builder.arrayOfNullsAndMapsOfObjects;
		this.arrayOfMapsOfNullsAndObjects = builder.arrayOfMapsOfNullsAndObjects;
		this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull = builder.arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
		this.mapOfArraysOfObjects = builder.mapOfArraysOfObjects;
		this.mapOfArraysOfObjectsOrNull = builder.mapOfArraysOfObjectsOrNull;
		this.mapOfNullsAndArraysOfObjects = builder.mapOfNullsAndArraysOfObjects;
		this.mapOfArraysOfNullsAndObjects = builder.mapOfArraysOfNullsAndObjects;
		this.mapOfNullsAndArraysOfNullsAndObjectsOrNull = builder.mapOfNullsAndArraysOfNullsAndObjectsOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.object_)
			.append(this.objectWithDescription)
			.append(this.objectOrNull)
			.append(this.arrayOfObjects)
			.append(this.arrayOfObjectsAndNulls)
			.append(this.arrayOfObjectsOrNull)
			.append(this.arrayOfObjectsAndNullsOrNull)
			.append(this.mapOfObjects)
			.append(this.mapOfNullsAndObjects)
			.append(this.mapOfObjectsOrNull)
			.append(this.mapOfNullsAndObjectsOrNull)
			.append(this.arrayOfMapsOfObjects)
			.append(this.arrayOfMapsOfObjectsOrNull)
			.append(this.arrayOfNullsAndMapsOfObjects)
			.append(this.arrayOfMapsOfNullsAndObjects)
			.append(this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull)
			.append(this.mapOfArraysOfObjects)
			.append(this.mapOfArraysOfObjectsOrNull)
			.append(this.mapOfNullsAndArraysOfObjects)
			.append(this.mapOfArraysOfNullsAndObjects)
			.append(this.mapOfNullsAndArraysOfNullsAndObjectsOrNull)
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
		JsonInterfaceRootTest rhs = (JsonInterfaceRootTest) other;
		return new EqualsBuilder()
			.append(this.object_, rhs.object_)
			.append(this.objectWithDescription, rhs.objectWithDescription)
			.append(this.objectOrNull, rhs.objectOrNull)
			.append(this.arrayOfObjects, rhs.arrayOfObjects)
			.append(this.arrayOfObjectsAndNulls, rhs.arrayOfObjectsAndNulls)
			.append(this.arrayOfObjectsOrNull, rhs.arrayOfObjectsOrNull)
			.append(this.arrayOfObjectsAndNullsOrNull, rhs.arrayOfObjectsAndNullsOrNull)
			.append(this.mapOfObjects, rhs.mapOfObjects)
			.append(this.mapOfNullsAndObjects, rhs.mapOfNullsAndObjects)
			.append(this.mapOfObjectsOrNull, rhs.mapOfObjectsOrNull)
			.append(this.mapOfNullsAndObjectsOrNull, rhs.mapOfNullsAndObjectsOrNull)
			.append(this.arrayOfMapsOfObjects, rhs.arrayOfMapsOfObjects)
			.append(this.arrayOfMapsOfObjectsOrNull, rhs.arrayOfMapsOfObjectsOrNull)
			.append(this.arrayOfNullsAndMapsOfObjects, rhs.arrayOfNullsAndMapsOfObjects)
			.append(this.arrayOfMapsOfNullsAndObjects, rhs.arrayOfMapsOfNullsAndObjects)
			.append(this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull, rhs.arrayOfNullsAndMapsOfNullsAndObjectsOrNull)
			.append(this.mapOfArraysOfObjects, rhs.mapOfArraysOfObjects)
			.append(this.mapOfArraysOfObjectsOrNull, rhs.mapOfArraysOfObjectsOrNull)
			.append(this.mapOfNullsAndArraysOfObjects, rhs.mapOfNullsAndArraysOfObjects)
			.append(this.mapOfArraysOfNullsAndObjects, rhs.mapOfArraysOfNullsAndObjects)
			.append(this.mapOfNullsAndArraysOfNullsAndObjectsOrNull, rhs.mapOfNullsAndArraysOfNullsAndObjectsOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("object_", this.object_)
			.append("objectWithDescription", this.objectWithDescription)
			.append("objectOrNull", this.objectOrNull)
			.append("arrayOfObjects", this.arrayOfObjects)
			.append("arrayOfObjectsAndNulls", this.arrayOfObjectsAndNulls)
			.append("arrayOfObjectsOrNull", this.arrayOfObjectsOrNull)
			.append("arrayOfObjectsAndNullsOrNull", this.arrayOfObjectsAndNullsOrNull)
			.append("mapOfObjects", this.mapOfObjects)
			.append("mapOfNullsAndObjects", this.mapOfNullsAndObjects)
			.append("mapOfObjectsOrNull", this.mapOfObjectsOrNull)
			.append("mapOfNullsAndObjectsOrNull", this.mapOfNullsAndObjectsOrNull)
			.append("arrayOfMapsOfObjects", this.arrayOfMapsOfObjects)
			.append("arrayOfMapsOfObjectsOrNull", this.arrayOfMapsOfObjectsOrNull)
			.append("arrayOfNullsAndMapsOfObjects", this.arrayOfNullsAndMapsOfObjects)
			.append("arrayOfMapsOfNullsAndObjects", this.arrayOfMapsOfNullsAndObjects)
			.append("arrayOfNullsAndMapsOfNullsAndObjectsOrNull", this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull)
			.append("mapOfArraysOfObjects", this.mapOfArraysOfObjects)
			.append("mapOfArraysOfObjectsOrNull", this.mapOfArraysOfObjectsOrNull)
			.append("mapOfNullsAndArraysOfObjects", this.mapOfNullsAndArraysOfObjects)
			.append("mapOfArraysOfNullsAndObjects", this.mapOfArraysOfNullsAndObjects)
			.append("mapOfNullsAndArraysOfNullsAndObjectsOrNull", this.mapOfNullsAndArraysOfNullsAndObjectsOrNull)
			.toString();
	}

	public jsoncodegen.javajacksontest.generated.JsonInterface getObject_() { return this.object_; }
	/**
	 * This is an object.
	 */
	public jsoncodegen.javajacksontest.generated.JsonInterface getObjectWithDescription() { return this.objectWithDescription; }
	public jsoncodegen.javajacksontest.generated.JsonInterface getObjectOrNull() { return this.objectOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> getArrayOfObjects() { return this.arrayOfObjects; }
	public java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> getArrayOfObjectsAndNulls() { return this.arrayOfObjectsAndNulls; }
	public java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> getArrayOfObjectsOrNull() { return this.arrayOfObjectsOrNull; }
	public java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> getArrayOfObjectsAndNullsOrNull() { return this.arrayOfObjectsAndNullsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> getMapOfObjects() { return this.mapOfObjects; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> getMapOfNullsAndObjects() { return this.mapOfNullsAndObjects; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> getMapOfObjectsOrNull() { return this.mapOfObjectsOrNull; }
	public java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> getMapOfNullsAndObjectsOrNull() { return this.mapOfNullsAndObjectsOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> getArrayOfMapsOfObjects() { return this.arrayOfMapsOfObjects; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> getArrayOfMapsOfObjectsOrNull() { return this.arrayOfMapsOfObjectsOrNull; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> getArrayOfNullsAndMapsOfObjects() { return this.arrayOfNullsAndMapsOfObjects; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> getArrayOfMapsOfNullsAndObjects() { return this.arrayOfMapsOfNullsAndObjects; }
	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> getArrayOfNullsAndMapsOfNullsAndObjectsOrNull() { return this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> getMapOfArraysOfObjects() { return this.mapOfArraysOfObjects; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> getMapOfArraysOfObjectsOrNull() { return this.mapOfArraysOfObjectsOrNull; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> getMapOfNullsAndArraysOfObjects() { return this.mapOfNullsAndArraysOfObjects; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> getMapOfArraysOfNullsAndObjects() { return this.mapOfArraysOfNullsAndObjects; }
	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> getMapOfNullsAndArraysOfNullsAndObjectsOrNull() { return this.mapOfNullsAndArraysOfNullsAndObjectsOrNull; }

	@JsonCreator
	public static JsonInterfaceRootTest jacksonHelper(
			@JsonProperty("object_") jsoncodegen.javajacksontest.generated.JsonInterface object_,
			@JsonProperty("objectWithDescription") jsoncodegen.javajacksontest.generated.JsonInterface objectWithDescription,
			@JsonProperty("objectOrNull") jsoncodegen.javajacksontest.generated.JsonInterface objectOrNull,
			@JsonProperty("arrayOfObjects") java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjects,
			@JsonProperty("arrayOfObjectsAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNulls,
			@JsonProperty("arrayOfObjectsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsOrNull,
			@JsonProperty("arrayOfObjectsAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNullsOrNull,
			@JsonProperty("mapOfObjects") java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjects,
			@JsonProperty("mapOfNullsAndObjects") java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjects,
			@JsonProperty("mapOfObjectsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjectsOrNull,
			@JsonProperty("mapOfNullsAndObjectsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjectsOrNull,
			@JsonProperty("arrayOfMapsOfObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjects,
			@JsonProperty("arrayOfMapsOfObjectsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjectsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfObjects,
			@JsonProperty("arrayOfMapsOfNullsAndObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfNullsAndObjects,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndObjectsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull,
			@JsonProperty("mapOfArraysOfObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjects,
			@JsonProperty("mapOfArraysOfObjectsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjectsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfObjects,
			@JsonProperty("mapOfArraysOfNullsAndObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfNullsAndObjects,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndObjectsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull
	) {
		return new JsonInterfaceRootTest(JsonInterfaceRootTest.Builder.create()
				.withObject_(object_)
				.withObjectWithDescription(objectWithDescription)
				.withObjectOrNull(objectOrNull)
				.withArrayOfObjects(arrayOfObjects)
				.withArrayOfObjectsAndNulls(arrayOfObjectsAndNulls)
				.withArrayOfObjectsOrNull(arrayOfObjectsOrNull)
				.withArrayOfObjectsAndNullsOrNull(arrayOfObjectsAndNullsOrNull)
				.withMapOfObjects(mapOfObjects)
				.withMapOfNullsAndObjects(mapOfNullsAndObjects)
				.withMapOfObjectsOrNull(mapOfObjectsOrNull)
				.withMapOfNullsAndObjectsOrNull(mapOfNullsAndObjectsOrNull)
				.withArrayOfMapsOfObjects(arrayOfMapsOfObjects)
				.withArrayOfMapsOfObjectsOrNull(arrayOfMapsOfObjectsOrNull)
				.withArrayOfNullsAndMapsOfObjects(arrayOfNullsAndMapsOfObjects)
				.withArrayOfMapsOfNullsAndObjects(arrayOfMapsOfNullsAndObjects)
				.withArrayOfNullsAndMapsOfNullsAndObjectsOrNull(arrayOfNullsAndMapsOfNullsAndObjectsOrNull)
				.withMapOfArraysOfObjects(mapOfArraysOfObjects)
				.withMapOfArraysOfObjectsOrNull(mapOfArraysOfObjectsOrNull)
				.withMapOfNullsAndArraysOfObjects(mapOfNullsAndArraysOfObjects)
				.withMapOfArraysOfNullsAndObjects(mapOfArraysOfNullsAndObjects)
				.withMapOfNullsAndArraysOfNullsAndObjectsOrNull(mapOfNullsAndArraysOfNullsAndObjectsOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_object___ {}
	private static final class __MISSING_objectWithDescription__ {}
	private static final class __MISSING_arrayOfObjects__ {}
	private static final class __MISSING_arrayOfObjectsAndNulls__ {}
	private static final class __MISSING_mapOfObjects__ {}
	private static final class __MISSING_mapOfNullsAndObjects__ {}
	private static final class __MISSING_arrayOfMapsOfObjects__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfObjects__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndObjects__ {}
	private static final class __MISSING_mapOfArraysOfObjects__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfObjects__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndObjects__ {}

	public static final class Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> {

		private jsoncodegen.javajacksontest.generated.JsonInterface object_;
		private jsoncodegen.javajacksontest.generated.JsonInterface objectWithDescription;
		private jsoncodegen.javajacksontest.generated.JsonInterface objectOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjects;
		private java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> arrayOfObjectsAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjects;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjects;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfObjectsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> mapOfNullsAndObjectsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfObjectsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfMapsOfNullsAndObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfObjectsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfArraysOfNullsAndObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_object___,
				__MISSING_objectWithDescription__,
				__MISSING_arrayOfObjects__,
				__MISSING_arrayOfObjectsAndNulls__,
				__MISSING_mapOfObjects__,
				__MISSING_mapOfNullsAndObjects__,
				__MISSING_arrayOfMapsOfObjects__,
				__MISSING_arrayOfNullsAndMapsOfObjects__,
				__MISSING_arrayOfMapsOfNullsAndObjects__,
				__MISSING_mapOfArraysOfObjects__,
				__MISSING_mapOfNullsAndArraysOfObjects__,
				__MISSING_mapOfArraysOfNullsAndObjects__
				> create() {
			return new Builder<
				__MISSING_object___,
				__MISSING_objectWithDescription__,
				__MISSING_arrayOfObjects__,
				__MISSING_arrayOfObjectsAndNulls__,
				__MISSING_mapOfObjects__,
				__MISSING_mapOfNullsAndObjects__,
				__MISSING_arrayOfMapsOfObjects__,
				__MISSING_arrayOfNullsAndMapsOfObjects__,
				__MISSING_arrayOfMapsOfNullsAndObjects__,
				__MISSING_mapOfArraysOfObjects__,
				__MISSING_mapOfNullsAndArraysOfObjects__,
				__MISSING_mapOfArraysOfNullsAndObjects__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonInterfaceRootTest.__OK__,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObject_(jsoncodegen.javajacksontest.generated.JsonInterface value) {
			this.object_ = value;
			return (Builder<
				JsonInterfaceRootTest.__OK__,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		/**
		 * This is an object.
		 */
		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObjectWithDescription(jsoncodegen.javajacksontest.generated.JsonInterface value) {
			this.objectWithDescription = value;
			return (Builder<
				__HAS_object___,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObjectOrNull(jsoncodegen.javajacksontest.generated.JsonInterface value) {
			this.objectOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjects(java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.arrayOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.arrayOfObjectsAndNulls = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.arrayOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.arrayOfObjectsAndNullsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.mapOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.mapOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.mapOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface> value) {
			this.mapOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.arrayOfMapsOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.arrayOfMapsOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfNullsAndMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.arrayOfNullsAndMapsOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfNullsAndObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.arrayOfMapsOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfNullsAndMapsOfNullsAndObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.mapOfArraysOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfArraysOfObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.mapOfArraysOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.mapOfNullsAndArraysOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				JsonInterfaceRootTest.__OK__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				JsonInterfaceRootTest.__OK__
				> withMapOfArraysOfNullsAndObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.mapOfArraysOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				JsonInterfaceRootTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndArraysOfNullsAndObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.JsonInterface>> value) {
			this.mapOfNullsAndArraysOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}
	}
}
