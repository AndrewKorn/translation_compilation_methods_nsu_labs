// HASH COLLISIONS: YES
// timestamp: 1.669356105102E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegUnion extends Struct {
	public Object[] f_structs;

	public Struct_PegUnion() {}
	public Struct_PegUnion(Object[] a_structs) {
		f_structs = a_structs;
	}

	public int getTypeId() { return 95; }
	public String getTypeName() { return "PegUnion"; }

	private static final String[] field_names = new String[] {
		"structs"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_structs
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegUnion");
		f_structs = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 95) return 95-tmp;
		Struct_PegUnion other = (Struct_PegUnion)other_gen;
		tmp = FlowRuntime.compareByValue(f_structs, other.f_structs);
		return tmp;
	}
}
