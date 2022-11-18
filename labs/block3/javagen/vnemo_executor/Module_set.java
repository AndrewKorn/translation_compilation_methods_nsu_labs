// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package vnemo_executor;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_set {
	public static final Struct_Set f_buildSet(Object[] axs) {
			return ((Struct_Set)Native.fold(axs, Module_set.f_makeSet(), ((Func2<Object,Object, Object>)(Func2)Wrappers.w_insertSet)));
		}
	public static final boolean f_existsSet(Struct_Set as, Func1<Boolean,Object> afn) {
			final Func1<Boolean,Object> l2_fn = afn;
			final Func2<Boolean,Boolean, Object> l1_$0 = (Func2<Boolean, Boolean, Object>)(Boolean aacc, Object av) -> {
				return ((Boolean)(((boolean)aacc)||((boolean)l2_fn.invoke(av))));
			};
			return ((boolean)Module_set.f_foldSet(as, false, ((Func2<Object,Object, Object>)(Func2)l1_$0)));
		}
	public static final Object f_foldSet(Struct_Set as, Object ainit, Func2<Object,Object, Object> afn) {
			final Struct l2_$1 = as.f_tree;
			final Func2<Object,Object, Object> l4_fn = afn;
			final Func3<Object,Object, Boolean, Object> l3_$0 = (Func3<Object, Object, Boolean, Object>)(Object ak, Boolean av, Object aacc) -> {
				return l4_fn.invoke(aacc, ak);
			};
			return Module_tree.f_foldTree(l2_$1, ainit, ((Func3<Object,Object, Object, Object>)(Func3)l3_$0));
		}
	public static final Struct_Set f_insertSet(Struct_Set as, Object avalue) {
			return (new Struct_Set(Module_tree.f_setTree(as.f_tree, avalue, true)));
		}
	public static final Struct_Set f_makeSet() {
			return (new Struct_Set(Module_tree.f_makeTree()));
		}
	public static final Struct_Set f_mergeSets(Struct_Set aa, Struct_Set ab) {
			return (new Struct_Set(Module_tree.f_mergeTree(aa.f_tree, ab.f_tree)));
		}
}
