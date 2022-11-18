// HASH COLLISIONS: YES
// timestamp: 1.667741189762E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Decl extends Struct {
	public Struct_Var f_v;
	public Struct f_t;

	public Struct_Decl() {}
	public Struct_Decl(Struct_Var a_v, Struct a_t) {
		f_v = a_v;
		f_t = a_t;
	}

	public int getTypeId() { return 20; }
	public String getTypeName() { return "Decl"; }

	private static final String[] field_names = new String[] {
		"v", "t"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_v, f_t
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Decl");
		f_v = (Struct_Var)values[0];
		f_t = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 20) return 20-tmp;
		Struct_Decl other = (Struct_Decl)other_gen;
		tmp = f_v.compareTo(other.f_v);
		if (tmp != 0) return tmp;
		tmp = f_t.compareTo(other.f_t);
		return tmp;
	}
}
