// HASH COLLISIONS: YES
// timestamp: 1.669202273419E12

package execute;

import com.area9innovation.flow.*;

public class Struct_ActionCallDebug extends Struct {
	public String f_id;
	public Object[] f_args;

	public Struct_ActionCallDebug() {}
	public Struct_ActionCallDebug(String a_id, Object[] a_args) {
		f_id = a_id;
		f_args = a_args;
	}

	public int getTypeId() { return 3; }
	public String getTypeName() { return "ActionCallDebug"; }

	private static final String[] field_names = new String[] {
		"id", "args"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id, f_args
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in ActionCallDebug");
		f_id = (String)values[0];
		f_args = (Object[])values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 3) return 3-tmp;
		Struct_ActionCallDebug other = (Struct_ActionCallDebug)other_gen;
		tmp = f_id.compareTo(other.f_id);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_args, other.f_args);
		return tmp;
	}
}
