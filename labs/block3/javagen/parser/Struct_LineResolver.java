// HASH COLLISIONS: YES
// timestamp: 1.667742586215E12

package parser;

import com.area9innovation.flow.*;

public class Struct_LineResolver extends Struct {
	public String f_input;
	public Object[] f_linestarts;

	public Struct_LineResolver() {}
	public Struct_LineResolver(String a_input, Object[] a_linestarts) {
		f_input = a_input;
		f_linestarts = a_linestarts;
	}

	public int getTypeId() { return 44; }
	public String getTypeName() { return "LineResolver"; }

	private static final String[] field_names = new String[] {
		"input", "linestarts"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_input, f_linestarts
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in LineResolver");
		f_input = (String)values[0];
		f_linestarts = (Object[])values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 44) return 44-tmp;
		Struct_LineResolver other = (Struct_LineResolver)other_gen;
		tmp = f_input.compareTo(other.f_input);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_linestarts, other.f_linestarts);
		return tmp;
	}
}
