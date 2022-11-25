// HASH COLLISIONS: YES
// timestamp: 1.669356033E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_main {
	public static final Object f_main() {
			final Struct_NemoProg l0_nemoProg = Module_nemo_parser.f_parseNemo("./test.txt");
			Module_runtime.f_println("NEMO PROG AST\n_________________");
			Module_runtime.f_println(l0_nemoProg);
			Module_runtime.f_println("\n");
			final String l1_vnemoStr = Module_translator.f_translateNemoProgram(l0_nemoProg);
			Module_runtime.f_println("VNEMO PROG STR\n_________________");
			Module_runtime.f_println(l1_vnemoStr);
			Module_runtime.f_println("\n");
			final Struct_VnemoProg l2_vnemoProg = Module_vnemo_parser.f_parseVnemo(l1_vnemoStr);
			Module_runtime.f_println("VNEMO PROG AST\n_________________");
			Module_runtime.f_println(l2_vnemoProg);
			Module_runtime.f_println("\n");
			Module_runtime.f_println("PROGRAMM OUTPUT\n________________");
			return Module_executer.f_executeVnemoProg(l2_vnemoProg);
		}
}
