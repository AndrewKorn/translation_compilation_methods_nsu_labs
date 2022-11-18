// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_driver {
	public static final Object[] f_compilePegGrammar(String agr) {
			return ((Object[])Module_driver.f_compilePegGrammar2(agr).f_first);
		}
	public static final Struct_Pair f_compilePegGrammar2(String agr) {
			final Object l0_r = Module_parsic.f_parsic(Module_lingocode.g_pegOps4Lingo, agr, Module_pegaction.g_defaultPegActions);
			final Struct_Grammar l1_g = ((Struct_Grammar)l0_r);
			final Struct_Grammar l2_renamed = Module_optimize_grammar.f_optimizeGrammar(Module_rename_bindings.f_renameBindings(Module_peg.f_inlineProductions(Module_peg.f_processNestedSequences(l1_g))));
			final Struct_Pair l3_code = Module_grammar2code.f_grammar2code(l2_renamed);
			return l3_code;
		}
}
