// HASH COLLISIONS: YES
// timestamp: 1.667741189769E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Sub extends Struct {
	public Struct f_e1;
	public Struct f_e2;

	public Struct_Sub() {}
	public Struct_Sub(Struct a_e1, Struct a_e2) {
		f_e1 = a_e1;
		f_e2 = a_e2;
	}

	public int getTypeId() { return 115; }
	public String getTypeName() { return "Sub"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in Sub");
		f_e1 = (Struct)values[0];
		f_e2 = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 115) return 115-tmp;
		Struct_Sub other = (Struct_Sub)other_gen;
		tmp = f_e1.compareTo(other.f_e1);
		if (tmp != 0) return tmp;
		tmp = f_e2.compareTo(other.f_e2);
		return tmp;
	}
}