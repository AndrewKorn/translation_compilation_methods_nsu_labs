// HASH COLLISIONS: YES
// timestamp: 1.66871178E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_translator {
	public static final Struct_State f_assignBody2str(Struct_Var avar, Struct ae, Struct_State aprevState) {
			final int l0_gotoLabel = (aprevState.f_maxLabel+1);
			final String l1_newSrcTranslatedLine = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_AssignStatement(aprevState.f_maxLabel, avar.f_v, ae, (new Object[] { (new Struct_Label(l0_gotoLabel)) })))));
			return (new Struct_State((aprevState.f_src+l1_newSrcTranslatedLine), l0_gotoLabel, aprevState.f_maxLabel));
		}
	public static final Struct_State f_body2str(Struct abody, Struct_State aprevState) {
			Struct l0__tmp = abody;
			switch (l0__tmp.getTypeId()) {
			case 9/*Assign*/: {
				final Struct_Assign l1__tmp = (Struct_Assign)l0__tmp;
				final Struct_Var l2_var = l1__tmp.f_var;
				final Struct l3_expr = l1__tmp.f_e;
				final Struct_Var l4_var = l1__tmp.f_var;
				final Struct l5_expr = l1__tmp.f_e;
				return Module_translator.f_assignBody2str(l4_var, l5_expr, aprevState);
			}
			case 99/*Print*/: {
				final Struct_Print l1__tmp = (Struct_Print)l0__tmp;
				final Struct l6_expr = l1__tmp.f_e;
				final Struct l7_expr = l1__tmp.f_e;
				return Module_translator.f_printBody2str(l7_expr, aprevState);
			}
			case 114/*Test*/: {
				final Struct_Test l1__tmp = (Struct_Test)l0__tmp;
				final String l8_op = l1__tmp.f_op;
				final Struct l9_e1 = l1__tmp.f_e1;
				final Struct l10_e2 = l1__tmp.f_e2;
				final String l11_op = l1__tmp.f_op;
				final Struct l12_e1 = l1__tmp.f_e1;
				final Struct l13_e2 = l1__tmp.f_e2;
				return Module_translator.f_testBody2str(l11_op, l12_e1, l13_e2, aprevState);
			}
			case 107/*Sequence*/: {
				final Struct_Sequence l1__tmp = (Struct_Sequence)l0__tmp;
				final Object[] l14_operators = l1__tmp.f_b;
				final Object[] l15_operators = l1__tmp.f_b;
				final Func2<Struct_State,Struct_State, Struct> l17_$16 = (Func2<Struct_State, Struct_State, Struct>)(Struct_State acurrentState, Struct anextOperator) -> {
					return Module_translator.f_body2str(anextOperator, acurrentState);
				};
				return ((Struct_State)Native.fold(l15_operators, aprevState, ((Func2<Object,Object, Object>)(Func2)l17_$16)));
			}
			case 15/*Choice*/: {
				final Struct_Choice l1__tmp = (Struct_Choice)l0__tmp;
				final Object[] l18_operators = l1__tmp.f_b;
				final Object[] l19_operators = l1__tmp.f_b;
				return Module_translator.f_choiceBody2str(l19_operators, aprevState);
			}
			case 30/*Iter*/: {
				final Struct_Iter l1__tmp = (Struct_Iter)l0__tmp;
				final Struct l20_loopOperator = l1__tmp.f_b;
				final Struct l21_loopOperator = l1__tmp.f_b;
				return Module_translator.f_iterBody2str(l21_loopOperator, aprevState);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_State f_choiceBody2str(Object[] aoperators, Struct_State aprevState) {
			final Object[] l0_operatorsStates = Module_translator.f_splitOperators(aoperators, aprevState.f_maxLabel);
			final Func1<Integer,Struct_State> l2_$1 = (Func1<Integer, Struct_State>)(Struct_State astate) -> {
				return ((Integer)astate.f_maxLabel);
			};
			final Object[] l3_nextLabels = Native.map(l0_operatorsStates, ((Func1<Object,Object>)(Func1)l2_$1));
			final Object[] l7_$6 = (new Object[] { (aprevState.f_maxLabel+1) });
			final Object[] l8_$5 = Module_array.f_take(l3_nextLabels, (Native.length(l3_nextLabels)-1));
			final Func1<Integer,Integer> l9_$4 = (Func1<Integer, Integer>)(Integer alabel) -> {
				return ((Integer)(((int)alabel)+1));
			};
			final Object[] l10_operatorsStartLabels = Native.concat(l7_$6, Native.map(l8_$5, ((Func1<Object,Object>)(Func1)l9_$4)));
			final int l15_$12 = aprevState.f_maxLabel;
			final Struct_Const l16_$13 = (new Struct_Const(1));
			final Struct_Const l17_$14 = (new Struct_Const(1));
			final Func1<Struct_Label,Integer> l18_$11 = (Func1<Struct_Label, Integer>)(Integer aid) -> {
				return (new Struct_Label(((int)aid)));
			};
			final String l19_startChoice = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_IfElse(l15_$12, "==", l16_$13, l17_$14, Native.map(l10_operatorsStartLabels, ((Func1<Object,Object>)(Func1)l18_$11)), SingletonStructs.arr_empty))));
			final String l20_operatorsSrc = Module_translator.f_makeSrcFromChoiceOperators(l0_operatorsStates);
			return (new Struct_State(((aprevState.f_src+l19_startChoice)+l20_operatorsSrc), ((Struct_State)(l0_operatorsStates[(Native.length(l0_operatorsStates)-1)])).f_maxLabel, aprevState.f_maxLabel));
		}
	public static final String f_exp2str(Struct ae) {
			Struct l0__tmp = ae;
			switch (l0__tmp.getTypeId()) {
			case 11/*BinaryOp*/: {
				final Struct_BinaryOp l1__tmp = (Struct_BinaryOp)l0__tmp;
				final String l2_op = l1__tmp.f_op;
				final Struct l3_e1 = l1__tmp.f_e1;
				final Struct l4_e2 = l1__tmp.f_e2;
				final String l5_op = l1__tmp.f_op;
				final Struct l6_e1 = l1__tmp.f_e1;
				final Struct l7_e2 = l1__tmp.f_e2;
				return (((("("+Module_translator.f_exp2str(l6_e1))+l5_op)+Module_translator.f_exp2str(l7_e2))+")");
			}
			case 18/*Const*/: {
				final Struct_Const l1__tmp = (Struct_Const)l0__tmp;
				final int l8_v = l1__tmp.f_i;
				final int l9_v = l1__tmp.f_i;
				return Module_string.f_i2s(l9_v);
			}
			case 8/*App*/: {
				final Struct_App l1__tmp = (Struct_App)l0__tmp;
				final Struct l10_array = l1__tmp.f_arr;
				final Struct l11_index = l1__tmp.f_i;
				final Struct l12_array = l1__tmp.f_arr;
				final Struct l13_index = l1__tmp.f_i;
				return (((("app("+Module_translator.f_exp2str(l12_array))+",")+Module_translator.f_exp2str(l13_index))+")");
			}
			case 118/*Upd*/: {
				final Struct_Upd l1__tmp = (Struct_Upd)l0__tmp;
				final Struct l14_array = l1__tmp.f_arr;
				final Struct l15_index = l1__tmp.f_i;
				final Struct l16_newValue = l1__tmp.f_v;
				final Struct l17_array = l1__tmp.f_arr;
				final Struct l18_index = l1__tmp.f_i;
				final Struct l19_newValue = l1__tmp.f_v;
				return (((((("upd("+Module_translator.f_exp2str(l17_array))+",")+Module_translator.f_exp2str(l18_index))+",")+Module_translator.f_exp2str(l19_newValue))+")");
			}
			case 119/*Var*/: {
				final Struct_Var l1__tmp = (Struct_Var)l0__tmp;
				final String l20_name = l1__tmp.f_v;
				final String l21_name = l1__tmp.f_v;
				return l21_name;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_State f_iterBody2str(Struct abody, Struct_State aprevState) {
			final int l0_gotoLabel = (aprevState.f_maxLabel+1);
			final Struct_State l1_translatedBody = Module_translator.f_body2str(abody, (new Struct_State("", l0_gotoLabel, aprevState.f_maxLabel)));
			final int l2_end = l1_translatedBody.f_maxLabel;
			final int l8_$5 = aprevState.f_maxLabel;
			final Struct_Const l9_$6 = (new Struct_Const(1));
			final Struct_Const l10_$7 = (new Struct_Const(1));
			final Object[] l11_$4 = (new Object[] { l0_gotoLabel, (l2_end+1) });
			final Func1<Struct_Label,Integer> l12_$3 = (Func1<Struct_Label, Integer>)(Integer aid) -> {
				return (new Struct_Label(((int)aid)));
			};
			final String l13_startIter = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_IfElse(l8_$5, "==", l9_$6, l10_$7, Native.map(l11_$4, ((Func1<Object,Object>)(Func1)l12_$3)), SingletonStructs.arr_empty))));
			final Struct_Const l18_$16 = (new Struct_Const(1));
			final Struct_Const l19_$17 = (new Struct_Const(1));
			final Object[] l20_$15 = (new Object[] { aprevState.f_maxLabel });
			final Func1<Struct_Label,Integer> l21_$14 = (Func1<Struct_Label, Integer>)(Integer aid) -> {
				return (new Struct_Label(((int)aid)));
			};
			final String l22_backToStart = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_IfElse(l2_end, "==", l18_$16, l19_$17, Native.map(l20_$15, ((Func1<Object,Object>)(Func1)l21_$14)), SingletonStructs.arr_empty))));
			return (new Struct_State((((aprevState.f_src+l13_startIter)+l1_translatedBody.f_src)+l22_backToStart), (l2_end+1), aprevState.f_maxLabel));
		}
	public static final String f_label2str(Struct_Label alabel) {
			return Module_string.f_i2s(alabel.f_id);
		}
	public static final String f_makeLine(String astr) {
			return (astr+"\n");
		}
	public static final String f_makeSrcFromChoiceOperators(Object[] aoperatorsStates) {
			final Struct_State l0_lastOperatorState = ((Struct_State)(aoperatorsStates[(Native.length(aoperatorsStates)-1)]));
			final int l1_end = l0_lastOperatorState.f_maxLabel;
			final Object[] l4_$3 = Module_array.f_take(aoperatorsStates, (Native.length(aoperatorsStates)-1));
			final Func1<String,Struct_State> l5_$2 = (Func1<String, Struct_State>)(Struct_State astate) -> {
				final String l12_$11 = astate.f_src;
				final int l13_$8 = astate.f_maxLabel;
				final Struct_Const l14_$9 = (new Struct_Const(1));
				final Struct_Const l15_$10 = (new Struct_Const(1));
				final Object[] l16_$7 = (new Object[] { l1_end });
				final Func1<Struct_Label,Integer> l17_$6 = (Func1<Struct_Label, Integer>)(Integer aid) -> {
					return (new Struct_Label(((int)aid)));
				};
				return (l12_$11+Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_IfElse(l13_$8, "==", l14_$9, l15_$10, Native.map(l16_$7, ((Func1<Object,Object>)(Func1)l17_$6)), SingletonStructs.arr_empty)))));
			};
			return (Module_string.f_concatStrings(Native.map(l4_$3, ((Func1<Object,Object>)(Func1)l5_$2)))+l0_lastOperatorState.f_src);
		}
	public static final Struct_State f_printBody2str(Struct ae, Struct_State aprevState) {
			final int l0_gotoLabel = (aprevState.f_maxLabel+1);
			final String l1_newSrcTranslatedLine = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_PrintStatement(aprevState.f_maxLabel, ae, (new Object[] { (new Struct_Label(l0_gotoLabel)) })))));
			return (new Struct_State((aprevState.f_src+l1_newSrcTranslatedLine), l0_gotoLabel, aprevState.f_maxLabel));
		}
	public static final Object[] f_splitOperators(Object[] aoperators, int aprevLabel) {
			final Object[] l3_$1 = Module_array.f_tail(aoperators);
			final Object[] l4_$2 = (new Object[] { Module_translator.f_body2str(((Struct)(aoperators[0])), (new Struct_State("", (aprevLabel+1), aprevLabel))) });
			final Func2<Object[],Object[], Struct> l5_$0 = (Func2<Object[], Object[], Struct>)(Object[] aacc, Struct anextOperator) -> {
				return Native.concat(aacc, (new Object[] { Module_translator.f_body2str(anextOperator, (new Struct_State("", (((Struct_State)(aacc[(Native.length(aacc)-1)])).f_maxLabel+1), ((Struct_State)(aacc[(Native.length(aacc)-1)])).f_maxLabel))) }));
			};
			return ((Object[])Native.fold(l3_$1, l4_$2, ((Func2<Object,Object, Object>)(Func2)l5_$0)));
		}
	public static final String f_statement2str(Struct as) {
			Struct l0__tmp = as;
			switch (l0__tmp.getTypeId()) {
			case 10/*AssignStatement*/: {
				final Struct_AssignStatement l1__tmp = (Struct_AssignStatement)l0__tmp;
				final int l2_label = l1__tmp.f_id;
				final String l3_var = l1__tmp.f_var;
				final Struct l4_e = l1__tmp.f_e;
				final Object[] l5_goto = l1__tmp.f_goto;
				final int l6_label = l1__tmp.f_id;
				final String l7_var = l1__tmp.f_var;
				final Struct l8_e = l1__tmp.f_e;
				final Object[] l9_goto = l1__tmp.f_goto;
				return (((((((Module_string.f_i2s(l6_label)+": ")+l7_var)+" := ")+Module_translator.f_exp2str(l8_e))+" goto {")+Module_string.f_strGlue(Native.map(l9_goto, ((Func1<Object,Object>)(Func1)Wrappers.w_label2str)), ", "))+"}");
			}
			case 25/*IfElse*/: {
				final Struct_IfElse l1__tmp = (Struct_IfElse)l0__tmp;
				final int l10_label = l1__tmp.f_id;
				final String l11_op = l1__tmp.f_op;
				final Struct l12_e1 = l1__tmp.f_e1;
				final Struct l13_e2 = l1__tmp.f_e2;
				final Object[] l14_ifGoto = l1__tmp.f_ifGoto;
				final Object[] l15_elseGoto = l1__tmp.f_elseGoto;
				final int l16_label = l1__tmp.f_id;
				final String l17_op = l1__tmp.f_op;
				final Struct l18_e1 = l1__tmp.f_e1;
				final Struct l19_e2 = l1__tmp.f_e2;
				final Object[] l20_ifGoto = l1__tmp.f_ifGoto;
				final Object[] l21_elseGoto = l1__tmp.f_elseGoto;
				return ((((((((((((((Module_string.f_i2s(l16_label)+": ")+"if ")+Module_translator.f_exp2str(l18_e1))+" ")+l17_op)+" ")+Module_translator.f_exp2str(l19_e2))+" ")+"then {")+Module_string.f_strGlue(Native.map(l20_ifGoto, ((Func1<Object,Object>)(Func1)Wrappers.w_label2str)), ","))+"} else ")+"{")+Module_string.f_strGlue(Native.map(l21_elseGoto, ((Func1<Object,Object>)(Func1)Wrappers.w_label2str)), ","))+"}");
			}
			case 100/*PrintStatement*/: {
				final Struct_PrintStatement l1__tmp = (Struct_PrintStatement)l0__tmp;
				final int l22_label = l1__tmp.f_id;
				final Struct l23_expr = l1__tmp.f_e;
				final Object[] l24_goto = l1__tmp.f_goto;
				final int l25_label = l1__tmp.f_id;
				final Struct l26_expr = l1__tmp.f_e;
				final Object[] l27_goto = l1__tmp.f_goto;
				return (((((Module_string.f_i2s(l25_label)+": print(")+Module_translator.f_exp2str(l26_expr))+")  goto {")+Module_string.f_strGlue(Native.map(l27_goto, ((Func1<Object,Object>)(Func1)Wrappers.w_label2str)), " "))+"}");
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_State f_testBody2str(String aop, Struct ae1, Struct ae2, Struct_State aprevState) {
			final int l0_gotoLabel = (aprevState.f_maxLabel+1);
			final String l1_newSrcTranslatedLine = Module_translator.f_makeLine(Module_translator.f_statement2str((new Struct_IfElse(aprevState.f_maxLabel, aop, ae1, ae2, (new Object[] { (new Struct_Label(l0_gotoLabel)) }), SingletonStructs.arr_empty))));
			return (new Struct_State((aprevState.f_src+l1_newSrcTranslatedLine), l0_gotoLabel, aprevState.f_maxLabel));
		}
	public static final Struct_State f_translateDeclarations(Object[] adecls) {
			return (new Struct_State(Module_translator.f_makeLine(Module_translator.f_variablesDeclarations2str(adecls)), 0, (-1)));
		}
	public static final String f_translateNemoProgram(Struct_NemoProg aprogram) {
			return Module_translator.f_body2str(aprogram.f_body, Module_translator.f_translateDeclarations(aprogram.f_decl)).f_src;
		}
	public static final String f_type2str(Struct atype) {
			Struct l0__tmp = atype;
			switch (l0__tmp.getTypeId()) {
			case 124/*bType*/: {
				final Struct_bType l1__tmp = (Struct_bType)l0__tmp;
				final String l2_t = l1__tmp.f_t;
				final String l3_t = l1__tmp.f_t;
				return "int";
			}
			case 123/*aType*/: {
				final Struct_aType l1__tmp = (Struct_aType)l0__tmp;
				final Struct l4_arrtype = l1__tmp.f_t;
				final Struct l5_arrtype = l1__tmp.f_t;
				return (("["+Module_translator.f_type2str(l5_arrtype))+"]");
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final String f_variableDeclaration2str(Struct_VarDecl aoneDecl) {
			return (((("var "+aoneDecl.f_var)+" : ")+Module_translator.f_type2str(aoneDecl.f_type))+";");
		}
	public static final String f_variablesDeclarations2str(Object[] avarDeclarations) {
			return Module_string.f_strGlue(Native.map(avarDeclarations, ((Func1<Object,Object>)(Func1)Wrappers.w_variableDeclaration2str)), "\n");
		}
}
