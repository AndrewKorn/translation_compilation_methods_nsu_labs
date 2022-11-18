// HASH COLLISIONS: YES
// timestamp: 1.667741189761E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Arr extends Struct {
	public Object[] f_a;

	public Struct_Arr() {}
	public Struct_Arr(Object[] a_a) {
		f_a = a_a;
	}

	public int getTypeId() { return 9; }
	public String getTypeName() { return "Arr"; }

	private static final String[] field_names = new String[] {
		"a"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_a
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Arr");
		f_a = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 9) return 9-tmp;
		Struct_Arr other = (Struct_Arr)other_gen;
		tmp = FlowRuntime.compareByValue(f_a, other.f_a);
		return tmp;
	}
}
