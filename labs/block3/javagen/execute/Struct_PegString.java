// HASH COLLISIONS: YES
// timestamp: 1.669202273427E12

package execute;

import com.area9innovation.flow.*;

public class Struct_PegString extends Struct {
	public String f_x;

	public Struct_PegString() {}
	public Struct_PegString(String a_x) {
		f_x = a_x;
	}

	public int getTypeId() { return 87; }
	public String getTypeName() { return "PegString"; }

	private static final String[] field_names = new String[] {
		"x"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_x
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegString");
		f_x = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 87) return 87-tmp;
		Struct_PegString other = (Struct_PegString)other_gen;
		tmp = f_x.compareTo(other.f_x);
		return tmp;
	}
}
