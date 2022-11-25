// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package execute;

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
}
