// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_maybe {
	public static final Object f_either(Struct am, Object aalternative) {
			Struct l0__tmp = am;
			switch (l0__tmp.getTypeId()) {
			case 48/*None*/: {
				return aalternative;
			}
			case 113/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return l3_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object f_eitherFn(Struct am, Func1<Object,Object> afn, Func0<Object> aalternativeFn) {
			Struct l0__tmp = am;
			switch (l0__tmp.getTypeId()) {
			case 48/*None*/: {
				return aalternativeFn.invoke();
			}
			case 113/*Some*/: {
				final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return afn.invoke(l3_v);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object f_onlyOnce(Reference<Struct> apad, Func0<Object> ainit) {
			final Struct l0_gsymswitch0 = apad.value;
			Struct l1__tmp = l0_gsymswitch0;
			switch (l1__tmp.getTypeId()) {
			case 48/*None*/: {
				final Object l3_v = ainit.invoke();
				((Reference<Struct_Some>)(Reference)apad).value = (new Struct_Some(l3_v));
				return l3_v;
			}
			case 113/*Some*/: {
				final Struct_Some l2__tmp = (Struct_Some)l1__tmp;
				final Object l4_v = l2__tmp.f_value;
				final Object l5_v = l2__tmp.f_value;
				return l5_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
}
