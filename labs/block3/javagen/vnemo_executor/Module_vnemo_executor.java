// HASH COLLISIONS: YES
// timestamp: 1.668108153E12

package vnemo_executor;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_vnemo_executor {
	public static final Struct_Set f_addAllGoto(Object[] agoto, Struct_MemoryState astate) {
			final Struct_Set l2_$1 = Module_vnemo_executor.f_emptyConfigurationSet();
			final Struct_MemoryState l4_state = astate;
			final Func2<Struct_Set,Struct_Set, Struct_Label> l3_$0 = (Func2<Struct_Set, Struct_Set, Struct_Label>)(Struct_Set aacc, Struct_Label alabel) -> {
				return ((Func2<Struct_Set,Struct_Set, Struct_Configuration>)(Func2)Wrappers.w_insertSet).invoke(aacc, (new Struct_Configuration(alabel.f_id, l4_state)));
			};
			return ((Struct_Set)Native.fold(agoto, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
		}
	public static final Struct_Set f_assignStatementExecute(String avar, Struct aexpr, Object[] agoto, Struct_Configuration aconfiguration) {
			final Struct l0_vMay = Module_tree.f_lookupTree(aconfiguration.f_state.f_vars, avar);
			if (Module_maybe.f_isNone(l0_vMay)) {
				Module_runtime.f_println(("Unknown var="+avar));
				return Module_vnemo_executor.f_emptyConfigurationSet();
			} else {
				final Struct l1_v = ((Struct)Module_maybe.f_either(l0_vMay, Module_vnemo_executor.f_emptyInteger()));
				final Struct l2_gsymswitch0 = Module_vnemo_executor.f_executeExpression(aexpr, aconfiguration.f_state);
				Struct l3__tmp = l2_gsymswitch0;
				switch (l3__tmp.getTypeId()) {
				case 108/*Some*/: {
					final Struct_Some l4__tmp = (Struct_Some)l3__tmp;
					final Object l5_exprVal = l4__tmp.f_value;
					final Struct l6_exprVal = ((Struct)l4__tmp.f_value);
					Struct l7__tmp = l6_exprVal;
					switch (l7__tmp.getTypeId()) {
					case 30/*Integer*/: {
						final Struct_Integer l8__tmp = (Struct_Integer)l7__tmp;
						final int l9_num = l8__tmp.f_val;
						final int l10_num = l8__tmp.f_val;
						Struct l11__tmp = l1_v;
						switch (l11__tmp.getTypeId()) {
						case 30/*Integer*/: {
							final Struct_Integer l12__tmp = (Struct_Integer)l11__tmp;
							final int l13_ign = l12__tmp.f_val;
							final int l14_ign = l12__tmp.f_val;
							final Struct_MemoryState l15_newState = (new Struct_MemoryState(Module_tree.f_setTree(aconfiguration.f_state.f_vars, avar, (new Struct_Integer(l10_num)))));
							return Module_vnemo_executor.f_addAllGoto(agoto, l15_newState);
						}
						default: {
							Module_runtime.f_println("Try assign int to array");
							return Module_vnemo_executor.f_emptyConfigurationSet();
						}
						}
					}
					case 9/*Array*/: {
						final Struct_Array l8__tmp = (Struct_Array)l7__tmp;
						final Object[] l16_arr = l8__tmp.f_arr;
						final Object[] l17_arr = l8__tmp.f_arr;
						Struct l18__tmp = l1_v;
						switch (l18__tmp.getTypeId()) {
						case 9/*Array*/: {
							final Struct_Array l19__tmp = (Struct_Array)l18__tmp;
							final Object[] l20_ign = l19__tmp.f_arr;
							final Object[] l21_ign = l19__tmp.f_arr;
							final Struct_MemoryState l22_newState = (new Struct_MemoryState(Module_tree.f_setTree(aconfiguration.f_state.f_vars, avar, (new Struct_Array(l17_arr)))));
							return Module_vnemo_executor.f_addAllGoto(agoto, l22_newState);
						}
						default: {
							Module_runtime.f_println("Try assign array to int");
							return Module_vnemo_executor.f_emptyConfigurationSet();
						}
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l7__tmp.getTypeName());
					}
				}
				case 46/*None*/: {
					return Module_vnemo_executor.f_emptyConfigurationSet();
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l3__tmp.getTypeName());
				}
			}
		}
	public static final Struct f_calcBinaryOperation(String abinaryOp, Struct aleft, Struct aright) {
			final Func3<Integer,String, Integer, Integer> l0_applyBinaryOp = (Func3<Integer, String, Integer, Integer>)(String abinOp, Integer al, Integer ar) -> {
				if ((abinOp).equals("+")) {
					return ((Integer)(((int)al)+((int)ar)));
				} else {
					if ((abinOp).equals("*")) {
						return ((Integer)(((int)al)*((int)ar)));
					} else {
						if ((abinOp).equals("-")) {
							return ((Integer)(((int)al)-((int)ar)));
						} else {
							if ((abinOp).equals("/")) {
								return ((Integer)(((int)al)/((int)ar)));
							} else {
								return ((Integer)Module_vnemo_executor.f_emptyInteger().f_val);
							}
						}
					}
				}
			};
			if ((Module_maybe.f_isNone(aleft)||Module_maybe.f_isNone(aright))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				final Struct l1_gsymswitch5 = ((Struct)Module_maybe.f_either(aleft, Module_vnemo_executor.f_emptyInteger()));
				Struct l2__tmp = l1_gsymswitch5;
				switch (l2__tmp.getTypeId()) {
				case 30/*Integer*/: {
					final Struct_Integer l3__tmp = (Struct_Integer)l2__tmp;
					final int l4_leftIntValue = l3__tmp.f_val;
					final int l5_leftIntValue = l3__tmp.f_val;
					final Struct l6_gsymswitch6 = ((Struct)Module_maybe.f_either(aright, Module_vnemo_executor.f_emptyInteger()));
					Struct l7__tmp = l6_gsymswitch6;
					switch (l7__tmp.getTypeId()) {
					case 30/*Integer*/: {
						final Struct_Integer l8__tmp = (Struct_Integer)l7__tmp;
						final int l9_rightIntValue = l8__tmp.f_val;
						final int l10_rightIntValue = l8__tmp.f_val;
						return (new Struct_Some((new Struct_Integer(((int)l0_applyBinaryOp.invoke(abinaryOp, ((Integer)l5_leftIntValue), ((Integer)l10_rightIntValue)))))));
					}
					default: {
						Module_runtime.f_println("Right operand isn't integer");
						return ((Struct)SingletonStructs.str_None);
					}
					}
				}
				default: {
					Module_runtime.f_println("Left operand isn't integer");
					return ((Struct)SingletonStructs.str_None);
				}
				}
			}
		}
	public static final Struct f_calcComparisonOperation(String acomparisonOp, Struct aleft, Struct aright) {
			final String l1_comparisonOp = acomparisonOp;
			final Func2<Boolean,Integer, Integer> l0_applyComparisonOp = (Func2<Boolean, Integer, Integer>)(Integer al, Integer ar) -> {
				if ((l1_comparisonOp).equals("==")) {
					return (((int)al)==((int)ar));
				} else {
					if ((l1_comparisonOp).equals("!=")) {
						return (((int)al)!=((int)ar));
					} else {
						if ((l1_comparisonOp).equals("<=")) {
							return (((int)al)<=((int)ar));
						} else {
							if ((l1_comparisonOp).equals(">=")) {
								return (((int)al)>=((int)ar));
							} else {
								if ((l1_comparisonOp).equals("<")) {
									return (((int)al)<((int)ar));
								} else {
									if ((l1_comparisonOp).equals(">")) {
										return (((int)al)>((int)ar));
									} else {
										return ((Boolean)false);
									}
								}
							}
						}
					}
				}
			};
			if ((Module_maybe.f_isNone(aleft)||Module_maybe.f_isNone(aright))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				final Struct l2_gsymswitch3 = ((Struct)Module_maybe.f_either(aleft, Module_vnemo_executor.f_emptyInteger()));
				Struct l3__tmp = l2_gsymswitch3;
				switch (l3__tmp.getTypeId()) {
				case 30/*Integer*/: {
					final Struct_Integer l4__tmp = (Struct_Integer)l3__tmp;
					final int l5_leftIntValue = l4__tmp.f_val;
					final int l6_leftIntValue = l4__tmp.f_val;
					final Struct l7_gsymswitch4 = ((Struct)Module_maybe.f_either(aright, Module_vnemo_executor.f_emptyInteger()));
					Struct l8__tmp = l7_gsymswitch4;
					switch (l8__tmp.getTypeId()) {
					case 30/*Integer*/: {
						final Struct_Integer l9__tmp = (Struct_Integer)l8__tmp;
						final int l10_rightIntValue = l9__tmp.f_val;
						final int l11_rightIntValue = l9__tmp.f_val;
						return (new Struct_Some(l0_applyComparisonOp.invoke(((Integer)l6_leftIntValue), ((Integer)l11_rightIntValue))));
					}
					default: {
						Module_runtime.f_println("Right operand isn't integer");
						return ((Struct)SingletonStructs.str_None);
					}
					}
				}
				default: {
					Module_runtime.f_println("Left operand isn't integer");
					return ((Struct)SingletonStructs.str_None);
				}
				}
			}
		}
	public static final Struct f_comparisonOperation(String acomparisonOp, Struct ale, Struct are, Struct_MemoryState astate) {
			return Module_vnemo_executor.f_calcComparisonOperation(acomparisonOp, Module_vnemo_executor.f_executeExpression(ale, astate), Module_vnemo_executor.f_executeExpression(are, astate));
		}
	public static final Struct_Array f_emptyArray() {
			return (new Struct_Array(SingletonStructs.arr_empty));
		}
	public static final Struct_Set f_emptyConfigurationSet() {
			return Module_set.f_makeSet();
		}
	public static final Struct_Integer f_emptyInteger() {
			return (new Struct_Integer(0));
		}
	public static final Struct f_executeExpression(Struct aexpression, Struct_MemoryState astate) {
			Struct l0__tmp = aexpression;
			switch (l0__tmp.getTypeId()) {
			case 11/*BinaryOp*/: {
				final Struct_BinaryOp l1__tmp = (Struct_BinaryOp)l0__tmp;
				final String l2_binaryOp = l1__tmp.f_op;
				final Struct l3_lExp = l1__tmp.f_e1;
				final Struct l4_rExp = l1__tmp.f_e2;
				final String l5_binaryOp = l1__tmp.f_op;
				final Struct l6_lExp = l1__tmp.f_e1;
				final Struct l7_rExp = l1__tmp.f_e2;
				return Module_vnemo_executor.f_calcBinaryOperation(l5_binaryOp, Module_vnemo_executor.f_executeExpression(l6_lExp, astate), Module_vnemo_executor.f_executeExpression(l7_rExp, astate));
			}
			case 114/*Upd*/: {
				final Struct_Upd l1__tmp = (Struct_Upd)l0__tmp;
				final Struct l8_arrayExp = l1__tmp.f_arr;
				final Struct l9_indexExp = l1__tmp.f_i;
				final Struct l10_newValueExp = l1__tmp.f_v;
				final Struct l11_arrayExp = l1__tmp.f_arr;
				final Struct l12_indexExp = l1__tmp.f_i;
				final Struct l13_newValueExp = l1__tmp.f_v;
				return Module_vnemo_executor.f_makeUpdOperation(Module_vnemo_executor.f_executeExpression(l11_arrayExp, astate), Module_vnemo_executor.f_executeExpression(l12_indexExp, astate), Module_vnemo_executor.f_executeExpression(l13_newValueExp, astate));
			}
			case 8/*App*/: {
				final Struct_App l1__tmp = (Struct_App)l0__tmp;
				final Struct l14_arrayExp = l1__tmp.f_arr;
				final Struct l15_indexExp = l1__tmp.f_i;
				final Struct l16_arrayExp = l1__tmp.f_arr;
				final Struct l17_indexExp = l1__tmp.f_i;
				return Module_vnemo_executor.f_makeAppOperation(Module_vnemo_executor.f_executeExpression(l16_arrayExp, astate), Module_vnemo_executor.f_executeExpression(l17_indexExp, astate));
			}
			case 115/*Var*/: {
				final Struct_Var l1__tmp = (Struct_Var)l0__tmp;
				final String l18_var = l1__tmp.f_v;
				final String l19_var = l1__tmp.f_v;
				return Module_tree.f_lookupTree(astate.f_vars, l19_var);
			}
			case 18/*Const*/: {
				final Struct_Const l1__tmp = (Struct_Const)l0__tmp;
				final int l20_number = l1__tmp.f_i;
				final int l21_number = l1__tmp.f_i;
				return (new Struct_Some((new Struct_Integer(l21_number))));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_Set f_executeNextStatement(Struct_VnemoProg aprogram, Struct_Configuration aconfiguration, int amaxLabel) {
			if ((aconfiguration.f_label>amaxLabel)) {
				return Module_vnemo_executor.f_emptyConfigurationSet();
			} else {
				final Struct l0_statement = ((Struct)(aprogram.f_s[aconfiguration.f_label]));
				Struct l1__tmp = l0_statement;
				switch (l1__tmp.getTypeId()) {
				case 10/*Assign*/: {
					final Struct_Assign l2__tmp = (Struct_Assign)l1__tmp;
					final int l3_label = l2__tmp.f_id;
					final String l4_var = l2__tmp.f_var;
					final Struct l5_expr = l2__tmp.f_e;
					final Object[] l6_goto = l2__tmp.f_goto;
					final int l7_label = l2__tmp.f_id;
					final String l8_var = l2__tmp.f_var;
					final Struct l9_expr = l2__tmp.f_e;
					final Object[] l10_goto = l2__tmp.f_goto;
					return Module_vnemo_executor.f_assignStatementExecute(l8_var, l9_expr, l10_goto, aconfiguration);
				}
				case 25/*IfElse*/: {
					final Struct_IfElse l2__tmp = (Struct_IfElse)l1__tmp;
					final int l11_label = l2__tmp.f_id;
					final String l12_comparisonOp = l2__tmp.f_op;
					final Struct l13_lexpr = l2__tmp.f_e1;
					final Struct l14_rexpr = l2__tmp.f_e2;
					final Object[] l15_ifGoto = l2__tmp.f_ifGoto;
					final Object[] l16_elseGoto = l2__tmp.f_elseGoto;
					final int l17_label = l2__tmp.f_id;
					final String l18_comparisonOp = l2__tmp.f_op;
					final Struct l19_lexpr = l2__tmp.f_e1;
					final Struct l20_rexpr = l2__tmp.f_e2;
					final Object[] l21_ifGoto = l2__tmp.f_ifGoto;
					final Object[] l22_elseGoto = l2__tmp.f_elseGoto;
					return Module_vnemo_executor.f_ifElseStatementExecute(l18_comparisonOp, l19_lexpr, l20_rexpr, l21_ifGoto, l22_elseGoto, aconfiguration);
				}
				case 99/*Print*/: {
					final Struct_Print l2__tmp = (Struct_Print)l1__tmp;
					final int l23_label = l2__tmp.f_id;
					final Struct l24_expr = l2__tmp.f_e;
					final Object[] l25_goto = l2__tmp.f_goto;
					final int l26_label = l2__tmp.f_id;
					final Struct l27_expr = l2__tmp.f_e;
					final Object[] l28_goto = l2__tmp.f_goto;
					return Module_vnemo_executor.f_printStatementExcecute(l27_expr, l28_goto, aconfiguration);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
				}
			}
		}
	public static final Object f_executeVnemoProg(Struct_VnemoProg aprogram) {
			final int l0_maxLabel = Module_vnemo_executor.f_findMaxLabel(aprogram.f_s);
			final Struct_Set l1_initSet = Module_set.f_buildSet((new Object[] { (new Struct_Configuration(0, Module_vnemo_executor.f_initState(aprogram.f_d))) }));
			final Func1<Boolean,Struct_Set> l2_exitPredicate = (Func1<Boolean, Struct_Set>)(Struct_Set as) -> {
				final Func1<Boolean,Struct_Configuration> l4_$3 = (Func1<Boolean, Struct_Configuration>)(Struct_Configuration aconfiguration) -> {
					return (aconfiguration.f_label<=l0_maxLabel);
				};
				return ((Boolean)Module_set.f_existsSet(as, ((Func1<Boolean,Object>)(Func1)l4_$3)));
			};
			final Struct_VnemoProg l4_program = aprogram;
			final Func1<Struct_Set,Struct_Set> l3_nextStep = (Func1<Struct_Set, Struct_Set>)(Struct_Set as) -> {
				final Struct_Set l6_$5 = Module_set.f_makeSet();
				final Func2<Struct_Set,Struct_Set, Struct_Configuration> l7_$4 = (Func2<Struct_Set, Struct_Set, Struct_Configuration>)(Struct_Set aacc, Struct_Configuration aconfiguration) -> {
					return Module_set.f_mergeSets(aacc, Module_vnemo_executor.f_executeNextStatement(l4_program, aconfiguration, l0_maxLabel));
				};
				return ((Struct_Set)Module_set.f_foldSet(as, l6_$5, ((Func2<Object,Object, Object>)(Func2)l7_$4)));
			};
			final Struct_Set l5_ignore_0 = ((Struct_Set)Native.for_(l1_initSet, ((Func1<Boolean,Object>)(Func1)l2_exitPredicate), ((Func1<Object,Object>)(Func1)l3_nextStep)));
			return null;
		}
	public static final int f_findMaxLabel(Object[] astatements) {
			final int l2_$1 = ((int)((Field_id)((Struct)(astatements[0]))).get_id());
			final Func2<Integer,Integer, Struct> l3_$0 = (Func2<Integer, Integer, Struct>)(Integer aprevMax, Struct aelem) -> {
				return ((Integer)Native.fast_max(((Field_id)aelem).get_id(), aprevMax));
			};
			return ((int)Native.fold(astatements, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
		}
	public static final Struct_Set f_ifElseStatementExecute(String acomparisonOp, Struct alExpr, Struct arExpr, Object[] aifGoto, Object[] aelseGoto, Struct_Configuration aconfiguration) {
			final Struct l0_gsymswitch1 = Module_vnemo_executor.f_comparisonOperation(acomparisonOp, alExpr, arExpr, aconfiguration.f_state);
			Struct l1__tmp = l0_gsymswitch1;
			switch (l1__tmp.getTypeId()) {
			case 108/*Some*/: {
				final Struct_Some l2__tmp = (Struct_Some)l1__tmp;
				final Object l3_isIf = l2__tmp.f_value;
				final boolean l4_isIf = ((boolean)l2__tmp.f_value);
				if (l4_isIf) {
					return Module_vnemo_executor.f_addAllGoto(aifGoto, aconfiguration.f_state);
				} else {
					return Module_vnemo_executor.f_addAllGoto(aelseGoto, aconfiguration.f_state);
				}
			}
			case 46/*None*/: {
				return Module_vnemo_executor.f_emptyConfigurationSet();
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
	public static final Struct_MemoryState f_initState(Object[] avars) {
			final Struct l2_$1 = Module_tree.f_makeTree();
			final Func2<Struct,Struct, Struct_VarDecl> l3_$0 = (Func2<Struct, Struct, Struct_VarDecl>)(Struct aacc, Struct_VarDecl avarDeclDecl) -> {
				final Struct l4_gsymswitch12 = Module_tree.f_lookupTree(aacc, avarDeclDecl.f_var);
				Struct l5__tmp = l4_gsymswitch12;
				switch (l5__tmp.getTypeId()) {
				case 108/*Some*/: {
					final Struct_Some l6__tmp = (Struct_Some)l5__tmp;
					final Object l7_ign = l6__tmp.f_value;
					final Struct l8_ign = ((Struct)l6__tmp.f_value);
					Module_runtime.f_println((("Var="+avarDeclDecl.f_var)+" already declared"));
					Module_runtime.f_assert(false, (("Var="+avarDeclDecl.f_var)+" already declared"));
					return aacc;
				}
				case 46/*None*/: {
					return Module_tree.f_setTree(aacc, avarDeclDecl.f_var, Module_vnemo_executor.f_initType(avarDeclDecl.f_type));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l5__tmp.getTypeName());
				}
			};
			return (new Struct_MemoryState(((Struct)Native.fold(avars, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)))));
		}
	public static final Struct f_initType(Struct atype) {
			Struct l0__tmp = atype;
			switch (l0__tmp.getTypeId()) {
			case 120/*bType*/: {
				final Struct_bType l1__tmp = (Struct_bType)l0__tmp;
				final String l2_s = l1__tmp.f_t;
				final String l3_s = l1__tmp.f_t;
				return Module_vnemo_executor.f_emptyInteger();
			}
			case 119/*aType*/: {
				final Struct_aType l1__tmp = (Struct_aType)l0__tmp;
				final Struct l4_a = l1__tmp.f_t;
				final Struct l5_a = l1__tmp.f_t;
				return Module_vnemo_executor.f_emptyArray();
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object f_main() {
			return Module_vnemo_executor.f_executeVnemoProg(Module_vnemo_parser.f_parseVnemo("./test.txt"));
		}
	public static final Struct f_makeAppOperation(Struct aarray, Struct aindex) {
			if ((Module_maybe.f_isNone(aarray)||Module_maybe.f_isNone(aindex))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				final Struct l0_gsymswitch7 = ((Struct)Module_maybe.f_either(aarray, Module_vnemo_executor.f_emptyArray()));
				Struct l1__tmp = l0_gsymswitch7;
				switch (l1__tmp.getTypeId()) {
				case 9/*Array*/: {
					final Struct_Array l2__tmp = (Struct_Array)l1__tmp;
					final Object[] l3_arr = l2__tmp.f_arr;
					final Object[] l4_arr = l2__tmp.f_arr;
					final Struct l5_gsymswitch8 = ((Struct)Module_maybe.f_either(aindex, Module_vnemo_executor.f_emptyInteger()));
					Struct l6__tmp = l5_gsymswitch8;
					switch (l6__tmp.getTypeId()) {
					case 30/*Integer*/: {
						final Struct_Integer l7__tmp = (Struct_Integer)l6__tmp;
						final int l8_indexValue = l7__tmp.f_val;
						final int l9_indexValue = l7__tmp.f_val;
						if (((l9_indexValue>=0)&&(l9_indexValue<Native.length(l4_arr)))) {
							return (new Struct_Some(((Struct)(l4_arr[l9_indexValue]))));
						} else {
							return ((Struct)SingletonStructs.str_None);
						}
					}
					default: {
						Module_runtime.f_println("Index is not an integer");
						return ((Struct)SingletonStructs.str_None);
					}
					}
				}
				default: {
					Module_runtime.f_println("APP working only with arrays");
					return ((Struct)SingletonStructs.str_None);
				}
				}
			}
		}
	public static final Struct f_makeUpdOperation(Struct aarray, Struct aindex, Struct anewValue) {
			if (((Module_maybe.f_isNone(aarray)||Module_maybe.f_isNone(aindex))||Module_maybe.f_isNone(anewValue))) {
				return ((Struct)SingletonStructs.str_None);
			} else {
				final Struct l0_gsymswitch9 = ((Struct)Module_maybe.f_either(anewValue, Module_vnemo_executor.f_emptyInteger()));
				Struct l1__tmp = l0_gsymswitch9;
				switch (l1__tmp.getTypeId()) {
				case 30/*Integer*/: {
					final Struct_Integer l2__tmp = (Struct_Integer)l1__tmp;
					final int l3_newV = l2__tmp.f_val;
					final int l4_newV = l2__tmp.f_val;
					final Struct l5_gsymswitch10 = ((Struct)Module_maybe.f_either(aarray, Module_vnemo_executor.f_emptyArray()));
					Struct l6__tmp = l5_gsymswitch10;
					switch (l6__tmp.getTypeId()) {
					case 9/*Array*/: {
						final Struct_Array l7__tmp = (Struct_Array)l6__tmp;
						final Object[] l8_arr = l7__tmp.f_arr;
						final Object[] l9_arr = l7__tmp.f_arr;
						final Struct l10_gsymswitch11 = ((Struct)Module_maybe.f_either(aindex, Module_vnemo_executor.f_emptyInteger()));
						Struct l11__tmp = l10_gsymswitch11;
						switch (l11__tmp.getTypeId()) {
						case 30/*Integer*/: {
							final Struct_Integer l12__tmp = (Struct_Integer)l11__tmp;
							final int l13_indexValue = l12__tmp.f_val;
							final int l14_indexValue = l12__tmp.f_val;
							if ((l14_indexValue<=Native.length(l9_arr))) {
								return (new Struct_Some((new Struct_Array(Native.replace(l9_arr, l14_indexValue, (new Struct_Integer(l4_newV)))))));
							} else {
								Module_runtime.f_println("Array index greater than array len");
								return ((Struct)SingletonStructs.str_None);
							}
						}
						default: {
							Module_runtime.f_println("Array index isn't integer");
							return ((Struct)SingletonStructs.str_None);
						}
						}
					}
					default: {
						Module_runtime.f_println("UPD working only with arrays");
						return ((Struct)SingletonStructs.str_None);
					}
					}
				}
				default: {
					Module_runtime.f_println("New value isn't integer");
					return ((Struct)SingletonStructs.str_None);
				}
				}
			}
		}
	public static final Struct_Set f_printStatementExcecute(Struct aexpr, Object[] agoto, Struct_Configuration aconfiguration) {
			final Struct l0_gsymswitch2 = Module_vnemo_executor.f_executeExpression(aexpr, aconfiguration.f_state);
			Struct l1__tmp = l0_gsymswitch2;
			switch (l1__tmp.getTypeId()) {
			case 108/*Some*/: {
				final Struct_Some l2__tmp = (Struct_Some)l1__tmp;
				final Object l3_valToPrint = l2__tmp.f_value;
				final Struct l4_valToPrint = ((Struct)l2__tmp.f_value);
				Module_runtime.f_println(Module_vnemo_executor.f_val2s(l4_valToPrint));
				return Module_vnemo_executor.f_addAllGoto(agoto, aconfiguration.f_state);
			}
			case 46/*None*/: {
				return Module_vnemo_executor.f_emptyConfigurationSet();
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
	public static final String f_val2s(Struct aval) {
			Struct l0__tmp = aval;
			switch (l0__tmp.getTypeId()) {
			case 30/*Integer*/: {
				final Struct_Integer l1__tmp = (Struct_Integer)l0__tmp;
				final int l2_n = l1__tmp.f_val;
				final int l3_n = l1__tmp.f_val;
				return Module_string.f_i2s(l3_n);
			}
			case 9/*Array*/: {
				final Struct_Array l1__tmp = (Struct_Array)l0__tmp;
				final Object[] l4_arr = l1__tmp.f_arr;
				final Object[] l5_arr = l1__tmp.f_arr;
				return (("["+Module_string.f_strGlue(Native.map(l5_arr, ((Func1<Object,Object>)(Func1)Wrappers.w_val2s)), ", "))+"]");
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
}
