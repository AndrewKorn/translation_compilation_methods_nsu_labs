// HASH COLLISIONS: YES
// timestamp: 1.663143738E12

package execute;

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
}
