// HASH COLLISIONS: YES
// timestamp: 1.668108779071E12

package vnemo_executor;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Wrappers {

	// Functional wrappers for methods: 7
	static Func2<Struct_Set,Struct_Set, Object> w_insertSet = Module_set::f_insertSet;
	static Func1<String,Struct> w_action2string = Module_peg::f_action2string;
	static Func1<Struct_Production,Struct_Production> w_optimizeProduction = Module_optimize_grammar::f_optimizeProduction;
	static Func1<String,Object> w_toString = Module_dynamic::f_toString;
	static Func1<Struct_Production,Struct_Production> w_renameBindingsInProduction = Module_rename_bindings::f_renameBindingsInProduction;
	static Func1<Struct_Seq,Struct_Seq> w_renameBindingsInChoice = Module_rename_bindings::f_renameBindingsInChoice;
	static Func1<String,Struct> w_val2s = Module_vnemo_executor::f_val2s;
}
