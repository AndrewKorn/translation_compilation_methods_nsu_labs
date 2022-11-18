// HASH COLLISIONS: YES
// timestamp: 1.668108779051E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_PegStackPcCache extends Struct {
	public int f_pc;
	public int f_ce;
	public int f_start;
	public Struct f_capture;

	public Struct_PegStackPcCache() {}
	public Struct_PegStackPcCache(int a_pc, int a_ce, int a_start, Struct a_capture) {
		f_pc = a_pc;
		f_ce = a_ce;
		f_start = a_start;
		f_capture = a_capture;
	}

	public int getTypeId() { return 84; }
	public String getTypeName() { return "PegStackPcCache"; }

	private static final String[] field_names = new String[] {
		"pc", "ce", "start", "capture"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.INT, RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_pc, f_ce, f_start, f_capture
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in PegStackPcCache");
		f_pc = (Integer)values[0];
		f_ce = (Integer)values[1];
		f_start = (Integer)values[2];
		f_capture = (Struct)values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 84) return 84-tmp;
		Struct_PegStackPcCache other = (Struct_PegStackPcCache)other_gen;
		if (f_pc != other.f_pc)
			return (f_pc > other.f_pc) ? 1 : -1;
		if (f_ce != other.f_ce)
			return (f_ce > other.f_ce) ? 1 : -1;
		if (f_start != other.f_start)
			return (f_start > other.f_start) ? 1 : -1;
		tmp = f_capture.compareTo(other.f_capture);
		return tmp;
	}
}
