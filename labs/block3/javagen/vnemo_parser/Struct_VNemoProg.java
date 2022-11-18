// HASH COLLISIONS: YES
// timestamp: 1.668102014818E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_VNemoProg extends Struct {
	public Object[] f_d;
	public Object[] f_s;

	public Struct_VNemoProg() {}
	public Struct_VNemoProg(Object[] a_d, Object[] a_s) {
		f_d = a_d;
		f_s = a_s;
	}

	public int getTypeId() { return 113; }
	public String getTypeName() { return "VNemoProg"; }

	private static final String[] field_names = new String[] {
		"d", "s"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_d, f_s
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in VNemoProg");
		f_d = (Object[])values[0];
		f_s = (Object[])values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 113) return 113-tmp;
		Struct_VNemoProg other = (Struct_VNemoProg)other_gen;
		tmp = FlowRuntime.compareByValue(f_d, other.f_d);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_s, other.f_s);
		return tmp;
	}
}
