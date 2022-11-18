// HASH COLLISIONS: YES
// timestamp: 1.668103166732E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegCacheCall extends Struct {
	public int f_l;
	public int f_cacheEntry;

	public Struct_PegCacheCall() {}
	public Struct_PegCacheCall(int a_l, int a_cacheEntry) {
		f_l = a_l;
		f_cacheEntry = a_cacheEntry;
	}

	public int getTypeId() { return 60; }
	public String getTypeName() { return "PegCacheCall"; }

	private static final String[] field_names = new String[] {
		"l", "cacheEntry"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_l, f_cacheEntry
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in PegCacheCall");
		f_l = (Integer)values[0];
		f_cacheEntry = (Integer)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 60) return 60-tmp;
		Struct_PegCacheCall other = (Struct_PegCacheCall)other_gen;
		if (f_l != other.f_l)
			return (f_l > other.f_l) ? 1 : -1;
		if (f_cacheEntry != other.f_cacheEntry)
			return (f_cacheEntry > other.f_cacheEntry) ? 1 : -1;
		return 0;
	}
}
