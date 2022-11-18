// HASH COLLISIONS: YES
// timestamp: 1.667742586221E12

package parser;

import com.area9innovation.flow.*;

public class Struct_PegRuleType extends Struct {
	public String f_rule;

	public Struct_PegRuleType() {}
	public Struct_PegRuleType(String a_rule) {
		f_rule = a_rule;
	}

	public int getTypeId() { return 84; }
	public String getTypeName() { return "PegRuleType"; }

	private static final String[] field_names = new String[] {
		"rule"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_rule
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegRuleType");
		f_rule = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 84) return 84-tmp;
		Struct_PegRuleType other = (Struct_PegRuleType)other_gen;
		tmp = f_rule.compareTo(other.f_rule);
		return tmp;
	}
}
