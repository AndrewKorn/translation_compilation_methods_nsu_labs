// HASH COLLISIONS: YES
// timestamp: 1.668103166743E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Upd extends Struct {
	public Struct f_arr;
	public Struct f_i;
	public Struct f_v;

	public Struct_Upd() {}
	public Struct_Upd(Struct a_arr, Struct a_i, Struct a_v) {
		f_arr = a_arr;
		f_i = a_i;
		f_v = a_v;
	}

	public int getTypeId() { return 115; }
	public String getTypeName() { return "Upd"; }

	private static final String[] field_names = new String[] {
		"arr", "i", "v"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_arr, f_i, f_v
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in Upd");
		f_arr = (Struct)values[0];
		f_i = (Struct)values[1];
		f_v = (Struct)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 115) return 115-tmp;
		Struct_Upd other = (Struct_Upd)other_gen;
		tmp = f_arr.compareTo(other.f_arr);
		if (tmp != 0) return tmp;
		tmp = f_i.compareTo(other.f_i);
		if (tmp != 0) return tmp;
		tmp = f_v.compareTo(other.f_v);
		return tmp;
	}
}
