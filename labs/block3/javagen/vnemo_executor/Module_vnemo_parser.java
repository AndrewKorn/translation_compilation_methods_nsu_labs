// HASH COLLISIONS: YES
// timestamp: 1.668104827E12

package vnemo_executor;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_vnemo_parser {
	public static Reference<Struct> g_lingoGrammarOp;
	public static void init() {
		g_lingoGrammarOp=((Reference<Struct>)(new Reference(SingletonStructs.str_None)));
	}
	public static final Object[] f_lingoGrammar() {
			final Func0<Object[]> l1_$0 = (Func0<Object[]>)() -> {
				return Module_driver.f_compilePegGrammar("prog = ws varDecl*:d ws statement*:s {VnemoProg(:d, :s) };\n\nvarDecl = ws \"var\" ws name$n ws \":\" ws type:t ws \";\" ws { VarDecl($n, :t) };\n\ntype  = int | array;\nint   =  ws \"int\" ws                { bType(\"int\") };\narray =  ws \"[\" ws type:t ws \"]\" ws { aType(:t) };\n\nstatement = assign | ifelse | print;\nassign = ws (digit+)$id ws \":\" ws name$v ws \":=\" ws exp:e ws \"goto\" ws \"{\" ws label*:labels ws \"}\" ws                                                           { Assign(s2i($id), $v, :e, :labels) };\nifelse = ws (digit+)$id ws \":\" ws \"if\" ws exp:e1 ws comparisonOp$op ws exp:e2 ws \"then\" ws \"{\" ws label*:ifg ws \"}\" ws \"else\" ws \"{\" ws label*:elseg ws \"}\" ws  { IfElse(s2i($id), $o, :e1, :e2, :ifg, :elseg) };\nprint = ws (digit+)$id ws \":\" ws \"print\" ws \"(\" exp:e \")\" ws \"goto\" ws \"{\" ws label*:labels ws \"}\" ws                                                           { Print(s2i($id), :e, :labels) };\n\nexp = bin | const | app | upd | var;\nbin = ws \"(\" exp:e1 binaryOp$op exp:e2 \")\" ws                                  { BinaryOp($op, :e1, :e2) };\nconst = ws digit+$d ws                                                         { Const(s2i ($d)) };\napp  = ws \"app\" ws \"(\" ws exp:array \",\" ws exp:index \")\" ws                    { App(:array, :index) };\nupd = ws \"upd\" ws \"(\" ws exp:array \",\" ws exp:index \",\" ws exp:newValue \")\" ws { Upd(:array, :index, :newValue) };\nvar = ws name$l ws                                                             { Var($l) };      \n\ncomparisonOp = (\"==\" | \"<=\" | \">=\" | \"<\" | \">\" | \"!=\");\nbinaryOp = (\"+\" | \"*\" | \"/\" | \"-\" | \"%\");\n\nname = char+;\nlabel = ws digit+$d ws \",\"? ws { Label(s2i($d)) };\nchar = 'a'-'z';\ndigit = '0'-'9';\nws = (' ' | '\\t' | '\\n' | '\\r')*;");
			};
			return ((Object[])Module_maybe.f_onlyOnce(Module_vnemo_parser.g_lingoGrammarOp, ((Func0<Object>)(Func0)l1_$0)));
		}
	public static final Struct_VnemoProg f_parseVnemo(String afile) {
			final String l0_str = Native.getFileContent(afile);
			return ((Struct_VnemoProg)Module_parsic.f_parsic(Module_vnemo_parser.f_lingoGrammar(), l0_str, Module_pegaction.g_defaultPegActions));
		}
}
