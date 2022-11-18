// HASH COLLISIONS: YES
// timestamp: 1.668753222777E12

package main;

import com.area9innovation.flow.*;

public class Struct_Assign extends Struct {
	public Struct_Var f_var;
	public Struct f_e;

	public Struct_Assign() {}
	public Struct_Assign(Struct_Var a_var, Struct a_e) {
		f_var = a_var;
		f_e = a_e;
	}

	public int getTypeId() { return 9; }
	public String getTypeName() { return "Assign"; }

	private static final String[] field_names = new String[] {
		"var", "e"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_var, f_e
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Assign");
		f_var = (Struct_Var)values[0];
		f_e = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 9) return 9-tmp;
		Struct_Assign other = (Struct_Assign)other_gen;
		tmp = f_var.compareTo(other.f_var);
		if (tmp != 0) return tmp;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
