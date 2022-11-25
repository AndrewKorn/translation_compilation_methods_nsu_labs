// HASH COLLISIONS: YES
// timestamp: 1.6693561051E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegStackPc extends Struct {
	public int f_pc;
	public Struct f_capture;

	public Struct_PegStackPc() {}
	public Struct_PegStackPc(int a_pc, Struct a_capture) {
		f_pc = a_pc;
		f_capture = a_capture;
	}

	public int getTypeId() { return 87; }
	public String getTypeName() { return "PegStackPc"; }

	private static final String[] field_names = new String[] {
		"pc", "capture"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pc, f_capture
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegStackPc");
		f_pc = (Integer)values[0];
		f_capture = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 87) return 87-tmp;
		Struct_PegStackPc other = (Struct_PegStackPc)other_gen;
		if (f_pc != other.f_pc)
			return (f_pc > other.f_pc) ? 1 : -1;
		tmp = f_capture.compareTo(other.f_capture);
		return tmp;
	}
}
