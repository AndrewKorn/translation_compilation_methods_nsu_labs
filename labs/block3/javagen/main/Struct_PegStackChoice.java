// HASH COLLISIONS: YES
// timestamp: 1.6693561051E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegStackChoice extends Struct {
	public int f_pc;
	public int f_i;
	public Struct f_capture;

	public Struct_PegStackChoice() {}
	public Struct_PegStackChoice(int a_pc, int a_i, Struct a_capture) {
		f_pc = a_pc;
		f_i = a_i;
		f_capture = a_capture;
	}

	public int getTypeId() { return 86; }
	public String getTypeName() { return "PegStackChoice"; }

	private static final String[] field_names = new String[] {
		"pc", "i", "capture"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pc, f_i, f_capture
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in PegStackChoice");
		f_pc = (Integer)values[0];
		f_i = (Integer)values[1];
		f_capture = (Struct)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 86) return 86-tmp;
		Struct_PegStackChoice other = (Struct_PegStackChoice)other_gen;
		if (f_pc != other.f_pc)
			return (f_pc > other.f_pc) ? 1 : -1;
		if (f_i != other.f_i)
			return (f_i > other.f_i) ? 1 : -1;
		tmp = f_capture.compareTo(other.f_capture);
		return tmp;
	}
}
