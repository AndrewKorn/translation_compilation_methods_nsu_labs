// HASH COLLISIONS: YES
// timestamp: 1.668753222861E12

package main;

import com.area9innovation.flow.*;

public class Struct_VnemoProg extends Struct {
	public Object[] f_d;
	public Object[] f_s;

	public Struct_VnemoProg() {}
	public Struct_VnemoProg(Object[] a_d, Object[] a_s) {
		f_d = a_d;
		f_s = a_s;
	}

	public int getTypeId() { return 122; }
	public String getTypeName() { return "VnemoProg"; }

	private static final String[] field_names = new String[] {
		"d", "s"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_d, f_s
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in VnemoProg");
		f_d = (Object[])values[0];
		f_s = (Object[])values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 122) return 122-tmp;
		Struct_VnemoProg other = (Struct_VnemoProg)other_gen;
		tmp = FlowRuntime.compareByValue(f_d, other.f_d);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_s, other.f_s);
		return tmp;
	}
}
