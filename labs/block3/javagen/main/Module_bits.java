// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_bits {
	public static Object[] g_pots2;
	public static void init() {
		final Func1<Integer,Integer> l1_$0 = (Func1<Integer, Integer>)(Integer ai) -> {
			return ((Integer)Module_math.f_pow(2, ((int)ai)));
		};
		g_pots2=Module_runtime.f_generate(0, 32, ((Func1<Object,Integer>)(Func1)l1_$0));
	}
	public static final int f_bitShl(int aa, int ab) {
			if ((ab==0)) {
				return aa;
			} else {
				if ((ab>=32)) {
					return 0;
				} else {
					final int l0_highest = Native.bitAnd(aa, Module_bits.f_pot2((31-ab)));
					final int l1_mask = (Module_bits.f_pot2((31-ab))-1);
					final int l2_shifted = (Native.bitAnd(aa, l1_mask)*Module_bits.f_pot2(ab));
					if ((l0_highest!=0)) {
						return Native.bitOr(l2_shifted, (-2147483648));
					} else {
						return l2_shifted;
					}
				}
			}
		}
	public static final int f_bitUshr(int aa, int ab) {
			if ((ab==0)) {
				return aa;
			} else {
				final Func2<Integer,Integer, Integer> l0_shr = (Func2<Integer, Integer, Integer>)(Integer aa1, Integer ab1) -> {
					return ((Integer)(((int)aa1)/Module_bits.f_pot2(((int)ab1))));
				};
				if ((aa<0)) {
					final int l1_v = Native.bitOr(((int)l0_shr.invoke(((Integer)Native.bitAnd(aa, 2147483647)), ((Integer)ab))), Module_bits.f_pot2((31-ab)));
					final int l2_mask = (Module_bits.f_pot2((32-ab))-1);
					return Native.bitAnd(l2_mask, l1_v);
				} else {
					return ((int)l0_shr.invoke(((Integer)aa), ((Integer)ab)));
				}
			}
		}
	public static final int f_pot2(int an) {
			return ((int)(Module_bits.g_pots2[an]));
		}
}
