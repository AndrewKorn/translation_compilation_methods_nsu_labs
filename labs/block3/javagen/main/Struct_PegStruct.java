// HASH COLLISIONS: YES
// timestamp: 1.668753222837E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegStruct extends Struct {
	public String f_name;
	public Object[] f_args;

	public Struct_PegStruct() {}
	public Struct_PegStruct(String a_name, Object[] a_args) {
		f_name = a_name;
		f_args = a_args;
	}

	public int getTypeId() { return 90; }
	public String getTypeName() { return "PegStruct"; }

	private static final String[] field_names = new String[] {
		"name", "args"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_name, f_args
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegStruct");
		f_name = (String)values[0];
		f_args = (Object[])values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 90) return 90-tmp;
		Struct_PegStruct other = (Struct_PegStruct)other_gen;
		tmp = f_name.compareTo(other.f_name);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_args, other.f_args);
		return tmp;
	}
}
