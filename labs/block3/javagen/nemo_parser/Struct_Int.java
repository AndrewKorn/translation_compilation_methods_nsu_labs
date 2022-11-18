// HASH COLLISIONS: YES
// timestamp: 1.667741189762E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_Int extends Struct {
	public int f_i;

	public Struct_Int() {}
	public Struct_Int(int a_i) {
		f_i = a_i;
	}

	public int getTypeId() { return 27; }
	public String getTypeName() { return "Int"; }

	private static final String[] field_names = new String[] {
		"i"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_i
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Int");
		f_i = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 27) return 27-tmp;
		Struct_Int other = (Struct_Int)other_gen;
		if (f_i != other.f_i)
			return (f_i > other.f_i) ? 1 : -1;
		return 0;
	}
}
