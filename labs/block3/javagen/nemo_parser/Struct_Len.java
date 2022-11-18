// HASH COLLISIONS: YES
// timestamp: 1.667741189763E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Len extends Struct {
	public Struct_Var f_a;

	public Struct_Len() {}
	public Struct_Len(Struct_Var a_a) {
		f_a = a_a;
	}

	public int getTypeId() { return 41; }
	public String getTypeName() { return "Len"; }

	private static final String[] field_names = new String[] {
		"a"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_a
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Len");
		f_a = (Struct_Var)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 41) return 41-tmp;
		Struct_Len other = (Struct_Len)other_gen;
		tmp = f_a.compareTo(other.f_a);
		return tmp;
	}
}
