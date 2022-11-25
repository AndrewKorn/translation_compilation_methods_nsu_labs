// HASH COLLISIONS: YES
// timestamp: 1.669202273427E12

package execute;

import com.area9innovation.flow.*;

public class Struct_PegStringChoice extends Struct {
	public String f_x;
	public int f_commit;

	public Struct_PegStringChoice() {}
	public Struct_PegStringChoice(String a_x, int a_commit) {
		f_x = a_x;
		f_commit = a_commit;
	}

	public int getTypeId() { return 88; }
	public String getTypeName() { return "PegStringChoice"; }

	private static final String[] field_names = new String[] {
		"x", "commit"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_x, f_commit
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegStringChoice");
		f_x = (String)values[0];
		f_commit = (Integer)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 88) return 88-tmp;
		Struct_PegStringChoice other = (Struct_PegStringChoice)other_gen;
		tmp = f_x.compareTo(other.f_x);
		if (tmp != 0) return tmp;
		if (f_commit != other.f_commit)
			return (f_commit > other.f_commit) ? 1 : -1;
		return 0;
	}
}
