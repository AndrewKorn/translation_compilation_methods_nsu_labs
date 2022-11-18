// HASH COLLISIONS: YES
// timestamp: 1.668753222791E12

package main;

import com.area9innovation.flow.*;

public class Struct_CutDown extends Struct {
	public Struct f_p;

	public Struct_CutDown() {}
	public Struct_CutDown(Struct a_p) {
		f_p = a_p;
	}

	public int getTypeId() { return 19; }
	public String getTypeName() { return "CutDown"; }

	private static final String[] field_names = new String[] {
		"p"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_p
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in CutDown");
		f_p = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 19) return 19-tmp;
		Struct_CutDown other = (Struct_CutDown)other_gen;
		tmp = f_p.compareTo(other.f_p);
		return tmp;
	}
}
