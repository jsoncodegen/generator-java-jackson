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
public final class JsonInterfaceMixedTest {

	private final jsoncodegen.javajacksontest.generated.parent.tests.child.JsonInterface child;
	private final jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface local;
	private final jsoncodegen.javajacksontest.generated.parent.JsonInterface parent;
	private final jsoncodegen.javajacksontest.generated.JsonInterface root;
	private final jsoncodegen.javajacksontest.generated.parent.sibling.JsonInterface sibling;

	public JsonInterfaceMixedTest(Builder<
			JsonInterfaceMixedTest.__OK__,
			JsonInterfaceMixedTest.__OK__,
			JsonInterfaceMixedTest.__OK__,
			JsonInterfaceMixedTest.__OK__,
			JsonInterfaceMixedTest.__OK__
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
		JsonInterfaceMixedTest rhs = (JsonInterfaceMixedTest) other;
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

	public jsoncodegen.javajacksontest.generated.parent.tests.child.JsonInterface getChild() { return this.child; }
	public jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface getLocal() { return this.local; }
	public jsoncodegen.javajacksontest.generated.parent.JsonInterface getParent() { return this.parent; }
	public jsoncodegen.javajacksontest.generated.JsonInterface getRoot() { return this.root; }
	public jsoncodegen.javajacksontest.generated.parent.sibling.JsonInterface getSibling() { return this.sibling; }

	@JsonCreator
	public static JsonInterfaceMixedTest jacksonHelper(
			@JsonProperty("child") jsoncodegen.javajacksontest.generated.parent.tests.child.JsonInterface child,
			@JsonProperty("local") jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface local,
			@JsonProperty("parent") jsoncodegen.javajacksontest.generated.parent.JsonInterface parent,
			@JsonProperty("root") jsoncodegen.javajacksontest.generated.JsonInterface root,
			@JsonProperty("sibling") jsoncodegen.javajacksontest.generated.parent.sibling.JsonInterface sibling
	) {
		return new JsonInterfaceMixedTest(JsonInterfaceMixedTest.Builder.create()
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

		private jsoncodegen.javajacksontest.generated.parent.tests.child.JsonInterface child;
		private jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface local;
		private jsoncodegen.javajacksontest.generated.parent.JsonInterface parent;
		private jsoncodegen.javajacksontest.generated.JsonInterface root;
		private jsoncodegen.javajacksontest.generated.parent.sibling.JsonInterface sibling;

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
				JsonInterfaceMixedTest.__OK__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				> withChild(jsoncodegen.javajacksontest.generated.parent.tests.child.JsonInterface value) {
			this.child = value;
			return (Builder<
				JsonInterfaceMixedTest.__OK__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				> withLocal(jsoncodegen.javajacksontest.generated.parent.tests.JsonInterface value) {
			this.local = value;
			return (Builder<
				__HAS_child__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_parent__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_root__,
				__HAS_sibling__
				> withParent(jsoncodegen.javajacksontest.generated.parent.JsonInterface value) {
			this.parent = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_root__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_sibling__
				> withRoot(jsoncodegen.javajacksontest.generated.JsonInterface value) {
			this.root = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				JsonInterfaceMixedTest.__OK__,
				__HAS_sibling__
				>) this;
		}

		@SuppressWarnings("unchecked")
		public Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				JsonInterfaceMixedTest.__OK__
				> withSibling(jsoncodegen.javajacksontest.generated.parent.sibling.JsonInterface value) {
			this.sibling = value;
			return (Builder<
				__HAS_child__,
				__HAS_local__,
				__HAS_parent__,
				__HAS_root__,
				JsonInterfaceMixedTest.__OK__
				>) this;
		}
	}
}
