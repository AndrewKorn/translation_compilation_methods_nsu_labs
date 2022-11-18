// HASH COLLISIONS: YES
// timestamp: 1.668103360799E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_aType extends Struct {
	public Struct f_t;

	public Struct_aType() {}
	public Struct_aType(Struct a_t) {
		f_t = a_t;
	}

	public int getTypeId() { return 115; }
	public String getTypeName() { return "aType"; }

	private static final String[] field_names = new String[] {
		"t"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
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
			throw new IndexOutOfBoundsException("Invalid field count in aType");
		f_t = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 115) return 115-tmp;
		Struct_aType other = (Struct_aType)other_gen;
		tmp = f_t.compareTo(other.f_t);
		return tmp;
	}
}
