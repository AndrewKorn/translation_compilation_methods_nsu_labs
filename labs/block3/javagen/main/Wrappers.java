// HASH COLLISIONS: YES
// timestamp: 1.668753222874E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Wrappers {

	// Functional wrappers for methods: 11
	static Func1<String,Struct> w_action2string = Module_peg::f_action2string;
	static Func1<Struct_Production,Struct_Production> w_optimizeProduction = Module_optimize_grammar::f_optimizeProduction;
	static Func1<String,Object> w_toString = Module_dynamic::f_toString;
	static Func1<Struct_Production,Struct_Production> w_renameBindingsInProduction = Module_rename_bindings::f_renameBindingsInProduction;
	static Func1<Struct_Seq,Struct_Seq> w_renameBindingsInChoice = Module_rename_bindings::f_renameBindingsInChoice;
	static Func1<Struct_Sequence,Object[]> w_BuildSeq = Module_nemo_parser::f_BuildSeq;
	static Func1<Struct_Choice,Object[]> w_BuildChoice = Module_nemo_parser::f_BuildChoice;
	static Func1<Struct_Choice,Object[]> w_BuildIfElse = Module_nemo_parser::f_BuildIfElse;
	static Func1<Struct_Sequence,Object[]> w_BuildWhile = Module_nemo_parser::f_BuildWhile;
	static Func1<String,Struct_Label> w_label2str = Module_translator::f_label2str;
	static Func1<String,Struct_VarDecl> w_variableDeclaration2str = Module_translator::f_variableDeclaration2str;
}
