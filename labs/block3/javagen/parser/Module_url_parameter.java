// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_url_parameter {
	public static Reference<Struct> g_allUrlParameters;
	public static void init() {
		g_allUrlParameters=((Reference<Struct>)(new Reference(Module_url_parameter.f_getAllUrlParameters())));
	}
	public static final Struct f_getAllUrlParameters() {
			final Struct l0_debugStorage = Module_json.f_parseJson(Module_runtime.f_getKeyValue("local-url-parameters", "{}"));
			final Object[] l4_$2 = (new Object[] { "dev", "devtrace", "new", "allow_share_progress" });
			final Struct l5_$3 = Module_tree.f_makeTree();
			final Func2<Struct,Struct, String> l6_$1 = (Func2<Struct, Struct, String>)(Struct aacc, String akey) -> {
				final String l7_value = Module_json.f_getJsonStringField(l0_debugStorage, akey, "");
				if ((l7_value).equals("")) {
					return aacc;
				} else {
					return Module_tree.f_setTree(aacc, akey, l7_value);
				}
			};
			final Struct l7_localTree = ((Struct)Native.fold(l4_$2, l5_$3, ((Func2<Object,Object, Object>)(Func2)l6_$1)));
			final Object[] l10_$9 = Native.getAllUrlParameters();
			final Func2<Struct,Struct, Object[]> l11_$8 = (Func2<Struct, Struct, Object[]>)(Struct aacc, Object[] apar) -> {
				return Module_tree.f_setTree(aacc, ((String)(apar[0])), ((String)(apar[1])));
			};
			return ((Struct)Native.fold(l10_$9, l7_localTree, ((Func2<Object,Object, Object>)(Func2)l11_$8)));
		}
	public static final boolean f_isParameterFalse(String aparam) {
			return (((aparam).equals("false")||(aparam).equals("0"))||(aparam).equals("FALSE"));
		}
	public static final boolean f_isUrlParameterTrue(String aname) {
			final Struct l3_$2 = Module_tree.f_lookupTree(Module_url_parameter.g_allUrlParameters.value, aname);
			final Func1<Boolean,String> l4_$0 = (Func1<Boolean, String>)(String aparam) -> {
				return ((Boolean)!Module_url_parameter.f_isParameterFalse(aparam));
			};
			final Func0<Boolean> l5_$1 = (Func0<Boolean>)() -> {
				return ((Boolean)false);
			};
			return ((boolean)Module_maybe.f_eitherFn(l3_$2, ((Func1<Object,Object>)(Func1)l4_$0), ((Func0<Object>)(Func0)l5_$1)));
		}
}
