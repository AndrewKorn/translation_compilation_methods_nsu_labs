// HASH COLLISIONS: YES
// timestamp: 1.667742586216E12

package parser;

import com.area9innovation.flow.*;

public class Struct_ParseResult extends Struct {
	public int f_pos;
	public Struct f_result;

	public Struct_ParseResult() {}
	public Struct_ParseResult(int a_pos, Struct a_result) {
		f_pos = a_pos;
		f_result = a_result;
	}

	public int getTypeId() { return 54; }
	public String getTypeName() { return "ParseResult"; }

	private static final String[] field_names = new String[] {
		"pos", "result"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pos, f_result
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in ParseResult");
		f_pos = (Integer)values[0];
		f_result = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 54) return 54-tmp;
		Struct_ParseResult other = (Struct_ParseResult)other_gen;
		if (f_pos != other.f_pos)
			return (f_pos > other.f_pos) ? 1 : -1;
		tmp = f_result.compareTo(other.f_result);
		return tmp;
	}
}
