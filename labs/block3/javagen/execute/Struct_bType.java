// HASH COLLISIONS: YES
// timestamp: 1.669202273431E12

package execute;

import com.area9innovation.flow.*;

public class Struct_bType extends Struct {
	public String f_t;

	public Struct_bType() {}
	public Struct_bType(String a_t) {
		f_t = a_t;
	}

	public int getTypeId() { return 120; }
	public String getTypeName() { return "bType"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in bType");
		f_t = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 120) return 120-tmp;
		Struct_bType other = (Struct_bType)other_gen;
		tmp = f_t.compareTo(other.f_t);
		return tmp;
	}
}
