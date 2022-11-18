// HASH COLLISIONS: YES
// timestamp: 1.668103166733E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegChoice extends Struct {
	public int f_l;

	public Struct_PegChoice() {}
	public Struct_PegChoice(int a_l) {
		f_l = a_l;
	}

	public int getTypeId() { return 65; }
	public String getTypeName() { return "PegChoice"; }

	private static final String[] field_names = new String[] {
		"l"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_l
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegChoice");
		f_l = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 65) return 65-tmp;
		Struct_PegChoice other = (Struct_PegChoice)other_gen;
		if (f_l != other.f_l)
			return (f_l > other.f_l) ? 1 : -1;
		return 0;
	}
}
