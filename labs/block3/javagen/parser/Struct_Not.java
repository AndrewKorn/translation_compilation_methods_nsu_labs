// HASH COLLISIONS: YES
// timestamp: 1.667742586216E12

package parser;

import com.area9innovation.flow.*;

public class Struct_Not extends Struct {
	public Struct f_e;

	public Struct_Not() {}
	public Struct_Not(Struct a_e) {
		f_e = a_e;
	}

	public int getTypeId() { return 49; }
	public String getTypeName() { return "Not"; }

	private static final String[] field_names = new String[] {
		"e"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_e
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Not");
		f_e = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 49) return 49-tmp;
		Struct_Not other = (Struct_Not)other_gen;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
