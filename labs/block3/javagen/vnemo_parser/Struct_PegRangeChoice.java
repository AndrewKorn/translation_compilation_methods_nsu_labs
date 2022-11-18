// HASH COLLISIONS: YES
// timestamp: 1.668103360793E12

package vnemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegRangeChoice extends Struct {
	public String f_l;
	public String f_u;
	public int f_commit;

	public Struct_PegRangeChoice() {}
	public Struct_PegRangeChoice(String a_l, String a_u, int a_commit) {
		f_l = a_l;
		f_u = a_u;
		f_commit = a_commit;
	}

	public int getTypeId() { return 75; }
	public String getTypeName() { return "PegRangeChoice"; }

	private static final String[] field_names = new String[] {
		"l", "u", "commit"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.STRING, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_l, f_u, f_commit
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in PegRangeChoice");
		f_l = (String)values[0];
		f_u = (String)values[1];
		f_commit = (Integer)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 75) return 75-tmp;
		Struct_PegRangeChoice other = (Struct_PegRangeChoice)other_gen;
		tmp = f_l.compareTo(other.f_l);
		if (tmp != 0) return tmp;
		tmp = f_u.compareTo(other.f_u);
		if (tmp != 0) return tmp;
		if (f_commit != other.f_commit)
			return (f_commit > other.f_commit) ? 1 : -1;
		return 0;
	}
}
