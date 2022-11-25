// HASH COLLISIONS: YES
// timestamp: 1.669202273432E12

package execute;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class execute extends FlowRuntime {

	// Init hosts: 1
	private static final void init_hosts() {
		FlowRuntime.registerNativeHost(Native.class);
	}

	// Init modules: 9
	private static final void init_modules() {
		Module_url.init();
		Module_securitymode.init();
		Module_runtime.init();
		Module_bits.init();
		Module_peg.init();
		Module_url_parameter.init();
		Module_devmode.init();
		Module_pegaction.init();
		Module_pegcode.init();
	}
	private static final void init() {
		Structs.init();
		init_hosts();
		init_modules();
	}
	public static void main(String[] args) {
		FlowRuntime.program_args = args;
		execute.init();
		Module_execute.f_main();
	}
}
