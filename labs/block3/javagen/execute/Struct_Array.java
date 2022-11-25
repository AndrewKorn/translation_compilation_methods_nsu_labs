// HASH COLLISIONS: YES
// timestamp: 1.66920227342E12

package execute;

import com.area9innovation.flow.*;

public class Struct_Array extends Struct {
	public Object[] f_arr;

	public Struct_Array() {}
	public Struct_Array(Object[] a_arr) {
		f_arr = a_arr;
	}

	public int getTypeId() { return 9; }
	public String getTypeName() { return "Array"; }

	private static final String[] field_names = new String[] {
		"arr"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_arr
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Array");
		f_arr = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 9) return 9-tmp;
		Struct_Array other = (Struct_Array)other_gen;
		tmp = FlowRuntime.compareByValue(f_arr, other.f_arr);
		return tmp;
	}
}
