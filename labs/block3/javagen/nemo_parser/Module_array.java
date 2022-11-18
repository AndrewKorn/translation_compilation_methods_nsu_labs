// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_array {
	public static final Object[] f_arrayPush(Object[] aarray, Object avalue) {
			return Native.replace(aarray, Native.length(aarray), avalue);
		}
	public static final Object[] f_concat3(Object[] aa1, Object[] aa2, Object[] aa3) {
			if ((Native.length(aa1)<Native.length(aa3))) {
				return Native.concat(Native.concat(aa1, aa2), aa3);
			} else {
				return Native.concat(aa1, Native.concat(aa2, aa3));
			}
		}
	public static final Object[] f_concatA(Object[] aa) {
			return Module_array.f_doConcatA(aa, 0, Native.length(aa));
		}
	public static final boolean f_contains(Object[] aa, Object av) {
			return (Native.elemIndex(aa, av, (-1))!=(-1));
		}
	public static final Object[] f_doConcatA(Object[] aa, int ai, int al) {
			if ((al<=3)) {
				if ((al==1)) {
					return ((Object[])(aa[ai]));
				} else {
					if ((al==2)) {
						return Native.concat(((Object[])(aa[ai])), ((Object[])(aa[(ai+1)])));
					} else {
						if ((al==3)) {
							return Module_array.f_concat3(((Object[])(aa[ai])), ((Object[])(aa[(ai+1)])), ((Object[])(aa[(ai+2)])));
						} else {
							return SingletonStructs.arr_empty;
						}
					}
				}
			} else {
				final int l0_m = (al/2);
				return Native.concat(Module_array.f_doConcatA(aa, ai, l0_m), Module_array.f_doConcatA(aa, (ai+l0_m), (al-l0_m)));
			}
		}
	public static final int f_elemIndex(Object[] aa, Object aelem, int aillegal) {
			final Object l2_elem = aelem;
			final Func2<Boolean,Integer, Object> l1_$0 = (Func2<Boolean, Integer, Object>)(Integer ai, Object aai) -> {
				return FlowRuntime.compareEqual(aai,l2_elem);
			};
			final int l3_foundIndex = Native.iteriUntil(aa, l1_$0);
			if ((l3_foundIndex==Native.length(aa))) {
				return aillegal;
			} else {
				return l3_foundIndex;
			}
		}
	public static final boolean f_exists(Object[] aa, Func1<Boolean,Object> afn) {
			final Func1<Boolean,Object> l2_fn = afn;
			final Func2<Boolean,Integer, Object> l1_$0 = (Func2<Boolean, Integer, Object>)(Integer ai, Object ae) -> {
				return l2_fn.invoke(ae);
			};
			final int l3_foundIndex = Native.iteriUntil(aa, l1_$0);
			return (l3_foundIndex!=Native.length(aa));
		}
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
	public static final Struct f_findi(Object[] aa, Func1<Boolean,Object> afn) {
			return Module_array.f_findiex(aa, afn, 0);
		}
	public static final Struct f_findiex(Object[] aa, Func1<Boolean,Object> afn, int ai) {
		TAIL_CALL: for(;;) {
			if ((ai>=Native.length(aa))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				if (((boolean)afn.invoke(((Object)(aa[ai]))))) {
					return (new Struct_Some(ai));
				} else {
					{
						final int l0___tmp = (ai+1);
						ai = l0___tmp;
						continue TAIL_CALL;
					}
				}
			}
		}
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
	public static final Object[] f_reverseA(Object[] aa) {
			final int l0_l = Native.length(aa);
			if ((l0_l>1)) {
				final Object[] l3_$2 = Native.enumFromTo(1, l0_l);
				final Object[] l5_a = aa;
				final Func1<Object,Integer> l4_$1 = (Func1<Object, Integer>)(Integer ai) -> {
					return ((Object)(l5_a[(l0_l-((int)ai))]));
				};
				return Native.map(l3_$2, ((Func1<Object,Object>)(Func1)l4_$1));
			} else {
				return aa;
			}
		}
}
