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
public final class JsonNumberEnumValueMixedTest {

	private final jsoncodegen.javajacksontest.generated.parent.tests.child.JsonNumberEnum child = jsoncodegen.javajacksontest.generated.parent.tests.child.JsonNumberEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonNumberEnum local = jsoncodegen.javajacksontest.generated.parent.tests.JsonNumberEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum parent = jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum.Name;
	private final jsoncodegen.javajacksontest.generated.JsonNumberEnum root = jsoncodegen.javajacksontest.generated.JsonNumberEnum.Name;
	private final jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum sibling = jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum.Name;

	public JsonNumberEnumValueMixedTest(Builder builder) {


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
		JsonNumberEnumValueMixedTest rhs = (JsonNumberEnumValueMixedTest) other;
		return new EqualsBuilder()

			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)

			.toString();
	}

	public jsoncodegen.javajacksontest.generated.parent.tests.child.JsonNumberEnum getChild() { return this.child; }
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonNumberEnum getLocal() { return this.local; }
	public jsoncodegen.javajacksontest.generated.parent.JsonNumberEnum getParent() { return this.parent; }
	public jsoncodegen.javajacksontest.generated.JsonNumberEnum getRoot() { return this.root; }
	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonNumberEnum getSibling() { return this.sibling; }

	@JsonCreator
	public static JsonNumberEnumValueMixedTest jacksonHelper(

	) {
		return new JsonNumberEnumValueMixedTest(JsonNumberEnumValueMixedTest.Builder.create()

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
