// HASH COLLISIONS: YES
// timestamp: 1.66875322286E12

package main;

import com.area9innovation.flow.*;

public class Struct_VarDecl extends Struct {
	public String f_var;
	public Struct f_type;

	public Struct_VarDecl() {}
	public Struct_VarDecl(String a_var, Struct a_type) {
		f_var = a_var;
		f_type = a_type;
	}

	public int getTypeId() { return 120; }
	public String getTypeName() { return "VarDecl"; }

	private static final String[] field_names = new String[] {
		"var", "type"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_var, f_type
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in VarDecl");
		f_var = (String)values[0];
		f_type = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 120) return 120-tmp;
		Struct_VarDecl other = (Struct_VarDecl)other_gen;
		tmp = f_var.compareTo(other.f_var);
		if (tmp != 0) return tmp;
		tmp = f_type.compareTo(other.f_type);
		return tmp;
	}
}
