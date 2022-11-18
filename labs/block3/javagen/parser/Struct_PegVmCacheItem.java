// HASH COLLISIONS: YES
// timestamp: 1.667742586222E12

package parser;

import com.area9innovation.flow.*;

public class Struct_PegVmCacheItem extends Struct {
	public int f_pos;
	public Struct_RuleResult f_capture;

	public Struct_PegVmCacheItem() {}
	public Struct_PegVmCacheItem(int a_pos, Struct_RuleResult a_capture) {
		f_pos = a_pos;
		f_capture = a_capture;
	}

	public int getTypeId() { return 97; }
	public String getTypeName() { return "PegVmCacheItem"; }

	private static final String[] field_names = new String[] {
		"pos", "capture"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pos, f_capture
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegVmCacheItem");
		f_pos = (Integer)values[0];
		f_capture = (Struct_RuleResult)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 97) return 97-tmp;
		Struct_PegVmCacheItem other = (Struct_PegVmCacheItem)other_gen;
		if (f_pos != other.f_pos)
			return (f_pos > other.f_pos) ? 1 : -1;
		tmp = f_capture.compareTo(other.f_capture);
		return tmp;
	}
}
