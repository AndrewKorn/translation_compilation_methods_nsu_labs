// HASH COLLISIONS: YES
// timestamp: 1.668753222796E12

package main;

import com.area9innovation.flow.*;

public class Struct_Iter extends Struct {
	public Struct f_b;

	public Struct_Iter() {}
	public Struct_Iter(Struct a_b) {
		f_b = a_b;
	}

	public int getTypeId() { return 30; }
	public String getTypeName() { return "Iter"; }

	private static final String[] field_names = new String[] {
		"b"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_b
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Iter");
		f_b = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 30) return 30-tmp;
		Struct_Iter other = (Struct_Iter)other_gen;
		tmp = f_b.compareTo(other.f_b);
		return tmp;
	}
}
