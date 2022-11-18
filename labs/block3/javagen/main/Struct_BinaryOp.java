// HASH COLLISIONS: YES
// timestamp: 1.66875322278E12

package main;

import com.area9innovation.flow.*;

public class Struct_BinaryOp extends Struct {
	public String f_op;
	public Struct f_e1;
	public Struct f_e2;

	public Struct_BinaryOp() {}
	public Struct_BinaryOp(String a_op, Struct a_e1, Struct a_e2) {
		f_op = a_op;
		f_e1 = a_e1;
		f_e2 = a_e2;
	}

	public int getTypeId() { return 11; }
	public String getTypeName() { return "BinaryOp"; }

	private static final String[] field_names = new String[] {
		"op", "e1", "e2"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_op, f_e1, f_e2
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in BinaryOp");
		f_op = (String)values[0];
		f_e1 = (Struct)values[1];
		f_e2 = (Struct)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 11) return 11-tmp;
		Struct_BinaryOp other = (Struct_BinaryOp)other_gen;
		tmp = f_op.compareTo(other.f_op);
		if (tmp != 0) return tmp;
		tmp = f_e1.compareTo(other.f_e1);
		if (tmp != 0) return tmp;
		tmp = f_e2.compareTo(other.f_e2);
		return tmp;
	}
}
