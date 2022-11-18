// HASH COLLISIONS: YES
// timestamp: 1.667742586223E12

package parser;

import com.area9innovation.flow.*;

public class Struct_Quadruple extends Struct implements Field_first<Object>, Field_second<Object> {
	public Object f_first;
	public Object f_second;
	public Object f_third;
	public Object f_fourth;

	public Struct_Quadruple() {}
	public Struct_Quadruple(Object a_first, Object a_second, Object a_third, Object a_fourth) {
		f_first = a_first;
		f_second = a_second;
		f_third = a_third;
		f_fourth = a_fourth;
	}
	public Object get_first() { return f_first; }
	public void set_first(Object value) { f_first = value; }
	public Object get_second() { return f_second; }
	public void set_second(Object value) { f_second = value; }

	public int getTypeId() { return 105; }
	public String getTypeName() { return "Quadruple"; }

	private static final String[] field_names = new String[] {
		"first", "second", "third", "fourth"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN, RuntimeType.UNKNOWN, RuntimeType.UNKNOWN, RuntimeType.UNKNOWN
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_first, f_second, f_third, f_fourth
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in Quadruple");
		f_first = (Object)values[0];
		f_second = (Object)values[1];
		f_third = (Object)values[2];
		f_fourth = (Object)values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 105) return 105-tmp;
		Struct_Quadruple other = (Struct_Quadruple)other_gen;
		tmp = FlowRuntime.compareByValue(f_first, other.f_first);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_second, other.f_second);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_third, other.f_third);
		if (tmp != 0) return tmp;
		tmp = FlowRuntime.compareByValue(f_fourth, other.f_fourth);
		return tmp;
	}
}
