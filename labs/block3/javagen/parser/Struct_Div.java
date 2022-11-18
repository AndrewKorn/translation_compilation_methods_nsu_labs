// HASH COLLISIONS: YES
// timestamp: 1.667742586214E12

package parser;

import com.area9innovation.flow.*;

public class Struct_Div extends Struct {
	public Struct f_e1;
	public Struct f_e2;

	public Struct_Div() {}
	public Struct_Div(Struct a_e1, Struct a_e2) {
		f_e1 = a_e1;
		f_e2 = a_e2;
	}

	public int getTypeId() { return 21; }
	public String getTypeName() { return "Div"; }

	private static final String[] field_names = new String[] {
		"e1", "e2"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_e1, f_e2
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Div");
		f_e1 = (Struct)values[0];
		f_e2 = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 21) return 21-tmp;
		Struct_Div other = (Struct_Div)other_gen;
		tmp = f_e1.compareTo(other.f_e1);
		if (tmp != 0) return tmp;
		tmp = f_e2.compareTo(other.f_e2);
		return tmp;
	}
}
