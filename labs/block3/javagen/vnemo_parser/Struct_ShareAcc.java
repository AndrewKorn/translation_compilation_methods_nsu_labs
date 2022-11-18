// HASH COLLISIONS: YES
// timestamp: 1.668103360797E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_ShareAcc extends Struct {
	public Object[] f_prefix;
	public Object[] f_suffix1;
	public Object[] f_suffix2;

	public Struct_ShareAcc() {}
	public Struct_ShareAcc(Object[] a_prefix, Object[] a_suffix1, Object[] a_suffix2) {
		f_prefix = a_prefix;
		f_suffix1 = a_suffix1;
		f_suffix2 = a_suffix2;
	}

	public int getTypeId() { return 103; }
	public String getTypeName() { return "ShareAcc"; }

	private static final String[] field_names = new String[] {
		"prefix", "suffix1", "suffix2"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY, RuntimeType.ARRAY, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_prefix, f_suffix1, f_suffix2
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in ShareAcc");
		f_prefix = (Object[])values[0];
		f_suffix1 = (Object[])values[1];
		f_suffix2 = (Object[])values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 103) return 103-tmp;
		Struct_ShareAcc other = (Struct_ShareAcc)other_gen;
		tmp = FlowRuntime.compareByValue(f_prefix, other.f_prefix);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_suffix1, other.f_suffix1);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_suffix2, other.f_suffix2);
		return tmp;
	}
}
