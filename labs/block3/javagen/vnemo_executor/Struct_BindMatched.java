// HASH COLLISIONS: YES
// timestamp: 1.668108779013E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_BindMatched extends Struct {
	public String f_name;
	public Struct f_v;

	public Struct_BindMatched() {}
	public Struct_BindMatched(String a_name, Struct a_v) {
		f_name = a_name;
		f_v = a_v;
	}

	public int getTypeId() { return 12; }
	public String getTypeName() { return "BindMatched"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in BindMatched");
		f_name = (String)values[0];
		f_v = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 12) return 12-tmp;
		Struct_BindMatched other = (Struct_BindMatched)other_gen;
		tmp = f_name.compareTo(other.f_name);
		if (tmp != 0) return tmp;
		tmp = f_v.compareTo(other.f_v);
		return tmp;
	}
}
