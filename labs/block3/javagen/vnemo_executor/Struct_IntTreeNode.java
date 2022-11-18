// HASH COLLISIONS: YES
// timestamp: 1.668108779022E12

package vnemo_executor;

import com.area9innovation.flow.*;

public class Struct_IntTreeNode extends Struct {
	public Object[] f_children;

	public Struct_IntTreeNode() {}
	public Struct_IntTreeNode(Object[] a_children) {
		f_children = a_children;
	}

	public int getTypeId() { return 27; }
	public String getTypeName() { return "IntTreeNode"; }

	private static final String[] field_names = new String[] {
		"children"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.ARRAY
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_children
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in IntTreeNode");
		f_children = (Object[])values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 27) return 27-tmp;
		Struct_IntTreeNode other = (Struct_IntTreeNode)other_gen;
		tmp = FlowRuntime.compareByValue(f_children, other.f_children);
		return tmp;
	}
}
