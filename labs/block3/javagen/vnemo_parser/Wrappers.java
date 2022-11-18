// HASH COLLISIONS: YES
// timestamp: 1.6681033608E12

package vnemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Wrappers {

	// Functional wrappers for methods: 5
	static Func1<String,Struct> w_action2string = Module_peg::f_action2string;
	static Func1<Struct_Production,Struct_Production> w_optimizeProduction = Module_optimize_grammar::f_optimizeProduction;
	static Func1<String,Object> w_toString = Module_dynamic::f_toString;
	static Func1<Struct_Production,Struct_Production> w_renameBindingsInProduction = Module_rename_bindings::f_renameBindingsInProduction;
	static Func1<Struct_Seq,Struct_Seq> w_renameBindingsInChoice = Module_rename_bindings::f_renameBindingsInChoice;
}
