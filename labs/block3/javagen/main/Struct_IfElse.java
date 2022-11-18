// HASH COLLISIONS: YES
// timestamp: 1.668753222794E12

package main;

import com.area9innovation.flow.*;

public class Struct_IfElse extends Struct {
	public int f_id;
	public String f_op;
	public Struct f_e1;
	public Struct f_e2;
	public Object[] f_ifGoto;
	public Object[] f_elseGoto;

	public Struct_IfElse() {}
	public Struct_IfElse(int a_id, String a_op, Struct a_e1, Struct a_e2, Object[] a_ifGoto, Object[] a_elseGoto) {
		f_id = a_id;
		f_op = a_op;
		f_e1 = a_e1;
		f_e2 = a_e2;
		f_ifGoto = a_ifGoto;
		f_elseGoto = a_elseGoto;
	}

	public int getTypeId() { return 25; }
	public String getTypeName() { return "IfElse"; }

	private static final String[] field_names = new String[] {
		"id", "op", "e1", "e2", "ifGoto", "elseGoto"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRING, RuntimeType.STRUCT, RuntimeType.STRUCT, RuntimeType.ARRAY, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id, f_op, f_e1, f_e2, f_ifGoto, f_elseGoto
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 6)
			throw new IndexOutOfBoundsException("Invalid field count in IfElse");
		f_id = (Integer)values[0];
		f_op = (String)values[1];
		f_e1 = (Struct)values[2];
		f_e2 = (Struct)values[3];
		f_ifGoto = (Object[])values[4];
		f_elseGoto = (Object[])values[5];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 25) return 25-tmp;
		Struct_IfElse other = (Struct_IfElse)other_gen;
		if (f_id != other.f_id)
			return (f_id > other.f_id) ? 1 : -1;
		tmp = f_op.compareTo(other.f_op);
		if (tmp != 0) return tmp;
		tmp = f_e1.compareTo(other.f_e1);
		if (tmp != 0) return tmp;
		tmp = f_e2.compareTo(other.f_e2);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_ifGoto, other.f_ifGoto);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_elseGoto, other.f_elseGoto);
		return tmp;
	}
}
