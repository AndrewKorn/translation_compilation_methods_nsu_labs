// HASH COLLISIONS: YES
// timestamp: 1.668753222774E12

package main;

import com.area9innovation.flow.*;

public class Struct_ActionVar extends Struct {
	public String f_id;

	public Struct_ActionVar() {}
	public Struct_ActionVar(String a_id) {
		f_id = a_id;
	}

	public int getTypeId() { return 7; }
	public String getTypeName() { return "ActionVar"; }

	private static final String[] field_names = new String[] {
		"id"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in ActionVar");
		f_id = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 7) return 7-tmp;
		Struct_ActionVar other = (Struct_ActionVar)other_gen;
		tmp = f_id.compareTo(other.f_id);
		return tmp;
	}
}
