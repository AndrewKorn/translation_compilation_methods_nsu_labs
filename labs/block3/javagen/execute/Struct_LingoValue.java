// HASH COLLISIONS: YES
// timestamp: 1.669202273424E12

package execute;

import com.area9innovation.flow.*;

public class Struct_LingoValue extends Struct {
	public Object f_value;

	public Struct_LingoValue() {}
	public Struct_LingoValue(Object a_value) {
		f_value = a_value;
	}

	public int getTypeId() { return 43; }
	public String getTypeName() { return "LingoValue"; }

	private static final String[] field_names = new String[] {
		"value"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN
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
			throw new IndexOutOfBoundsException("Invalid field count in LingoValue");
		f_value = (Object)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 43) return 43-tmp;
		Struct_LingoValue other = (Struct_LingoValue)other_gen;
		tmp = FlowRuntime.compareByValue(f_value, other.f_value);
		return tmp;
	}
}
