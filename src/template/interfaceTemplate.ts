export function interfaceTemplate({
	packageName,
	interfaceName,
	comment,
	fieldDeclarations,
	hashAppends,
	equalsAppends,
	toStringAppends,
	builderGenericsAllOk,
	validations,
	copyValuesFromBuilder,
	jacksonHelperProperties,
	builderWithCalls,
	missingClasses,
	builderGenerics,
	gettersAndSetters,
	builderFields,
	builderGenericsAllMissing,
	builderWithMethods,
	cloneWithCalls,
}: {
	packageName: string
	interfaceName: string
	comment: string
	fieldDeclarations: string
	hashAppends: string
	equalsAppends: string
	toStringAppends: string
	builderGenericsAllOk: string
	validations: string
	copyValuesFromBuilder: string
	jacksonHelperProperties: string
	builderWithCalls: string
	missingClasses: string
	builderGenerics: string
	gettersAndSetters: string
	builderFields: string
	builderGenericsAllMissing: string
	builderWithMethods: string
	cloneWithCalls: string
}) {
	return `package ${packageName};

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

${comment}
public final class ${interfaceName} {

${fieldDeclarations}

	public ${interfaceName}(Builder${builderGenericsAllOk} builder) {
${validations}
${copyValuesFromBuilder}
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
${hashAppends}
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
		${interfaceName} rhs = (${interfaceName}) other;
		return new EqualsBuilder()
${equalsAppends}
			.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
${toStringAppends}
			.toString();
	}
	
	public ${interfaceName} clone() {
		return new ${interfaceName}(${interfaceName}.Builder.create()
${cloneWithCalls}
		);
	}

${gettersAndSetters}

	@JsonCreator
	public static ${interfaceName} jacksonHelper(
${jacksonHelperProperties}
	) {
		return new ${interfaceName}(${interfaceName}.Builder.create()
${builderWithCalls}
		);
	}

	private static final class __OK__ {}
${missingClasses}

	public static final class Builder${builderGenerics} {

${builderFields}

		private Builder() {}

		public static Builder${builderGenericsAllMissing} create() {
			return new Builder${builderGenericsAllMissing}();
		}

${builderWithMethods}
	}
}
`
}
