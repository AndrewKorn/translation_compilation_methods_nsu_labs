// HASH COLLISIONS: YES
// timestamp: 1.669356105105E12

package main;

import com.area9innovation.flow.*;

public class Struct_Sequence extends Struct {
	public Object[] f_b;

	public Struct_Sequence() {}
	public Struct_Sequence(Object[] a_b) {
		f_b = a_b;
	}

	public int getTypeId() { return 111; }
	public String getTypeName() { return "Sequence"; }

	private static final String[] field_names = new String[] {
		"b"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_b
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Sequence");
		f_b = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 111) return 111-tmp;
		Struct_Sequence other = (Struct_Sequence)other_gen;
		tmp = FlowRuntime.compareByValue(f_b, other.f_b);
		return tmp;
	}
}
