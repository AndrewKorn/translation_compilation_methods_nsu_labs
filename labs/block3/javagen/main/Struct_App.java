// HASH COLLISIONS: YES
// timestamp: 1.669356105081E12

package main;

import com.area9innovation.flow.*;

public class Struct_App extends Struct {
	public Struct f_arr;
	public Struct f_i;

	public Struct_App() {}
	public Struct_App(Struct a_arr, Struct a_i) {
		f_arr = a_arr;
		f_i = a_i;
	}

	public int getTypeId() { return 8; }
	public String getTypeName() { return "App"; }

	private static final String[] field_names = new String[] {
		"arr", "i"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_arr, f_i
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in App");
		f_arr = (Struct)values[0];
		f_i = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 8) return 8-tmp;
		Struct_App other = (Struct_App)other_gen;
		tmp = f_arr.compareTo(other.f_arr);
		if (tmp != 0) return tmp;
		tmp = f_i.compareTo(other.f_i);
		return tmp;
	}
}
