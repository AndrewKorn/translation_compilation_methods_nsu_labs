// HASH COLLISIONS: YES
// timestamp: 1.668753222821E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegCaptureStringStart extends Struct {
	public int f_start;

	public Struct_PegCaptureStringStart() {}
	public Struct_PegCaptureStringStart(int a_start) {
		f_start = a_start;
	}

	public int getTypeId() { return 65; }
	public String getTypeName() { return "PegCaptureStringStart"; }

	private static final String[] field_names = new String[] {
		"start"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_start
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegCaptureStringStart");
		f_start = (Integer)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 65) return 65-tmp;
		Struct_PegCaptureStringStart other = (Struct_PegCaptureStringStart)other_gen;
		if (f_start != other.f_start)
			return (f_start > other.f_start) ? 1 : -1;
		return 0;
	}
}
