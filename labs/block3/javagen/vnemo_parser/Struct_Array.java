// HASH COLLISIONS: YES
// timestamp: 1.668103255907E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_Array extends Struct {
	public Struct f_a;

	public Struct_Array() {}
	public Struct_Array(Struct a_a) {
		f_a = a_a;
	}

	public int getTypeId() { return 9; }
	public String getTypeName() { return "Array"; }

	private static final String[] field_names = new String[] {
		"a"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
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
			throw new IndexOutOfBoundsException("Invalid field count in Array");
		f_a = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 9) return 9-tmp;
		Struct_Array other = (Struct_Array)other_gen;
		tmp = f_a.compareTo(other.f_a);
		return tmp;
	}
}
