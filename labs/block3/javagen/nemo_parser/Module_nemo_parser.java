// HASH COLLISIONS: YES
// timestamp: 1.668103139E12

package nemo_parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_nemo_parser {
	public static Reference<Struct> g_lingoGrammarOp;
	public static void init() {
		g_lingoGrammarOp=((Reference<Struct>)(new Reference(SingletonStructs.str_None)));
	}
	public static final Struct_Choice f_BuildChoice(Object[] adata) {
			return (new Struct_Choice(Native.concat((new Object[] { ((Object)(adata[0])) }), ((Object[])(adata[1])))));
		}
	public static final Struct_Choice f_BuildIfElse(Object[] adata) {
			final Object l0_op = ((Object)(adata[0]));
			final Object l1_e1 = ((Object)(adata[1]));
			final Object l2_e2 = ((Object)(adata[2]));
			final Struct_Test l3_ifCond = (new Struct_Test(((String)l0_op), ((Struct)l1_e1), ((Struct)l2_e2)));
			final Object l4_ifOp = ((Object)(adata[3]));
			final Struct_Sequence l5_ifSeq = (new Struct_Sequence((new Object[] { l3_ifCond, l4_ifOp })));
			final Struct_Test l6_elseCond = (new Struct_Test(Module_nemo_parser.f_getReverseComparisonOperator(((String)l0_op)), ((Struct)l1_e1), ((Struct)l2_e2)));
			final Object l7_elseOp = ((Object)(adata[4]));
			final Struct_Sequence l8_elseSeq = (new Struct_Sequence((new Object[] { l6_elseCond, l7_elseOp })));
			return (new Struct_Choice((new Object[] { l5_ifSeq, l8_elseSeq })));
		}
	public static final Struct_Sequence f_BuildSeq(Object[] adata) {
			return (new Struct_Sequence(Native.concat((new Object[] { ((Object)(adata[0])) }), ((Object[])(adata[1])))));
		}
	public static final Struct_Sequence f_BuildWhile(Object[] adata) {
			return (new Struct_Sequence((new Object[] { (new Struct_Iter((new Struct_Sequence((new Object[] { (new Struct_Test(((String)(adata[0])), ((Struct)(adata[1])), ((Struct)(adata[2])))), ((Object)(adata[3])) }))))), (new Struct_Test(Module_nemo_parser.f_getReverseComparisonOperator(((String)(adata[0]))), ((Struct)(adata[1])), ((Struct)(adata[2])))) })));
		}
	public static final String f_getReverseComparisonOperator(String acomparisonOp) {
			if ((acomparisonOp).equals("==")) {
				return "!=";
			} else {
				if ((acomparisonOp).equals("<=")) {
					return ">";
				} else {
					if ((acomparisonOp).equals(">=")) {
						return "<";
					} else {
						if ((acomparisonOp).equals("<")) {
							return ">=";
						} else {
							if ((acomparisonOp).equals(">")) {
								return "<=";
							} else {
								if ((acomparisonOp).equals("!=")) {
									return "==";
								} else {
									return acomparisonOp;
								}
							}
						}
					}
				}
			}
		}
	public static final Object[] f_lingoGrammar() {
			final Func0<Object[]> l1_$0 = (Func0<Object[]>)() -> {
				return Module_driver.f_compilePegGrammar("prog = varDecl*:d ws body:b { NemoProg(:d, :b) };\n\nvarDecl = ws \"VAR\" ws char+$n ws \":\" ws type:t ws \";\" ws { VarDecl($n, :t) };\n\ntype  = int | array;\nint   =  ws \"INT\" ws {Integer()};\narray =  ws \"[\" ws type:t ws \"]\" ws {Array(:t)};\n\nbody = assign | print | iter | test | choice | seq | ifElse | while;\nassign = ws variable:v ws \":=\" ws exp:e                                                          { Assign(:v, :e) };\nprint = ws \"PRINT(\" exp:e \")\" ws                                                                 { Print(:e) };\niter = ws \"(\" ws body:op ws \")*\" ws                                                              { Iter(:op) };\ntest = ws \"(\" ws exp:e1 ws comparisonOp$op ws exp:e2 ws \")?\" ws                                  { Test($op, :e1, :e2) };\nchoice = ws \"(\" body:b choiceOp*:o \")\" ws                                                        { BuildChoice(:b, :o) };\nseq = ws \"(\" body:b seqOp*:o \")\" ws                                                              { BuildSeq(:b, :o) };\nifElse = ws \"IF\" ws exp:e1 comparisonOp$op exp:e2 ws \"THEN\" ws body:if ws \"ELSE\" ws body:else ws { BuildIfElse($op, :e1, :e2, :if, :else) };\nwhile = ws \"WHILE\" ws exp:e1 comparisonOp$op exp:e2 ws \"DO\" ws body:b ws                         { BuildWhile($op, :e1, :e2, :b)};\n\nexp = binaryOperator | const | app | upd | variable;\nbinaryOperator = ws \"(\" exp:e1 binaryOp$op exp:e2 \")\" ws                       { BinaryOp($op, :e1, :e2) };\nconst = ws digit+$d ws                                                         { Const(s2i($d)) };\napp  = ws \"(\" ws \"APP\" ws \"(\" exp:array \",\" exp:index \")\" ws \")\" ws            { App(:array, :index) };\nupd = ws \"(\" ws \"UPD\" ws \"(\" exp:array \",\" exp:index \",\" exp:val \")\" ws \")\" ws { Upd(:array, :index, :val) };\nvariable = ws char+$v ws                                                       { Var($v) };\n\ncomparisonOp = (\"==\" | \"<=\" | \">=\" | \"<\" | \">\" | \"!=\");\nbinaryOp = (\"+\" | \"*\" | \"/\" | \"-\" | \"%\");\nchoiceOp =  ws \"U\" body;\nseqOp = ws \";\" body;\n\nchar = 'a'-'z';\ndigit = '0'-'9';\nws = (' ' | '\\t' | '\\n' | '\\r')*;");
			};
			return ((Object[])Module_maybe.f_onlyOnce(Module_nemo_parser.g_lingoGrammarOp, ((Func0<Object>)(Func0)l1_$0)));
		}
	public static final Object f_main() {
			final String l0_test = Native.getFileContent("./test.txt");
			final Struct l1_t1 = Module_tree.f_setTree(Module_pegaction.g_defaultPegActions.f_t, "BuildSeq", Wrappers.w_BuildSeq);
			final Struct l2_t2 = Module_tree.f_setTree(l1_t1, "BuildChoice", Wrappers.w_BuildChoice);
			final Struct l3_t3 = Module_tree.f_setTree(l2_t2, "BuildIfElse", Wrappers.w_BuildIfElse);
			final Struct l4_t4 = Module_tree.f_setTree(l3_t3, "BuildWhile", Wrappers.w_BuildWhile);
			final Struct_SemanticActions l5_specialPegActions = (new Struct_SemanticActions(l4_t4));
			final Object l6_AST = Module_parsic.f_parsic(Module_nemo_parser.f_lingoGrammar(), l0_test, l5_specialPegActions);
			return Module_runtime.f_println(l6_AST);
		}
}
