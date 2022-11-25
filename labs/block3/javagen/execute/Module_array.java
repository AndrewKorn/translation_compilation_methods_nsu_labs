// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package execute;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_array {
	public static final Struct f_find(Object[] aa, Func1<Boolean,Object> afn) {
			final Func1<Boolean,Object> l2_fn = afn;
			final Func2<Boolean,Integer, Object> l1_$0 = (Func2<Boolean, Integer, Object>)(Integer ai, Object ae) -> {
				return l2_fn.invoke(ae);
			};
			final int l3_foundIndex = Native.iteriUntil(aa, l1_$0);
			if ((l3_foundIndex==Native.length(aa))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				return (new Struct_Some(((Object)(aa[l3_foundIndex]))));
			}
		}
	public static final Object f_findDef(Object[] aa, Func1<Boolean,Object> afn, Object adef) {
			return Module_maybe.f_either(Module_array.f_find(aa, afn), adef);
		}
	public static final Object f_foldRange(int astart, int aend, Object aacc, Func2<Object,Object, Integer> afn) {
		TAIL_CALL: for(;;) {
			if ((astart<=aend)) {
				{
					final int l0___tmp = (astart+1);
					final Object l1___tmp = afn.invoke(aacc, ((Integer)astart));
					astart = l0___tmp;
					aacc = l1___tmp;
					continue TAIL_CALL;
				}
			} else {
				return aacc;
			}
		}
		}
}
