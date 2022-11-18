// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package vnemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_grammar2code {
	public static final Object[] f_choices2code(Struct_Grammar ag, Object[] achs) {
			final Struct_Grammar l2_g = ag;
			final Func1<Object[],Struct> l1_$0 = (Func1<Object[], Struct>)(Struct ac) -> {
				return Module_grammar2code.f_parsing2code(l2_g, ac);
			};
			final Object[] l3_choices = Native.map(achs, ((Func1<Object,Object>)(Func1)l1_$0));
			if ((Native.length(l3_choices)==1)) {
				return ((Object[])(l3_choices[0]));
			} else {
				final Object[] l7_$5 = Module_array.f_reverseA(l3_choices);
				final Object[] l8_$6 = (new Object[] { SingletonStructs.str_PegEnd });
				final Func2<Object[],Object[], Object[]> l9_$4 = (Func2<Object[], Object[], Object[]>)(Object[] aacc, Object[] ac) -> {
					if (FlowRuntime.compareEqual(aacc,(new Object[] { SingletonStructs.str_PegEnd }))) {
						return ac;
					} else {
						return Module_array.f_concat3((new Object[] { (new Struct_PegChoice((Native.length(ac)+2))) }), ac, Native.concat((new Object[] { (new Struct_PegCommit((Native.length(aacc)+1))) }), aacc));
					}
				};
				return ((Object[])Native.fold(l7_$5, l8_$6, ((Func2<Object,Object, Object>)(Func2)l9_$4)));
			}
		}
	public static final Struct_ShareAcc f_doSharePrefix(Object[] ap1, Object[] ap2, Struct_ShareAcc aacc, int ai1, int ai2, int al) {
		TAIL_CALL: for(;;) {
			if (((ai1<al)&&(ai2<al))) {
				final Struct l0_np1 = ((Struct)(ap1[ai1]));
				final Struct l1_np2 = ((Struct)(ap2[ai2]));
				if ((!Module_grammar2code.f_semanticParsing(l0_np1)&&!Module_grammar2code.f_semanticParsing(l1_np2))) {
					{
						final Struct_ShareAcc l2___tmp = (new Struct_ShareAcc(Module_array.f_arrayPush(aacc.f_prefix, l0_np1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
						final int l3___tmp = (ai1+1);
						final int l4___tmp = (ai2+1);
						aacc = l2___tmp;
						ai1 = l3___tmp;
						ai2 = l4___tmp;
						continue TAIL_CALL;
					}
				} else {
					if (!Module_grammar2code.f_semanticParsing(l0_np1)) {
						final String l5_name = Module_grammar2code.f_extractBindingName(l0_np1);
						final Object[] l6_rp1 = Module_grammar2code.f_renameBindings2(ap1, l5_name, ("s"+Module_string.f_strRight(l5_name, 1)));
						final Struct l7_rnp1 = ((Struct)(l6_rp1[ai1]));
						{
							final Object[] l8___tmp = l6_rp1;
							final Struct_ShareAcc l9___tmp = (new Struct_ShareAcc(Module_array.f_arrayPush(aacc.f_prefix, l7_rnp1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
							final int l10___tmp = (ai1+1);
							ap1 = l8___tmp;
							aacc = l9___tmp;
							ai1 = l10___tmp;
							continue TAIL_CALL;
						}
					} else {
						if (!Module_grammar2code.f_semanticParsing(l1_np2)) {
							final String l11_name = Module_grammar2code.f_extractBindingName(l1_np2);
							final Object[] l12_rp2 = Module_grammar2code.f_renameBindings2(ap2, l11_name, ("s"+Module_string.f_strRight(l11_name, 1)));
							final Struct l13_rnp2 = ((Struct)(l12_rp2[ai2]));
							{
								final Object[] l14___tmp = l12_rp2;
								final Struct_ShareAcc l15___tmp = (new Struct_ShareAcc(Module_array.f_arrayPush(aacc.f_prefix, l13_rnp2), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
								final int l16___tmp = (ai2+1);
								ap2 = l14___tmp;
								aacc = l15___tmp;
								ai2 = l16___tmp;
								continue TAIL_CALL;
							}
						} else {
							if (Module_grammar2code.f_sameParsing(l0_np1, l1_np2)) {
								final String l17_name1 = Module_grammar2code.f_extractBindingName(l0_np1);
								final String l18_name2 = Module_grammar2code.f_extractBindingName(l1_np2);
								final String l19_newname = ("s"+Module_string.f_strRight(l17_name1, 1));
								final Object[] l20_rp1 = Module_grammar2code.f_renameBindings2(ap1, l17_name1, l19_newname);
								final Object[] l21_rp2 = Module_grammar2code.f_renameBindings2(ap2, l18_name2, l19_newname);
								final Struct l22_rnp1 = ((Struct)(l20_rp1[ai1]));
								{
									final Object[] l23___tmp = l20_rp1;
									final Object[] l24___tmp = l21_rp2;
									final Struct_ShareAcc l25___tmp = (new Struct_ShareAcc(Module_array.f_arrayPush(aacc.f_prefix, l22_rnp1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
									final int l26___tmp = (ai1+1);
									final int l27___tmp = (ai2+1);
									ap1 = l23___tmp;
									ap2 = l24___tmp;
									aacc = l25___tmp;
									ai1 = l26___tmp;
									ai2 = l27___tmp;
									continue TAIL_CALL;
								}
							} else {
								return (new Struct_ShareAcc(aacc.f_prefix, Native.subrange(ap1, ai1, Native.length(ap1)), Native.subrange(ap2, ai2, Native.length(ap2))));
							}
						}
					}
				}
			} else {
				return (new Struct_ShareAcc(aacc.f_prefix, Native.subrange(ap1, ai1, Native.length(ap1)), Native.subrange(ap2, ai2, Native.length(ap2))));
			}
		}
		}
	public static final String f_extractBindingName(Struct ap) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 12/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l2_n = l1__tmp.f_name;
				final Struct l3_r = l1__tmp.f_v;
				final String l4_n = l1__tmp.f_name;
				final Struct l5_r = l1__tmp.f_v;
				return l4_n;
			}
			default: {
				return "";
			}
			}
		}
	public static final Struct_Pair f_grammar2code(Struct_Grammar ag) {
			final Object[] l3_$1 = ag.f_productions;
			final Struct_Pair l4_$2 = (new Struct_Pair((new Object[] { (new Struct_PegCall(2)), SingletonStructs.str_PegEnd }), Module_tree.f_makeTree()));
			final Struct_Grammar l6_g = ag;
			final Func3<Struct_Pair,Integer, Struct_Pair, Struct_Production> l5_$0 = (Func3<Struct_Pair, Integer, Struct_Pair, Struct_Production>)(Integer ai, Struct_Pair aacc, Struct_Production ap) -> {
				final Object[] l6_c = Module_grammar2code.f_production2code(l6_g, ap);
				return (new Struct_Pair(Native.concat(((Object[])aacc.f_first), l6_c), Module_tree.f_setTree(((Struct)aacc.f_second), ai, Native.length(((Object[])aacc.f_first)))));
			};
			final Struct_Pair l7_t = ((Struct_Pair)Native.foldi(l3_$1, l4_$2, ((Func3<Object,Integer, Object, Object>)(Func3)l5_$0)));
			final Object[] l8_code = Module_grammar2code.f_renumberPegcode(((Object[])l7_t.f_first), ((Struct)l7_t.f_second));
			final Struct l12_$10 = ((Struct)l7_t.f_second);
			final Struct l13_$11 = Module_tree.f_makeTree();
			final Struct_Grammar l15_g = ag;
			final Func3<Struct,Integer, Integer, Struct> l14_$9 = (Func3<Struct, Integer, Integer, Struct>)(Integer ak, Integer av, Struct aacc) -> {
				return Module_tree.f_setTree(aacc, av, ((Struct_Production)(l15_g.f_productions[((int)ak)])).f_name);
			};
			return (new Struct_Pair(l8_code, Module_tree.f_foldTree(l12_$10, l13_$11, ((Func3<Object,Object, Object, Object>)(Func3)l14_$9))));
		}
	public static final int f_mark2production(int ai) {
			return (ai-1000000);
		}
	public static final Object[] f_parsing2code(Struct_Grammar ag, Struct aparsing) {
			Struct l0__tmp = aparsing;
			switch (l0__tmp.getTypeId()) {
			case 14/*Choices*/: {
				final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
				final Object[] l2_s = l1__tmp.f_p;
				final Object[] l3_s = l1__tmp.f_p;
				return Module_grammar2code.f_choices2code(ag, l3_s);
			}
			case 11/*BindMatched*/: {
				final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
				final String l4_n = l1__tmp.f_name;
				final Struct l5_p = l1__tmp.f_v;
				final String l6_n = l1__tmp.f_name;
				final Struct l7_p = l1__tmp.f_v;
				final Object[] l8_c = Module_grammar2code.f_parsing2code(ag, l7_p);
				return Module_array.f_concat3((new Object[] { SingletonStructs.str_PegStartString }), l8_c, (new Object[] { (new Struct_PegBindString(l6_n)) }));
			}
			case 12/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l9_n = l1__tmp.f_name;
				final Struct l10_p = l1__tmp.f_v;
				final String l11_n = l1__tmp.f_name;
				final Struct l12_p = l1__tmp.f_v;
				if (FlowRuntime.compareEqual(l12_p,(new Struct_Action2(((Struct)SingletonStructs.str_ActionIndex))))) {
					return (new Object[] { (new Struct_PegBindIndex(l11_n)) });
				} else {
					final Object[] l13_c = Module_grammar2code.f_parsing2code(ag, l12_p);
					return Native.concat(l13_c, (new Object[] { (new Struct_PegBindValue(l11_n)) }));
				}
			}
			case 44/*Opt*/: {
				final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
				final Struct l14_p = l1__tmp.f_p;
				final Struct l15_p = l1__tmp.f_p;
				final Object[] l16_c = Module_grammar2code.f_surroundChoice(ag, l15_p, 1);
				return Module_array.f_concat3((new Object[] { SingletonStructs.str_PegStartCaptureList }), l16_c, (new Object[] { SingletonStructs.str_PegCaptureList }));
			}
			case 92/*Plus*/: {
				final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
				final Struct l17_p = l1__tmp.f_p;
				final Struct l18_p = l1__tmp.f_p;
				final Object[] l19_c = Module_grammar2code.f_parsing2code(ag, l18_p);
				return Module_array.f_concatA((new Object[] { (new Object[] { SingletonStructs.str_PegStartCaptureList }), l19_c, (new Object[] { (new Struct_PegChoice((Native.length(l19_c)+2))) }), l19_c, (new Object[] { (new Struct_PegCommit((-(Native.length(l19_c)+1)))), SingletonStructs.str_PegCaptureList }) }));
			}
			case 105/*Star*/: {
				final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
				final Struct l20_p = l1__tmp.f_p;
				final Struct l21_p = l1__tmp.f_p;
				final Object[] l22_c = Module_grammar2code.f_parsing2code(ag, l21_p);
				return Module_array.f_concat3((new Object[] { SingletonStructs.str_PegStartCaptureList, (new Struct_PegChoice((Native.length(l22_c)+2))) }), l22_c, (new Object[] { (new Struct_PegCommit((-(Native.length(l22_c)+1)))), SingletonStructs.str_PegCaptureList }));
			}
			case 101/*Seq*/: {
				final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
				final Object[] l23_s = l1__tmp.f_seq;
				final Object[] l24_s = l1__tmp.f_seq;
				return Module_grammar2code.f_sequence2code(ag, l24_s);
			}
			case 41/*Negation*/: {
				final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
				final Struct l25_p = l1__tmp.f_p;
				final Struct l26_p = l1__tmp.f_p;
				final Object[] l27_c = Module_grammar2code.f_parsing2code(ag, l26_p);
				return Module_array.f_concat3((new Object[] { (new Struct_PegChoice((Native.length(l27_c)+3))) }), l27_c, (new Object[] { (new Struct_PegCommit(1)), SingletonStructs.str_PegFail }));
			}
			case 18/*CutUp*/: {
				final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
				final Struct l28_p = l1__tmp.f_p;
				final Struct l29_p = l1__tmp.f_p;
				return Native.concat((new Object[] { SingletonStructs.str_PegClearCache }), Module_grammar2code.f_parsing2code(ag, l29_p));
			}
			case 17/*CutDown*/: {
				final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
				final Struct l30_p = l1__tmp.f_p;
				final Struct l31_p = l1__tmp.f_p;
				return Native.concat(Module_grammar2code.f_parsing2code(ag, l31_p), (new Object[] { SingletonStructs.str_PegClearCache }));
			}
			case 117/*iRule*/: {
				final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
				final int l32_i = l1__tmp.f_i;
				final int l33_i = l1__tmp.f_i;
				return (new Object[] { (new Struct_PegCall(Module_grammar2code.f_production2mark(l33_i))) });
			}
			case 98/*Rule*/: {
				final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
				final String l34_name = l1__tmp.f_name;
				final String l35_name = l1__tmp.f_name;
				final Object[] l39_$38 = ag.f_productions;
				final Func1<Boolean,Struct_Production> l40_$37 = (Func1<Boolean, Struct_Production>)(Struct_Production ap) -> {
					return (ap.f_name).equals(l35_name);
				};
				final int l41_i = ((int)Module_maybe.f_either(Module_array.f_findi(l39_$38, ((Func1<Boolean,Object>)(Func1)l40_$37)), (-1)));
				if ((l41_i==(-1))) {
					Module_runtime.f_println(("Unknown rule: "+l35_name));
				} else {
				}
				Struct l42_$36;
				if (((Struct_Production)(ag.f_productions[l41_i])).f_caching) {
					l42_$36=(new Struct_PegCacheCall(Module_grammar2code.f_production2mark(l41_i), l41_i));
				} else {
					l42_$36=(new Struct_PegCall(Module_grammar2code.f_production2mark(l41_i)));
				}
				return (new Object[] { l42_$36 });
			}
			case 0/*Action*/: {
				final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
				final Func1<Object,Struct_PegEnv> l43_fn = l1__tmp.f_fn;
				final Func1<Object,Struct_PegEnv> l44_fn = l1__tmp.f_fn;
				return (new Object[] { (new Struct_PegAction(l44_fn)) });
			}
			case 1/*Action2*/: {
				final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
				final Struct l45_e = l1__tmp.f_e;
				final Struct l46_e = l1__tmp.f_e;
				Struct l47_act;
				if (true) {
					Struct l48__tmp = l46_e;
					switch (l48__tmp.getTypeId()) {
					case 6/*ActionIndex*/: {
						l47_act=l46_e;
						break;
					}
					case 7/*ActionVar*/: {
						final Struct_ActionVar l49__tmp = (Struct_ActionVar)l48__tmp;
						final String l50_id = l49__tmp.f_id;
						final String l51_id = l49__tmp.f_id;
						l47_act=l49__tmp;
						break;
					}
					case 2/*ActionCall*/: {
						final Struct_ActionCall l49__tmp = (Struct_ActionCall)l48__tmp;
						final String l52_id = l49__tmp.f_id;
						final Object[] l53_args = l49__tmp.f_args;
						final String l54_id = l49__tmp.f_id;
						final Object[] l55_args = l49__tmp.f_args;
						l47_act=(new Struct_ActionCallDebug(l54_id, l55_args));
						break;
					}
					case 3/*ActionCallDebug*/: {
						final Struct_ActionCallDebug l49__tmp = (Struct_ActionCallDebug)l48__tmp;
						final String l56_id = l49__tmp.f_id;
						final Object[] l57_args = l49__tmp.f_args;
						final String l58_id = l49__tmp.f_id;
						final Object[] l59_args = l49__tmp.f_args;
						l47_act=l49__tmp;
						break;
					}
					case 5/*ActionConstantString*/: {
						final Struct_ActionConstantString l49__tmp = (Struct_ActionConstantString)l48__tmp;
						final String l60_s = l49__tmp.f_s;
						final String l61_s = l49__tmp.f_s;
						l47_act=l49__tmp;
						break;
					}
					case 4/*ActionConstantInt*/: {
						final Struct_ActionConstantInt l49__tmp = (Struct_ActionConstantInt)l48__tmp;
						final int l62_i = l49__tmp.f_i;
						final int l63_i = l49__tmp.f_i;
						l47_act=l49__tmp;
						break;
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l48__tmp.getTypeName());
					}
				} else {
					l47_act=l46_e;
				}
				return (new Object[] { (new Struct_PegAction2(l47_act)) });
			}
			case 6/*ActionIndex*/: {
				return (new Object[] { SingletonStructs.str_PegActionIndex });
			}
			case 21/*Epsilon*/: {
				return SingletonStructs.arr_empty;
			}
			case 106/*Term*/: {
				final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
				final String l64_text = l1__tmp.f_name;
				final String l65_text = l1__tmp.f_name;
				return (new Object[] { (new Struct_PegString(l65_text)) });
			}
			case 13/*CharRange*/: {
				final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
				final String l66_first = l1__tmp.f_first;
				final String l67_last = l1__tmp.f_last;
				final String l68_first = l1__tmp.f_first;
				final String l69_last = l1__tmp.f_last;
				return (new Object[] { (new Struct_PegRange(l68_first, l69_last)) });
			}
			case 40/*LingoValue*/: {
				final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
				final Object l70_v = l1__tmp.f_value;
				final Object l71_v = l1__tmp.f_value;
				return SingletonStructs.arr_empty;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object[] f_production2code(Struct_Grammar ag, Struct_Production ap) {
			final int l0_nc = Native.length(ap.f_choices);
			if ((l0_nc==0)) {
				return (new Object[] { SingletonStructs.str_PegReturn });
			} else {
				if ((l0_nc==1)) {
					final Object[] l3_$2 = ap.f_choices;
					final Struct_Grammar l5_g = ag;
					final Func1<Object[],Struct_Seq> l4_$1 = (Func1<Object[], Struct_Seq>)(Struct_Seq ac) -> {
						return Module_grammar2code.f_sequence2code(l5_g, ac.f_seq);
					};
					final Object[] l6_choices = Native.map(l3_$2, ((Func1<Object,Object>)(Func1)l4_$1));
					return Module_array.f_arrayPush(((Object[])(l6_choices[0])), SingletonStructs.str_PegReturn);
				} else {
					final Struct_ShareAcc l7_prefix = Module_grammar2code.f_sharePrefix(((Struct_Seq)(ap.f_choices[0])).f_seq, ((Struct_Seq)(ap.f_choices[1])).f_seq);
					if (((l0_nc==2)&&((Object[])l7_prefix.f_prefix).length != 0)) {
						final Object[] l8_prefixcode = Module_grammar2code.f_sequence2code(ag, l7_prefix.f_prefix);
						final Object[] l9_suffix1 = Module_grammar2code.f_sequence2code(ag, l7_prefix.f_suffix1);
						final int l10_s1 = Native.length(l9_suffix1);
						final Object[] l11_suffix2 = Module_grammar2code.f_sequence2code(ag, l7_prefix.f_suffix2);
						final int l12_s2 = Native.length(l11_suffix2);
						return Module_array.f_concatA((new Object[] { l8_prefixcode, (new Object[] { (new Struct_PegChoice((2+l10_s1))) }), l9_suffix1, (new Object[] { (new Struct_PegCommit((1+l12_s2))) }), l11_suffix2, (new Object[] { SingletonStructs.str_PegReturn }) }));
					} else {
						final Object[] l15_$14 = ap.f_choices;
						final Struct_Grammar l17_g = ag;
						final Func1<Object[],Struct_Seq> l16_$13 = (Func1<Object[], Struct_Seq>)(Struct_Seq ac) -> {
							return Module_grammar2code.f_sequence2code(l17_g, ac.f_seq);
						};
						final Object[] l18_choices = Native.map(l15_$14, ((Func1<Object,Object>)(Func1)l16_$13));
						final Object[] l22_$20 = Module_array.f_reverseA(l18_choices);
						final Object[] l23_$21 = SingletonStructs.arr_empty;
						final Func2<Object[],Object[], Object[]> l24_$19 = (Func2<Object[], Object[], Object[]>)(Object[] aacc, Object[] ac) -> {
							if (((Object[])aacc).length == 0) {
								return ac;
							} else {
								if ((Native.length(ac)==1)) {
									final Struct l25_gsymswitch0 = ((Struct)(ac[0]));
									Struct l26__tmp = l25_gsymswitch0;
									switch (l26__tmp.getTypeId()) {
									case 83/*PegString*/: {
										final Struct_PegString l27__tmp = (Struct_PegString)l26__tmp;
										final String l28_s = l27__tmp.f_x;
										final String l29_s = l27__tmp.f_x;
										return Native.concat((new Object[] { (new Struct_PegStringChoice(l29_s, (Native.length(aacc)+1))) }), aacc);
									}
									case 74/*PegRange*/: {
										final Struct_PegRange l27__tmp = (Struct_PegRange)l26__tmp;
										final String l30_low = l27__tmp.f_l;
										final String l31_up = l27__tmp.f_u;
										final String l32_low = l27__tmp.f_l;
										final String l33_up = l27__tmp.f_u;
										return Native.concat((new Object[] { (new Struct_PegRangeChoice(l32_low, l33_up, (Native.length(aacc)+1))) }), aacc);
									}
									default: {
										return Module_array.f_concat3((new Object[] { (new Struct_PegChoice((Native.length(ac)+2))) }), ac, Native.concat((new Object[] { (new Struct_PegCommit((Native.length(aacc)+1))) }), aacc));
									}
									}
								} else {
									return Module_array.f_concat3((new Object[] { (new Struct_PegChoice((Native.length(ac)+2))) }), ac, Native.concat((new Object[] { (new Struct_PegCommit((Native.length(aacc)+1))) }), aacc));
								}
							}
						};
						return Module_array.f_arrayPush(((Object[])Native.fold(l22_$20, l23_$21, ((Func2<Object,Object, Object>)(Func2)l24_$19))), SingletonStructs.str_PegReturn);
					}
				}
			}
		}
	public static final int f_production2mark(int ai) {
			return (ai+1000000);
		}
	public static final Struct f_renameBinding(Struct ap, String aname, String anewname) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 12/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l2_n = l1__tmp.f_name;
				final Struct l3_r = l1__tmp.f_v;
				final String l4_n = l1__tmp.f_name;
				final Struct l5_r = l1__tmp.f_v;
				if ((l4_n).equals(aname)) {
					return (new Struct_BindResult(anewname, Module_grammar2code.f_renameBinding(l5_r, aname, anewname)));
				} else {
					return l1__tmp;
				}
			}
			case 11/*BindMatched*/: {
				final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
				final String l6_n = l1__tmp.f_name;
				final Struct l7_r = l1__tmp.f_v;
				final String l8_n = l1__tmp.f_name;
				final Struct l9_r = l1__tmp.f_v;
				if ((l8_n).equals(aname)) {
					return (new Struct_BindMatched(anewname, Module_grammar2code.f_renameBinding(l9_r, aname, anewname)));
				} else {
					return l1__tmp;
				}
			}
			case 117/*iRule*/: {
				final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
				final int l10_i = l1__tmp.f_i;
				final int l11_i = l1__tmp.f_i;
				return l1__tmp;
			}
			case 13/*CharRange*/: {
				final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
				final String l12_f = l1__tmp.f_first;
				final String l13_l = l1__tmp.f_last;
				final String l14_f = l1__tmp.f_first;
				final String l15_l = l1__tmp.f_last;
				return l1__tmp;
			}
			case 106/*Term*/: {
				final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
				final String l16_n = l1__tmp.f_name;
				final String l17_n = l1__tmp.f_name;
				return l1__tmp;
			}
			case 6/*ActionIndex*/: {
				return ap;
			}
			case 21/*Epsilon*/: {
				return ap;
			}
			case 98/*Rule*/: {
				final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
				final String l18_m = l1__tmp.f_name;
				final String l19_m = l1__tmp.f_name;
				return l1__tmp;
			}
			case 0/*Action*/: {
				final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
				final Func1<Object,Struct_PegEnv> l20_fn = l1__tmp.f_fn;
				final Func1<Object,Struct_PegEnv> l21_fn = l1__tmp.f_fn;
				return l1__tmp;
			}
			case 101/*Seq*/: {
				final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
				final Object[] l22_seq = l1__tmp.f_seq;
				final Object[] l23_seq = l1__tmp.f_seq;
				return (new Struct_Seq(Module_grammar2code.f_renameBindings2(l23_seq, aname, anewname)));
			}
			case 14/*Choices*/: {
				final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
				final Object[] l24_seq = l1__tmp.f_p;
				final Object[] l25_seq = l1__tmp.f_p;
				return (new Struct_Choices(Module_grammar2code.f_renameBindings2(l25_seq, aname, anewname)));
			}
			case 44/*Opt*/: {
				final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
				final Struct l26_r = l1__tmp.f_p;
				final Struct l27_r = l1__tmp.f_p;
				return (new Struct_Opt(Module_grammar2code.f_renameBinding(l27_r, aname, anewname)));
			}
			case 105/*Star*/: {
				final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
				final Struct l28_r = l1__tmp.f_p;
				final Struct l29_r = l1__tmp.f_p;
				return (new Struct_Star(Module_grammar2code.f_renameBinding(l29_r, aname, anewname)));
			}
			case 92/*Plus*/: {
				final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
				final Struct l30_r = l1__tmp.f_p;
				final Struct l31_r = l1__tmp.f_p;
				return (new Struct_Plus(Module_grammar2code.f_renameBinding(l31_r, aname, anewname)));
			}
			case 41/*Negation*/: {
				final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
				final Struct l32_r = l1__tmp.f_p;
				final Struct l33_r = l1__tmp.f_p;
				return (new Struct_Negation(Module_grammar2code.f_renameBinding(l33_r, aname, anewname)));
			}
			case 18/*CutUp*/: {
				final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
				final Struct l34_r = l1__tmp.f_p;
				final Struct l35_r = l1__tmp.f_p;
				return (new Struct_CutUp(Module_grammar2code.f_renameBinding(l35_r, aname, anewname)));
			}
			case 17/*CutDown*/: {
				final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
				final Struct l36_r = l1__tmp.f_p;
				final Struct l37_r = l1__tmp.f_p;
				return (new Struct_CutDown(Module_grammar2code.f_renameBinding(l37_r, aname, anewname)));
			}
			case 1/*Action2*/: {
				final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
				final Struct l38_e = l1__tmp.f_e;
				final Struct l39_e = l1__tmp.f_e;
				return (new Struct_Action2(Module_grammar2code.f_renameBindingInAction(l39_e, aname, anewname)));
			}
			case 40/*LingoValue*/: {
				final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
				final Object l40_v = l1__tmp.f_value;
				final Object l41_v = l1__tmp.f_value;
				return l1__tmp;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_renameBindingInAction(Struct aa, String aname, String anewname) {
			Struct l0__tmp = aa;
			switch (l0__tmp.getTypeId()) {
			case 6/*ActionIndex*/: {
				return aa;
			}
			case 7/*ActionVar*/: {
				final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
				final String l2_id = l1__tmp.f_id;
				final String l3_id = l1__tmp.f_id;
				if ((l3_id).equals(aname)) {
					return (new Struct_ActionVar(anewname));
				} else {
					return l1__tmp;
				}
			}
			case 2/*ActionCall*/: {
				final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
				final String l4_id = l1__tmp.f_id;
				final Object[] l5_args = l1__tmp.f_args;
				final String l6_id = l1__tmp.f_id;
				final Object[] l7_args = l1__tmp.f_args;
				final String l10_name = aname;
				final String l11_newname = anewname;
				final Func1<Struct,Struct> l9_$8 = (Func1<Struct, Struct>)(Struct aarg) -> {
					return Module_grammar2code.f_renameBindingInAction(aarg, l10_name, l11_newname);
				};
				return (new Struct_ActionCall(l6_id, Native.map(l7_args, ((Func1<Object,Object>)(Func1)l9_$8))));
			}
			case 3/*ActionCallDebug*/: {
				final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
				final String l12_id = l1__tmp.f_id;
				final Object[] l13_args = l1__tmp.f_args;
				final String l14_id = l1__tmp.f_id;
				final Object[] l15_args = l1__tmp.f_args;
				final String l18_name = aname;
				final String l19_newname = anewname;
				final Func1<Struct,Struct> l17_$16 = (Func1<Struct, Struct>)(Struct aarg) -> {
					return Module_grammar2code.f_renameBindingInAction(aarg, l18_name, l19_newname);
				};
				return (new Struct_ActionCallDebug(l14_id, Native.map(l15_args, ((Func1<Object,Object>)(Func1)l17_$16))));
			}
			case 5/*ActionConstantString*/: {
				final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
				final String l20_s = l1__tmp.f_s;
				final String l21_s = l1__tmp.f_s;
				return l1__tmp;
			}
			case 4/*ActionConstantInt*/: {
				final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
				final int l22_s = l1__tmp.f_i;
				final int l23_s = l1__tmp.f_i;
				return l1__tmp;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object[] f_renameBindings2(Object[] as, String aname, String anewname) {
			final Object[] l2_$1 = SingletonStructs.arr_empty;
			final String l4_name = aname;
			final String l5_newname = anewname;
			final Func2<Object[],Object[], Struct> l3_$0 = (Func2<Object[], Object[], Struct>)(Object[] aacc, Struct ap) -> {
				return Module_array.f_arrayPush(aacc, Module_grammar2code.f_renameBinding(ap, l4_name, l5_newname));
			};
			return ((Object[])Native.fold(as, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
		}
	public static final Object[] f_renumberPegcode(Object[] acode, Struct aproductionAddresses) {
			final Struct l1_productionAddresses = aproductionAddresses;
			final Func1<Integer,Integer> l0_fix = (Func1<Integer, Integer>)(Integer al) -> {
				if ((((int)al)>=1000000)) {
					return ((Integer)Module_tree.f_lookupTreeDef(l1_productionAddresses, Module_grammar2code.f_mark2production(((int)al)), (-1)));
				} else {
					return al;
				}
			};
			final Func1<Struct,Struct> l3_$2 = (Func1<Struct, Struct>)(Struct ap) -> {
				Struct l4__tmp = ap;
				switch (l4__tmp.getTypeId()) {
				case 83/*PegString*/: {
					final Struct_PegString l5__tmp = (Struct_PegString)l4__tmp;
					final String l6_x = l5__tmp.f_x;
					final String l7_x = l5__tmp.f_x;
					return l5__tmp;
				}
				case 74/*PegRange*/: {
					final Struct_PegRange l5__tmp = (Struct_PegRange)l4__tmp;
					final String l8_l = l5__tmp.f_l;
					final String l9_u = l5__tmp.f_u;
					final String l10_l = l5__tmp.f_l;
					final String l11_u = l5__tmp.f_u;
					return l5__tmp;
				}
				case 73/*PegJump*/: {
					final Struct_PegJump l5__tmp = (Struct_PegJump)l4__tmp;
					final int l12_l = l5__tmp.f_l;
					final int l13_l = l5__tmp.f_l;
					return (new Struct_PegJump(((int)l0_fix.invoke(((Integer)l13_l)))));
				}
				case 62/*PegChoice*/: {
					final Struct_PegChoice l5__tmp = (Struct_PegChoice)l4__tmp;
					final int l14_l = l5__tmp.f_l;
					final int l15_l = l5__tmp.f_l;
					return (new Struct_PegChoice(((int)l0_fix.invoke(((Integer)l15_l)))));
				}
				case 84/*PegStringChoice*/: {
					final Struct_PegStringChoice l5__tmp = (Struct_PegStringChoice)l4__tmp;
					final String l16_x = l5__tmp.f_x;
					final int l17_l = l5__tmp.f_commit;
					final String l18_x = l5__tmp.f_x;
					final int l19_l = l5__tmp.f_commit;
					return (new Struct_PegStringChoice(l18_x, ((int)l0_fix.invoke(((Integer)l19_l)))));
				}
				case 75/*PegRangeChoice*/: {
					final Struct_PegRangeChoice l5__tmp = (Struct_PegRangeChoice)l4__tmp;
					final String l20_low = l5__tmp.f_l;
					final String l21_up = l5__tmp.f_u;
					final int l22_l = l5__tmp.f_commit;
					final String l23_low = l5__tmp.f_l;
					final String l24_up = l5__tmp.f_u;
					final int l25_l = l5__tmp.f_commit;
					return (new Struct_PegRangeChoice(l23_low, l24_up, ((int)l0_fix.invoke(((Integer)l25_l)))));
				}
				case 58/*PegCall*/: {
					final Struct_PegCall l5__tmp = (Struct_PegCall)l4__tmp;
					final int l26_l = l5__tmp.f_l;
					final int l27_l = l5__tmp.f_l;
					return (new Struct_PegCall(((int)l0_fix.invoke(((Integer)l27_l)))));
				}
				case 57/*PegCacheCall*/: {
					final Struct_PegCacheCall l5__tmp = (Struct_PegCacheCall)l4__tmp;
					final int l28_l = l5__tmp.f_l;
					final int l29_c = l5__tmp.f_cacheEntry;
					final int l30_l = l5__tmp.f_l;
					final int l31_c = l5__tmp.f_cacheEntry;
					return (new Struct_PegCacheCall(((int)l0_fix.invoke(((Integer)l30_l))), l31_c));
				}
				case 76/*PegReturn*/: {
					return ap;
				}
				case 67/*PegDrop*/: {
					return ap;
				}
				case 65/*PegCommit*/: {
					final Struct_PegCommit l5__tmp = (Struct_PegCommit)l4__tmp;
					final int l32_l = l5__tmp.f_l;
					final int l33_l = l5__tmp.f_l;
					return (new Struct_PegCommit(((int)l0_fix.invoke(((Integer)l33_l)))));
				}
				case 82/*PegStartString*/: {
					return ap;
				}
				case 54/*PegBindString*/: {
					final Struct_PegBindString l5__tmp = (Struct_PegBindString)l4__tmp;
					final String l34_v = l5__tmp.f_n;
					final String l35_v = l5__tmp.f_n;
					return l5__tmp;
				}
				case 81/*PegStartCaptureList*/: {
					return ap;
				}
				case 55/*PegBindValue*/: {
					final Struct_PegBindValue l5__tmp = (Struct_PegBindValue)l4__tmp;
					final String l36_v = l5__tmp.f_n;
					final String l37_v = l5__tmp.f_n;
					return l5__tmp;
				}
				case 53/*PegBindIndex*/: {
					final Struct_PegBindIndex l5__tmp = (Struct_PegBindIndex)l4__tmp;
					final String l38_v = l5__tmp.f_n;
					final String l39_v = l5__tmp.f_n;
					return l5__tmp;
				}
				case 49/*PegAction*/: {
					final Struct_PegAction l5__tmp = (Struct_PegAction)l4__tmp;
					final Func1<Object,Struct_PegEnv> l40_v = l5__tmp.f_fn;
					final Func1<Object,Struct_PegEnv> l41_v = l5__tmp.f_fn;
					return l5__tmp;
				}
				case 50/*PegAction2*/: {
					final Struct_PegAction2 l5__tmp = (Struct_PegAction2)l4__tmp;
					final Struct l42_e = l5__tmp.f_e;
					final Struct l43_e = l5__tmp.f_e;
					return l5__tmp;
				}
				case 51/*PegActionIndex*/: {
					return ap;
				}
				case 71/*PegFail*/: {
					return ap;
				}
				case 68/*PegEnd*/: {
					return ap;
				}
				case 59/*PegCaptureList*/: {
					return ap;
				}
				case 63/*PegClearCache*/: {
					return ap;
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l4__tmp.getTypeName());
				}
			};
			return Native.map(acode, ((Func1<Object,Object>)(Func1)l3_$2));
		}
	public static final boolean f_sameParsing(Struct ap1, Struct ap2) {
			return FlowRuntime.compareEqual(Module_grammar2code.f_stripBind(ap1),Module_grammar2code.f_stripBind(ap2));
		}
	public static final boolean f_semanticParsing(Struct ap) {
		TAIL_CALL: for(;;) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 12/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l2_n = l1__tmp.f_name;
				final Struct l3_r = l1__tmp.f_v;
				final String l4_n = l1__tmp.f_name;
				final Struct l5_r = l1__tmp.f_v;
				{
					final Struct l6___tmp = l5_r;
					ap = l6___tmp;
					continue TAIL_CALL;
				}
			}
			case 1/*Action2*/: {
				final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
				final Struct l7_a = l1__tmp.f_e;
				final Struct l8_a = l1__tmp.f_e;
				return ((Struct)l8_a).getTypeId() != 6;
			}
			default: {
				return true;
			}
			}
		}
		}
	public static final Object[] f_sequence2code(Struct_Grammar ag, Object[] as) {
			final Struct_Grammar l2_g = ag;
			final Func1<Object[],Struct> l1_$0 = (Func1<Object[], Struct>)(Struct ap) -> {
				return Module_array.f_arrayPush(Module_grammar2code.f_parsing2code(l2_g, ap), SingletonStructs.str_PegDrop);
			};
			final Object[] l3_ns = Module_array.f_concatA(Native.map(as, ((Func1<Object,Object>)(Func1)l1_$0)));
			return Native.subrange(l3_ns, 0, (Native.length(l3_ns)-1));
		}
	public static final Struct_ShareAcc f_sharePrefix(Object[] ap1, Object[] ap2) {
			final int l0_l = ((int)Module_runtime.f_min(Native.length(ap1), Native.length(ap2)));
			return Module_grammar2code.f_doSharePrefix(ap1, ap2, (new Struct_ShareAcc(SingletonStructs.arr_empty, SingletonStructs.arr_empty, SingletonStructs.arr_empty)), 0, 0, l0_l);
		}
	public static final Struct f_stripBind(Struct ap) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 12/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l2_n = l1__tmp.f_name;
				final Struct l3_r = l1__tmp.f_v;
				final String l4_n = l1__tmp.f_name;
				final Struct l5_r = l1__tmp.f_v;
				return l5_r;
			}
			default: {
				return ap;
			}
			}
		}
	public static final Object[] f_surroundChoice(Struct_Grammar ag, Struct ap, int acommit) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 106/*Term*/: {
				final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
				final String l2_text = l1__tmp.f_name;
				final String l3_text = l1__tmp.f_name;
				return (new Object[] { (new Struct_PegStringChoice(l3_text, acommit)) });
			}
			case 13/*CharRange*/: {
				final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
				final String l4_low = l1__tmp.f_first;
				final String l5_up = l1__tmp.f_last;
				final String l6_low = l1__tmp.f_first;
				final String l7_up = l1__tmp.f_last;
				return (new Object[] { (new Struct_PegRangeChoice(l6_low, l7_up, acommit)) });
			}
			default: {
				final Object[] l8_c = Module_grammar2code.f_parsing2code(ag, ap);
				return Module_array.f_concat3((new Object[] { (new Struct_PegChoice((Native.length(l8_c)+2))) }), l8_c, (new Object[] { (new Struct_PegCommit(acommit)) }));
			}
			}
		}
}
