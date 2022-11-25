// HASH COLLISIONS: YES
// timestamp: 1.669202273428E12

package execute;

import com.area9innovation.flow.*;

public class Struct_Production extends Struct {
	public String f_name;
	public boolean f_caching;
	public Struct f_type;
	public Object[] f_choices;

	public Struct_Production() {}
	public Struct_Production(String a_name, boolean a_caching, Struct a_type, Object[] a_choices) {
		f_name = a_name;
		f_caching = a_caching;
		f_type = a_type;
		f_choices = a_choices;
	}

	public int getTypeId() { return 100; }
	public String getTypeName() { return "Production"; }

	private static final String[] field_names = new String[] {
		"name", "caching", "type", "choices"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.BOOL, RuntimeType.STRUCT, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_name, f_caching, f_type, f_choices
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in Production");
		f_name = (String)values[0];
		f_caching = (Boolean)values[1];
		f_type = (Struct)values[2];
		f_choices = (Object[])values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 100) return 100-tmp;
		Struct_Production other = (Struct_Production)other_gen;
		tmp = f_name.compareTo(other.f_name);
		if (tmp != 0) return tmp;
		if (f_caching != other.f_caching)
			return f_caching ? 1 : -1;
		tmp = f_type.compareTo(other.f_type);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_choices, other.f_choices);
		return tmp;
	}
}
