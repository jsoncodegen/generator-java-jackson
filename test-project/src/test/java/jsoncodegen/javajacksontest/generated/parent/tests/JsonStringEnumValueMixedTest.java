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
public final class JsonStringEnumValueMixedTest {

	private jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum child = jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum.Name;
	private jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum local = jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum.Name;
	private jsoncodegen.javajacksontest.generated.parent.JsonStringEnum parent = jsoncodegen.javajacksontest.generated.parent.JsonStringEnum.Name;
	private jsoncodegen.javajacksontest.generated.JsonStringEnum root = jsoncodegen.javajacksontest.generated.JsonStringEnum.Name;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum sibling = jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum.Name;

	public JsonStringEnumValueMixedTest(Builder builder) {


	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()

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
		JsonStringEnumValueMixedTest rhs = (JsonStringEnumValueMixedTest) other;
		return new EqualsBuilder()

			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)

			.toString();
	}
	
	public JsonStringEnumValueMixedTest clone() {
		return new JsonStringEnumValueMixedTest(JsonStringEnumValueMixedTest.Builder.create()

		);
	}

	public jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum getChild() {
		return this.child;
	}

	public void setChild(jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.child = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum getLocal() {
		return this.local;
	}

	public void setLocal(jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.local = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.JsonStringEnum getParent() {
		return this.parent;
	}

	public void setParent(jsoncodegen.javajacksontest.generated.parent.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.parent = value;
	}

	public jsoncodegen.javajacksontest.generated.JsonStringEnum getRoot() {
		return this.root;
	}

	public void setRoot(jsoncodegen.javajacksontest.generated.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.root = value;
	}

	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum getSibling() {
		return this.sibling;
	}

	public void setSibling(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
		Validate.notNull(value, "Argument 'value' must not be null.");
		this.sibling = value;
	}

	@JsonCreator
	public static JsonStringEnumValueMixedTest jacksonHelper(

	) {
		return new JsonStringEnumValueMixedTest(JsonStringEnumValueMixedTest.Builder.create()

		);
	}

	private static final class __OK__ {}


	public static final class Builder {



		private Builder() {}

		public static Builder create() {
			return new Builder();
		}


	}
}
