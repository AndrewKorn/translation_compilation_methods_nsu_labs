// HASH COLLISIONS: YES
// timestamp: 1.668103166719E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_CharRange extends Struct implements Field_first<String> {
	public String f_first;
	public String f_last;

	public Struct_CharRange() {}
	public Struct_CharRange(String a_first, String a_last) {
		f_first = a_first;
		f_last = a_last;
	}
	public String get_first() { return f_first; }
	public void set_first(String value) { f_first = value; }

	public int getTypeId() { return 14; }
	public String getTypeName() { return "CharRange"; }

	private static final String[] field_names = new String[] {
		"first", "last"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_first, f_last
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in CharRange");
		f_first = (String)values[0];
		f_last = (String)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 14) return 14-tmp;
		Struct_CharRange other = (Struct_CharRange)other_gen;
		tmp = f_first.compareTo(other.f_first);
		if (tmp != 0) return tmp;
		tmp = f_last.compareTo(other.f_last);
		return tmp;
	}
}
