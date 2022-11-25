// HASH COLLISIONS: YES
// timestamp: 1.669356105092E12

package main;

import com.area9innovation.flow.*;

public class Struct_MemoryState extends Struct {
	public Struct f_vars;

	public Struct_MemoryState() {}
	public Struct_MemoryState(Struct a_vars) {
		f_vars = a_vars;
	}

	public int getTypeId() { return 47; }
	public String getTypeName() { return "MemoryState"; }

	private static final String[] field_names = new String[] {
		"vars"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_vars
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in MemoryState");
		f_vars = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 47) return 47-tmp;
		Struct_MemoryState other = (Struct_MemoryState)other_gen;
		tmp = f_vars.compareTo(other.f_vars);
		return tmp;
	}
}
