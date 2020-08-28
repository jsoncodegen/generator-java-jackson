package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This tests number values.
 */
public final class JsonNumberTest {

	private final Double count;
	private final Double countWithDescription;
	private final Double countOrNull;
	private final java.util.List<Double> arrayOfCounts;
	private final java.util.List<java.util.List<Double>> arrayOfArraysOfCounts;
	private final java.util.List<Double> arrayOfCountsAndNulls;
	private final java.util.List<Double> arrayOfCountsOrNull;
	private final java.util.List<Double> arrayOfCountsAndNullsOrNull;
	private final java.util.Map<String, Double> mapOfCounts;
	private final java.util.Map<String, java.util.Map<String, Double>> mapOfMapsOfCounts;
	private final java.util.Map<String, Double> mapOfNullsAndCounts;
	private final java.util.Map<String, Double> mapOfCountsOrNull;
	private final java.util.Map<String, Double> mapOfNullsAndCountsOrNull;
	private final java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCounts;
	private final java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCountsOrNull;
	private final java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfCounts;
	private final java.util.List<java.util.Map<String, Double>> arrayOfMapsOfNullsAndCounts;
	private final java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfNullsAndCountsOrNull;
	private final java.util.Map<String, java.util.List<Double>> mapOfArraysOfCounts;
	private final java.util.Map<String, java.util.List<Double>> mapOfArraysOfCountsOrNull;
	private final java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfCounts;
	private final java.util.Map<String, java.util.List<Double>> mapOfArraysOfNullsAndCounts;
	private final java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfNullsAndCountsOrNull;

