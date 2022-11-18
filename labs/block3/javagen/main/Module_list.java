// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_list {
	public static final Object f_foldList(Struct al, Object ainit, Func2<Object,Object, Object> afn) {
		TAIL_CALL: for(;;) {
			Struct l0__tmp = al;
			switch (l0__tmp.getTypeId()) {
			case 21/*EmptyList*/: {
				return ainit;
			}
			case 17/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_t = l1__tmp.f_tail;
				final Object l4_h = l1__tmp.f_head;
				final Struct l5_t = l1__tmp.f_tail;
				{
					final Struct l6___tmp = l5_t;
					final Object l7___tmp = afn.invoke(ainit, l4_h);
					al = l6___tmp;
					ainit = l7___tmp;
					continue TAIL_CALL;
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
		}
	public static final Object f_headList(Struct al, Object adefault) {
			Struct l0__tmp = al;
			switch (l0__tmp.getTypeId()) {
			case 21/*EmptyList*/: {
				return adefault;
			}
			case 17/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_t = l1__tmp.f_tail;
				final Object l4_h = l1__tmp.f_head;
				final Struct l5_t = l1__tmp.f_tail;
				return l4_h;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_makeList() {
			return ((Struct)SingletonStructs.str_EmptyList);
		}
	public static final Struct f_tailList(Struct al) {
			Struct l0__tmp = al;
			switch (l0__tmp.getTypeId()) {
			case 21/*EmptyList*/: {
				return al;
			}
			case 17/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_t = l1__tmp.f_tail;
				final Object l4_h = l1__tmp.f_head;
				final Struct l5_t = l1__tmp.f_tail;
				return l5_t;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
}
