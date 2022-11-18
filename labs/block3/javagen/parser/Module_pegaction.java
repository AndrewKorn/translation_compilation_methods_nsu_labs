// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_pegaction {
	public static Struct_SemanticActions g_defaultPegActions;
	public static void init_defaultPegActions() {
		final Reference<Struct> l0_t = ((Reference<Struct>)(new Reference(Module_tree.f_makeTree())));
		final Func2<Object,String, Func1<Object,Object[]>> l1_add = (Func2<Object, String, Func1<Object,Object[]>>)(String an, Func1<Object,Object[]> afn) -> {
			l0_t.value = Module_tree.f_setTree(l0_t.value, an, afn);
			return null;
		};
		final Func1<Object,Object[]> l2_strUnescape = (Func1<Object, Object[]>)(Object[] axs) -> {
			String l3_quote;
			if ((Module_dynamic.f_flow2s(((Object)(axs[1])))).equals("'")) {
				l3_quote="\"";
			} else {
				l3_quote="'";
			}
			return Module_dynamic.f_flow(Module_deserialize_string.f_deserializeString((("\""+Native.strReplace(Module_dynamic.f_flow2s(((Object)(axs[0]))), l3_quote, ("\\"+l3_quote)))+"\"")).f_first);
		};
		final Func1<Object,Object[]> l4_$3 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(Native.concat((new Object[] { ((Object)(axs[0])) }), ((Object[])((Object)(axs[1])))));
		};
		l1_add.invoke("consArray", l4_$3);
		l1_add.invoke("strUnescape", l2_strUnescape);
		final Func1<Object,Object[]> l6_$5 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return l2_strUnescape.invoke((new Object[] { ((Field_first)((Object)(axs[0]))).get_first(), ((Field_second)((Object)(axs[0]))).get_second() }));
		};
		l1_add.invoke("strUnescapePair", l6_$5);
		final Func1<Object,Object[]> l8_$7 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(Native.concat(((Object[])((Object)(axs[0]))), ((Object[])((Object)(axs[1])))));
		};
		l1_add.invoke("concat", l8_$7);
		final Func1<Object,Object[]> l10_$9 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(Module_math.f_s2i(Module_dynamic.f_flow2s(((Object)(axs[0])))));
		};
		l1_add.invoke("s2i", l10_$9);
		final Func1<Object,Object[]> l12_$11 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(Module_string.f_trim(Module_dynamic.f_flow2s(((Object)(axs[0])))));
		};
		l1_add.invoke("trim", l12_$11);
		final Func1<Object,Object[]> l14_$13 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(Module_math.f_s2d(Module_dynamic.f_flow2s(((Object)(axs[0])))));
		};
		l1_add.invoke("s2d", l14_$13);
		final Func1<Object,Object[]> l16_$15 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(axs);
		};
		l1_add.invoke("array", l16_$15);
		final Func1<Object,Object[]> l18_$17 = (Func1<Object, Object[]>)(Object[] axs) -> {
			final Object[] l19_x0 = ((Object[])((Object)(axs[0])));
			if ((Native.length(l19_x0)>0)) {
				return ((Object)(l19_x0[0]));
			} else {
				final Object[] l20_a = SingletonStructs.arr_empty;
				return Module_dynamic.f_flow(l20_a);
			}
		};
		l1_add.invoke("unarray", l18_$17);
		final Func1<Object,Object[]> l20_$19 = (Func1<Object, Object[]>)(Object[] axs) -> {
			Module_runtime.f_println(("Debug: "+Module_dynamic.f_toString(((Native.length(axs)==1)?((Object)(axs[0])):axs))));
			return ((Object)(axs[0]));
		};
		l1_add.invoke("debug", l20_$19);
		final Func1<Object,Object[]> l22_$21 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(true);
		};
		l1_add.invoke("true", l22_$21);
		final Func1<Object,Object[]> l24_$23 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(false);
		};
		l1_add.invoke("false", l24_$23);
		final Func1<Object,Object[]> l26_$25 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(0);
		};
		l1_add.invoke("zero", l26_$25);
		final Func1<Object,Object[]> l28_$27 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(1);
		};
		l1_add.invoke("one", l28_$27);
		final Func1<Object,Object[]> l30_$29 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(2);
		};
		l1_add.invoke("two", l30_$29);
		final Func1<Object,Object[]> l32_$31 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow(3);
		};
		l1_add.invoke("three", l32_$31);
		final Func1<Object,Object[]> l34_$33 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow((-Module_dynamic.f_flow2i(((Object)(axs[0])))));
		};
		l1_add.invoke("minus", l34_$33);
		final Func1<Object,Object[]> l36_$35 = (Func1<Object, Object[]>)(Object[] axs) -> {
			return Module_dynamic.f_flow("");
		};
		l1_add.invoke("storeComment", l36_$35);
		final Func1<Object,Object[]> l38_$37 = (Func1<Object, Object[]>)(Object[] axs) -> {
			final Object[] l39_a = SingletonStructs.arr_empty;
			return Module_dynamic.f_flow(l39_a);
		};
		l1_add.invoke("emptyArray", l38_$37);
		final Func1<Object,Object[]> l40_$39 = (Func1<Object, Object[]>)(Object[] axs) -> {
			final Object[] l41_x0 = ((Object[])((Object)(axs[0])));
			if ((Native.length(l41_x0)>0)) {
				return ((Object)(l41_x0[0]));
			} else {
				return Module_dynamic.f_flow(((Object)(axs[1])));
			}
		};
		l1_add.invoke("unarrayDef", l40_$39);
		g_defaultPegActions=(new Struct_SemanticActions(l0_t.value));
	}
	public static void init() {
		init_defaultPegActions();
	}
}
