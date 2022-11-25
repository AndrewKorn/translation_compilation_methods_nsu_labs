// HASH COLLISIONS: YES
// timestamp: 1.669356105084E12

package main;

import com.area9innovation.flow.*;

public class Struct_Configuration extends Struct {
	public int f_label;
	public Struct_MemoryState f_state;

	public Struct_Configuration() {}
	public Struct_Configuration(int a_label, Struct_MemoryState a_state) {
		f_label = a_label;
		f_state = a_state;
	}

	public int getTypeId() { return 18; }
	public String getTypeName() { return "Configuration"; }

	private static final String[] field_names = new String[] {
		"label", "state"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_label, f_state
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Configuration");
		f_label = (Integer)values[0];
		f_state = (Struct_MemoryState)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 18) return 18-tmp;
		Struct_Configuration other = (Struct_Configuration)other_gen;
		if (f_label != other.f_label)
			return (f_label > other.f_label) ? 1 : -1;
		tmp = f_state.compareTo(other.f_state);
		return tmp;
	}
}
