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
public final class JsonInterfaceLocalTest {

	private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface object_;
	private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectWithDescription;
	private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjects;
	private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfArraysOfObjects;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNulls;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsOrNull;
	private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNullsOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjects;
	private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfMapsOfObjects;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjects;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjectsOrNull;
	private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjectsOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjects;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjectsOrNull;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfObjects;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfNullsAndObjects;
	private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjects;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjectsOrNull;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfObjects;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfNullsAndObjects;
	private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull;

	public JsonInterfaceLocalTest(Builder<
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__,
			JsonInterfaceLocalTest.__OK__
			> builder) {
		Validate.notNull(builder.object_, "Argument 'object_' must not be null.");
		Validate.notNull(builder.objectWithDescription, "Argument 'objectWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfObjects, "Argument 'arrayOfObjects' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfObjects, "Argument 'arrayOfArraysOfObjects' must not be null.");
		Validate.notNull(builder.arrayOfObjectsAndNulls, "Argument 'arrayOfObjectsAndNulls' must not be null.");
		Validate.notNull(builder.mapOfObjects, "Argument 'mapOfObjects' must not be null.");
		Validate.notNull(builder.mapOfMapsOfObjects, "Argument 'mapOfMapsOfObjects' must not be null.");
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
		this.arrayOfArraysOfObjects = builder.arrayOfArraysOfObjects;
		this.arrayOfObjectsAndNulls = builder.arrayOfObjectsAndNulls;
		this.arrayOfObjectsOrNull = builder.arrayOfObjectsOrNull;
		this.arrayOfObjectsAndNullsOrNull = builder.arrayOfObjectsAndNullsOrNull;
		this.mapOfObjects = builder.mapOfObjects;
		this.mapOfMapsOfObjects = builder.mapOfMapsOfObjects;
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
			.append(this.arrayOfArraysOfObjects)
			.append(this.arrayOfObjectsAndNulls)
			.append(this.arrayOfObjectsOrNull)
			.append(this.arrayOfObjectsAndNullsOrNull)
			.append(this.mapOfObjects)
			.append(this.mapOfMapsOfObjects)
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
		JsonInterfaceLocalTest rhs = (JsonInterfaceLocalTest) other;
		return new EqualsBuilder()
			.append(this.object_, rhs.object_)
			.append(this.objectWithDescription, rhs.objectWithDescription)
			.append(this.objectOrNull, rhs.objectOrNull)
			.append(this.arrayOfObjects, rhs.arrayOfObjects)
			.append(this.arrayOfArraysOfObjects, rhs.arrayOfArraysOfObjects)
			.append(this.arrayOfObjectsAndNulls, rhs.arrayOfObjectsAndNulls)
			.append(this.arrayOfObjectsOrNull, rhs.arrayOfObjectsOrNull)
			.append(this.arrayOfObjectsAndNullsOrNull, rhs.arrayOfObjectsAndNullsOrNull)
			.append(this.mapOfObjects, rhs.mapOfObjects)
			.append(this.mapOfMapsOfObjects, rhs.mapOfMapsOfObjects)
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
			.append("arrayOfArraysOfObjects", this.arrayOfArraysOfObjects)
			.append("arrayOfObjectsAndNulls", this.arrayOfObjectsAndNulls)
			.append("arrayOfObjectsOrNull", this.arrayOfObjectsOrNull)
			.append("arrayOfObjectsAndNullsOrNull", this.arrayOfObjectsAndNullsOrNull)
			.append("mapOfObjects", this.mapOfObjects)
			.append("mapOfMapsOfObjects", this.mapOfMapsOfObjects)
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
	
	public JsonInterfaceLocalTest clone() {
		return new JsonInterfaceLocalTest(JsonInterfaceLocalTest.Builder.create()
				.withObject_(this.object_)
				.withObjectWithDescription(this.objectWithDescription)
				.withObjectOrNull(this.objectOrNull)
				.withArrayOfObjects(this.arrayOfObjects)
				.withArrayOfArraysOfObjects(this.arrayOfArraysOfObjects)
				.withArrayOfObjectsAndNulls(this.arrayOfObjectsAndNulls)
				.withArrayOfObjectsOrNull(this.arrayOfObjectsOrNull)
				.withArrayOfObjectsAndNullsOrNull(this.arrayOfObjectsAndNullsOrNull)
				.withMapOfObjects(this.mapOfObjects)
				.withMapOfMapsOfObjects(this.mapOfMapsOfObjects)
				.withMapOfNullsAndObjects(this.mapOfNullsAndObjects)
				.withMapOfObjectsOrNull(this.mapOfObjectsOrNull)
				.withMapOfNullsAndObjectsOrNull(this.mapOfNullsAndObjectsOrNull)
				.withArrayOfMapsOfObjects(this.arrayOfMapsOfObjects)
				.withArrayOfMapsOfObjectsOrNull(this.arrayOfMapsOfObjectsOrNull)
				.withArrayOfNullsAndMapsOfObjects(this.arrayOfNullsAndMapsOfObjects)
				.withArrayOfMapsOfNullsAndObjects(this.arrayOfMapsOfNullsAndObjects)
				.withArrayOfNullsAndMapsOfNullsAndObjectsOrNull(this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull)
				.withMapOfArraysOfObjects(this.mapOfArraysOfObjects)
				.withMapOfArraysOfObjectsOrNull(this.mapOfArraysOfObjectsOrNull)
				.withMapOfNullsAndArraysOfObjects(this.mapOfNullsAndArraysOfObjects)
				.withMapOfArraysOfNullsAndObjects(this.mapOfArraysOfNullsAndObjects)
				.withMapOfNullsAndArraysOfNullsAndObjectsOrNull(this.mapOfNullsAndArraysOfNullsAndObjectsOrNull)
		);
	}

	public jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface getObject_() {
		return this.object_;
	}

	public void setObject_(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.object_ = value;
	}

	/**
	 * This is an object.
	 */
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface getObjectWithDescription() {
		return this.objectWithDescription;
	}

	/**
	 * This is an object.
	 */
	public void setObjectWithDescription(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.objectWithDescription = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface getObjectOrNull() {
		return this.objectOrNull;
	}

	public void setObjectOrNull(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
		this.objectOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getArrayOfObjects() {
		return this.arrayOfObjects;
	}

	public void setArrayOfObjects(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfObjects = value;
	}

	public java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfArraysOfObjects() {
		return this.arrayOfArraysOfObjects;
	}

	public void setArrayOfArraysOfObjects(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfArraysOfObjects = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getArrayOfObjectsAndNulls() {
		return this.arrayOfObjectsAndNulls;
	}

	public void setArrayOfObjectsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfObjectsAndNulls = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getArrayOfObjectsOrNull() {
		return this.arrayOfObjectsOrNull;
	}

	public void setArrayOfObjectsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		this.arrayOfObjectsOrNull = value;
	}

	public java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getArrayOfObjectsAndNullsOrNull() {
		return this.arrayOfObjectsAndNullsOrNull;
	}

	public void setArrayOfObjectsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		this.arrayOfObjectsAndNullsOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getMapOfObjects() {
		return this.mapOfObjects;
	}

	public void setMapOfObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfObjects = value;
	}

	public java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfMapsOfObjects() {
		return this.mapOfMapsOfObjects;
	}

	public void setMapOfMapsOfObjects(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfMapsOfObjects = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getMapOfNullsAndObjects() {
		return this.mapOfNullsAndObjects;
	}

	public void setMapOfNullsAndObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndObjects = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getMapOfObjectsOrNull() {
		return this.mapOfObjectsOrNull;
	}

	public void setMapOfObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		this.mapOfObjectsOrNull = value;
	}

	public java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> getMapOfNullsAndObjectsOrNull() {
		return this.mapOfNullsAndObjectsOrNull;
	}

	public void setMapOfNullsAndObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
		this.mapOfNullsAndObjectsOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfMapsOfObjects() {
		return this.arrayOfMapsOfObjects;
	}

	public void setArrayOfMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfObjects = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfMapsOfObjectsOrNull() {
		return this.arrayOfMapsOfObjectsOrNull;
	}

	public void setArrayOfMapsOfObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		this.arrayOfMapsOfObjectsOrNull = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfNullsAndMapsOfObjects() {
		return this.arrayOfNullsAndMapsOfObjects;
	}

	public void setArrayOfNullsAndMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfNullsAndMapsOfObjects = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfMapsOfNullsAndObjects() {
		return this.arrayOfMapsOfNullsAndObjects;
	}

	public void setArrayOfMapsOfNullsAndObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.arrayOfMapsOfNullsAndObjects = value;
	}

	public java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getArrayOfNullsAndMapsOfNullsAndObjectsOrNull() {
		return this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
	}

	public void setArrayOfNullsAndMapsOfNullsAndObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfArraysOfObjects() {
		return this.mapOfArraysOfObjects;
	}

	public void setMapOfArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfObjects = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfArraysOfObjectsOrNull() {
		return this.mapOfArraysOfObjectsOrNull;
	}

	public void setMapOfArraysOfObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		this.mapOfArraysOfObjectsOrNull = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfNullsAndArraysOfObjects() {
		return this.mapOfNullsAndArraysOfObjects;
	}

	public void setMapOfNullsAndArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfNullsAndArraysOfObjects = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfArraysOfNullsAndObjects() {
		return this.mapOfArraysOfNullsAndObjects;
	}

	public void setMapOfArraysOfNullsAndObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.mapOfArraysOfNullsAndObjects = value;
	}

