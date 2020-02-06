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

	private final jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum child = jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum local = jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.JsonStringEnum parent = jsoncodegen.javajacksontest.generated.parent.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.JsonStringEnum root = jsoncodegen.javajacksontest.generated.JsonStringEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum sibling = jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum.Name;

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

	public jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum getChild() { return this.child; }
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum getLocal() { return this.local; }
	public jsoncodegen.javajacksontest.generated.parent.JsonStringEnum getParent() { return this.parent; }
	public jsoncodegen.javajacksontest.generated.JsonStringEnum getRoot() { return this.root; }
	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum getSibling() { return this.sibling; }

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
