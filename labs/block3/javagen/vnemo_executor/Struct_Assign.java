// HASH COLLISIONS: YES
// timestamp: 1.668108779012E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_Assign extends Struct implements Field_id<Integer> {
	public int f_id;
	public String f_var;
	public Struct f_e;
	public Object[] f_goto;

	public Struct_Assign() {}
	public Struct_Assign(int a_id, String a_var, Struct a_e, Object[] a_goto) {
		f_id = a_id;
		f_var = a_var;
		f_e = a_e;
		f_goto = a_goto;
	}
	public Integer get_id() { return f_id; }
	public void set_id(Integer value) { f_id = value; }

	public int getTypeId() { return 10; }
	public String getTypeName() { return "Assign"; }

	private static final String[] field_names = new String[] {
		"id", "var", "e", "goto"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRING, RuntimeType.STRUCT, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id, f_var, f_e, f_goto
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in Assign");
		f_id = (Integer)values[0];
		f_var = (String)values[1];
		f_e = (Struct)values[2];
		f_goto = (Object[])values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 10) return 10-tmp;
		Struct_Assign other = (Struct_Assign)other_gen;
		if (f_id != other.f_id)
			return (f_id > other.f_id) ? 1 : -1;
		tmp = f_var.compareTo(other.f_var);
		if (tmp != 0) return tmp;
		tmp = f_e.compareTo(other.f_e);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_goto, other.f_goto);
		return tmp;
	}
}
