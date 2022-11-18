// HASH COLLISIONS: YES
// timestamp: 1.668108779061E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_Star extends Struct {
	public Struct f_p;

	public Struct_Star() {}
	public Struct_Star(Struct a_p) {
		f_p = a_p;
	}

	public int getTypeId() { return 109; }
	public String getTypeName() { return "Star"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in Star");
		f_p = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 109) return 109-tmp;
		Struct_Star other = (Struct_Star)other_gen;
		tmp = f_p.compareTo(other.f_p);
		return tmp;
	}
}
