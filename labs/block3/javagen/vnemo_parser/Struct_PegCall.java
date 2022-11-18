// HASH COLLISIONS: YES
// timestamp: 1.668103360792E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegCall extends Struct {
	public int f_l;

	public Struct_PegCall() {}
	public Struct_PegCall(int a_l) {
		f_l = a_l;
	}

	public int getTypeId() { return 58; }
	public String getTypeName() { return "PegCall"; }

	private static final String[] field_names = new String[] {
		"l"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_l
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegCall");
		f_l = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 58) return 58-tmp;
		Struct_PegCall other = (Struct_PegCall)other_gen;
		if (f_l != other.f_l)
			return (f_l > other.f_l) ? 1 : -1;
		return 0;
	}
}
