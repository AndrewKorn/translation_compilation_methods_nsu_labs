// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package vnemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_parsic {
	public static final Object f_parsic(Object[] aop, String atext, Struct_SemanticActions aactions) {
			final Struct_ParseResult l0_result = Module_pegcode.f_runPeg(atext, aop, Module_tree.f_makeTree(), aactions);
			if ((l0_result.f_pos<0)) {
				Module_runtime.f_println((("SYNTAX ERROR <0: \""+Module_string.f_strLeft(atext, 130))+"...\""));
			} else {
				if ((l0_result.f_pos<Native.strlen(atext))) {
					Module_runtime.f_println((("SYNTAX ERROR AT : \""+Native.substring(atext, l0_result.f_pos, 130))+"...\""));
				} else {
				}
			}
			return Module_dynamic.f_flow(Module_maybe.f_either(l0_result.f_result, Module_dynamic.f_flow("PARSING FAILED")));
		}
}
