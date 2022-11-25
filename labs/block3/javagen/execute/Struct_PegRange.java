// HASH COLLISIONS: YES
// timestamp: 1.669202273426E12

package execute;

import com.area9innovation.flow.*;

public class Struct_PegRange extends Struct {
	public String f_l;
	public String f_u;

	public Struct_PegRange() {}
	public Struct_PegRange(String a_l, String a_u) {
		f_l = a_l;
		f_u = a_u;
	}

	public int getTypeId() { return 78; }
	public String getTypeName() { return "PegRange"; }

	private static final String[] field_names = new String[] {
		"l", "u"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_l, f_u
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegRange");
		f_l = (String)values[0];
		f_u = (String)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 78) return 78-tmp;
		Struct_PegRange other = (Struct_PegRange)other_gen;
		tmp = f_l.compareTo(other.f_l);
		if (tmp != 0) return tmp;
		tmp = f_u.compareTo(other.f_u);
		return tmp;
	}
}