	public java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> getMapOfNullsAndArraysOfNullsAndObjectsOrNull() {
		return this.mapOfNullsAndArraysOfNullsAndObjectsOrNull;
	}

	public void setMapOfNullsAndArraysOfNullsAndObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
		this.mapOfNullsAndArraysOfNullsAndObjectsOrNull = value;
	}

	@JsonCreator
	public static JsonInterfaceLocalTest jacksonHelper(
			@JsonProperty("object_") jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface object_,
			@JsonProperty("objectWithDescription") jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectWithDescription,
			@JsonProperty("objectOrNull") jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectOrNull,
			@JsonProperty("arrayOfObjects") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjects,
			@JsonProperty("arrayOfArraysOfObjects") java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfArraysOfObjects,
			@JsonProperty("arrayOfObjectsAndNulls") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNulls,
			@JsonProperty("arrayOfObjectsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsOrNull,
			@JsonProperty("arrayOfObjectsAndNullsOrNull") java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNullsOrNull,
			@JsonProperty("mapOfObjects") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjects,
			@JsonProperty("mapOfMapsOfObjects") java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfMapsOfObjects,
			@JsonProperty("mapOfNullsAndObjects") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjects,
			@JsonProperty("mapOfObjectsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjectsOrNull,
			@JsonProperty("mapOfNullsAndObjectsOrNull") java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjectsOrNull,
			@JsonProperty("arrayOfMapsOfObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjects,
			@JsonProperty("arrayOfMapsOfObjectsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjectsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfObjects,
			@JsonProperty("arrayOfMapsOfNullsAndObjects") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfNullsAndObjects,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndObjectsOrNull") java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull,
			@JsonProperty("mapOfArraysOfObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjects,
			@JsonProperty("mapOfArraysOfObjectsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjectsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfObjects,
			@JsonProperty("mapOfArraysOfNullsAndObjects") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfNullsAndObjects,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndObjectsOrNull") java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull
	) {
		return new JsonInterfaceLocalTest(JsonInterfaceLocalTest.Builder.create()
				.withObject_(object_)
				.withObjectWithDescription(objectWithDescription)
				.withObjectOrNull(objectOrNull)
				.withArrayOfObjects(arrayOfObjects)
				.withArrayOfArraysOfObjects(arrayOfArraysOfObjects)
				.withArrayOfObjectsAndNulls(arrayOfObjectsAndNulls)
				.withArrayOfObjectsOrNull(arrayOfObjectsOrNull)
				.withArrayOfObjectsAndNullsOrNull(arrayOfObjectsAndNullsOrNull)
				.withMapOfObjects(mapOfObjects)
				.withMapOfMapsOfObjects(mapOfMapsOfObjects)
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
	private static final class __MISSING_arrayOfArraysOfObjects__ {}
	private static final class __MISSING_arrayOfObjectsAndNulls__ {}
	private static final class __MISSING_mapOfObjects__ {}
	private static final class __MISSING_mapOfMapsOfObjects__ {}
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> {

		private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface object_;
		private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectWithDescription;
		private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface objectOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjects;
		private java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfArraysOfObjects;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNulls;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsOrNull;
		private java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> arrayOfObjectsAndNullsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjects;
		private java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfMapsOfObjects;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjects;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfObjectsOrNull;
		private java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> mapOfNullsAndObjectsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfObjectsOrNull;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfMapsOfNullsAndObjects;
		private java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> arrayOfNullsAndMapsOfNullsAndObjectsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfObjectsOrNull;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfArraysOfNullsAndObjects;
		private java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> mapOfNullsAndArraysOfNullsAndObjectsOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_object___,
				__MISSING_objectWithDescription__,
				__MISSING_arrayOfObjects__,
				__MISSING_arrayOfArraysOfObjects__,
				__MISSING_arrayOfObjectsAndNulls__,
				__MISSING_mapOfObjects__,
				__MISSING_mapOfMapsOfObjects__,
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
				__MISSING_arrayOfArraysOfObjects__,
				__MISSING_arrayOfObjectsAndNulls__,
				__MISSING_mapOfObjects__,
				__MISSING_mapOfMapsOfObjects__,
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
				JsonInterfaceLocalTest.__OK__,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObject_(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
			this.object_ = value;
			return (Builder<
				JsonInterfaceLocalTest.__OK__,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObjectWithDescription(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
			this.objectWithDescription = value;
			return (Builder<
				__HAS_object___,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withObjectOrNull(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
			this.objectOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjects(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.arrayOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfArraysOfObjects(java.util.List<java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfArraysOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsAndNulls(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.arrayOfObjectsAndNulls = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.arrayOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfObjectsAndNullsOrNull(java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.arrayOfObjectsAndNullsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.mapOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfMapsOfObjects(java.util.Map<String, java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfMapsOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				JsonInterfaceLocalTest.__OK__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndObjects(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.mapOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.mapOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndObjectsOrNull(java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface> value) {
			this.mapOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfMapsOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				JsonInterfaceLocalTest.__OK__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfMapsOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfNullsAndMapsOfObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfNullsAndMapsOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfMapsOfNullsAndObjects(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfMapsOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				JsonInterfaceLocalTest.__OK__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withArrayOfNullsAndMapsOfNullsAndObjectsOrNull(java.util.List<java.util.Map<String, jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.arrayOfNullsAndMapsOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfArraysOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfArraysOfObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfArraysOfObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndArraysOfObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfNullsAndArraysOfObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__,
				__HAS_mapOfArraysOfNullsAndObjects__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__
				> withMapOfArraysOfNullsAndObjects(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfArraysOfNullsAndObjects = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				JsonInterfaceLocalTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
				__HAS_mapOfNullsAndObjects__,
				__HAS_arrayOfMapsOfObjects__,
				__HAS_arrayOfNullsAndMapsOfObjects__,
				__HAS_arrayOfMapsOfNullsAndObjects__,
				__HAS_mapOfArraysOfObjects__,
				__HAS_mapOfNullsAndArraysOfObjects__,
				__HAS_mapOfArraysOfNullsAndObjects__
				> withMapOfNullsAndArraysOfNullsAndObjectsOrNull(java.util.Map<String, java.util.List<jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface>> value) {
			this.mapOfNullsAndArraysOfNullsAndObjectsOrNull = value;
			return (Builder<
				__HAS_object___,
				__HAS_objectWithDescription__,
				__HAS_arrayOfObjects__,
				__HAS_arrayOfArraysOfObjects__,
				__HAS_arrayOfObjectsAndNulls__,
				__HAS_mapOfObjects__,
				__HAS_mapOfMapsOfObjects__,
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
