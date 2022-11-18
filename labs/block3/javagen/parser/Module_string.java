// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package parser;

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
	public static final String f_getCharAt(String as, int an) {
			return Native.substring(as, an, 1);
		}
	public static final String f_i2s(int ai) {
			return Integer.toString((int)(ai));
		}
	public static final String f_lpad(String as, String ac, int al) {
			if ((Native.strlen(as)<al)) {
				return (ac+Module_string.f_lpad(as, ac, (al-1)));
			} else {
				return as;
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
	public static final String f_ltrim2(String as, String augly) {
			if ((augly).equals("")) {
				return as;
			} else {
				final int l0_l = Native.strlen(as);
				final String l3_ugly = augly;
				final String l4_s = as;
				final Func1<Boolean,Integer> l2_$1 = (Func1<Boolean, Integer>)(Integer ai) -> {
					return (Native.strIndexOf(l3_ugly, Module_string.f_getCharAt(l4_s, ((int)ai)))==(-1));
				};
				final int l5_e = Module_runtime.f_countUntil(0, l0_l, l2_$1);
				if ((l5_e==0)) {
					return as;
				} else {
					return Module_string.f_strRight(as, l5_e);
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
	public static final String f_rtrim2(String as, String augly) {
			final int l0_l = Native.strlen(as);
			final String l3_s = as;
			final String l4_ugly = augly;
			final Func1<Boolean,Integer> l2_$1 = (Func1<Boolean, Integer>)(Integer ai) -> {
				final String l3_c = Module_string.f_getCharAt(l3_s, (l0_l-(((int)ai)+1)));
				return (Native.strIndexOf(l4_ugly, l3_c)==(-1));
			};
			final int l5_e = Module_runtime.f_countUntil(0, l0_l, l2_$1);
			if ((l5_e==0)) {
				return as;
			} else {
				return Module_string.f_strLeft(as, (l0_l-l5_e));
			}
		}
	public static final boolean f_strContainsAt(String astr, int aindex, String asubstr) {
			return (Native.strRangeIndexOf(astr, asubstr, aindex, (aindex+Native.strlen(asubstr)))==aindex);
		}
	public static final String f_strGlue(Object[] aarr, String asep) {
			if (((Object[])aarr).length == 0) {
				return "";
			} else {
				if ((Native.length(aarr)==1)) {
					return ((String)(aarr[0]));
				} else {
					final Struct l2_$1 = Module_list.f_makeList();
					final String l4_sep = asep;
					final Func3<Struct_Cons,Integer, Struct, String> l3_$0 = (Func3<Struct_Cons, Integer, Struct, String>)(Integer aidx, Struct aacc, String ae) -> {
						if ((((int)aidx)==0)) {
							return (new Struct_Cons(ae, aacc));
						} else {
							return (new Struct_Cons(ae, (new Struct_Cons(l4_sep, aacc))));
						}
					};
					return Native.list2string(((Struct)Native.foldi(aarr, l2_$1, ((Func3<Object,Integer, Object, Object>)(Func3)l3_$0))));
				}
			}
		}
	public static final String f_strLeft(String as, int aindex) {
			return Native.substring(as, 0, aindex);
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
