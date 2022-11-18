// HASH COLLISIONS: YES
// timestamp: 1.667742586213E12

package parser;

import com.area9innovation.flow.*;

public class Struct_Assign extends Struct {
	public Struct_Var f_v;
	public Struct f_e;

	public Struct_Assign() {}
	public Struct_Assign(Struct_Var a_v, Struct a_e) {
		f_v = a_v;
		f_e = a_e;
	}

	public int getTypeId() { return 11; }
	public String getTypeName() { return "Assign"; }

	private static final String[] field_names = new String[] {
		"v", "e"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_v, f_e
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Assign");
		f_v = (Struct_Var)values[0];
		f_e = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 11) return 11-tmp;
		Struct_Assign other = (Struct_Assign)other_gen;
		tmp = f_v.compareTo(other.f_v);
		if (tmp != 0) return tmp;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
