// HASH COLLISIONS: YES
// timestamp: 1.667742586226E12

package parser;

import com.area9innovation.flow.*;

public class Struct_Upd extends Struct {
	public Struct_Var f_a;
	public Struct_Int f_i;
	public Struct f_e;

	public Struct_Upd() {}
	public Struct_Upd(Struct_Var a_a, Struct_Int a_i, Struct a_e) {
		f_a = a_a;
		f_i = a_i;
		f_e = a_e;
	}

	public int getTypeId() { return 123; }
	public String getTypeName() { return "Upd"; }

	private static final String[] field_names = new String[] {
		"a", "i", "e"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_a, f_i, f_e
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in Upd");
		f_a = (Struct_Var)values[0];
		f_i = (Struct_Int)values[1];
		f_e = (Struct)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 123) return 123-tmp;
		Struct_Upd other = (Struct_Upd)other_gen;
		tmp = f_a.compareTo(other.f_a);
		if (tmp != 0) return tmp;
		tmp = f_i.compareTo(other.f_i);
		if (tmp != 0) return tmp;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
