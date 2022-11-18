// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package vnemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_pegcode {
	public static Reference<Struct> g_profilePcs;
	public static void init() {
		g_profilePcs=((Reference<Struct>)(new Reference(Module_tree.f_makeTree())));
	}
	public static final String f_pegcode2string(int apc, Struct ac, Func1<String,Integer> afn) {
			Struct l0__tmp = ac;
			switch (l0__tmp.getTypeId()) {
			case 84/*PegStringChoice*/: {
				final Struct_PegStringChoice l1__tmp = (Struct_PegStringChoice)l0__tmp;
				final String l2_x = l1__tmp.f_x;
				final int l3_d = l1__tmp.f_commit;
				final String l4_x = l1__tmp.f_x;
				final int l5_d = l1__tmp.f_commit;
				return (((((("PegStringChoice("+((Func1<String,String>)(Func1)Wrappers.w_toString).invoke(l4_x))+", ")+Module_string.f_i2s(l5_d))+" -> ")+Module_string.f_i2s((apc+l5_d)))+")");
			}
			case 75/*PegRangeChoice*/: {
				final Struct_PegRangeChoice l1__tmp = (Struct_PegRangeChoice)l0__tmp;
				final String l6_low = l1__tmp.f_l;
				final String l7_up = l1__tmp.f_u;
				final int l8_d = l1__tmp.f_commit;
				final String l9_low = l1__tmp.f_l;
				final String l10_up = l1__tmp.f_u;
				final int l11_d = l1__tmp.f_commit;
				return (((((((("PegRangeChoice("+((Func1<String,String>)(Func1)Wrappers.w_toString).invoke(l9_low))+", ")+((Func1<String,String>)(Func1)Wrappers.w_toString).invoke(l10_up))+", ")+Module_string.f_i2s(l11_d))+" -> ")+Module_string.f_i2s((apc+l11_d)))+")");
			}
			case 62/*PegChoice*/: {
				final Struct_PegChoice l1__tmp = (Struct_PegChoice)l0__tmp;
				final int l12_d = l1__tmp.f_l;
				final int l13_d = l1__tmp.f_l;
				return (((("PegChoice(+"+Module_string.f_i2s(l13_d))+" -> ")+Module_string.f_i2s((apc+l13_d)))+")");
			}
			case 65/*PegCommit*/: {
				final Struct_PegCommit l1__tmp = (Struct_PegCommit)l0__tmp;
				final int l14_d = l1__tmp.f_l;
				final int l15_d = l1__tmp.f_l;
				return (((("PegCommit(+"+Module_string.f_i2s(l15_d))+" -> ")+Module_string.f_i2s((apc+l15_d)))+")");
			}
			case 58/*PegCall*/: {
				final Struct_PegCall l1__tmp = (Struct_PegCall)l0__tmp;
				final int l16_d = l1__tmp.f_l;
				final int l17_d = l1__tmp.f_l;
				return (((("PegCall("+Module_string.f_i2s(l17_d))+" : ")+afn.invoke(((Integer)l17_d)))+")");
			}
			case 57/*PegCacheCall*/: {
				final Struct_PegCacheCall l1__tmp = (Struct_PegCacheCall)l0__tmp;
				final int l18_d = l1__tmp.f_l;
				final int l19_ce = l1__tmp.f_cacheEntry;
				final int l20_d = l1__tmp.f_l;
				final int l21_ce = l1__tmp.f_cacheEntry;
				return (((((("PegCacheCall("+Module_string.f_i2s(l20_d))+" : ")+afn.invoke(((Integer)l20_d)))+",")+Module_string.f_i2s(l21_ce))+")");
			}
			default: {
				return ((Func1<String,Struct>)(Func1)Wrappers.w_toString).invoke(ac);
			}
			}
		}
	public static final Object f_printPegcode(Object[] aop, Struct adebug) {
			final Struct l1_debug = adebug;
			final Func1<String,Integer> l0_fn = (Func1<String, Integer>)(Integer apc) -> {
				final Func3<String,Integer, String, String> l2_$1 = (Func3<String, Integer, String, String>)(Integer ak, String av, String aacc) -> {
					if ((((int)apc)>=((int)ak))) {
						return av;
					} else {
						return aacc;
					}
				};
				return ((String)Module_tree.f_foldTree(l1_debug, "", ((Func3<Object,Object, Object, Object>)(Func3)l2_$1)));
			};
			final Struct l4_$3 = Module_tree.f_makeTree();
			final Func3<Struct,Integer, Struct, Struct> l5_$2 = (Func3<Struct, Integer, Struct, Struct>)(Integer ai, Struct aacc, Struct ac) -> {
				final String l6_fun = l0_fn.invoke(ai);
				final int l7_prof = ((int)Module_tree.f_lookupTreeDef(Module_pegcode.g_profilePcs.value, ai, 0));
				return Module_tree.f_setTree(aacc, l6_fun, (((int)Module_tree.f_lookupTreeDef(aacc, l6_fun, 0))+l7_prof));
			};
			final Struct l6_perFn = ((Struct)Native.foldi(aop, l4_$3, ((Func3<Object,Integer, Object, Object>)(Func3)l5_$2)));
			final int l7_total = Module_math.f_sum(Module_tree.f_getTreeValues(Module_pegcode.g_profilePcs.value));
			if ((l7_total!=0)) {
				Module_runtime.f_println("Instructions per rule");
				final Func2<Object,String, Integer> l9_$8 = (Func2<Object, String, Integer>)(String ak, Integer av) -> {
					if ((((int)av)>0)) {
						return Module_runtime.f_println((((((ak+": ")+Module_string.f_i2s(((int)av)))+" ")+Module_stringmath.f_d2st(((100.0*Module_math.f_i2d(((int)av)))/Module_math.f_i2d(l7_total)), 1))+"%"));
					} else {
						return null;
					}
				};
				Module_tree.f_traverseInOrder(l6_perFn, ((Func2<Object,Object, Object>)(Func2)l9_$8));
				final Struct l12_$11 = Module_tree.f_makeTree();
				final Func3<Struct,Integer, Struct, Struct> l13_$10 = (Func3<Struct, Integer, Struct, Struct>)(Integer ai, Struct aacc, Struct ac) -> {
					final int l14_prof = ((int)Module_tree.f_lookupTreeDef(Module_pegcode.g_profilePcs.value, ai, 0));
					return Module_tree.f_setTree(aacc, ((Struct)ac).getTypeName(), (((int)Module_tree.f_lookupTreeDef(aacc, ((Struct)ac).getTypeName(), 0))+l14_prof));
				};
				final Struct l14_perOpcode = ((Struct)Native.foldi(aop, l12_$11, ((Func3<Object,Integer, Object, Object>)(Func3)l13_$10)));
				Module_runtime.f_println(("\nInstructions per opcode. Total: "+Module_string.f_i2s(l7_total)));
				final Func2<Object,String, Integer> l16_$15 = (Func2<Object, String, Integer>)(String ak, Integer av) -> {
					if ((((int)av)>0)) {
						return Module_runtime.f_println((((((ak+": ")+Module_string.f_i2s(((int)av)))+" ")+Module_stringmath.f_d2st(((100.0*Module_math.f_i2d(((int)av)))/Module_math.f_i2d(l7_total)), 1))+"%"));
					} else {
						return null;
					}
				};
				Module_tree.f_traverseInOrder(l14_perOpcode, ((Func2<Object,Object, Object>)(Func2)l16_$15));
			} else {
			}
			final Func3<String,Integer, String, Struct> l18_$17 = (Func3<String, Integer, String, Struct>)(Integer ai, String aacc, Struct ac) -> {
				final int l19_prof = ((int)Module_tree.f_lookupTreeDef(Module_pegcode.g_profilePcs.value, ai, 0));
				return ((((((aacc+Module_string.f_i2s(((int)ai)))+" ")+l0_fn.invoke(ai))+":")+Module_pegcode.f_pegcode2string(((int)ai), ac, l0_fn))+((l7_total!=0)?((" "+Module_string.f_i2s(l19_prof))+" visits\n"):"\n"));
			};
			return Module_runtime.f_println(Native.foldi(aop, "", ((Func3<Object,Integer, Object, Object>)(Func3)l18_$17)));
		}
	public static final Struct_ParseResult f_runPeg(String ainput, Object[] aprogram, Struct adebug, Struct_SemanticActions afunctions) {
			final Struct l2_$1 = afunctions.f_t;
			final Struct l4_debug = adebug;
			final Func1<Object,Object[]> l3_$0 = (Func1<Object, Object[]>)(Object[] aargs) -> {
				final int l4_pc = Module_dynamic.f_flow2i(((Object)(aargs[0])));
				final Func3<String,Integer, String, String> l6_$5 = (Func3<String, Integer, String, String>)(Integer ak, String av, String aacc) -> {
					if ((l4_pc>=((int)ak))) {
						return av;
					} else {
						return aacc;
					}
				};
				return Module_dynamic.f_flow(Module_tree.f_foldTree(l4_debug, "", ((Func3<Object,Object, Object, Object>)(Func3)l6_$5)));
			};
			final Struct l5_t = Module_tree.f_setTree(l2_$1, "callstack", l3_$0);
			final Func2<Integer,Integer, Struct> l7_$6 = (Func2<Integer, Integer, Struct>)(Integer aacc, Struct aop) -> {
				Struct l8__tmp = aop;
				switch (l8__tmp.getTypeId()) {
				case 57/*PegCacheCall*/: {
					final Struct_PegCacheCall l9__tmp = (Struct_PegCacheCall)l8__tmp;
					final int l10_l = l9__tmp.f_l;
					final int l11_c = l9__tmp.f_cacheEntry;
					final int l12_l = l9__tmp.f_l;
					final int l13_c = l9__tmp.f_cacheEntry;
					return ((Integer)Native.fast_max(aacc, l13_c));
				}
				default: {
					return aacc;
				}
				}
			};
			final int l8_cacheSize = ((int)Native.fold(aprogram, 0, ((Func2<Object,Object, Object>)(Func2)l7_$6)));
			final int l11_$10 = (l8_cacheSize+1);
			final Func1<Reference<Struct>,Integer> l12_$9 = (Func1<Reference<Struct>, Integer>)(Integer ai) -> {
				return Module_inttree.f_makeIntTree();
			};
			final Struct_PegVmCache l13_cache = (new Struct_PegVmCache(Module_runtime.f_generate(0, l11_$10, ((Func1<Object,Integer>)(Func1)l12_$9))));
			Module_peg.g_parseCacheHits.value = Module_inttree.f_makeIntTree().value;
			Module_peg.g_parseCacheMisses.value = Module_inttree.f_makeIntTree().value;
			final Struct_RuleResult l14_drv = (new Struct_RuleResult(Module_dynamic.f_flow(ainput), 0, 0, ((Struct)SingletonStructs.str_None)));
			final Struct_PegCodeConst l15_pca = (new Struct_PegCodeConst(ainput, aprogram, l5_t, l13_cache, l14_drv));
			final Struct_ParseResult l16_r = Module_pegcode.f_whilePeg(l15_pca, 0, 0, Module_list.f_makeList(), Module_list.f_makeList(), (new Struct_Cons(Module_tree.f_makeTree(), ((Struct)SingletonStructs.str_EmptyList))));
			if ((false&&(!FlowRuntime.compareEqual(adebug,Module_tree.f_makeTree())))) {
				Module_pegcode.f_printPegcode(aprogram, adebug);
			} else {
			}
			if ((l16_r.f_pos<Native.strlen(ainput))) {
				final Object[] l20_$18 = l15_pca.f_cache.f_caches;
				final int l21_$19 = l16_r.f_pos;
				final Func2<Integer,Integer, Reference<Struct>> l22_$17 = (Func2<Integer, Integer, Reference<Struct>>)(Integer aacc, Reference<Struct> atheCache) -> {
					final Reference<Integer> l23_pos = ((Reference<Integer>)(new Reference(aacc)));
					final Func2<Object,Integer, Struct_PegVmCacheItem> l25_$24 = (Func2<Object, Integer, Struct_PegVmCacheItem>)(Integer ap, Struct_PegVmCacheItem as) -> {
						if ((!FlowRuntime.compareEqual(as,Module_pegcode_lib.g_peg_fail_cache_item))) {
							l23_pos.value = ((Integer)Native.fast_max(ap, l23_pos.value));
							return null;
						} else {
							return null;
						}
					};
					Module_inttree.f_iterIntTree(atheCache, ((Func2<Object,Integer, Object>)(Func2)l25_$24));
					return l23_pos.value;
				};
				final int l23_lastPos = ((int)Native.fold(l20_$18, l21_$19, ((Func2<Object,Object, Object>)(Func2)l22_$17)));
				return (new Struct_ParseResult(l23_lastPos, l16_r.f_result));
			} else {
				return l16_r;
			}
		}
	public static final Struct_ParseResult f_whilePeg(Struct_PegCodeConst apca, int apc, int ai, Struct astack, Struct acapture, Struct aenv) {
		TAIL_CALL: for(;;) {
			if ((apc<0)) {
				Struct l0__tmp = astack;
				switch (l0__tmp.getTypeId()) {
				case 19/*EmptyList*/: {
					Module_pegcode_lib.f_pegAddress2rule(apca.f_fns, apc);
					return (new Struct_ParseResult(ai, ((Struct)SingletonStructs.str_None)));
				}
				case 15/*Cons*/: {
					final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
					final Object l2_h = l1__tmp.f_head;
					final Struct l3_t = l1__tmp.f_tail;
					final Struct l4_h = ((Struct)l1__tmp.f_head);
					final Struct l5_t = l1__tmp.f_tail;
					Struct l6__tmp = l4_h;
					switch (l6__tmp.getTypeId()) {
					case 79/*PegStackPc*/: {
						final Struct_PegStackPc l7__tmp = (Struct_PegStackPc)l6__tmp;
						final int l8_pc0 = l7__tmp.f_pc;
						final Struct l9_cl = l7__tmp.f_capture;
						final int l10_pc0 = l7__tmp.f_pc;
						final Struct l11_cl = l7__tmp.f_capture;
						{
							final Struct l12___tmp = l5_t;
							final Struct l13___tmp = l11_cl;
							final Struct l14___tmp = Native.tailList(aenv);
							astack = l12___tmp;
							acapture = l13___tmp;
							aenv = l14___tmp;
							continue TAIL_CALL;
						}
					}
					case 80/*PegStackPcCache*/: {
						final Struct_PegStackPcCache l7__tmp = (Struct_PegStackPcCache)l6__tmp;
						final int l15_pc0 = l7__tmp.f_pc;
						final int l16_ce = l7__tmp.f_ce;
						final int l17_si = l7__tmp.f_start;
						final Struct l18_cl = l7__tmp.f_capture;
						final int l19_pc0 = l7__tmp.f_pc;
						final int l20_ce = l7__tmp.f_ce;
						final int l21_si = l7__tmp.f_start;
						final Struct l22_cl = l7__tmp.f_capture;
						final Reference<Struct> l23_it = ((Reference<Struct>)(apca.f_cache.f_caches[l20_ce]));
						l23_it.value = Module_inttree.f_addOrUpdateIntTree(l23_it, l21_si, Module_pegcode_lib.g_peg_fail_cache_item);
						{
							final Struct l24___tmp = l5_t;
							final Struct l25___tmp = l22_cl;
							final Struct l26___tmp = Native.tailList(aenv);
							astack = l24___tmp;
							acapture = l25___tmp;
							aenv = l26___tmp;
							continue TAIL_CALL;
						}
					}
					case 78/*PegStackChoice*/: {
						final Struct_PegStackChoice l7__tmp = (Struct_PegStackChoice)l6__tmp;
						final int l27_pc0 = l7__tmp.f_pc;
						final int l28_i0 = l7__tmp.f_i;
						final Struct l29_c0 = l7__tmp.f_capture;
						final int l30_pc0 = l7__tmp.f_pc;
						final int l31_i0 = l7__tmp.f_i;
						final Struct l32_c0 = l7__tmp.f_capture;
						{
							final int l33___tmp = l30_pc0;
							final int l34___tmp = l31_i0;
							final Struct l35___tmp = l5_t;
							final Struct l36___tmp = l32_c0;
							apc = l33___tmp;
							ai = l34___tmp;
							astack = l35___tmp;
							acapture = l36___tmp;
							continue TAIL_CALL;
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l6__tmp.getTypeName());
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
				}
			} else {
				final Struct l37_gsymswitch0 = ((Struct)(apca.f_program[apc]));
				Struct l38__tmp = l37_gsymswitch0;
				switch (l38__tmp.getTypeId()) {
				case 83/*PegString*/: {
					final Struct_PegString l39__tmp = (Struct_PegString)l38__tmp;
					final String l40_x = l39__tmp.f_x;
					final String l41_x = l39__tmp.f_x;
					if (Native.strContainsAt(apca.f_input, ai, l41_x)) {
						{
							final int l42___tmp = (apc+1);
							final int l43___tmp = (ai+Native.strlen(l41_x));
							apc = l42___tmp;
							ai = l43___tmp;
							continue TAIL_CALL;
						}
					} else {
						{
							final int l44___tmp = (-1);
							apc = l44___tmp;
							continue TAIL_CALL;
						}
					}
				}
				case 74/*PegRange*/: {
					final Struct_PegRange l39__tmp = (Struct_PegRange)l38__tmp;
					final String l45_low = l39__tmp.f_l;
					final String l46_up = l39__tmp.f_u;
					final String l47_low = l39__tmp.f_l;
					final String l48_up = l39__tmp.f_u;
					final String l49_s = Native.substring(apca.f_input, ai, 1);
					if ((((l47_low).compareTo(l49_s)<=0)&&((l49_s).compareTo(l48_up)<=0))) {
						{
							final int l50___tmp = (apc+1);
							final int l51___tmp = (ai+1);
							apc = l50___tmp;
							ai = l51___tmp;
							continue TAIL_CALL;
						}
					} else {
						{
							final int l52___tmp = (-1);
							apc = l52___tmp;
							continue TAIL_CALL;
						}
					}
				}
				case 73/*PegJump*/: {
					final Struct_PegJump l39__tmp = (Struct_PegJump)l38__tmp;
					final int l53_l = l39__tmp.f_l;
					final int l54_l = l39__tmp.f_l;
					{
						final int l55___tmp = (apc+l54_l);
						apc = l55___tmp;
						continue TAIL_CALL;
					}
				}
				case 62/*PegChoice*/: {
					final Struct_PegChoice l39__tmp = (Struct_PegChoice)l38__tmp;
					final int l56_l = l39__tmp.f_l;
					final int l57_l = l39__tmp.f_l;
					{
						final int l58___tmp = (apc+1);
						final Struct l59___tmp = (new Struct_Cons((new Struct_PegStackChoice((apc+l57_l), ai, acapture)), astack));
						apc = l58___tmp;
						astack = l59___tmp;
						continue TAIL_CALL;
					}
				}
				case 84/*PegStringChoice*/: {
					final Struct_PegStringChoice l39__tmp = (Struct_PegStringChoice)l38__tmp;
					final String l60_x = l39__tmp.f_x;
					final int l61_l = l39__tmp.f_commit;
					final String l62_x = l39__tmp.f_x;
					final int l63_l = l39__tmp.f_commit;
					if (Native.strContainsAt(apca.f_input, ai, l62_x)) {
						{
							final int l64___tmp = (apc+l63_l);
							final int l65___tmp = (ai+Native.strlen(l62_x));
							apc = l64___tmp;
							ai = l65___tmp;
							continue TAIL_CALL;
						}
					} else {
						{
							final int l66___tmp = (apc+1);
							apc = l66___tmp;
							continue TAIL_CALL;
						}
					}
				}
				case 75/*PegRangeChoice*/: {
					final Struct_PegRangeChoice l39__tmp = (Struct_PegRangeChoice)l38__tmp;
					final String l67_low = l39__tmp.f_l;
					final String l68_up = l39__tmp.f_u;
					final int l69_l = l39__tmp.f_commit;
					final String l70_low = l39__tmp.f_l;
					final String l71_up = l39__tmp.f_u;
					final int l72_l = l39__tmp.f_commit;
					final String l73_s = Native.substring(apca.f_input, ai, 1);
					if ((((l70_low).compareTo(l73_s)<=0)&&((l73_s).compareTo(l71_up)<=0))) {
						{
							final int l74___tmp = (apc+l72_l);
							final int l75___tmp = (ai+1);
							apc = l74___tmp;
							ai = l75___tmp;
							continue TAIL_CALL;
						}
					} else {
						{
							final int l76___tmp = (apc+1);
							apc = l76___tmp;
							continue TAIL_CALL;
						}
					}
				}
				case 58/*PegCall*/: {
					final Struct_PegCall l39__tmp = (Struct_PegCall)l38__tmp;
					final int l77_l = l39__tmp.f_l;
					final int l78_l = l39__tmp.f_l;
					{
						final int l79___tmp = l78_l;
						final Struct l80___tmp = (new Struct_Cons((new Struct_PegStackPc((apc+1), acapture)), astack));
						final Struct l81___tmp = Module_list.f_makeList();
						final Struct l82___tmp = (new Struct_Cons(Module_tree.f_makeTree(), aenv));
						apc = l79___tmp;
						astack = l80___tmp;
						acapture = l81___tmp;
						aenv = l82___tmp;
						continue TAIL_CALL;
					}
				}
				case 57/*PegCacheCall*/: {
					final Struct_PegCacheCall l39__tmp = (Struct_PegCacheCall)l38__tmp;
					final int l83_l = l39__tmp.f_l;
					final int l84_ce = l39__tmp.f_cacheEntry;
					final int l85_l = l39__tmp.f_l;
					final int l86_ce = l39__tmp.f_cacheEntry;
					final Struct l87_c = Module_inttree.f_lookupIntTree(((Reference<Struct>)(apca.f_cache.f_caches[l86_ce])), ai);
					Struct l88__tmp = l87_c;
					switch (l88__tmp.getTypeId()) {
					case 42/*None*/: {
						{
							final int l90___tmp = l85_l;
							final Struct l91___tmp = (new Struct_Cons((new Struct_PegStackPcCache((apc+1), l86_ce, ai, acapture)), astack));
							final Struct l92___tmp = Module_list.f_makeList();
							final Struct l93___tmp = (new Struct_Cons(Module_tree.f_makeTree(), aenv));
							apc = l90___tmp;
							astack = l91___tmp;
							acapture = l92___tmp;
							aenv = l93___tmp;
							continue TAIL_CALL;
						}
					}
					case 104/*Some*/: {
						final Struct_Some l89__tmp = (Struct_Some)l88__tmp;
						final Object l94_r = l89__tmp.f_value;
						final Struct_PegVmCacheItem l95_r = ((Struct_PegVmCacheItem)l89__tmp.f_value);
						if ((l95_r.f_pos==(-1))) {
							{
								final int l96___tmp = (-1);
								apc = l96___tmp;
								continue TAIL_CALL;
							}
						} else {
							final Struct_RuleResult l97_cap = l95_r.f_capture;
							{
								final int l98___tmp = (apc+1);
								final int l99___tmp = l95_r.f_pos;
								final Struct l100___tmp = (new Struct_Cons(l97_cap, acapture));
								apc = l98___tmp;
								ai = l99___tmp;
								acapture = l100___tmp;
								continue TAIL_CALL;
							}
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l88__tmp.getTypeName());
					}
				}
				case 76/*PegReturn*/: {
					Struct l101__tmp = astack;
					switch (l101__tmp.getTypeId()) {
					case 19/*EmptyList*/: {
						return (new Struct_ParseResult((-1), ((Struct)SingletonStructs.str_None)));
					}
					case 15/*Cons*/: {
						final Struct_Cons l102__tmp = (Struct_Cons)l101__tmp;
						final Object l103_h = l102__tmp.f_head;
						final Struct l104_t = l102__tmp.f_tail;
						final Struct l105_h = ((Struct)l102__tmp.f_head);
						final Struct l106_t = l102__tmp.f_tail;
						Struct l107__tmp = l105_h;
						switch (l107__tmp.getTypeId()) {
						case 79/*PegStackPc*/: {
							final Struct_PegStackPc l108__tmp = (Struct_PegStackPc)l107__tmp;
							final int l109_pc0 = l108__tmp.f_pc;
							final Struct l110_tl = l108__tmp.f_capture;
							final int l111_pc0 = l108__tmp.f_pc;
							final Struct l112_tl = l108__tmp.f_capture;
							{
								final int l113___tmp = l111_pc0;
								final Struct l114___tmp = l106_t;
								final Struct l115___tmp = (new Struct_Cons(Native.headList(acapture, apca.f_capture), l112_tl));
								final Struct l116___tmp = Native.tailList(aenv);
								apc = l113___tmp;
								astack = l114___tmp;
								acapture = l115___tmp;
								aenv = l116___tmp;
								continue TAIL_CALL;
							}
						}
						case 80/*PegStackPcCache*/: {
							final Struct_PegStackPcCache l108__tmp = (Struct_PegStackPcCache)l107__tmp;
							final int l117_pc0 = l108__tmp.f_pc;
							final int l118_ce = l108__tmp.f_ce;
							final int l119_si = l108__tmp.f_start;
							final Struct l120_tl = l108__tmp.f_capture;
							final int l121_pc0 = l108__tmp.f_pc;
							final int l122_ce = l108__tmp.f_ce;
							final int l123_si = l108__tmp.f_start;
							final Struct l124_tl = l108__tmp.f_capture;
							final Struct l125_res = ((Struct)Native.headList(acapture, apca.f_capture));
							Struct l126__tmp = l125_res;
							switch (l126__tmp.getTypeId()) {
							case 99/*RuleResult*/: {
								final Struct_RuleResult l127__tmp = (Struct_RuleResult)l126__tmp;
								final Struct l128_r = l127__tmp.f_result;
								final Object l129___ = l127__tmp.f_input;
								final int l130___ = l127__tmp.f_pos;
								final int l131___ = l127__tmp.f_len;
								final Struct l132_r = l127__tmp.f_result;
								final Reference<Struct> l133_it = ((Reference<Struct>)(apca.f_cache.f_caches[l122_ce]));
								l133_it.value = Module_inttree.f_addOrUpdateIntTree(l133_it, l123_si, (new Struct_PegVmCacheItem(ai, l127__tmp)));
								break;
							}
							default: {
								break;
							}
							}
							{
								final int l134___tmp = l121_pc0;
								final Struct l135___tmp = l106_t;
								final Struct l136___tmp = (new Struct_Cons(l125_res, l124_tl));
								final Struct l137___tmp = Native.tailList(aenv);
								apc = l134___tmp;
								astack = l135___tmp;
								acapture = l136___tmp;
								aenv = l137___tmp;
								continue TAIL_CALL;
							}
						}
						case 78/*PegStackChoice*/: {
							final Struct_PegStackChoice l108__tmp = (Struct_PegStackChoice)l107__tmp;
							final int l138_pc0 = l108__tmp.f_pc;
							final int l139_i0 = l108__tmp.f_i;
							final Struct l140_c = l108__tmp.f_capture;
							final int l141_pc0 = l108__tmp.f_pc;
							final int l142_i0 = l108__tmp.f_i;
							final Struct l143_c = l108__tmp.f_capture;
							{
								final Struct l144___tmp = l106_t;
								astack = l144___tmp;
								continue TAIL_CALL;
							}
						}
						default:
							throw new RuntimeException("Unexpected struct in switch: "+l107__tmp.getTypeName());
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l101__tmp.getTypeName());
					}
				}
				case 67/*PegDrop*/: {
					{
						final int l145___tmp = (apc+1);
						final Struct l146___tmp = Native.tailList(acapture);
						apc = l145___tmp;
						acapture = l146___tmp;
						continue TAIL_CALL;
					}
				}
				case 65/*PegCommit*/: {
					final Struct_PegCommit l39__tmp = (Struct_PegCommit)l38__tmp;
					final int l147_l = l39__tmp.f_l;
					final int l148_l = l39__tmp.f_l;
					{
						final int l149___tmp = (apc+l148_l);
						final Struct l150___tmp = Native.tailList(astack);
						apc = l149___tmp;
						astack = l150___tmp;
						continue TAIL_CALL;
					}
				}
				case 82/*PegStartString*/: {
					{
						final int l151___tmp = (apc+1);
						final Struct l152___tmp = (new Struct_Cons((new Struct_PegCaptureStringStart(ai)), acapture));
						apc = l151___tmp;
						acapture = l152___tmp;
						continue TAIL_CALL;
					}
				}
				case 54/*PegBindString*/: {
					final Struct_PegBindString l39__tmp = (Struct_PegBindString)l38__tmp;
					final String l153_v = l39__tmp.f_n;
					final String l154_v = l39__tmp.f_n;
					Struct l155__tmp = acapture;
					switch (l155__tmp.getTypeId()) {
					case 19/*EmptyList*/: {
						{
							final int l157___tmp = (apc+1);
							apc = l157___tmp;
							continue TAIL_CALL;
						}
					}
					case 15/*Cons*/: {
						final Struct_Cons l156__tmp = (Struct_Cons)l155__tmp;
						final Object l158_h = l156__tmp.f_head;
						final Struct l159_t = l156__tmp.f_tail;
						final Struct l160_h = ((Struct)l156__tmp.f_head);
						final Struct l161_t = l156__tmp.f_tail;
						Struct l162__tmp = l160_h;
						switch (l162__tmp.getTypeId()) {
						case 61/*PegCaptureStringStart*/: {
							final Struct_PegCaptureStringStart l163__tmp = (Struct_PegCaptureStringStart)l162__tmp;
							final int l164_start = l163__tmp.f_start;
							final int l165_start = l163__tmp.f_start;
							final int l166_s = l163__tmp.f_start;
							final Struct_RuleResult l167_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), l166_s, (ai-l166_s), (new Struct_Some(Module_dynamic.f_flow(Native.substring(apca.f_input, l166_s, (ai-l166_s)))))));
							final Struct l168_tenv = ((Struct)Native.headList(aenv, Module_tree.f_makeTree()));
							final Struct_Cons l169_nenv = (new Struct_Cons(Module_tree.f_setTree(l168_tenv, l154_v, l167_rr), Native.tailList(aenv)));
							{
								final int l170___tmp = (apc+1);
								final Struct l171___tmp = l161_t;
								final Struct l172___tmp = l169_nenv;
								apc = l170___tmp;
								acapture = l171___tmp;
								aenv = l172___tmp;
								continue TAIL_CALL;
							}
						}
						default: {
							{
								final Struct l173___tmp = l161_t;
								acapture = l173___tmp;
								continue TAIL_CALL;
							}
						}
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l155__tmp.getTypeName());
					}
				}
				case 81/*PegStartCaptureList*/: {
					{
						final int l174___tmp = (apc+1);
						final Struct l175___tmp = (new Struct_Cons(SingletonStructs.str_PegCaptureStartList, acapture));
						apc = l174___tmp;
						acapture = l175___tmp;
						continue TAIL_CALL;
					}
				}
				case 55/*PegBindValue*/: {
					final Struct_PegBindValue l39__tmp = (Struct_PegBindValue)l38__tmp;
					final String l176_v = l39__tmp.f_n;
					final String l177_v = l39__tmp.f_n;
					Struct l178_result;
					Struct l179__tmp = acapture;
					switch (l179__tmp.getTypeId()) {
					case 19/*EmptyList*/: {
						l178_result=((Struct)SingletonStructs.str_None);
						break;
					}
					case 15/*Cons*/: {
						final Struct_Cons l180__tmp = (Struct_Cons)l179__tmp;
						final Object l181_h = l180__tmp.f_head;
						final Struct l182_t = l180__tmp.f_tail;
						final Struct l183_h = ((Struct)l180__tmp.f_head);
						final Struct l184_t = l180__tmp.f_tail;
						Struct l185__tmp = l183_h;
						switch (l185__tmp.getTypeId()) {
						case 99/*RuleResult*/: {
							final Struct_RuleResult l186__tmp = (Struct_RuleResult)l185__tmp;
							final Struct l187_result = l186__tmp.f_result;
							final Object l188___ = l186__tmp.f_input;
							final int l189___ = l186__tmp.f_pos;
							final int l190___ = l186__tmp.f_len;
							final Struct l191_result = l186__tmp.f_result;
							l178_result=l191_result;
							break;
						}
						default: {
							l178_result=((Struct)SingletonStructs.str_None);
							break;
						}
						}
						break;
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l179__tmp.getTypeName());
					}
					final Struct_RuleResult l192_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, Native.strlen(apca.f_input), l178_result));
					final Struct l193_tenv = ((Struct)Native.headList(aenv, Module_tree.f_makeTree()));
					final Struct_Cons l194_nenv = (new Struct_Cons(Module_tree.f_setTree(l193_tenv, l177_v, l192_rr), Native.tailList(aenv)));
					{
						final int l195___tmp = (apc+1);
						final Struct l196___tmp = l194_nenv;
						apc = l195___tmp;
						aenv = l196___tmp;
						continue TAIL_CALL;
					}
				}
				case 53/*PegBindIndex*/: {
					final Struct_PegBindIndex l39__tmp = (Struct_PegBindIndex)l38__tmp;
					final String l197_v = l39__tmp.f_n;
					final String l198_v = l39__tmp.f_n;
					final Struct_RuleResult l199_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(Module_dynamic.f_flow(ai)))));
					final Struct l200_tenv = ((Struct)Native.headList(aenv, Module_tree.f_makeTree()));
					final Struct_Cons l201_nenv = (new Struct_Cons(Module_tree.f_setTree(l200_tenv, l198_v, l199_rr), Native.tailList(aenv)));
					{
						final int l202___tmp = (apc+1);
						final Struct l203___tmp = l201_nenv;
						apc = l202___tmp;
						aenv = l203___tmp;
						continue TAIL_CALL;
					}
				}
				case 49/*PegAction*/: {
					final Struct_PegAction l39__tmp = (Struct_PegAction)l38__tmp;
					final Func1<Object,Struct_PegEnv> l204_fn = l39__tmp.f_fn;
					final Func1<Object,Struct_PegEnv> l205_fn = l39__tmp.f_fn;
					final Object l206_v = l205_fn.invoke((new Struct_PegEnv(((Struct)Native.headList(aenv, Module_tree.f_makeTree())), apca.f_fns)));
					final Struct_RuleResult l207_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(l206_v))));
					{
						final int l208___tmp = (apc+1);
						final Struct l209___tmp = (new Struct_Cons(l207_rr, acapture));
						apc = l208___tmp;
						acapture = l209___tmp;
						continue TAIL_CALL;
					}
				}
				case 50/*PegAction2*/: {
					final Struct_PegAction2 l39__tmp = (Struct_PegAction2)l38__tmp;
					final Struct l210_e = l39__tmp.f_e;
					final Struct l211_e = l39__tmp.f_e;
					final Object l212_v = Module_pegcode_lib.f_evalActionExp(l211_e, ai, ((Struct)Native.headList(aenv, Module_tree.f_makeTree())), apca.f_fns);
					final Struct_RuleResult l213_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(l212_v))));
					{
						final int l214___tmp = (apc+1);
						final Struct l215___tmp = (new Struct_Cons(l213_rr, acapture));
						apc = l214___tmp;
						acapture = l215___tmp;
						continue TAIL_CALL;
					}
				}
				case 51/*PegActionIndex*/: {
					final Struct_RuleResult l216_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(Module_dynamic.f_flow(ai)))));
					{
						final int l217___tmp = (apc+1);
						final Struct l218___tmp = (new Struct_Cons(l216_rr, acapture));
						apc = l217___tmp;
						acapture = l218___tmp;
						continue TAIL_CALL;
					}
				}
				case 71/*PegFail*/: {
					{
						final int l219___tmp = (-1);
						apc = l219___tmp;
						continue TAIL_CALL;
					}
				}
				case 68/*PegEnd*/: {
					return (new Struct_ParseResult(ai, Module_pegcode_lib.f_pegResultFromCapture(acapture)));
				}
				case 59/*PegCaptureList*/: {
					final Struct_Pair l220_listAndRest = Module_pegcode_lib.f_grabUntilMarker(Module_list.f_makeList(), acapture);
					final Struct l224_$222 = ((Struct)l220_listAndRest.f_first);
					final Struct l225_$223 = Module_list.f_makeList();
					final Func2<Struct,Struct, Struct> l226_$221 = (Func2<Struct, Struct, Struct>)(Struct aacc, Struct ap) -> {
						Struct l227__tmp = ap;
						switch (l227__tmp.getTypeId()) {
						case 99/*RuleResult*/: {
							final Struct_RuleResult l228__tmp = (Struct_RuleResult)l227__tmp;
							final Struct l229_result = l228__tmp.f_result;
							final Object l230___ = l228__tmp.f_input;
							final int l231___ = l228__tmp.f_pos;
							final int l232___ = l228__tmp.f_len;
							final Struct l233_result = l228__tmp.f_result;
							Struct l234__tmp = l233_result;
							switch (l234__tmp.getTypeId()) {
							case 42/*None*/: {
								return aacc;
							}
							case 104/*Some*/: {
								final Struct_Some l235__tmp = (Struct_Some)l234__tmp;
								final Object l236_va = l235__tmp.f_value;
								final Object l237_va = l235__tmp.f_value;
								return (new Struct_Cons(l237_va, aacc));
							}
							default:
								throw new RuntimeException("Unexpected struct in switch: "+l234__tmp.getTypeName());
							}
						}
						default: {
							return aacc;
						}
						}
					};
					final Struct l227_results0 = ((Struct)Module_list.f_foldList(l224_$222, l225_$223, ((Func2<Object,Object, Object>)(Func2)l226_$221)));
					final Object[] l228_results = Native.list2array(l227_results0);
					final Struct_RuleResult l229_rr = (new Struct_RuleResult(Module_dynamic.f_flow(apca.f_input), ai, Native.strlen(apca.f_input), (new Struct_Some(Module_dynamic.f_flow(l228_results)))));
					{
						final int l230___tmp = (apc+1);
						final Struct l231___tmp = (new Struct_Cons(l229_rr, ((Struct)l220_listAndRest.f_second)));
						apc = l230___tmp;
						acapture = l231___tmp;
						continue TAIL_CALL;
					}
				}
				case 63/*PegClearCache*/: {
					final Object[] l234_$233 = apca.f_cache.f_caches;
					final Func1<Object,Reference<Struct>> l235_$232 = (Func1<Object, Reference<Struct>>)(Reference<Struct> ac) -> {
						ac.value = Module_inttree.f_makeIntTree().value;
						return null;
					};
					Native.iter(l234_$233, ((Func1<Object,Object>)(Func1)l235_$232));
					{
						final int l236___tmp = (apc+1);
						apc = l236___tmp;
						continue TAIL_CALL;
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l38__tmp.getTypeName());
				}
			}
		}
		}
}
