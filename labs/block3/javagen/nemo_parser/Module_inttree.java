// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_inttree {
	public static final Struct f_addOrUpdateIntTree(Reference<Struct> atree, int akey, Object avalue) {
		TAIL_CALL: for(;;) {
			final Struct l0_t = atree.value;
			Struct l1__tmp = l0_t;
			switch (l1__tmp.getTypeId()) {
			case 26/*IntTreeNode*/: {
				final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
				final Object[] l3_children = l2__tmp.f_children;
				final Object[] l4_children = l2__tmp.f_children;
				final int l5_nibble = Native.bitAnd(akey, 15);
				int l6_rest;
				if ((akey>=0)) {
					l6_rest=(akey/16);
				} else {
					l6_rest=Native.bitUshr(akey, 4);
				}
				((Reference<Struct>)(l4_children[l5_nibble])).value = Module_inttree.f_addOrUpdateIntTree(((Reference<Struct>)(l4_children[l5_nibble])), l6_rest, avalue);
				return l2__tmp;
			}
			case 28/*IntTreeValue*/: {
				final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
				final int l7_k = l2__tmp.f_key;
				final Object l8_v = l2__tmp.f_value;
				final int l9_k = l2__tmp.f_key;
				final Object l10_v = l2__tmp.f_value;
				if ((l9_k==akey)) {
					return (new Struct_IntTreeValue(akey, avalue));
				} else {
					final int l11_existingNibble = Native.bitAnd(l9_k, 15);
					int l12_existingRest;
					if ((l9_k>=0)) {
						l12_existingRest=(l9_k/16);
					} else {
						l12_existingRest=Native.bitUshr(l9_k, 4);
					}
					final Func0<Reference<Struct>> l13_nt = ((Func0<Reference<Struct>>)(Func0)(Func0<Reference<SingletonStruct>>)() -> {
						return ((Reference<SingletonStruct>)(new Reference(SingletonStructs.str_IntTreeNone)));
					});
					Object[] l14_e;
					l14_e=(new Object[] { l13_nt.invoke(), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)) });
					((Reference<Struct_IntTreeValue>)(l14_e[l11_existingNibble])).value = (new Struct_IntTreeValue(l12_existingRest, l10_v));
					final Reference<Struct_IntTreeNode> l15_refactored = ((Reference<Struct_IntTreeNode>)(new Reference((new Struct_IntTreeNode(l14_e)))));
					{
						final Reference<Struct> l16___tmp = ((Reference<Struct>)(Reference)l15_refactored);
						atree = l16___tmp;
						continue TAIL_CALL;
					}
				}
			}
			case 27/*IntTreeNone*/: {
				return (new Struct_IntTreeValue(akey, avalue));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
		}
	public static final Object f_doIterIntTree(Reference<Struct> atree, int alobits, int alevel, Func2<Object,Integer, Object> afn) {
			final Struct l0_t = atree.value;
			Struct l1__tmp = l0_t;
			switch (l1__tmp.getTypeId()) {
			case 26/*IntTreeNode*/: {
				final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
				final Object[] l3_children = l2__tmp.f_children;
				final Object[] l4_children = l2__tmp.f_children;
				final int l7_lobits = alobits;
				final int l8_level = alevel;
				final Func2<Object,Integer, Object> l9_fn = afn;
				final Func2<Object,Integer, Reference<Struct>> l6_$5 = (Func2<Object, Integer, Reference<Struct>>)(Integer ai, Reference<Struct> ac) -> {
					return Module_inttree.f_doIterIntTree(ac, (l7_lobits+(((int)ai)*l8_level)), Native.bitShl(l8_level, 4), l9_fn);
				};
				return Native.iteri(l4_children, ((Func2<Object,Integer, Object>)(Func2)l6_$5));
			}
			case 28/*IntTreeValue*/: {
				final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
				final int l10_k = l2__tmp.f_key;
				final Object l11_v = l2__tmp.f_value;
				final int l12_k = l2__tmp.f_key;
				final Object l13_v = l2__tmp.f_value;
				return afn.invoke(((Integer)((l12_k*alevel)+alobits)), l13_v);
			}
			case 27/*IntTreeNone*/: {
				return null;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
	public static final Object f_iterIntTree(Reference<Struct> atree, Func2<Object,Integer, Object> afn) {
			return Module_inttree.f_doIterIntTree(atree, 0, 1, afn);
		}
	public static final Struct f_lookupIntTree(Reference<Struct> atree, int akey) {
		TAIL_CALL: for(;;) {
			final Struct l0_t = atree.value;
			Struct l1__tmp = l0_t;
			switch (l1__tmp.getTypeId()) {
			case 26/*IntTreeNode*/: {
				final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
				final Object[] l3_children = l2__tmp.f_children;
				final Object[] l4_children = l2__tmp.f_children;
				final int l5_nibble = Native.bitAnd(akey, 15);
				int l6_rest;
				if ((akey>=0)) {
					l6_rest=(akey/16);
				} else {
					l6_rest=Native.bitUshr(akey, 4);
				}
				{
					final Reference<Struct> l7___tmp = ((Reference<Struct>)(l4_children[l5_nibble]));
					final int l8___tmp = l6_rest;
					atree = l7___tmp;
					akey = l8___tmp;
					continue TAIL_CALL;
				}
			}
			case 28/*IntTreeValue*/: {
				final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
				final int l9_k = l2__tmp.f_key;
				final Object l10_v = l2__tmp.f_value;
				final int l11_k = l2__tmp.f_key;
				final Object l12_v = l2__tmp.f_value;
				if ((l11_k==akey)) {
					return (new Struct_Some(l12_v));
				} else {
					return ((Struct)SingletonStructs.str_None);
				}
			}
			case 27/*IntTreeNone*/: {
				return ((Struct)SingletonStructs.str_None);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
			}
		}
		}
	public static final Reference<Struct> f_makeIntTree() {
			return ((Reference<Struct>)(new Reference(SingletonStructs.str_IntTreeNone)));
		}
}
