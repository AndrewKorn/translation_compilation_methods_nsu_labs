// HASH COLLISIONS: YES
// timestamp: 1.6681033608E12

package vnemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class vnemo_parser extends FlowRuntime {

	// Init hosts: 1
	private static final void init_hosts() {
		FlowRuntime.registerNativeHost(Native.class);
	}

	// Init modules: 12
	private static final void init_modules() {
		Module_url.init();
		Module_securitymode.init();
		Module_runtime.init();
		Module_bits.init();
		Module_peg.init();
		Module_url_parameter.init();
		Module_devmode.init();
		Module_pegaction.init();
		Module_pegcode_lib.init();
		Module_pegcode.init();
		Module_lingocode.init();
		Module_vnemo_parser.init();
	}
	private static final void init() {
		Structs.init();
		init_hosts();
		init_modules();
	}
	public static void main(String[] args) {
		FlowRuntime.program_args = args;
		vnemo_parser.init();
		Module_vnemo_parser.f_main();
	}
}