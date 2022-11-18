// HASH COLLISIONS: YES
// timestamp: 1.668103166719E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_BindResult extends Struct {
	public String f_name;
	public Struct f_v;

	public Struct_BindResult() {}
	public Struct_BindResult(String a_name, Struct a_v) {
		f_name = a_name;
		f_v = a_v;
	}

	public int getTypeId() { return 13; }
	public String getTypeName() { return "BindResult"; }

	private static final String[] field_names = new String[] {
		"name", "v"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_name, f_v
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in BindResult");
		f_name = (String)values[0];
		f_v = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 13) return 13-tmp;
		Struct_BindResult other = (Struct_BindResult)other_gen;
		tmp = f_name.compareTo(other.f_name);
		if (tmp != 0) return tmp;
		tmp = f_v.compareTo(other.f_v);
		return tmp;
	}
}
