// HASH COLLISIONS: YES
// timestamp: 1.668103025181E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_BaseType extends Struct {
	public String f_t;

	public Struct_BaseType() {}
	public Struct_BaseType(String a_t) {
		f_t = a_t;
	}

	public int getTypeId() { return 11; }
	public String getTypeName() { return "BaseType"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in BaseType");
		f_t = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 11) return 11-tmp;
		Struct_BaseType other = (Struct_BaseType)other_gen;
		tmp = f_t.compareTo(other.f_t);
		return tmp;
	}
}
