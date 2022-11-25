// HASH COLLISIONS: YES
// timestamp: 1.66935610511E12

package main;

import com.area9innovation.flow.*;

public class Struct_Var extends Struct {
	public String f_v;

	public Struct_Var() {}
	public Struct_Var(String a_v) {
		f_v = a_v;
	}

	public int getTypeId() { return 123; }
	public String getTypeName() { return "Var"; }

	private static final String[] field_names = new String[] {
		"v"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_v
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Var");
		f_v = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 123) return 123-tmp;
		Struct_Var other = (Struct_Var)other_gen;
		tmp = f_v.compareTo(other.f_v);
		return tmp;
	}
}
