// HASH COLLISIONS: YES
// timestamp: 1.669356105103E12

package main;

import com.area9innovation.flow.*;

public class Struct_PrintStatement extends Struct implements Field_id<Integer> {
	public int f_id;
	public Struct f_e;
	public Object[] f_goto;

	public Struct_PrintStatement() {}
	public Struct_PrintStatement(int a_id, Struct a_e, Object[] a_goto) {
		f_id = a_id;
		f_e = a_e;
		f_goto = a_goto;
	}
	public Integer get_id() { return f_id; }
	public void set_id(Integer value) { f_id = value; }

	public int getTypeId() { return 104; }
	public String getTypeName() { return "PrintStatement"; }

	private static final String[] field_names = new String[] {
		"id", "e", "goto"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRUCT, RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_id, f_e, f_goto
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in PrintStatement");
		f_id = (Integer)values[0];
		f_e = (Struct)values[1];
		f_goto = (Object[])values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 104) return 104-tmp;
		Struct_PrintStatement other = (Struct_PrintStatement)other_gen;
		if (f_id != other.f_id)
			return (f_id > other.f_id) ? 1 : -1;
		tmp = f_e.compareTo(other.f_e);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_goto, other.f_goto);
		return tmp;
	}
}