	public JsonNumberTest(Builder<
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__,
			JsonNumberTest.__OK__
			> builder) {
		Validate.notNull(builder.count, "Argument 'count' must not be null.");
		Validate.notNull(builder.countWithDescription, "Argument 'countWithDescription' must not be null.");
		Validate.notNull(builder.arrayOfCounts, "Argument 'arrayOfCounts' must not be null.");
		Validate.notNull(builder.arrayOfArraysOfCounts, "Argument 'arrayOfArraysOfCounts' must not be null.");
		Validate.notNull(builder.arrayOfCountsAndNulls, "Argument 'arrayOfCountsAndNulls' must not be null.");
		Validate.notNull(builder.mapOfCounts, "Argument 'mapOfCounts' must not be null.");
		Validate.notNull(builder.mapOfMapsOfCounts, "Argument 'mapOfMapsOfCounts' must not be null.");
		Validate.notNull(builder.mapOfNullsAndCounts, "Argument 'mapOfNullsAndCounts' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfCounts, "Argument 'arrayOfMapsOfCounts' must not be null.");
		Validate.notNull(builder.arrayOfNullsAndMapsOfCounts, "Argument 'arrayOfNullsAndMapsOfCounts' must not be null.");
		Validate.notNull(builder.arrayOfMapsOfNullsAndCounts, "Argument 'arrayOfMapsOfNullsAndCounts' must not be null.");
		Validate.notNull(builder.mapOfArraysOfCounts, "Argument 'mapOfArraysOfCounts' must not be null.");
		Validate.notNull(builder.mapOfNullsAndArraysOfCounts, "Argument 'mapOfNullsAndArraysOfCounts' must not be null.");
		Validate.notNull(builder.mapOfArraysOfNullsAndCounts, "Argument 'mapOfArraysOfNullsAndCounts' must not be null.");
		this.count = builder.count;
		this.countWithDescription = builder.countWithDescription;
		this.countOrNull = builder.countOrNull;
		this.arrayOfCounts = builder.arrayOfCounts;
		this.arrayOfArraysOfCounts = builder.arrayOfArraysOfCounts;
		this.arrayOfCountsAndNulls = builder.arrayOfCountsAndNulls;
		this.arrayOfCountsOrNull = builder.arrayOfCountsOrNull;
		this.arrayOfCountsAndNullsOrNull = builder.arrayOfCountsAndNullsOrNull;
		this.mapOfCounts = builder.mapOfCounts;
		this.mapOfMapsOfCounts = builder.mapOfMapsOfCounts;
		this.mapOfNullsAndCounts = builder.mapOfNullsAndCounts;
		this.mapOfCountsOrNull = builder.mapOfCountsOrNull;
		this.mapOfNullsAndCountsOrNull = builder.mapOfNullsAndCountsOrNull;
		this.arrayOfMapsOfCounts = builder.arrayOfMapsOfCounts;
		this.arrayOfMapsOfCountsOrNull = builder.arrayOfMapsOfCountsOrNull;
		this.arrayOfNullsAndMapsOfCounts = builder.arrayOfNullsAndMapsOfCounts;
		this.arrayOfMapsOfNullsAndCounts = builder.arrayOfMapsOfNullsAndCounts;
		this.arrayOfNullsAndMapsOfNullsAndCountsOrNull = builder.arrayOfNullsAndMapsOfNullsAndCountsOrNull;
		this.mapOfArraysOfCounts = builder.mapOfArraysOfCounts;
		this.mapOfArraysOfCountsOrNull = builder.mapOfArraysOfCountsOrNull;
		this.mapOfNullsAndArraysOfCounts = builder.mapOfNullsAndArraysOfCounts;
		this.mapOfArraysOfNullsAndCounts = builder.mapOfArraysOfNullsAndCounts;
		this.mapOfNullsAndArraysOfNullsAndCountsOrNull = builder.mapOfNullsAndArraysOfNullsAndCountsOrNull;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.count)
			.append(this.countWithDescription)
			.append(this.countOrNull)
			.append(this.arrayOfCounts)
			.append(this.arrayOfArraysOfCounts)
			.append(this.arrayOfCountsAndNulls)
			.append(this.arrayOfCountsOrNull)
			.append(this.arrayOfCountsAndNullsOrNull)
			.append(this.mapOfCounts)
			.append(this.mapOfMapsOfCounts)
			.append(this.mapOfNullsAndCounts)
			.append(this.mapOfCountsOrNull)
			.append(this.mapOfNullsAndCountsOrNull)
			.append(this.arrayOfMapsOfCounts)
			.append(this.arrayOfMapsOfCountsOrNull)
			.append(this.arrayOfNullsAndMapsOfCounts)
			.append(this.arrayOfMapsOfNullsAndCounts)
			.append(this.arrayOfNullsAndMapsOfNullsAndCountsOrNull)
			.append(this.mapOfArraysOfCounts)
			.append(this.mapOfArraysOfCountsOrNull)
			.append(this.mapOfNullsAndArraysOfCounts)
			.append(this.mapOfArraysOfNullsAndCounts)
			.append(this.mapOfNullsAndArraysOfNullsAndCountsOrNull)
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
		JsonNumberTest rhs = (JsonNumberTest) other;
		return new EqualsBuilder()
			.append(this.count, rhs.count)
			.append(this.countWithDescription, rhs.countWithDescription)
			.append(this.countOrNull, rhs.countOrNull)
			.append(this.arrayOfCounts, rhs.arrayOfCounts)
			.append(this.arrayOfArraysOfCounts, rhs.arrayOfArraysOfCounts)
			.append(this.arrayOfCountsAndNulls, rhs.arrayOfCountsAndNulls)
			.append(this.arrayOfCountsOrNull, rhs.arrayOfCountsOrNull)
			.append(this.arrayOfCountsAndNullsOrNull, rhs.arrayOfCountsAndNullsOrNull)
			.append(this.mapOfCounts, rhs.mapOfCounts)
			.append(this.mapOfMapsOfCounts, rhs.mapOfMapsOfCounts)
			.append(this.mapOfNullsAndCounts, rhs.mapOfNullsAndCounts)
			.append(this.mapOfCountsOrNull, rhs.mapOfCountsOrNull)
			.append(this.mapOfNullsAndCountsOrNull, rhs.mapOfNullsAndCountsOrNull)
			.append(this.arrayOfMapsOfCounts, rhs.arrayOfMapsOfCounts)
			.append(this.arrayOfMapsOfCountsOrNull, rhs.arrayOfMapsOfCountsOrNull)
			.append(this.arrayOfNullsAndMapsOfCounts, rhs.arrayOfNullsAndMapsOfCounts)
			.append(this.arrayOfMapsOfNullsAndCounts, rhs.arrayOfMapsOfNullsAndCounts)
			.append(this.arrayOfNullsAndMapsOfNullsAndCountsOrNull, rhs.arrayOfNullsAndMapsOfNullsAndCountsOrNull)
			.append(this.mapOfArraysOfCounts, rhs.mapOfArraysOfCounts)
			.append(this.mapOfArraysOfCountsOrNull, rhs.mapOfArraysOfCountsOrNull)
			.append(this.mapOfNullsAndArraysOfCounts, rhs.mapOfNullsAndArraysOfCounts)
			.append(this.mapOfArraysOfNullsAndCounts, rhs.mapOfArraysOfNullsAndCounts)
			.append(this.mapOfNullsAndArraysOfNullsAndCountsOrNull, rhs.mapOfNullsAndArraysOfNullsAndCountsOrNull)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("count", this.count)
			.append("countWithDescription", this.countWithDescription)
			.append("countOrNull", this.countOrNull)
			.append("arrayOfCounts", this.arrayOfCounts)
			.append("arrayOfArraysOfCounts", this.arrayOfArraysOfCounts)
			.append("arrayOfCountsAndNulls", this.arrayOfCountsAndNulls)
			.append("arrayOfCountsOrNull", this.arrayOfCountsOrNull)
			.append("arrayOfCountsAndNullsOrNull", this.arrayOfCountsAndNullsOrNull)
			.append("mapOfCounts", this.mapOfCounts)
			.append("mapOfMapsOfCounts", this.mapOfMapsOfCounts)
			.append("mapOfNullsAndCounts", this.mapOfNullsAndCounts)
			.append("mapOfCountsOrNull", this.mapOfCountsOrNull)
			.append("mapOfNullsAndCountsOrNull", this.mapOfNullsAndCountsOrNull)
			.append("arrayOfMapsOfCounts", this.arrayOfMapsOfCounts)
			.append("arrayOfMapsOfCountsOrNull", this.arrayOfMapsOfCountsOrNull)
			.append("arrayOfNullsAndMapsOfCounts", this.arrayOfNullsAndMapsOfCounts)
			.append("arrayOfMapsOfNullsAndCounts", this.arrayOfMapsOfNullsAndCounts)
			.append("arrayOfNullsAndMapsOfNullsAndCountsOrNull", this.arrayOfNullsAndMapsOfNullsAndCountsOrNull)
			.append("mapOfArraysOfCounts", this.mapOfArraysOfCounts)
			.append("mapOfArraysOfCountsOrNull", this.mapOfArraysOfCountsOrNull)
			.append("mapOfNullsAndArraysOfCounts", this.mapOfNullsAndArraysOfCounts)
			.append("mapOfArraysOfNullsAndCounts", this.mapOfArraysOfNullsAndCounts)
			.append("mapOfNullsAndArraysOfNullsAndCountsOrNull", this.mapOfNullsAndArraysOfNullsAndCountsOrNull)
			.toString();
	}

