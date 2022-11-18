// HASH COLLISIONS: YES
// timestamp: 1.668103360791E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegAction2 extends Struct {
	public Struct f_e;

	public Struct_PegAction2() {}
	public Struct_PegAction2(Struct a_e) {
		f_e = a_e;
	}

	public int getTypeId() { return 50; }
	public String getTypeName() { return "PegAction2"; }

	private static final String[] field_names = new String[] {
		"e"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_e
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegAction2");
		f_e = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 50) return 50-tmp;
		Struct_PegAction2 other = (Struct_PegAction2)other_gen;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
