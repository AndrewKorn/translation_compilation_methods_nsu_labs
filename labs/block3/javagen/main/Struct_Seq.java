// HASH COLLISIONS: YES
// timestamp: 1.669356105105E12

package main;

import com.area9innovation.flow.*;

public class Struct_Seq extends Struct {
	public Object[] f_seq;

	public Struct_Seq() {}
	public Struct_Seq(Object[] a_seq) {
		f_seq = a_seq;
	}

	public int getTypeId() { return 110; }
	public String getTypeName() { return "Seq"; }

	private static final String[] field_names = new String[] {
		"seq"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_seq
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Seq");
		f_seq = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 110) return 110-tmp;
		Struct_Seq other = (Struct_Seq)other_gen;
		tmp = FlowRuntime.compareByValue(f_seq, other.f_seq);
		return tmp;
	}
}
