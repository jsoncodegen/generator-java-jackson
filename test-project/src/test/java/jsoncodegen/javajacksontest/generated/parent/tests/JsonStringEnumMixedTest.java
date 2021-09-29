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
public final class JsonStringEnumMixedTest {

	private jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum child;
	private jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum local;
	private jsoncodegen.javajacksontest.generated.parent.JsonStringEnum parent;
	private jsoncodegen.javajacksontest.generated.JsonStringEnum root;
	private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum sibling;

	public JsonStringEnumMixedTest(Builder<
			JsonStringEnumMixedTest.__OK__,
			JsonStringEnumMixedTest.__OK__,
			JsonStringEnumMixedTest.__OK__,
			JsonStringEnumMixedTest.__OK__,
			JsonStringEnumMixedTest.__OK__
			> builder) {
		Validate.notNull(builder.child, "Argument 'child' must not be null.");
		Validate.notNull(builder.local, "Argument 'local' must not be null.");
		Validate.notNull(builder.parent, "Argument 'parent' must not be null.");
		Validate.notNull(builder.root, "Argument 'root' must not be null.");
		Validate.notNull(builder.sibling, "Argument 'sibling' must not be null.");
		this.child = builder.child;
		this.local = builder.local;
		this.parent = builder.parent;
		this.root = builder.root;
		this.sibling = builder.sibling;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.child)
			.append(this.local)
			.append(this.parent)
			.append(this.root)
			.append(this.sibling)
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
		JsonStringEnumMixedTest rhs = (JsonStringEnumMixedTest) other;
		return new EqualsBuilder()
			.append(this.child, rhs.child)
			.append(this.local, rhs.local)
			.append(this.parent, rhs.parent)
			.append(this.root, rhs.root)
			.append(this.sibling, rhs.sibling)
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("child", this.child)
			.append("local", this.local)
			.append("parent", this.parent)
			.append("root", this.root)
			.append("sibling", this.sibling)
			.toString();
	}
	
	public JsonStringEnumMixedTest clone() {
		return new JsonStringEnumMixedTest(JsonStringEnumMixedTest.Builder.create()
				.withChild(this.child)
				.withLocal(this.local)
				.withParent(this.parent)
				.withRoot(this.root)
				.withSibling(this.sibling)
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
	public static JsonStringEnumMixedTest jacksonHelper(
			@JsonProperty("child") jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum child,
			@JsonProperty("local") jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum local,
			@JsonProperty("parent") jsoncodegen.javajacksontest.generated.parent.JsonStringEnum parent,
			@JsonProperty("root") jsoncodegen.javajacksontest.generated.JsonStringEnum root,
			@JsonProperty("sibling") jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum sibling
	) {
		return new JsonStringEnumMixedTest(JsonStringEnumMixedTest.Builder.create()
				.withChild(child)
				.withLocal(local)
				.withParent(parent)
				.withRoot(root)
				.withSibling(sibling)
		);
	}

	private static final class __OK__ {}
	private static final class __MISSING_child__ {}
	private static final class __MISSING_local__ {}
	private static final class __MISSING_parent__ {}
	private static final class __MISSING_root__ {}
	private static final class __MISSING_sibling__ {}

	public static final class Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				> {

		private jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum child;
		private jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum local;
		private jsoncodegen.javajacksontest.generated.parent.JsonStringEnum parent;
		private jsoncodegen.javajacksontest.generated.JsonStringEnum root;
		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum sibling;

		private Builder() {}

		public static Builder<
				__MISSING_child__,
				__MISSING_local__,
				__MISSING_parent__,
				__MISSING_root__,
				__MISSING_sibling__
				> create() {
			return new Builder<
				__MISSING_child__,
				__MISSING_local__,
				__MISSING_parent__,
				__MISSING_root__,
				__MISSING_sibling__
				>();
		}

		@SuppressWarnings("unchecked")
		public Builder<
				JsonStringEnumMixedTest.__OK__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				> withChild(jsoncodegen.javajacksontest.generated.parent.tests.child.JsonStringEnum value) {
			this.child = value;
			return (Builder<
				JsonStringEnumMixedTest.__OK__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				> withLocal(jsoncodegen.javajacksontest.generated.parent.tests.JsonStringEnum value) {
			this.local = value;
			return (Builder<
				__HAS_child__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_root__,
				__HAS_sibling__
				> withParent(jsoncodegen.javajacksontest.generated.parent.JsonStringEnum value) {
			this.parent = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_sibling__
				> withRoot(jsoncodegen.javajacksontest.generated.JsonStringEnum value) {
			this.root = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				JsonStringEnumMixedTest.__OK__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				JsonStringEnumMixedTest.__OK__
				> withSibling(jsoncodegen.javajacksontest.generated.parent.sibling.JsonStringEnum value) {
			this.sibling = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				JsonStringEnumMixedTest.__OK__
				>) this;
		}
	}
}
