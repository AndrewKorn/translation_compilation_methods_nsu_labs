// HASH COLLISIONS: YES
// timestamp: 1.668103166726E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_NemoProg extends Struct {
	public Object[] f_decl;
	public Struct f_body;

	public Struct_NemoProg() {}
	public Struct_NemoProg(Object[] a_decl, Struct a_body) {
		f_decl = a_decl;
		f_body = a_body;
	}

	public int getTypeId() { return 44; }
	public String getTypeName() { return "NemoProg"; }

	private static final String[] field_names = new String[] {
		"decl", "body"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_decl, f_body
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in NemoProg");
		f_decl = (Object[])values[0];
		f_body = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 44) return 44-tmp;
		Struct_NemoProg other = (Struct_NemoProg)other_gen;
		tmp = FlowRuntime.compareByValue(f_decl, other.f_decl);
		if (tmp != 0) return tmp;
		tmp = f_body.compareTo(other.f_body);
		return tmp;
	}
}
