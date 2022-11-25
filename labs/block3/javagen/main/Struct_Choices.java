// HASH COLLISIONS: YES
// timestamp: 1.669356105084E12

package main;

import com.area9innovation.flow.*;

public class Struct_Choices extends Struct {
	public Object[] f_p;

	public Struct_Choices() {}
	public Struct_Choices(Object[] a_p) {
		f_p = a_p;
	}

	public int getTypeId() { return 17; }
	public String getTypeName() { return "Choices"; }

	private static final String[] field_names = new String[] {
		"p"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_p
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Choices");
		f_p = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 17) return 17-tmp;
		Struct_Choices other = (Struct_Choices)other_gen;
		tmp = FlowRuntime.compareByValue(f_p, other.f_p);
		return tmp;
	}
}
