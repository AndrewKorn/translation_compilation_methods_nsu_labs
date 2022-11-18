// HASH COLLISIONS: YES
// timestamp: 1.668103360786E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_JsonFieldTreatAsPath extends Struct {
	public String f_pathDelimiter;

	public Struct_JsonFieldTreatAsPath() {}
	public Struct_JsonFieldTreatAsPath(String a_pathDelimiter) {
		f_pathDelimiter = a_pathDelimiter;
	}

	public int getTypeId() { return 32; }
	public String getTypeName() { return "JsonFieldTreatAsPath"; }

	private static final String[] field_names = new String[] {
		"pathDelimiter"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pathDelimiter
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in JsonFieldTreatAsPath");
		f_pathDelimiter = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 32) return 32-tmp;
		Struct_JsonFieldTreatAsPath other = (Struct_JsonFieldTreatAsPath)other_gen;
		tmp = f_pathDelimiter.compareTo(other.f_pathDelimiter);
		return tmp;
	}
}
