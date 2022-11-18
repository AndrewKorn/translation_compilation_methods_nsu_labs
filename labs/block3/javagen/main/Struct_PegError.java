// HASH COLLISIONS: YES
// timestamp: 1.668753222826E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegError extends Struct {
	public String f_error;

	public Struct_PegError() {}
	public Struct_PegError(String a_error) {
		f_error = a_error;
	}

	public int getTypeId() { return 74; }
	public String getTypeName() { return "PegError"; }

	private static final String[] field_names = new String[] {
		"error"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_error
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegError");
		f_error = (String)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 74) return 74-tmp;
		Struct_PegError other = (Struct_PegError)other_gen;
		tmp = f_error.compareTo(other.f_error);
		return tmp;
	}
}
