// HASH COLLISIONS: YES
// timestamp: 1.668103360791E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegBindString extends Struct {
	public String f_n;

	public Struct_PegBindString() {}
	public Struct_PegBindString(String a_n) {
		f_n = a_n;
	}

	public int getTypeId() { return 54; }
	public String getTypeName() { return "PegBindString"; }

	private static final String[] field_names = new String[] {
		"n"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_n
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegBindString");
		f_n = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 54) return 54-tmp;
		Struct_PegBindString other = (Struct_PegBindString)other_gen;
		tmp = f_n.compareTo(other.f_n);
		return tmp;
	}
}
