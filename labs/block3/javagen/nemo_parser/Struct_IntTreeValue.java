// HASH COLLISIONS: YES
// timestamp: 1.668103166722E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_IntTreeValue extends Struct {
	public int f_key;
	public Object f_value;

	public Struct_IntTreeValue() {}
	public Struct_IntTreeValue(int a_key, Object a_value) {
		f_key = a_key;
		f_value = a_value;
	}

	public int getTypeId() { return 28; }
	public String getTypeName() { return "IntTreeValue"; }

	private static final String[] field_names = new String[] {
		"key", "value"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.UNKNOWN
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_key, f_value
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in IntTreeValue");
		f_key = (Integer)values[0];
		f_value = (Object)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 28) return 28-tmp;
		Struct_IntTreeValue other = (Struct_IntTreeValue)other_gen;
		if (f_key != other.f_key)
			return (f_key > other.f_key) ? 1 : -1;
		tmp = FlowRuntime.compareByValue(f_value, other.f_value);
		return tmp;
	}
}
