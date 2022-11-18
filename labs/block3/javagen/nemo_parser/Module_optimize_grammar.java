// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_optimize_grammar {
	public static final Struct_Grammar f_optimizeGrammar(Struct_Grammar ag) {
			return (new Struct_Grammar(Native.map(ag.f_productions, ((Func1<Object,Object>)(Func1)Wrappers.w_optimizeProduction))));
		}
	public static final Struct_Production f_optimizeProduction(Struct_Production ap) {
			final Object[] l3_$1 = ap.f_choices;
			final Object[] l4_$2 = SingletonStructs.arr_empty;
			final Func2<Object[],Object[], Struct_Seq> l5_$0 = (Func2<Object[], Object[], Struct_Seq>)(Object[] aacc, Struct_Seq ac) -> {
				final int l6_n = Native.length(aacc);
				if ((l6_n==0)) {
					return (new Object[] { ac });
				} else {
					final Object[] l7_last = ((Struct_Seq)(aacc[(l6_n-1)])).f_seq;
					final int l8_nl = Native.length(l7_last);
					final Object[] l11_$10 = ac.f_seq;
					final Func2<Boolean,Integer, Struct> l12_$9 = (Func2<Boolean, Integer, Struct>)(Integer ai, Struct ae) -> {
						return ((Boolean)!((((int)ai)<l8_nl)&&FlowRuntime.compareEqual(((Struct)(l7_last[((int)ai)])),ae)));
					};
					final int l13_firstDiff = Native.iteriUntil(l11_$10, ((Func2<Boolean,Integer, Object>)(Func2)l12_$9));
					if ((l13_firstDiff>0)) {
						final Object[] l14_shared = Native.subrange(ac.f_seq, 0, l13_firstDiff);
						final Object[] l15_tail1 = Native.subrange(l7_last, l13_firstDiff, (l8_nl-l13_firstDiff));
						final int l16_nc = Native.length(ac.f_seq);
						final Object[] l17_tail2 = Native.subrange(ac.f_seq, l13_firstDiff, (l16_nc-l13_firstDiff));
						final Struct_Seq l18_joined = (new Struct_Seq(Module_array.f_arrayPush(l14_shared, (new Struct_Choices((new Object[] { (new Struct_Seq(l15_tail1)), (new Struct_Seq(l17_tail2)) }))))));
						return Module_array.f_arrayPush(Native.subrange(aacc, 0, (l6_n-1)), l18_joined);
					} else {
						return Module_array.f_arrayPush(aacc, ac);
					}
				}
			};
			final Object[] l6_choices = ((Object[])Native.fold(l3_$1, l4_$2, ((Func2<Object,Object, Object>)(Func2)l5_$0)));
			return (new Struct_Production(ap.f_name, ap.f_caching, ap.f_type, l6_choices));
		}
}
