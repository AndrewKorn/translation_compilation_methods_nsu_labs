// HASH COLLISIONS: YES
// timestamp: 1.667741189768E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Prog extends Struct {
	public Object[] f_d;
	public Struct f_b;

	public Struct_Prog() {}
	public Struct_Prog(Object[] a_d, Struct a_b) {
		f_d = a_d;
		f_b = a_b;
	}

	public int getTypeId() { return 104; }
	public String getTypeName() { return "Prog"; }

	private static final String[] field_names = new String[] {
		"d", "b"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_d, f_b
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Prog");
		f_d = (Object[])values[0];
		f_b = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 104) return 104-tmp;
		Struct_Prog other = (Struct_Prog)other_gen;
		tmp = FlowRuntime.compareByValue(f_d, other.f_d);
		if (tmp != 0) return tmp;
		tmp = f_b.compareTo(other.f_b);
		return tmp;
	}
}