	public Double getCount() { return this.count; }
	/**
	 * This is a count.
	 */
	public Double getCountWithDescription() { return this.countWithDescription; }
	public Double getCountOrNull() { return this.countOrNull; }
	public java.util.List<Double> getArrayOfCounts() { return this.arrayOfCounts; }
	public java.util.List<java.util.List<Double>> getArrayOfArraysOfCounts() { return this.arrayOfArraysOfCounts; }
	public java.util.List<Double> getArrayOfCountsAndNulls() { return this.arrayOfCountsAndNulls; }
	public java.util.List<Double> getArrayOfCountsOrNull() { return this.arrayOfCountsOrNull; }
	public java.util.List<Double> getArrayOfCountsAndNullsOrNull() { return this.arrayOfCountsAndNullsOrNull; }
	public java.util.Map<String, Double> getMapOfCounts() { return this.mapOfCounts; }
	public java.util.Map<String, java.util.Map<String, Double>> getMapOfMapsOfCounts() { return this.mapOfMapsOfCounts; }
	public java.util.Map<String, Double> getMapOfNullsAndCounts() { return this.mapOfNullsAndCounts; }
	public java.util.Map<String, Double> getMapOfCountsOrNull() { return this.mapOfCountsOrNull; }
	public java.util.Map<String, Double> getMapOfNullsAndCountsOrNull() { return this.mapOfNullsAndCountsOrNull; }
	public java.util.List<java.util.Map<String, Double>> getArrayOfMapsOfCounts() { return this.arrayOfMapsOfCounts; }
	public java.util.List<java.util.Map<String, Double>> getArrayOfMapsOfCountsOrNull() { return this.arrayOfMapsOfCountsOrNull; }
	public java.util.List<java.util.Map<String, Double>> getArrayOfNullsAndMapsOfCounts() { return this.arrayOfNullsAndMapsOfCounts; }
	public java.util.List<java.util.Map<String, Double>> getArrayOfMapsOfNullsAndCounts() { return this.arrayOfMapsOfNullsAndCounts; }
	public java.util.List<java.util.Map<String, Double>> getArrayOfNullsAndMapsOfNullsAndCountsOrNull() { return this.arrayOfNullsAndMapsOfNullsAndCountsOrNull; }
	public java.util.Map<String, java.util.List<Double>> getMapOfArraysOfCounts() { return this.mapOfArraysOfCounts; }
	public java.util.Map<String, java.util.List<Double>> getMapOfArraysOfCountsOrNull() { return this.mapOfArraysOfCountsOrNull; }
	public java.util.Map<String, java.util.List<Double>> getMapOfNullsAndArraysOfCounts() { return this.mapOfNullsAndArraysOfCounts; }
	public java.util.Map<String, java.util.List<Double>> getMapOfArraysOfNullsAndCounts() { return this.mapOfArraysOfNullsAndCounts; }
	public java.util.Map<String, java.util.List<Double>> getMapOfNullsAndArraysOfNullsAndCountsOrNull() { return this.mapOfNullsAndArraysOfNullsAndCountsOrNull; }

