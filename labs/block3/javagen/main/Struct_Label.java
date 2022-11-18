// HASH COLLISIONS: YES
// timestamp: 1.668753222806E12

package main;

import com.area9innovation.flow.*;

public class Struct_Label extends Struct {
	public int f_id;

	public Struct_Label() {}
	public Struct_Label(int a_id) {
		f_id = a_id;
	}

	public int getTypeId() { return 40; }
	public String getTypeName() { return "Label"; }

	private static final String[] field_names = new String[] {
		"id"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Label");
		f_id = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 40) return 40-tmp;
		Struct_Label other = (Struct_Label)other_gen;
		if (f_id != other.f_id)
			return (f_id > other.f_id) ? 1 : -1;
		return 0;
	}
}
