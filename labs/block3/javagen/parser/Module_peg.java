// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_peg {
	public static Reference<Integer> g_lastParsing;
	public static Reference<Struct> g_parseCacheHits;
	public static Reference<Struct> g_parseCacheMisses;
	public static void init() {
		g_lastParsing=((Reference<Integer>)(new Reference((-1))));
		g_parseCacheHits=Module_inttree.f_makeIntTree();
		g_parseCacheMisses=Module_inttree.f_makeIntTree();
	}
	public static final String f_action2string(Struct aa) {
			Struct l0__tmp = aa;
			switch (l0__tmp.getTypeId()) {
			case 7/*ActionVar*/: {
				final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
				final String l2_i = l1__tmp.f_id;
				final String l3_i = l1__tmp.f_id;
				return (":"+l3_i);
			}
			case 2/*ActionCall*/: {
				final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
				final String l4_id = l1__tmp.f_id;
				final Object[] l5_args = l1__tmp.f_args;
				final String l6_id = l1__tmp.f_id;
				final Object[] l7_args = l1__tmp.f_args;
				return (((l6_id+"(")+Module_string.f_strGlue(Native.map(l7_args, ((Func1<Object,Object>)(Func1)Wrappers.w_action2string)), ", "))+")");
			}
			case 3/*ActionCallDebug*/: {
				final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
				final String l8_id = l1__tmp.f_id;
				final Object[] l9_args = l1__tmp.f_args;
				final String l10_id = l1__tmp.f_id;
				final Object[] l11_args = l1__tmp.f_args;
				return (((l10_id+"(")+Module_string.f_strGlue(Native.map(l11_args, ((Func1<Object,Object>)(Func1)Wrappers.w_action2string)), ", "))+")");
			}
			case 6/*ActionIndex*/: {
				return "#";
			}
			case 5/*ActionConstantString*/: {
				final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
				final String l12_s = l1__tmp.f_s;
				final String l13_s = l1__tmp.f_s;
				return Module_dynamic.f_toString(l13_s);
			}
			case 4/*ActionConstantInt*/: {
				final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
				final int l14_i = l1__tmp.f_i;
				final int l15_i = l1__tmp.f_i;
				return Module_string.f_i2s(l15_i);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final boolean f_canInlineProduction(Struct_Production ap) {
			boolean l3_$2;
			if ((!ap.f_caching&&(Native.length(ap.f_choices)==1))) {
				final Object[] l6_$5 = ((Struct_Seq)(ap.f_choices[0])).f_seq;
				final Func1<Boolean,Struct> l7_$4 = (Func1<Boolean, Struct>)(Struct apa) -> {
					Struct l8__tmp = apa;
					switch (l8__tmp.getTypeId()) {
					case 0/*Action*/: {
						final Struct_Action l9__tmp = (Struct_Action)l8__tmp;
						final Func1<Object,Struct_PegEnv> l10_fn = l9__tmp.f_fn;
						final Func1<Object,Struct_PegEnv> l11_fn = l9__tmp.f_fn;
						return ((Boolean)true);
					}
					case 1/*Action2*/: {
						final Struct_Action2 l9__tmp = (Struct_Action2)l8__tmp;
						final Struct l12_e = l9__tmp.f_e;
						final Struct l13_e = l9__tmp.f_e;
						return ((Boolean)true);
					}
					case 6/*ActionIndex*/: {
						return ((Boolean)true);
					}
					default: {
						return ((Boolean)false);
					}
					}
				};
				l3_$2=!Native.exists(l6_$5, ((Func1<Boolean,Object>)(Func1)l7_$4));
			} else {
				l3_$2=false;
			}
			return l3_$2;
		}
	public static final Struct f_convertNestedSequence(Struct_Production aprod, Struct apar, Reference<Integer> anextFree, Reference<Object[]> aextraProductions) {
			Struct l0__tmp = apar;
			switch (l0__tmp.getTypeId()) {
			case 106/*Rule*/: {
				final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
				final String l2_name = l1__tmp.f_name;
				final String l3_name = l1__tmp.f_name;
				return l1__tmp;
			}
			case 114/*Star*/: {
				final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
				final Struct l4_p = l1__tmp.f_p;
				final Struct l5_p = l1__tmp.f_p;
				return (new Struct_Star(Module_peg.f_convertNestedSequence(aprod, l5_p, anextFree, aextraProductions)));
			}
			case 99/*Plus*/: {
				final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
				final Struct l6_p = l1__tmp.f_p;
				final Struct l7_p = l1__tmp.f_p;
				return (new Struct_Plus(Module_peg.f_convertNestedSequence(aprod, l7_p, anextFree, aextraProductions)));
			}
			case 51/*Opt*/: {
				final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
				final Struct l8_p = l1__tmp.f_p;
				final Struct l9_p = l1__tmp.f_p;
				return (new Struct_Opt(Module_peg.f_convertNestedSequence(aprod, l9_p, anextFree, aextraProductions)));
			}
			case 47/*Negation*/: {
				final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
				final Struct l10_p = l1__tmp.f_p;
				final Struct l11_p = l1__tmp.f_p;
				return (new Struct_Negation(Module_peg.f_convertNestedSequence(aprod, l11_p, anextFree, aextraProductions)));
			}
			case 14/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l12_name = l1__tmp.f_name;
				final Struct l13_p = l1__tmp.f_v;
				final String l14_name = l1__tmp.f_name;
				final Struct l15_p = l1__tmp.f_v;
				return (new Struct_BindResult(l14_name, Module_peg.f_convertNestedSequence(aprod, l15_p, anextFree, aextraProductions)));
			}
			case 13/*BindMatched*/: {
				final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
				final String l16_name = l1__tmp.f_name;
				final Struct l17_p = l1__tmp.f_v;
				final String l18_name = l1__tmp.f_name;
				final Struct l19_p = l1__tmp.f_v;
				return (new Struct_BindMatched(l18_name, Module_peg.f_convertNestedSequence(aprod, l19_p, anextFree, aextraProductions)));
			}
			case 126/*iRule*/: {
				final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
				final int l20_i = l1__tmp.f_i;
				final int l21_i = l1__tmp.f_i;
				return l1__tmp;
			}
			case 117/*Term*/: {
				final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
				final String l22_name = l1__tmp.f_name;
				final String l23_name = l1__tmp.f_name;
				return l1__tmp;
			}
			case 15/*CharRange*/: {
				final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
				final String l24_first = l1__tmp.f_first;
				final String l25_last = l1__tmp.f_last;
				final String l26_first = l1__tmp.f_first;
				final String l27_last = l1__tmp.f_last;
				return l1__tmp;
			}
			case 45/*LingoValue*/: {
				final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
				final Object l28_v = l1__tmp.f_value;
				final Object l29_v = l1__tmp.f_value;
				return l1__tmp;
			}
			case 24/*Epsilon*/: {
				return apar;
			}
			case 0/*Action*/: {
				final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
				final Func1<Object,Struct_PegEnv> l30_fn = l1__tmp.f_fn;
				final Func1<Object,Struct_PegEnv> l31_fn = l1__tmp.f_fn;
				return l1__tmp;
			}
			case 1/*Action2*/: {
				final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
				final Struct l32_e = l1__tmp.f_e;
				final Struct l33_e = l1__tmp.f_e;
				return l1__tmp;
			}
			case 6/*ActionIndex*/: {
				return apar;
			}
			case 16/*Choices*/: {
				final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
				final Object[] l34_s = l1__tmp.f_p;
				final Object[] l35_s = l1__tmp.f_p;
				final Struct_Production l38_prod = aprod;
				final Reference<Integer> l39_nextFree = anextFree;
				final Reference<Object[]> l40_extraProductions = aextraProductions;
				final Func1<Struct,Struct> l37_$36 = (Func1<Struct, Struct>)(Struct ap) -> {
					return Module_peg.f_convertNestedSequence(l38_prod, ap, l39_nextFree, l40_extraProductions);
				};
				return (new Struct_Choices(Native.map(l35_s, ((Func1<Object,Object>)(Func1)l37_$36))));
			}
			case 109/*Seq*/: {
				final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
				final Object[] l41_s = l1__tmp.f_seq;
				final Object[] l42_s = l1__tmp.f_seq;
				final Struct_Production l45_prod = aprod;
				final Reference<Integer> l46_nextFree = anextFree;
				final Reference<Object[]> l47_extraProductions = aextraProductions;
				final Func1<Struct,Struct> l44_$43 = (Func1<Struct, Struct>)(Struct apars) -> {
					return Module_peg.f_convertNestedSequence(l45_prod, apars, l46_nextFree, l47_extraProductions);
				};
				final Object[] l48_sequence = Native.map(l42_s, ((Func1<Object,Object>)(Func1)l44_$43));
				if ((Native.length(l48_sequence)==1)) {
					return ((Struct)(l48_sequence[0]));
				} else {
					final int l49_n = ((int)anextFree.value);
					final Struct_Production l50_production = (new Struct_Production(((aprod.f_name+"$auto")+Module_string.f_i2s(l49_n)), false, ((Struct)SingletonStructs.str_PegUnknown), (new Object[] { (new Struct_Seq(l48_sequence)) })));
					aextraProductions.value = Module_array.f_arrayPush(aextraProductions.value, l50_production);
					anextFree.value = ((Integer)(l49_n+1));
					return (new Struct_iRule(l49_n));
				}
			}
			case 19/*CutUp*/: {
				final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
				final Struct l51_p = l1__tmp.f_p;
				final Struct l52_p = l1__tmp.f_p;
				return (new Struct_CutUp(Module_peg.f_convertNestedSequence(aprod, l52_p, anextFree, aextraProductions)));
			}
			case 18/*CutDown*/: {
				final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
				final Struct l53_p = l1__tmp.f_p;
				final Struct l54_p = l1__tmp.f_p;
				return (new Struct_CutDown(Module_peg.f_convertNestedSequence(aprod, l54_p, anextFree, aextraProductions)));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Object[] f_inlineParsingProductions(Struct_Grammar ag, Struct ap) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 126/*iRule*/: {
				final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
				final int l2_i = l1__tmp.f_i;
				final int l3_i = l1__tmp.f_i;
				final Struct_Production l4_pr = ((Struct_Production)(ag.f_productions[l3_i]));
				if (Module_peg.f_canInlineProduction(l4_pr)) {
					return Module_peg.f_inlineParsingSequence(ag, ((Struct_Seq)(l4_pr.f_choices[0])).f_seq);
				} else {
					return (new Object[] { l1__tmp });
				}
			}
			default: {
				return (new Object[] { ap });
			}
			}
		}
	public static final Object[] f_inlineParsingSequence(Struct_Grammar ag, Object[] as) {
			final Object[] l2_$1 = SingletonStructs.arr_empty;
			final Struct_Grammar l4_g = ag;
			final Func2<Object[],Object[], Struct> l3_$0 = (Func2<Object[], Object[], Struct>)(Object[] aacc, Struct apar) -> {
				return Native.concat(aacc, Module_peg.f_inlineParsingProductions(l4_g, apar));
			};
			return ((Object[])Native.fold(as, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
		}
	public static final Struct_Grammar f_inlineProductions(Struct_Grammar ag) {
			if (false) {
				return ag;
			} else {
				final Object[] l2_$1 = ag.f_productions;
				final Struct_Grammar l4_g = ag;
				final Func1<Struct_Production,Struct_Production> l3_$0 = (Func1<Struct_Production, Struct_Production>)(Struct_Production ap) -> {
					final String l9_$6 = ap.f_name;
					final boolean l10_$7 = ap.f_caching;
					final Struct l11_$8 = ap.f_type;
					final Object[] l12_$5 = ap.f_choices;
					final Func1<Struct_Seq,Struct_Seq> l13_$4 = (Func1<Struct_Seq, Struct_Seq>)(Struct_Seq ac) -> {
						return (new Struct_Seq(Module_peg.f_inlineParsingSequence(l4_g, ac.f_seq)));
					};
					return (new Struct_Production(l9_$6, l10_$7, l11_$8, Native.map(l12_$5, ((Func1<Object,Object>)(Func1)l13_$4))));
				};
				return (new Struct_Grammar(Native.map(l2_$1, ((Func1<Object,Object>)(Func1)l3_$0))));
			}
		}
	public static final Struct_Grammar f_processNestedSequences(Struct_Grammar ag) {
			final Reference<Integer> l0_nextFree = ((Reference<Integer>)(new Reference(Native.length(ag.f_productions))));
			final Reference<Object[]> l1_extraProductions = ((Reference<Object[]>)(new Reference(SingletonStructs.arr_empty)));
			final Object[] l4_$3 = ag.f_productions;
			final Func1<Struct_Production,Struct_Production> l5_$2 = (Func1<Struct_Production, Struct_Production>)(Struct_Production ap) -> {
				final String l11_$8 = ap.f_name;
				final boolean l12_$9 = ap.f_caching;
				final Struct l13_$10 = ap.f_type;
				final Object[] l14_$7 = ap.f_choices;
				final Func1<Struct_Seq,Struct_Seq> l15_$6 = (Func1<Struct_Seq, Struct_Seq>)(Struct_Seq ac) -> {
					final Object[] l18_$17 = ac.f_seq;
					final Func1<Struct,Struct> l19_$16 = (Func1<Struct, Struct>)(Struct apar) -> {
						return Module_peg.f_convertNestedSequence(ap, apar, l0_nextFree, l1_extraProductions);
					};
					return (new Struct_Seq(Native.map(l18_$17, ((Func1<Object,Object>)(Func1)l19_$16))));
				};
				return (new Struct_Production(l11_$8, l12_$9, l13_$10, Native.map(l14_$7, ((Func1<Object,Object>)(Func1)l15_$6))));
			};
			final Object[] l6_productions = Native.map(l4_$3, ((Func1<Object,Object>)(Func1)l5_$2));
			return (new Struct_Grammar(Native.concat(l6_productions, l1_extraProductions.value)));
		}
}
