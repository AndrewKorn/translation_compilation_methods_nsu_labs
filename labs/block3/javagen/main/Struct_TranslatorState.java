// HASH COLLISIONS: YES
// timestamp: 1.668709398007E12

package main;

import com.area9innovation.flow.*;

public class Struct_TranslatorState extends Struct {
	public String f_src;
	public int f_maxLabel;
	public int f_prevStateMaxLabel;

	public Struct_TranslatorState() {}
	public Struct_TranslatorState(String a_src, int a_maxLabel, int a_prevStateMaxLabel) {
		f_src = a_src;
		f_maxLabel = a_maxLabel;
		f_prevStateMaxLabel = a_prevStateMaxLabel;
	}

	public int getTypeId() { return 114; }
	public String getTypeName() { return "TranslatorState"; }

	private static final String[] field_names = new String[] {
		"src", "maxLabel", "prevStateMaxLabel"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.INT, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_src, f_maxLabel, f_prevStateMaxLabel
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 3)
			throw new IndexOutOfBoundsException("Invalid field count in TranslatorState");
		f_src = (String)values[0];
		f_maxLabel = (Integer)values[1];
		f_prevStateMaxLabel = (Integer)values[2];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 114) return 114-tmp;
		Struct_TranslatorState other = (Struct_TranslatorState)other_gen;
		tmp = f_src.compareTo(other.f_src);
		if (tmp != 0) return tmp;
		if (f_maxLabel != other.f_maxLabel)
			return (f_maxLabel > other.f_maxLabel) ? 1 : -1;
		if (f_prevStateMaxLabel != other.f_prevStateMaxLabel)
			return (f_prevStateMaxLabel > other.f_prevStateMaxLabel) ? 1 : -1;
		return 0;
	}
}