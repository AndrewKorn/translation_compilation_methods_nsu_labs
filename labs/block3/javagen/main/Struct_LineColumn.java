// HASH COLLISIONS: YES
// timestamp: 1.668753222807E12

package main;

import com.area9innovation.flow.*;

public class Struct_LineColumn extends Struct {
	public String f_line;
	public int f_lineno;
	public int f_column;
	public int f_lineIndex;
	public Struct_LineResolver f_lineResolver;

	public Struct_LineColumn() {}
	public Struct_LineColumn(String a_line, int a_lineno, int a_column, int a_lineIndex, Struct_LineResolver a_lineResolver) {
		f_line = a_line;
		f_lineno = a_lineno;
		f_column = a_column;
		f_lineIndex = a_lineIndex;
		f_lineResolver = a_lineResolver;
	}

	public int getTypeId() { return 41; }
	public String getTypeName() { return "LineColumn"; }

	private static final String[] field_names = new String[] {
		"line", "lineno", "column", "lineIndex", "lineResolver"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRING, RuntimeType.INT, RuntimeType.INT, RuntimeType.INT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_line, f_lineno, f_column, f_lineIndex, f_lineResolver
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 5)
			throw new IndexOutOfBoundsException("Invalid field count in LineColumn");
		f_line = (String)values[0];
		f_lineno = (Integer)values[1];
		f_column = (Integer)values[2];
		f_lineIndex = (Integer)values[3];
		f_lineResolver = (Struct_LineResolver)values[4];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 41) return 41-tmp;
		Struct_LineColumn other = (Struct_LineColumn)other_gen;
		tmp = f_line.compareTo(other.f_line);
		if (tmp != 0) return tmp;
		if (f_lineno != other.f_lineno)
			return (f_lineno > other.f_lineno) ? 1 : -1;
		if (f_column != other.f_column)
			return (f_column > other.f_column) ? 1 : -1;
		if (f_lineIndex != other.f_lineIndex)
			return (f_lineIndex > other.f_lineIndex) ? 1 : -1;
		tmp = f_lineResolver.compareTo(other.f_lineResolver);
		return tmp;
	}
}