	@JsonCreator
	public static JsonNumberTest jacksonHelper(
			@JsonProperty("count") Double count,
			@JsonProperty("countWithDescription") Double countWithDescription,
			@JsonProperty("countOrNull") Double countOrNull,
			@JsonProperty("arrayOfCounts") java.util.List<Double> arrayOfCounts,
			@JsonProperty("arrayOfArraysOfCounts") java.util.List<java.util.List<Double>> arrayOfArraysOfCounts,
			@JsonProperty("arrayOfCountsAndNulls") java.util.List<Double> arrayOfCountsAndNulls,
			@JsonProperty("arrayOfCountsOrNull") java.util.List<Double> arrayOfCountsOrNull,
			@JsonProperty("arrayOfCountsAndNullsOrNull") java.util.List<Double> arrayOfCountsAndNullsOrNull,
			@JsonProperty("mapOfCounts") java.util.Map<String, Double> mapOfCounts,
			@JsonProperty("mapOfMapsOfCounts") java.util.Map<String, java.util.Map<String, Double>> mapOfMapsOfCounts,
			@JsonProperty("mapOfNullsAndCounts") java.util.Map<String, Double> mapOfNullsAndCounts,
			@JsonProperty("mapOfCountsOrNull") java.util.Map<String, Double> mapOfCountsOrNull,
			@JsonProperty("mapOfNullsAndCountsOrNull") java.util.Map<String, Double> mapOfNullsAndCountsOrNull,
			@JsonProperty("arrayOfMapsOfCounts") java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCounts,
			@JsonProperty("arrayOfMapsOfCountsOrNull") java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCountsOrNull,
			@JsonProperty("arrayOfNullsAndMapsOfCounts") java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfCounts,
			@JsonProperty("arrayOfMapsOfNullsAndCounts") java.util.List<java.util.Map<String, Double>> arrayOfMapsOfNullsAndCounts,
			@JsonProperty("arrayOfNullsAndMapsOfNullsAndCountsOrNull") java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfNullsAndCountsOrNull,
			@JsonProperty("mapOfArraysOfCounts") java.util.Map<String, java.util.List<Double>> mapOfArraysOfCounts,
			@JsonProperty("mapOfArraysOfCountsOrNull") java.util.Map<String, java.util.List<Double>> mapOfArraysOfCountsOrNull,
			@JsonProperty("mapOfNullsAndArraysOfCounts") java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfCounts,
			@JsonProperty("mapOfArraysOfNullsAndCounts") java.util.Map<String, java.util.List<Double>> mapOfArraysOfNullsAndCounts,
			@JsonProperty("mapOfNullsAndArraysOfNullsAndCountsOrNull") java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfNullsAndCountsOrNull
	) {
		return new JsonNumberTest(JsonNumberTest.Builder.create()
				.withCount(count)
				.withCountWithDescription(countWithDescription)
				.withCountOrNull(countOrNull)
				.withArrayOfCounts(arrayOfCounts)
				.withArrayOfArraysOfCounts(arrayOfArraysOfCounts)
				.withArrayOfCountsAndNulls(arrayOfCountsAndNulls)
				.withArrayOfCountsOrNull(arrayOfCountsOrNull)
				.withArrayOfCountsAndNullsOrNull(arrayOfCountsAndNullsOrNull)
				.withMapOfCounts(mapOfCounts)
				.withMapOfMapsOfCounts(mapOfMapsOfCounts)
				.withMapOfNullsAndCounts(mapOfNullsAndCounts)
				.withMapOfCountsOrNull(mapOfCountsOrNull)
				.withMapOfNullsAndCountsOrNull(mapOfNullsAndCountsOrNull)
				.withArrayOfMapsOfCounts(arrayOfMapsOfCounts)
				.withArrayOfMapsOfCountsOrNull(arrayOfMapsOfCountsOrNull)
				.withArrayOfNullsAndMapsOfCounts(arrayOfNullsAndMapsOfCounts)
				.withArrayOfMapsOfNullsAndCounts(arrayOfMapsOfNullsAndCounts)
				.withArrayOfNullsAndMapsOfNullsAndCountsOrNull(arrayOfNullsAndMapsOfNullsAndCountsOrNull)
				.withMapOfArraysOfCounts(mapOfArraysOfCounts)
				.withMapOfArraysOfCountsOrNull(mapOfArraysOfCountsOrNull)
				.withMapOfNullsAndArraysOfCounts(mapOfNullsAndArraysOfCounts)
				.withMapOfArraysOfNullsAndCounts(mapOfArraysOfNullsAndCounts)
				.withMapOfNullsAndArraysOfNullsAndCountsOrNull(mapOfNullsAndArraysOfNullsAndCountsOrNull)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_count__ {}
	private static final class __MISSING_countWithDescription__ {}
	private static final class __MISSING_arrayOfCounts__ {}
	private static final class __MISSING_arrayOfArraysOfCounts__ {}
	private static final class __MISSING_arrayOfCountsAndNulls__ {}
	private static final class __MISSING_mapOfCounts__ {}
	private static final class __MISSING_mapOfMapsOfCounts__ {}
	private static final class __MISSING_mapOfNullsAndCounts__ {}
	private static final class __MISSING_arrayOfMapsOfCounts__ {}
	private static final class __MISSING_arrayOfNullsAndMapsOfCounts__ {}
	private static final class __MISSING_arrayOfMapsOfNullsAndCounts__ {}
	private static final class __MISSING_mapOfArraysOfCounts__ {}
	private static final class __MISSING_mapOfNullsAndArraysOfCounts__ {}
	private static final class __MISSING_mapOfArraysOfNullsAndCounts__ {}

	public static final class Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> {

		private Double count;
		private Double countWithDescription;
		private Double countOrNull;
		private java.util.List<Double> arrayOfCounts;
		private java.util.List<java.util.List<Double>> arrayOfArraysOfCounts;
		private java.util.List<Double> arrayOfCountsAndNulls;
		private java.util.List<Double> arrayOfCountsOrNull;
		private java.util.List<Double> arrayOfCountsAndNullsOrNull;
		private java.util.Map<String, Double> mapOfCounts;
		private java.util.Map<String, java.util.Map<String, Double>> mapOfMapsOfCounts;
		private java.util.Map<String, Double> mapOfNullsAndCounts;
		private java.util.Map<String, Double> mapOfCountsOrNull;
		private java.util.Map<String, Double> mapOfNullsAndCountsOrNull;
		private java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCounts;
		private java.util.List<java.util.Map<String, Double>> arrayOfMapsOfCountsOrNull;
		private java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfCounts;
		private java.util.List<java.util.Map<String, Double>> arrayOfMapsOfNullsAndCounts;
		private java.util.List<java.util.Map<String, Double>> arrayOfNullsAndMapsOfNullsAndCountsOrNull;
		private java.util.Map<String, java.util.List<Double>> mapOfArraysOfCounts;
		private java.util.Map<String, java.util.List<Double>> mapOfArraysOfCountsOrNull;
		private java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfCounts;
		private java.util.Map<String, java.util.List<Double>> mapOfArraysOfNullsAndCounts;
		private java.util.Map<String, java.util.List<Double>> mapOfNullsAndArraysOfNullsAndCountsOrNull;

		private Builder() {}

		public static Builder<
				__MISSING_count__,
				__MISSING_countWithDescription__,
				__MISSING_arrayOfCounts__,
				__MISSING_arrayOfArraysOfCounts__,
				__MISSING_arrayOfCountsAndNulls__,
				__MISSING_mapOfCounts__,
				__MISSING_mapOfMapsOfCounts__,
				__MISSING_mapOfNullsAndCounts__,
				__MISSING_arrayOfMapsOfCounts__,
				__MISSING_arrayOfNullsAndMapsOfCounts__,
				__MISSING_arrayOfMapsOfNullsAndCounts__,
				__MISSING_mapOfArraysOfCounts__,
				__MISSING_mapOfNullsAndArraysOfCounts__,
				__MISSING_mapOfArraysOfNullsAndCounts__
				> create() {
			return new Builder<
				__MISSING_count__,
				__MISSING_countWithDescription__,
				__MISSING_arrayOfCounts__,
				__MISSING_arrayOfArraysOfCounts__,
				__MISSING_arrayOfCountsAndNulls__,
				__MISSING_mapOfCounts__,
				__MISSING_mapOfMapsOfCounts__,
				__MISSING_mapOfNullsAndCounts__,
				__MISSING_arrayOfMapsOfCounts__,
				__MISSING_arrayOfNullsAndMapsOfCounts__,
				__MISSING_arrayOfMapsOfNullsAndCounts__,
				__MISSING_mapOfArraysOfCounts__,
				__MISSING_mapOfNullsAndArraysOfCounts__,
				__MISSING_mapOfArraysOfNullsAndCounts__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonNumberTest.__OK__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withCount(Double value) {
			this.count = value;
			return (Builder<
				JsonNumberTest.__OK__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		/**
		 * This is a count.
		 */
		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withCountWithDescription(Double value) {
			this.countWithDescription = value;
			return (Builder<
				__HAS_count__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withCountOrNull(Double value) {
			this.countOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfCounts(java.util.List<Double> value) {
			this.arrayOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfArraysOfCounts(java.util.List<java.util.List<Double>> value) {
			this.arrayOfArraysOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfCountsAndNulls(java.util.List<Double> value) {
			this.arrayOfCountsAndNulls = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfCountsOrNull(java.util.List<Double> value) {
			this.arrayOfCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfCountsAndNullsOrNull(java.util.List<Double> value) {
			this.arrayOfCountsAndNullsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				JsonNumberTest.__OK__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfCounts(java.util.Map<String, Double> value) {
			this.mapOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				JsonNumberTest.__OK__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfMapsOfCounts(java.util.Map<String, java.util.Map<String, Double>> value) {
			this.mapOfMapsOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfNullsAndCounts(java.util.Map<String, Double> value) {
			this.mapOfNullsAndCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfCountsOrNull(java.util.Map<String, Double> value) {
			this.mapOfCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfNullsAndCountsOrNull(java.util.Map<String, Double> value) {
			this.mapOfNullsAndCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfMapsOfCounts(java.util.List<java.util.Map<String, Double>> value) {
			this.arrayOfMapsOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfMapsOfCountsOrNull(java.util.List<java.util.Map<String, Double>> value) {
			this.arrayOfMapsOfCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfNullsAndMapsOfCounts(java.util.List<java.util.Map<String, Double>> value) {
			this.arrayOfNullsAndMapsOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfMapsOfNullsAndCounts(java.util.List<java.util.Map<String, Double>> value) {
			this.arrayOfMapsOfNullsAndCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withArrayOfNullsAndMapsOfNullsAndCountsOrNull(java.util.List<java.util.Map<String, Double>> value) {
			this.arrayOfNullsAndMapsOfNullsAndCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfArraysOfCounts(java.util.Map<String, java.util.List<Double>> value) {
			this.mapOfArraysOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfArraysOfCountsOrNull(java.util.Map<String, java.util.List<Double>> value) {
			this.mapOfArraysOfCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfNullsAndArraysOfCounts(java.util.Map<String, java.util.List<Double>> value) {
			this.mapOfNullsAndArraysOfCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				JsonNumberTest.__OK__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				JsonNumberTest.__OK__
				> withMapOfArraysOfNullsAndCounts(java.util.Map<String, java.util.List<Double>> value) {
			this.mapOfArraysOfNullsAndCounts = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				JsonNumberTest.__OK__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				> withMapOfNullsAndArraysOfNullsAndCountsOrNull(java.util.Map<String, java.util.List<Double>> value) {
			this.mapOfNullsAndArraysOfNullsAndCountsOrNull = value;
			return (Builder<
				__HAS_count__,
				__HAS_countWithDescription__,
				__HAS_arrayOfCounts__,
				__HAS_arrayOfArraysOfCounts__,
				__HAS_arrayOfCountsAndNulls__,
				__HAS_mapOfCounts__,
				__HAS_mapOfMapsOfCounts__,
				__HAS_mapOfNullsAndCounts__,
				__HAS_arrayOfMapsOfCounts__,
				__HAS_arrayOfNullsAndMapsOfCounts__,
				__HAS_arrayOfMapsOfNullsAndCounts__,
				__HAS_mapOfArraysOfCounts__,
				__HAS_mapOfNullsAndArraysOfCounts__,
				__HAS_mapOfArraysOfNullsAndCounts__
				>) this;
		}
	}
}
