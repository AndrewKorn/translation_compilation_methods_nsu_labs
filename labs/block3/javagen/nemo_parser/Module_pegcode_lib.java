// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_pegcode_lib {
	public static Struct_PegVmCacheItem g_peg_fail_cache_item;
	public static void init() {
		g_peg_fail_cache_item=(new Struct_PegVmCacheItem((-1), (new Struct_RuleResult(Module_dynamic.f_flow(""), (-1), (-1), ((Struct)SingletonStructs.str_None)))));
	}
	public static final String f_captureEntry2String(Struct ap) {
			Struct l0__tmp = ap;
			switch (l0__tmp.getTypeId()) {
			case 63/*PegCaptureStartList*/: {
				return "<startlist>";
			}
			case 64/*PegCaptureStringStart*/: {
				final Struct_PegCaptureStringStart l1__tmp = (Struct_PegCaptureStringStart)l0__tmp;
				final int l2_s = l1__tmp.f_start;
				final int l3_s = l1__tmp.f_start;
				return ("stringstart:"+Module_string.f_i2s(l3_s));
			}
			case 102/*RuleResult*/: {
				final Struct_RuleResult l1__tmp = (Struct_RuleResult)l0__tmp;
				final Struct l4_result = l1__tmp.f_result;
				final Object l5___ = l1__tmp.f_input;
				final int l6___ = l1__tmp.f_pos;
				final int l7___ = l1__tmp.f_len;
				final Struct l8_result = l1__tmp.f_result;
				return Module_dynamic.f_toString(l8_result);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final String f_captureStack2String(Struct as) {
			final Func2<String,String, Struct> l1_$0 = (Func2<String, String, Struct>)(String aacc, Struct ap) -> {
				return ((aacc+" ")+Module_pegcode_lib.f_captureEntry2String(ap));
			};
			return ((String)Module_list.f_foldList(as, "", ((Func2<Object,Object, Object>)(Func2)l1_$0)));
		}
	public static final Object f_evalActionExp(Struct ae, int ai, Struct aenv, Struct afns) {
			Struct l0__tmp = ae;
			switch (l0__tmp.getTypeId()) {
			case 7/*ActionVar*/: {
				final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
				final String l2_id = l1__tmp.f_id;
				final String l3_id = l1__tmp.f_id;
				final Struct l4_v = Module_tree.f_lookupTree(aenv, l3_id);
				Struct l5__tmp = l4_v;
				switch (l5__tmp.getTypeId()) {
				case 45/*None*/: {
					return Module_dynamic.f_flow(("Unknown var: "+l3_id));
				}
				case 108/*Some*/: {
					final Struct_Some l6__tmp = (Struct_Some)l5__tmp;
					final Object l7_mv = l6__tmp.f_value;
					final Struct_RuleResult l8_mv = ((Struct_RuleResult)l6__tmp.f_value);
					return Module_maybe.f_either(l8_mv.f_result, Module_dynamic.f_flow(SingletonStructs.str_IllegalStruct));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l5__tmp.getTypeName());
				}
			}
			case 2/*ActionCall*/: {
				final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
				final String l9_id = l1__tmp.f_id;
				final Object[] l10_args = l1__tmp.f_args;
				final String l11_id = l1__tmp.f_id;
				final Object[] l12_args = l1__tmp.f_args;
				final int l15_i = ai;
				final Struct l16_env = aenv;
				final Struct l17_fns = afns;
				final Func1<Object,Struct> l14_$13 = (Func1<Object, Struct>)(Struct ace) -> {
					return Module_pegcode_lib.f_evalActionExp(ace, l15_i, l16_env, l17_fns);
				};
				final Object[] l18_vargs = Native.map(l12_args, ((Func1<Object,Object>)(Func1)l14_$13));
				final Struct l19_fn = Module_tree.f_lookupTree(afns, l11_id);
				Struct l20__tmp = l19_fn;
				switch (l20__tmp.getTypeId()) {
				case 45/*None*/: {
					return Native.makeStructValue(l11_id, l18_vargs, SingletonStructs.str_IllegalStruct);
				}
				case 108/*Some*/: {
					final Struct_Some l21__tmp = (Struct_Some)l20__tmp;
					final Object l22_v = l21__tmp.f_value;
					final Func1<Object,Object[]> l23_v = ((Func1<Object,Object[]>)l21__tmp.f_value);
					return l23_v.invoke(l18_vargs);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l20__tmp.getTypeName());
				}
			}
			case 3/*ActionCallDebug*/: {
				final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
				final String l24_id = l1__tmp.f_id;
				final Object[] l25_args = l1__tmp.f_args;
				final String l26_id = l1__tmp.f_id;
				final Object[] l27_args = l1__tmp.f_args;
				final int l30_i = ai;
				final Struct l31_env = aenv;
				final Struct l32_fns = afns;
				final Func1<Object,Struct> l29_$28 = (Func1<Object, Struct>)(Struct ace) -> {
					return Module_pegcode_lib.f_evalActionExp(ace, l30_i, l31_env, l32_fns);
				};
				final Object[] l33_vargs = Native.map(l27_args, ((Func1<Object,Object>)(Func1)l29_$28));
				final Struct l34_fn = Module_tree.f_lookupTree(afns, l26_id);
				Struct l35__tmp = l34_fn;
				switch (l35__tmp.getTypeId()) {
				case 45/*None*/: {
					final Object l37_r = Native.makeStructValue(l26_id, l33_vargs, SingletonStructs.str_IllegalStruct);
					if ((((Struct)Module_dynamic.f_flow(l37_r)).getTypeId() == 25||Module_array.f_contains(l33_vargs, SingletonStructs.str_IllegalStruct))) {
						final String l38_sargs = Module_string.f_strGlue(Native.map(l33_vargs, ((Func1<Object,Object>)(Func1)Wrappers.w_toString)), ", ");
						Module_runtime.f_println((((((("Could not make struct: "+l26_id)+"(")+l38_sargs)+") in semantic action { ")+Wrappers.w_action2string.invoke(l1__tmp))+" }"));
					} else {
					}
					return l37_r;
				}
				case 108/*Some*/: {
					final Struct_Some l36__tmp = (Struct_Some)l35__tmp;
					final Object l39_v = l36__tmp.f_value;
					final Func1<Object,Object[]> l40_v = ((Func1<Object,Object[]>)l36__tmp.f_value);
					if (Module_array.f_contains(l33_vargs, SingletonStructs.str_IllegalStruct)) {
						final String l41_sargs = Module_string.f_strGlue(Native.map(l33_vargs, ((Func1<Object,Object>)(Func1)Wrappers.w_toString)), ", ");
						Module_runtime.f_println((((((("Could not call: "+l26_id)+"(")+l41_sargs)+") in semantic action { ")+Wrappers.w_action2string.invoke(l1__tmp))+" }"));
					} else {
					}
					return l40_v.invoke(l33_vargs);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l35__tmp.getTypeName());
				}
			}
			case 6/*ActionIndex*/: {
				return Module_dynamic.f_flow(ai);
			}
			case 5/*ActionConstantString*/: {
				final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
				final String l42_s = l1__tmp.f_s;
				final String l43_s = l1__tmp.f_s;
				return Module_dynamic.f_flow(l43_s);
			}
			case 4/*ActionConstantInt*/: {
				final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
				final int l44_in = l1__tmp.f_i;
				final int l45_in = l1__tmp.f_i;
				return Module_dynamic.f_flow(l45_in);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct_Pair f_grabUntilMarker(Struct aacc, Struct alist) {
		TAIL_CALL: for(;;) {
			Struct l0__tmp = alist;
			switch (l0__tmp.getTypeId()) {
			case 21/*EmptyList*/: {
				return (new Struct_Pair(aacc, alist));
			}
			case 17/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_t = l1__tmp.f_tail;
				final Struct l4_h = ((Struct)l1__tmp.f_head);
				final Struct l5_t = l1__tmp.f_tail;
				Struct l6__tmp = l4_h;
				switch (l6__tmp.getTypeId()) {
				case 63/*PegCaptureStartList*/: {
					return (new Struct_Pair(aacc, l5_t));
				}
				default: {
					{
						final Struct l8___tmp = (new Struct_Cons(l4_h, aacc));
						final Struct l9___tmp = l5_t;
						aacc = l8___tmp;
						alist = l9___tmp;
						continue TAIL_CALL;
					}
				}
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
		}
	public static final String f_pegAddress2rule(Struct afns, int apc) {
			final Func1<Object,Object[]> l1_$0 = (Func1<Object, Object[]>)(Object[] aa) -> {
				return Module_dynamic.f_flow("");
			};
			final Func1<Object,Object[]> l2_fn = ((Func1<Object,Object[]>)Module_tree.f_lookupTreeDef(afns, "callstack", l1_$0));
			return Module_dynamic.f_flow2s(l2_fn.invoke((new Object[] { Module_dynamic.f_flow(apc) })));
		}
	public static final Struct f_pegResultFromCapture(Struct ar) {
			Struct l0__tmp = ar;
			switch (l0__tmp.getTypeId()) {
			case 21/*EmptyList*/: {
				return ((Struct)SingletonStructs.str_None);
			}
			case 17/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_tail_ = l1__tmp.f_tail;
				final Struct l4_h = ((Struct)l1__tmp.f_head);
				final Struct l5_tail_ = l1__tmp.f_tail;
				Struct l6__tmp = l4_h;
				switch (l6__tmp.getTypeId()) {
				case 102/*RuleResult*/: {
					final Struct_RuleResult l7__tmp = (Struct_RuleResult)l6__tmp;
					final Struct l8_result = l7__tmp.f_result;
					final Object l9___ = l7__tmp.f_input;
					final int l10___ = l7__tmp.f_pos;
					final int l11___ = l7__tmp.f_len;
					final Struct l12_result = l7__tmp.f_result;
					return l12_result;
				}
				default: {
					Module_runtime.f_println(Module_pegcode_lib.f_captureStack2String(l1__tmp));
					return ((Struct)SingletonStructs.str_None);
				}
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
}
