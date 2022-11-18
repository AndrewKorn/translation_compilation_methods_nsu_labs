// HASH COLLISIONS: YES
// timestamp: 1.668753222839E12

package main;

import com.area9innovation.flow.*;

public class Struct_PegVmCache extends Struct {
	public Object[] f_caches;

	public Struct_PegVmCache() {}
	public Struct_PegVmCache(Object[] a_caches) {
		f_caches = a_caches;
	}

	public int getTypeId() { return 93; }
	public String getTypeName() { return "PegVmCache"; }

	private static final String[] field_names = new String[] {
		"caches"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_caches
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegVmCache");
		f_caches = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 93) return 93-tmp;
		Struct_PegVmCache other = (Struct_PegVmCache)other_gen;
		tmp = FlowRuntime.compareByValue(f_caches, other.f_caches);
		return tmp;
	}
}
