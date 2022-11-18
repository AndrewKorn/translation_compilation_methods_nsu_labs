// HASH COLLISIONS: YES
// timestamp: 1.667742582E12

package parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_parser {
	public static Reference<Struct> g_lingoGrammarOp;
	public static void init() {
		g_lingoGrammarOp=((Reference<Struct>)(new Reference(SingletonStructs.str_None)));
	}
	public static final Struct_Sequence f_BuildSeq(Object[] axs) {
			return (new Struct_Sequence(Module_array.f_arrayPush(((Object[])(axs[0])), ((Object)(axs[1])))));
		}
	public static final Struct_Union f_BuildUnion(Object[] axs) {
			return (new Struct_Union(Module_array.f_arrayPush(((Object[])(axs[0])), ((Object)(axs[1])))));
		}
	public static final Struct_Sequence f_BuildWhile(Object[] axs) {
			return (new Struct_Sequence((new Object[] { (new Struct_Iter((new Struct_Sequence((new Object[] { (new Struct_Test(((Struct)(axs[0])))), ((Object)(axs[1])) }))))), (new Struct_Test((new Struct_Not(((Struct)(axs[0])))))) })));
		}
	public static final Object[] f_lingoGrammar() {
			final Func0<Object[]> l1_$0 = (Func0<Object[]>)() -> {
				return Module_driver.f_compilePegGrammar("prog = ws decl+:d '{' ws body:b ws '}' ws     { Prog(:d, :b) };\ndecl = \"VAR\" ws var:v ws ':' ws type:t ws ';' ws { Decl(:v, :t) };\n\ntype = baseType | arrType;\nbaseType = \"INT\"               { BaseType(\"INT\") };\narrType = '[' ws type:t ws ']' { ArrType(:t) };\n\nbody = assign | test | seq | union | iter | print | while;\nassign = lb ws var:v ws \":=\" ws exp:e ws rb                                        { Assign(:v, :e) };\ntest = lb ws exp:e ws '?' ws rb                                                    { Test(:e) };\nseq =  lb ws seqEntry+:s body:b ws rb                                              { BuildSeq(:s, :b) };\nseqEntry = body:b ws ';' ws                                                        { :b };\nunion = lb ws unEntry+:u body:b ws rb                                              { BuildUnion(:u, :b)};\nunEntry = body:b ws 'U' ws                                                         { :b };\niter = lb ws body:b ws '*' ws rb                                                   { Iter(:b) };\nprint  = lb ws \"PRINT\" ws exp:e ws rb                                              { Print(:e) };\nwhile  = lb ws \"WHILE\" ws exp:e ws \"DO\" ws body:b ws \"DONE\" ws rb                  { BuildWhile(:e, :b) };\n\nexp = var | val | sum | sub | mul | div | app | upd | len | not | less | more | lessOrEq | moreOrEq | eq;\nsum = lb ws exp:e1 ws '+' ws exp:e2 ws rb             { Sum(:e1, :e2) };\nsub = lb ws exp:e1 ws '-' ws exp:e2 ws rb             { Sub(:e1, :e2) };\nmul = lb ws exp:e1 ws '*' ws exp:e2 ws rb             { Mul(:e1, :e2) };\ndiv = lb ws exp:e1 ws '/' ws exp:e2 ws rb             { Div(:e1, :e2) };\napp = lb ws \"APP\" ws var:a ws int:i ws rb             { App(:a, :i) };\nupd = lb ws \"UPD\" ws var:a ws int:i ws exp:e ws rb    { Upd(:a, :i, :e) }; \nlen = lb ws \"LEN\" ws var:a ws rb                      { Len(:a) };\nnot = lb ws '!' ws exp:e ws rb                        { Not(:e) };\nless = lb ws exp:e1 ws '<' ws exp:e2 ws rb            { Less(:e1, :e2) }; \nmore = lb ws exp:e1 ws '>' ws exp:e2 ws rb            { Less(:e2, :e1) }; \nlessOrEq = lb ws exp:e1 ws \"<=\" ws exp:e2 ws rb       { Not(Less(:e2, :e1)) }; \nmoreOrEq = lb ws exp:e1 ws \">=\" ws exp:e2 ws rb       { Not(Less(:e1, :e2)) };\neq = lb ws exp:e1 ws \"==\" ws exp:e2 ws rb             { Prod(Not(Less(:e2, :e1)), Not(Less(:e1, :e2)))};\n\n\nval = int | arr;\nint = digit+ $i            { Int(s2i($i)) };\narr = '[' ws val*:a ws ']' { Arr(:a) };\n\n\ndigit = '0'-'9';\nvar = char+ $v { Var($v) };\nchar = 'a'-'z' | 'A'-'Z';\n\n\nlb = '(';\nrb = ')';\nws = s*;\ns = \" \" | \"\\t\" | \"\\n\";");
			};
			return ((Object[])Module_maybe.f_onlyOnce(Module_parser.g_lingoGrammarOp, ((Func0<Object>)(Func0)l1_$0)));
		}
	public static final Object f_main() {
			final String l0_test = Native.getFileContent("./test.txt");
			final Struct l1_t = Module_tree.f_setTree(Module_pegaction.g_defaultPegActions.f_t, "BuildUnion", Wrappers.w_BuildUnion);
			final Struct l2_t2 = Module_tree.f_setTree(l1_t, "BuildSeq", Wrappers.w_BuildSeq);
			final Struct l3_t3 = Module_tree.f_setTree(l2_t2, "BuildWhile", Wrappers.w_BuildWhile);
			final Struct_SemanticActions l4_specialPegActions = (new Struct_SemanticActions(l3_t3));
			final Object l5_AST = Module_parsic.f_parsic(Module_parser.f_lingoGrammar(), l0_test, l4_specialPegActions);
			return Module_runtime.f_println(l5_AST);
		}
}
