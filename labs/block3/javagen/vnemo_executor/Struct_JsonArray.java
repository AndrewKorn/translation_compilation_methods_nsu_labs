// HASH COLLISIONS: YES
// timestamp: 1.668108779024E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_JsonArray extends Struct {
	public Object[] f_value;

	public Struct_JsonArray() {}
	public Struct_JsonArray(Object[] a_value) {
		f_value = a_value;
	}

	public int getTypeId() { return 31; }
	public String getTypeName() { return "JsonArray"; }

	private static final String[] field_names = new String[] {
		"value"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_value
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in JsonArray");
		f_value = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 31) return 31-tmp;
		Struct_JsonArray other = (Struct_JsonArray)other_gen;
		tmp = FlowRuntime.compareByValue(f_value, other.f_value);
		return tmp;
	}
}
