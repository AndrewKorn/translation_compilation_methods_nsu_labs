// HASH COLLISIONS: YES
// timestamp: 1.668103166733E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegCodeConst extends Struct {
	public String f_input;
	public Object[] f_program;
	public Struct f_fns;
	public Struct_PegVmCache f_cache;
	public Struct_RuleResult f_capture;

	public Struct_PegCodeConst() {}
	public Struct_PegCodeConst(String a_input, Object[] a_program, Struct a_fns, Struct_PegVmCache a_cache, Struct_RuleResult a_capture) {
		f_input = a_input;
		f_program = a_program;
		f_fns = a_fns;
		f_cache = a_cache;
		f_capture = a_capture;
	}

	public int getTypeId() { return 67; }
	public String getTypeName() { return "PegCodeConst"; }

	private static final String[] field_names = new String[] {
		"input", "program", "fns", "cache", "capture"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.ARRAY, RuntimeType.STRUCT, RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_input, f_program, f_fns, f_cache, f_capture
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 5)
			throw new IndexOutOfBoundsException("Invalid field count in PegCodeConst");
		f_input = (String)values[0];
		f_program = (Object[])values[1];
		f_fns = (Struct)values[2];
		f_cache = (Struct_PegVmCache)values[3];
		f_capture = (Struct_RuleResult)values[4];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 67) return 67-tmp;
		Struct_PegCodeConst other = (Struct_PegCodeConst)other_gen;
		tmp = f_input.compareTo(other.f_input);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_program, other.f_program);
		if (tmp != 0) return tmp;
		tmp = f_fns.compareTo(other.f_fns);
		if (tmp != 0) return tmp;
		tmp = f_cache.compareTo(other.f_cache);
		if (tmp != 0) return tmp;
		tmp = f_capture.compareTo(other.f_capture);
		return tmp;
	}
}
