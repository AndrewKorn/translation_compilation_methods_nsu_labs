// HASH COLLISIONS: YES
// timestamp: 1.668103255911E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_Integer extends Struct {
	public String f_t;

	public Struct_Integer() {}
	public Struct_Integer(String a_t) {
		f_t = a_t;
	}

	public int getTypeId() { return 29; }
	public String getTypeName() { return "Integer"; }

	private static final String[] field_names = new String[] {
		"t"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_t
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Integer");
		f_t = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 29) return 29-tmp;
		Struct_Integer other = (Struct_Integer)other_gen;
		tmp = f_t.compareTo(other.f_t);
		return tmp;
	}
}
