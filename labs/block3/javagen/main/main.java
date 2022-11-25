// HASH COLLISIONS: YES
// timestamp: 1.669356105113E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class main extends FlowRuntime {

	// Init hosts: 1
	private static final void init_hosts() {
		FlowRuntime.registerNativeHost(Native.class);
	}

	// Init modules: 11
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
	}
	private static final void init() {
		Structs.init();
		init_hosts();
		init_modules();
	}
	public static void main(String[] args) {
		FlowRuntime.program_args = args;
		main.init();
		Module_main.f_main();
	}
}
