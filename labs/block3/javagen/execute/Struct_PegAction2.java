// HASH COLLISIONS: YES
// timestamp: 1.669202273425E12

package execute;

import com.area9innovation.flow.*;

public class Struct_PegAction2 extends Struct {
	public Struct f_e;

	public Struct_PegAction2() {}
	public Struct_PegAction2(Struct a_e) {
		f_e = a_e;
	}

	public int getTypeId() { return 54; }
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
		if (tmp != 54) return 54-tmp;
		Struct_PegAction2 other = (Struct_PegAction2)other_gen;
		tmp = f_e.compareTo(other.f_e);
		return tmp;
	}
}
