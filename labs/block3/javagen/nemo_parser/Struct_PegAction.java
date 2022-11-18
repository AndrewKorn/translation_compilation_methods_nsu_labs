// HASH COLLISIONS: YES
// timestamp: 1.66810316673E12

package nemo_parser;

import com.area9innovation.flow.*;

public class Struct_PegAction extends Struct {
	public Func1<Object,Struct_PegEnv> f_fn;

	public Struct_PegAction() {}
	public Struct_PegAction(Func1<Object,Struct_PegEnv> a_fn) {
		f_fn = a_fn;
	}

	public int getTypeId() { return 52; }
	public String getTypeName() { return "PegAction"; }

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
			throw new IndexOutOfBoundsException("Invalid field count in PegAction");
		f_fn = (Func1<Object,Struct_PegEnv>)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 52) return 52-tmp;
		Struct_PegAction other = (Struct_PegAction)other_gen;
		tmp = FlowRuntime.compareByValue(f_fn, other.f_fn);
		return tmp;
	}
}
