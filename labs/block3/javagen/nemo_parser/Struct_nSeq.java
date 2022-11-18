// HASH COLLISIONS: YES
// timestamp: 1.667736015797E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_nSeq extends Struct {
	public Object[] f_b;

	public Struct_nSeq() {}
	public Struct_nSeq(Object[] a_b) {
		f_b = a_b;
	}

	public int getTypeId() { return 126; }
	public String getTypeName() { return "nSeq"; }

	private static final String[] field_names = new String[] {
		"b"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_b
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in nSeq");
		f_b = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 126) return 126-tmp;
		Struct_nSeq other = (Struct_nSeq)other_gen;
		tmp = FlowRuntime.compareByValue(f_b, other.f_b);
		return tmp;
	}
}
