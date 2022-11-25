// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_rename_bindings {
	public static final Struct_Grammar f_renameBindings(Struct_Grammar ag) {
			return (new Struct_Grammar(Native.map(ag.f_productions, ((Func1<Object,Object>)(Func1)Wrappers.w_renameBindingsInProduction))));
		}
	public static final Struct f_renameBindingsInActionExp(Struct ae, Struct arenamings) {
			Struct l0__tmp = ae;
			switch (l0__tmp.getTypeId()) {
			case 7/*ActionVar*/: {
				final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
				final String l2_v = l1__tmp.f_id;
				final String l3_v = l1__tmp.f_id;
				return (new Struct_ActionVar(((String)Module_tree.f_lookupTreeDef(arenamings, l3_v, l3_v))));
			}
			case 2/*ActionCall*/: {
				final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
				final String l4_id = l1__tmp.f_id;
				final Object[] l5_args = l1__tmp.f_args;
				final String l6_id = l1__tmp.f_id;
				final Object[] l7_args = l1__tmp.f_args;
				final Struct l10_renamings = arenamings;
				final Func1<Struct,Struct> l9_$8 = (Func1<Struct, Struct>)(Struct aa) -> {
					return Module_rename_bindings.f_renameBindingsInActionExp(aa, l10_renamings);
				};
				return (new Struct_ActionCall(l6_id, Native.map(l7_args, ((Func1<Object,Object>)(Func1)l9_$8))));
			}
			case 3/*ActionCallDebug*/: {
				final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
				final String l11_id = l1__tmp.f_id;
				final Object[] l12_args = l1__tmp.f_args;
				final String l13_id = l1__tmp.f_id;
				final Object[] l14_args = l1__tmp.f_args;
				final Struct l17_renamings = arenamings;
				final Func1<Struct,Struct> l16_$15 = (Func1<Struct, Struct>)(Struct aa) -> {
					return Module_rename_bindings.f_renameBindingsInActionExp(aa, l17_renamings);
				};
				return (new Struct_ActionCallDebug(l13_id, Native.map(l14_args, ((Func1<Object,Object>)(Func1)l16_$15))));
			}
			case 6/*ActionIndex*/: {
				return ae;
			}
			case 5/*ActionConstantString*/: {
				final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
				final String l18_s = l1__tmp.f_s;
				final String l19_s = l1__tmp.f_s;
				return l1__tmp;
			}
			case 4/*ActionConstantInt*/: {
				final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
				final int l20_i = l1__tmp.f_i;
				final int l21_i = l1__tmp.f_i;
				return l1__tmp;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_Seq f_renameBindingsInChoice(Struct_Seq ac) {
			final Object[] l3_$1 = ac.f_seq;
			final Struct_Pair l4_$2 = (new Struct_Pair(SingletonStructs.arr_empty, Module_tree.f_makeTree()));
			final Func2<Struct_Pair,Struct_Pair, Struct> l5_$0 = (Func2<Struct_Pair, Struct_Pair, Struct>)(Struct_Pair aacc, Struct ap) -> {
				final Struct_Pair l6_r = Module_rename_bindings.f_renameBindingsInParsing(ap, ((Struct)aacc.f_second));
				return (new Struct_Pair(Module_array.f_arrayPush(((Object[])aacc.f_first), l6_r.f_first), l6_r.f_second));
			};
			final Struct_Pair l6_r = ((Struct_Pair)Native.fold(l3_$1, l4_$2, ((Func2<Object,Object, Object>)(Func2)l5_$0)));
			return (new Struct_Seq(((Object[])l6_r.f_first)));
		}
	public static final Struct_Pair f_renameBindingsInParsing(Struct apar, Struct arenamings) {
			Struct l0__tmp = apar;
			switch (l0__tmp.getTypeId()) {
			case 46/*LingoValue*/: {
				final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
				final Object l2_v = l1__tmp.f_value;
				final Object l3_v = l1__tmp.f_value;
				return ((Struct_Pair)(new Struct_Pair(l1__tmp, arenamings)));
			}
			case 115/*Star*/: {
				final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
				final Struct l4_p = l1__tmp.f_p;
				final Struct l5_p = l1__tmp.f_p;
				final Struct_Pair l6_r = Module_rename_bindings.f_renameBindingsInParsing(l5_p, arenamings);
				return (new Struct_Pair((new Struct_Star(((Struct)l6_r.f_first))), l6_r.f_second));
			}
			case 100/*Plus*/: {
				final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
				final Struct l7_p = l1__tmp.f_p;
				final Struct l8_p = l1__tmp.f_p;
				final Struct_Pair l9_r = Module_rename_bindings.f_renameBindingsInParsing(l8_p, arenamings);
				return (new Struct_Pair((new Struct_Plus(((Struct)l9_r.f_first))), l9_r.f_second));
			}
			case 52/*Opt*/: {
				final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
				final Struct l10_p = l1__tmp.f_p;
				final Struct l11_p = l1__tmp.f_p;
				final Struct_Pair l12_r = Module_rename_bindings.f_renameBindingsInParsing(l11_p, arenamings);
				return (new Struct_Pair((new Struct_Opt(((Struct)l12_r.f_first))), l12_r.f_second));
			}
			case 48/*Negation*/: {
				final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
				final Struct l13_p = l1__tmp.f_p;
				final Struct l14_p = l1__tmp.f_p;
				final Struct_Pair l15_r = Module_rename_bindings.f_renameBindingsInParsing(l14_p, arenamings);
				return (new Struct_Pair((new Struct_Negation(((Struct)l15_r.f_first))), l15_r.f_second));
			}
			case 22/*CutUp*/: {
				final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
				final Struct l16_p = l1__tmp.f_p;
				final Struct l17_p = l1__tmp.f_p;
				final Struct_Pair l18_r = Module_rename_bindings.f_renameBindingsInParsing(l17_p, arenamings);
				return (new Struct_Pair((new Struct_CutUp(((Struct)l18_r.f_first))), l18_r.f_second));
			}
			case 21/*CutDown*/: {
				final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
				final Struct l19_p = l1__tmp.f_p;
				final Struct l20_p = l1__tmp.f_p;
				final Struct_Pair l21_r = Module_rename_bindings.f_renameBindingsInParsing(l20_p, arenamings);
				return (new Struct_Pair((new Struct_CutDown(((Struct)l21_r.f_first))), l21_r.f_second));
			}
			case 107/*Rule*/: {
				final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
				final String l22_n = l1__tmp.f_name;
				final String l23_n = l1__tmp.f_name;
				return (new Struct_Pair(l1__tmp, arenamings));
			}
			case 129/*iRule*/: {
				final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
				final int l24_n = l1__tmp.f_i;
				final int l25_n = l1__tmp.f_i;
				return (new Struct_Pair(l1__tmp, arenamings));
			}
			case 117/*Term*/: {
				final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
				final String l26_s = l1__tmp.f_name;
				final String l27_s = l1__tmp.f_name;
				return (new Struct_Pair(l1__tmp, arenamings));
			}
			case 15/*CharRange*/: {
				final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
				final String l28_l = l1__tmp.f_first;
				final String l29_h = l1__tmp.f_last;
				final String l30_l = l1__tmp.f_first;
				final String l31_h = l1__tmp.f_last;
				return (new Struct_Pair(l1__tmp, arenamings));
			}
			case 25/*Epsilon*/: {
				return (new Struct_Pair(apar, arenamings));
			}
			case 0/*Action*/: {
				final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
				final Func1<Object,Struct_PegEnv> l32_fn = l1__tmp.f_fn;
				final Func1<Object,Struct_PegEnv> l33_fn = l1__tmp.f_fn;
				return (new Struct_Pair(l1__tmp, arenamings));
			}
			case 1/*Action2*/: {
				final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
				final Struct l34_e = l1__tmp.f_e;
				final Struct l35_e = l1__tmp.f_e;
				return (new Struct_Pair((new Struct_Action2(Module_rename_bindings.f_renameBindingsInActionExp(l35_e, arenamings))), arenamings));
			}
			case 6/*ActionIndex*/: {
				return (new Struct_Pair(apar, arenamings));
			}
			case 14/*BindResult*/: {
				final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
				final String l36_n = l1__tmp.f_name;
				final Struct l37_p = l1__tmp.f_v;
				final String l38_n = l1__tmp.f_name;
				final Struct l39_p = l1__tmp.f_v;
				final String l40_newId = ("v"+Module_string.f_i2s(Module_tree.f_sizeTree(arenamings)));
				final Struct l41_rena = Module_tree.f_setTree(arenamings, l38_n, l40_newId);
				final Struct_Pair l42_r = Module_rename_bindings.f_renameBindingsInParsing(l39_p, l41_rena);
				return (new Struct_Pair((new Struct_BindResult(l40_newId, ((Struct)l42_r.f_first))), l42_r.f_second));
			}
			case 13/*BindMatched*/: {
				final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
				final String l43_n = l1__tmp.f_name;
				final Struct l44_p = l1__tmp.f_v;
				final String l45_n = l1__tmp.f_name;
				final Struct l46_p = l1__tmp.f_v;
				final String l47_newId = ("v"+Module_string.f_i2s(Module_tree.f_sizeTree(arenamings)));
				final Struct l48_rena = Module_tree.f_setTree(arenamings, l45_n, l47_newId);
				final Struct_Pair l49_r = Module_rename_bindings.f_renameBindingsInParsing(l46_p, l48_rena);
				return (new Struct_Pair((new Struct_BindMatched(l47_newId, ((Struct)l49_r.f_first))), l49_r.f_second));
			}
			case 110/*Seq*/: {
				final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
				final Object[] l50_s = l1__tmp.f_seq;
				final Object[] l51_s = l1__tmp.f_seq;
				final Struct_Pair l54_$53 = (new Struct_Pair(SingletonStructs.arr_empty, arenamings));
				final Func2<Struct_Pair,Struct_Pair, Struct> l55_$52 = (Func2<Struct_Pair, Struct_Pair, Struct>)(Struct_Pair aacc, Struct ap) -> {
					final Struct_Pair l56_r = Module_rename_bindings.f_renameBindingsInParsing(ap, ((Struct)aacc.f_second));
					return (new Struct_Pair(Module_array.f_arrayPush(((Object[])aacc.f_first), l56_r.f_first), l56_r.f_second));
				};
				final Struct_Pair l56_r = ((Struct_Pair)Native.fold(l51_s, l54_$53, ((Func2<Object,Object, Object>)(Func2)l55_$52)));
				return (new Struct_Pair((new Struct_Seq(((Object[])l56_r.f_first))), l56_r.f_second));
			}
			case 17/*Choices*/: {
				final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
				final Object[] l57_s = l1__tmp.f_p;
				final Object[] l58_s = l1__tmp.f_p;
				final Struct_Pair l61_$60 = (new Struct_Pair(SingletonStructs.arr_empty, arenamings));
				final Func2<Struct_Pair,Struct_Pair, Struct> l62_$59 = (Func2<Struct_Pair, Struct_Pair, Struct>)(Struct_Pair aacc, Struct ap) -> {
					final Struct_Pair l63_r = Module_rename_bindings.f_renameBindingsInParsing(ap, ((Struct)aacc.f_second));
					return (new Struct_Pair(Module_array.f_arrayPush(((Object[])aacc.f_first), l63_r.f_first), l63_r.f_second));
				};
				final Struct_Pair l63_r = ((Struct_Pair)Native.fold(l58_s, l61_$60, ((Func2<Object,Object, Object>)(Func2)l62_$59)));
				return (new Struct_Pair((new Struct_Choices(((Object[])l63_r.f_first))), l63_r.f_second));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_Production f_renameBindingsInProduction(Struct_Production ap) {
			return (new Struct_Production(ap.f_name, ap.f_caching, ap.f_type, Native.map(ap.f_choices, ((Func1<Object,Object>)(Func1)Wrappers.w_renameBindingsInChoice))));
		}
}
