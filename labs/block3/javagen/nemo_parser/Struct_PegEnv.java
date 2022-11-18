// HASH COLLISIONS: YES
// timestamp: 1.668103166734E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegEnv extends Struct {
	public Struct f_bindings;
	public Struct f_functions;

	public Struct_PegEnv() {}
	public Struct_PegEnv(Struct a_bindings, Struct a_functions) {
		f_bindings = a_bindings;
		f_functions = a_functions;
	}

	public int getTypeId() { return 72; }
	public String getTypeName() { return "PegEnv"; }

	private static final String[] field_names = new String[] {
		"bindings", "functions"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_bindings, f_functions
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegEnv");
		f_bindings = (Struct)values[0];
		f_functions = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 72) return 72-tmp;
		Struct_PegEnv other = (Struct_PegEnv)other_gen;
		tmp = f_bindings.compareTo(other.f_bindings);
		if (tmp != 0) return tmp;
		tmp = f_functions.compareTo(other.f_functions);
		return tmp;
	}
}
