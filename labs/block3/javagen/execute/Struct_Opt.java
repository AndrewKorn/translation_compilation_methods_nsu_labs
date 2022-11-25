// HASH COLLISIONS: YES
// timestamp: 1.669202273424E12

package execute;

import com.area9innovation.flow.*;

public class Struct_Opt extends Struct {
	public Struct f_p;

	public Struct_Opt() {}
	public Struct_Opt(Struct a_p) {
		f_p = a_p;
	}

	public int getTypeId() { return 48; }
	public String getTypeName() { return "Opt"; }

	private static final String[] field_names = new String[] {
		"p"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
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
			throw new IndexOutOfBoundsException("Invalid field count in Opt");
		f_p = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 48) return 48-tmp;
		Struct_Opt other = (Struct_Opt)other_gen;
		tmp = f_p.compareTo(other.f_p);
		return tmp;
	}
}
