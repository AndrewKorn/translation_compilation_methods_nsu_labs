// HASH COLLISIONS: YES
// timestamp: 1.668753222812E12

package main;

import com.area9innovation.flow.*;

public class Struct_ParseConstants extends Struct {
	public Object f_input;
	public int f_inputlen;
	public Struct_Grammar f_grammar;
	public Struct_SemanticActions f_semantics;

	public Struct_ParseConstants() {}
	public Struct_ParseConstants(Object a_input, int a_inputlen, Struct_Grammar a_grammar, Struct_SemanticActions a_semantics) {
		f_input = a_input;
		f_inputlen = a_inputlen;
		f_grammar = a_grammar;
		f_semantics = a_semantics;
	}

	public int getTypeId() { return 50; }
	public String getTypeName() { return "ParseConstants"; }

	private static final String[] field_names = new String[] {
		"input", "inputlen", "grammar", "semantics"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.UNKNOWN, RuntimeType.INT, RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_input, f_inputlen, f_grammar, f_semantics
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 4)
			throw new IndexOutOfBoundsException("Invalid field count in ParseConstants");
		f_input = (Object)values[0];
		f_inputlen = (Integer)values[1];
		f_grammar = (Struct_Grammar)values[2];
		f_semantics = (Struct_SemanticActions)values[3];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 50) return 50-tmp;
		Struct_ParseConstants other = (Struct_ParseConstants)other_gen;
		tmp = FlowRuntime.compareByValue(f_input, other.f_input);
		if (tmp != 0) return tmp;
		if (f_inputlen != other.f_inputlen)
			return (f_inputlen > other.f_inputlen) ? 1 : -1;
		tmp = f_grammar.compareTo(other.f_grammar);
		if (tmp != 0) return tmp;
		tmp = f_semantics.compareTo(other.f_semantics);
		return tmp;
	}
}
