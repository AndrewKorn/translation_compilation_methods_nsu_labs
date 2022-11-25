// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package execute;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_string {
	public static final String f_cloneString(String as) {
			return as;
		}
	public static final String f_d2s(double ad) {
			return FlowRuntime.doubleToString(ad);
		}
	public static final Struct f_doStrReplace(String as, int ai, String aold, String anew, Struct aacc) {
		TAIL_CALL: for(;;) {
			final int l0_n = Native.strlen(as);
			if ((ai<l0_n)) {
				final int l1_hit = Native.strRangeIndexOf(as, aold, ai, l0_n);
				if ((l1_hit>=0)) {
					final String l2_before = Native.substring(as, ai, (l1_hit-ai));
					final Struct_Cons l3_nacc = (new Struct_Cons(anew, (new Struct_Cons(l2_before, aacc))));
					{
						final int l4___tmp = (l1_hit+Native.strlen(aold));
						final Struct l5___tmp = l3_nacc;
						ai = l4___tmp;
						aacc = l5___tmp;
						continue TAIL_CALL;
					}
				} else {
					return (new Struct_Cons(Module_string.f_strRight(as, ai), aacc));
				}
			} else {
				return aacc;
			}
		}
		}
	public static final String f_doStrReplace2(String aprefix, String asuffix, String aold, String anew) {
		TAIL_CALL: for(;;) {
			final int l0_i = Native.strIndexOf(asuffix, aold);
			if ((l0_i>=0)) {
				final int l1_l = Native.strlen(asuffix);
				final int l2_oldLen = Native.strlen(aold);
				{
					final String l3___tmp = ((aprefix+Native.substring(asuffix, 0, l0_i))+anew);
					final String l4___tmp = Native.substring(asuffix, (l0_i+l2_oldLen), ((l1_l-l0_i)-l2_oldLen));
					aprefix = l3___tmp;
					asuffix = l4___tmp;
					continue TAIL_CALL;
				}
			} else {
				return (aprefix+asuffix);
			}
		}
		}
	public static final String f_ltrim(String as) {
		TAIL_CALL: for(;;) {
			final int l0_l = Native.strlen(as);
			if ((l0_l==0)) {
				return as;
			} else {
				final int l1_first = Native.getCharCodeAt(as, 0);
				if ((l1_first==32)) {
					{
						final String l2___tmp = Native.substring(as, 1, (l0_l-1));
						as = l2___tmp;
						continue TAIL_CALL;
					}
				} else {
					return as;
				}
			}
		}
		}
	public static final int f_parseHex(String as) {
			final Func2<Integer,Integer, Integer> l1_$0 = (Func2<Integer, Integer, Integer>)(Integer aacc, Integer acode) -> {
				final Func1<Integer,Integer> l2_subtract = (Func1<Integer, Integer>)(Integer aoffset) -> {
					return ((Integer)((((int)aacc)*16)+(((int)acode)-((int)aoffset))));
				};
				if (((48<=((int)acode))&&(((int)acode)<=57))) {
					return l2_subtract.invoke(((Integer)48));
				} else {
					if (((65<=((int)acode))&&(((int)acode)<=70))) {
						return l2_subtract.invoke(((Integer)55));
					} else {
						if (((97<=((int)acode))&&(((int)acode)<=102))) {
							return l2_subtract.invoke(((Integer)87));
						} else {
							return aacc;
						}
					}
				}
			};
			return ((int)Module_string.f_stringFold(as, 0, ((Func2<Object,Object, Integer>)(Func2)l1_$0)));
		}
	public static final String f_rtrim(String as) {
		TAIL_CALL: for(;;) {
			final int l0_l = Native.strlen(as);
			if ((l0_l==0)) {
				return as;
			} else {
				final int l1_last = Native.getCharCodeAt(as, (l0_l-1));
				if ((l1_last==32)) {
					{
						final String l2___tmp = Native.substring(as, 0, (l0_l-1));
						as = l2___tmp;
						continue TAIL_CALL;
					}
				} else {
					return as;
				}
			}
		}
		}
	public static final int f_strRangeIndexOf(String astr, String asubstr, int astart, int aend) {
			final int l0_rv = Native.strIndexOf(Native.substring(astr, astart, (aend-astart)), asubstr);
			if ((l0_rv<0)) {
				return l0_rv;
			} else {
				return (astart+l0_rv);
			}
		}
	public static final String f_strReplace(String as, String aold, String anew) {
			if ((aold).equals("")) {
				return as;
			} else {
				if ((Native.strlen(as)>500)) {
					return Native.list2string(Module_string.f_doStrReplace(as, 0, aold, anew, Module_list.f_makeList()));
				} else {
					return Module_string.f_doStrReplace2("", as, aold, anew);
				}
			}
		}
	public static final String f_strRight(String as, int aindex) {
			final int l0_l = Native.strlen(as);
			if ((aindex>=l0_l)) {
				return "";
			} else {
				return Native.substring(as, aindex, (l0_l-aindex));
			}
		}
	public static final Object f_stringFold(String as, Object aa, Func2<Object,Object, Integer> af) {
			final int l2_$1 = (Native.strlen(as)-1);
			final Func2<Object,Object, Integer> l4_f = af;
			final String l5_s = as;
			final Func2<Object,Object, Integer> l3_$0 = (Func2<Object, Object, Integer>)(Object aa2, Integer ai) -> {
				return l4_f.invoke(aa2, ((Integer)Native.getCharCodeAt(l5_s, ((int)ai))));
			};
			return Module_array.f_foldRange(0, l2_$1, aa, l3_$0);
		}
	public static final String f_trim(String as) {
			return Module_string.f_rtrim(Module_string.f_ltrim(as));
		}
	public static final int f_trunc(double ad) {
			return ((int)ad);
		}
}
