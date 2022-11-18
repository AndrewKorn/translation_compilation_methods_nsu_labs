// HASH COLLISIONS: YES
// timestamp: 1.667742586223E12

package parser;

import com.area9innovation.flow.*;

public class Struct_RuleResult extends Struct {
	public Object f_input;
	public int f_pos;
	public int f_len;
	public Struct f_result;

	public Struct_RuleResult() {}
	public Struct_RuleResult(Object a_input, int a_pos, int a_len, Struct a_result) {
		f_input = a_input;
		f_pos = a_pos;
		f_len = a_len;
		f_result = a_result;
	}

	public int getTypeId() { return 107; }
	public String getTypeName() { return "RuleResult"; }

	private static final String[] field_names = new String[] {
		"input", "pos", "len", "result"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN, RuntimeType.INT, RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_input, f_pos, f_len, f_result
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in RuleResult");
		f_input = (Object)values[0];
		f_pos = (Integer)values[1];
		f_len = (Integer)values[2];
		f_result = (Struct)values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 107) return 107-tmp;
		Struct_RuleResult other = (Struct_RuleResult)other_gen;
		tmp = FlowRuntime.compareByValue(f_input, other.f_input);
		if (tmp != 0) return tmp;
		if (f_pos != other.f_pos)
			return (f_pos > other.f_pos) ? 1 : -1;
		if (f_len != other.f_len)
			return (f_len > other.f_len) ? 1 : -1;
		tmp = f_result.compareTo(other.f_result);
		return tmp;
	}
}
