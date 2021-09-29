package jsoncodegen.javajacksontest.generated.parent.tests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This is an interface.
 */
public final class JsonInterface {



	public JsonInterface(Builder builder) {


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
		JsonInterface rhs = (JsonInterface) other;
		return new EqualsBuilder()

			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)

			.toString();
	}
	
	public JsonInterface clone() {
		return new JsonInterface(JsonInterface.Builder.create()

		);
	}



	@JsonCreator
	public static JsonInterface jacksonHelper(

	) {
		return new JsonInterface(JsonInterface.Builder.create()

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
