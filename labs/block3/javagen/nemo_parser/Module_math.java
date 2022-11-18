// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_math {
	public static final double f_abs(double ax) {
			if ((ax<0.0)) {
				return (-ax);
			} else {
				return ax;
			}
		}
	public static final int f_b2i(boolean ab) {
			if (ab) {
				return 1;
			} else {
				return 0;
			}
		}
	public static final double f_dfloor(double ad) {
			return (ad-(ad%1.0));
		}
	public static final double f_dround(double ax) {
			return Module_math.f_dfloor((ax+((ax<0.0)?(-0.5):0.5)));
		}
	public static final int f_floor(double ad) {
			return Module_string.f_trunc(((ad>=0.0)?ad:((((-ad)-Module_math.f_i2d(Module_string.f_trunc((-ad))))>0.0)?(ad-1.0):ad)));
		}
	public static final int f_getDigitCode(int ac) {
			if (((48<=ac)&&(ac<=57))) {
				return (ac-48);
			} else {
				return (-1);
			}
		}
	public static final double f_i2d(int ai) {
			return ((double)ai);
		}
	public static final boolean f_isNanOrInf(double ad) {
			return (((ad==(2.0*ad))&&(ad!=0.0))||(ad!=ad));
		}
	public static final int f_pow(int ai, int an) {
			if ((an>0)) {
				final int l0_n2 = Module_math.f_pow(ai, (an/2));
				if (((an%2)==0)) {
					return (l0_n2*l0_n2);
				} else {
					return ((l0_n2*l0_n2)*ai);
				}
			} else {
				return 1;
			}
		}
	public static final int f_round(double ad) {
			return Module_math.f_floor((ad+0.5));
		}
	public static final double f_s2d(String as) {
			final int l0_n = Native.strlen(as);
			if ((l0_n==0)) {
				return 0.0;
			} else {
				final boolean l1_negative = (Native.getCharCodeAt(as, 0)==45);
				if (l1_negative) {
					return (-Module_math.f_s2dint(as, 1, l0_n, 0.0));
				} else {
					return Module_math.f_s2dint(as, 0, l0_n, 0.0);
				}
			}
		}
	public static final double f_s2dexp(String as, int ai, int an, double aacc) {
			if ((ai<an)) {
				final int l0_c = Native.getCharCodeAt(as, ai);
				final boolean l1_expNeg = (l0_c==45);
				final boolean l2_expPos = (l0_c==43);
				final int l3_exponent = Module_math.f_s2i2(as, (ai+Module_math.f_b2i((l1_expNeg||l2_expPos))), an, 0);
				return Module_math.f_shiftExponent(aacc, (l1_expNeg?(-l3_exponent):l3_exponent));
			} else {
				return aacc;
			}
		}
	public static final Struct_Pair f_s2dfrac(String as, int ai, int an, double aacc, double afracacc) {
			if ((ai<an)) {
				final int l0_c = Native.getCharCodeAt(as, ai);
				final int l1_d = Module_math.f_getDigitCode(l0_c);
				if ((l1_d!=(-1))) {
					final Struct_Pair l2_fracres = Module_math.f_s2dfrac(as, (ai+1), an, ((aacc*10.0)+Module_math.f_i2d(l1_d)), (afracacc*10.0));
					return (new Struct_Pair(l2_fracres.f_first, l2_fracres.f_second));
				} else {
					if (((l0_c==69)||(l0_c==101))) {
						return (new Struct_Pair(Module_math.f_s2dexp(as, (ai+1), an, (aacc/afracacc)), 1.0));
					} else {
						return (new Struct_Pair(aacc, afracacc));
					}
				}
			} else {
				return (new Struct_Pair(aacc, afracacc));
			}
		}
	public static final double f_s2dint(String as, int ai, int an, double aacc) {
		TAIL_CALL: for(;;) {
			if ((ai<an)) {
				final int l0_c = Native.getCharCodeAt(as, ai);
				final int l1_d = Module_math.f_getDigitCode(l0_c);
				if ((l1_d!=(-1))) {
					{
						final int l2___tmp = (ai+1);
						final double l3___tmp = ((10.0*aacc)+Module_math.f_i2d(l1_d));
						ai = l2___tmp;
						aacc = l3___tmp;
						continue TAIL_CALL;
					}
				} else {
					if ((l0_c==46)) {
						final Struct_Pair l4_fracres = Module_math.f_s2dfrac(as, (ai+1), an, aacc, 10.0);
						final double l5_mult = (10.0*((double)l4_fracres.f_first));
						if (Module_math.f_isNanOrInf(l5_mult)) {
							return ((((double)l4_fracres.f_first)/((double)l4_fracres.f_second))*10.0);
						} else {
							return (l5_mult/((double)l4_fracres.f_second));
						}
					} else {
						if (((l0_c==69)||(l0_c==101))) {
							return Module_math.f_s2dexp(as, (ai+1), an, aacc);
						} else {
							return aacc;
						}
					}
				}
			} else {
				return aacc;
			}
		}
		}
	public static final int f_s2i(String as) {
			return Module_math.f_floor(Module_math.f_s2d(as));
		}
	public static final int f_s2i2(String as, int ai, int an, int aacc) {
		TAIL_CALL: for(;;) {
			if ((ai<an)) {
				final int l0_c = Native.getCharCodeAt(as, ai);
				final int l1_d = Module_math.f_getDigitCode(l0_c);
				if ((l1_d!=(-1))) {
					{
						final int l2___tmp = (ai+1);
						final int l3___tmp = ((10*aacc)+l1_d);
						ai = l2___tmp;
						aacc = l3___tmp;
						continue TAIL_CALL;
					}
				} else {
					return aacc;
				}
			} else {
				return aacc;
			}
		}
		}
	public static final double f_shiftExponent(double aacc, int aexponent) {
		TAIL_CALL: for(;;) {
			if ((aexponent==0)) {
				return aacc;
			} else {
				if ((aexponent<0)) {
					{
						final double l0___tmp = (aacc/10.0);
						final int l1___tmp = (aexponent+1);
						aacc = l0___tmp;
						aexponent = l1___tmp;
						continue TAIL_CALL;
					}
				} else {
					{
						final double l2___tmp = (aacc*10.0);
						final int l3___tmp = (aexponent-1);
						aacc = l2___tmp;
						aexponent = l3___tmp;
						continue TAIL_CALL;
					}
				}
			}
		}
		}
	public static final int f_sum(Object[] al) {
			final Func2<Integer,Integer, Integer> l1_$0 = (Func2<Integer, Integer, Integer>)(Integer aa, Integer ab) -> {
				return ((Integer)(((int)aa)+((int)ab)));
			};
			return ((int)Native.fold(al, 0, ((Func2<Object,Object, Object>)(Func2)l1_$0)));
		}
}
