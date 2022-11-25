// HASH COLLISIONS: YES
// timestamp: 1.669356105079E12

package main;

import com.area9innovation.flow.*;

public class Struct_Action extends Struct {
	public Func1<Object,Struct_PegEnv> f_fn;

	public Struct_Action() {}
	public Struct_Action(Func1<Object,Struct_PegEnv> a_fn) {
		f_fn = a_fn;
	}

	public int getTypeId() { return 0; }
	public String getTypeName() { return "Action"; }

	private static final String[] field_names = new String[] {
		"fn"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_fn
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Action");
		f_fn = (Func1<Object,Struct_PegEnv>)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 0) return 0-tmp;
		Struct_Action other = (Struct_Action)other_gen;
		tmp = FlowRuntime.compareByValue(f_fn, other.f_fn);
		return tmp;
	}
}
