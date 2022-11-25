// HASH COLLISIONS: YES
// timestamp: 1.669356105095E12

package main;

import com.area9innovation.flow.*;

public class Struct_ParsingAcc extends Struct {
	public Object f_data;
	public int f_start;
	public int f_finish;

	public Struct_ParsingAcc() {}
	public Struct_ParsingAcc(Object a_data, int a_start, int a_finish) {
		f_data = a_data;
		f_start = a_start;
		f_finish = a_finish;
	}

	public int getTypeId() { return 56; }
	public String getTypeName() { return "ParsingAcc"; }

	private static final String[] field_names = new String[] {
		"data", "start", "finish"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN, RuntimeType.INT, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_data, f_start, f_finish
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in ParsingAcc");
		f_data = (Object)values[0];
		f_start = (Integer)values[1];
		f_finish = (Integer)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 56) return 56-tmp;
		Struct_ParsingAcc other = (Struct_ParsingAcc)other_gen;
		tmp = FlowRuntime.compareByValue(f_data, other.f_data);
		if (tmp != 0) return tmp;
		if (f_start != other.f_start)
			return (f_start > other.f_start) ? 1 : -1;
		if (f_finish != other.f_finish)
			return (f_finish > other.f_finish) ? 1 : -1;
		return 0;
	}
}
