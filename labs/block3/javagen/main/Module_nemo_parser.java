// HASH COLLISIONS: YES
// timestamp: 1.668115358E12

package main;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_nemo_parser {
	public static final Struct_Choice f_BuildChoice(Object[] adata) {
			return (new Struct_Choice(Native.concat((new Object[] { ((Object)(adata[0])) }), ((Object[])(adata[1])))));
		}
	public static final Struct_Choice f_BuildIfElse(Object[] adata) {
			return (new Struct_Choice((new Object[] { (new Struct_Sequence((new Object[] { (new Struct_Test(((String)(adata[0])), ((Struct)(adata[1])), ((Struct)(adata[2])))), ((Object)(adata[3])) }))), (new Struct_Sequence((new Object[] { (new Struct_Test(Module_nemo_parser.f_NotOp(((String)(adata[0]))), ((Struct)(adata[1])), ((Struct)(adata[2])))), ((Object)(adata[4])) }))) })));
		}
	public static final Struct_Sequence f_BuildSeq(Object[] adata) {
			return (new Struct_Sequence(Native.concat((new Object[] { ((Object)(adata[0])) }), ((Object[])(adata[1])))));
		}
	public static final Struct_Sequence f_BuildWhile(Object[] adata) {
			return (new Struct_Sequence((new Object[] { (new Struct_Iter((new Struct_Sequence((new Object[] { (new Struct_Test(((String)(adata[0])), ((Struct)(adata[1])), ((Struct)(adata[2])))), ((Object)(adata[3])) }))))), (new Struct_Test(Module_nemo_parser.f_NotOp(((String)(adata[0]))), ((Struct)(adata[1])), ((Struct)(adata[2])))) })));
		}
	public static final String f_NotOp(String aop) {
			if ((aop).equals("==")) {
				return "!=";
			} else {
				if ((aop).equals("!=")) {
					return "==";
				} else {
					if ((aop).equals("<=")) {
						return ">";
					} else {
						if ((aop).equals(">")) {
							return "<=";
						} else {
							if ((aop).equals(">=")) {
								return "<";
							} else {
								if ((aop).equals("<")) {
									return ">=";
								} else {
									return aop;
								}
							}
						}
					}
				}
			}
		}
	public static final Struct_NemoProg f_parseNemo(String afile) {
			final String l0_str = Native.getFileContent(afile);
			final Struct l1_t1 = Module_tree.f_setTree(Module_pegaction.g_defaultPegActions.f_t, "BuildSeq", Wrappers.w_BuildSeq);
			final Struct l2_t2 = Module_tree.f_setTree(l1_t1, "BuildChoice", Wrappers.w_BuildChoice);
			final Struct l3_t3 = Module_tree.f_setTree(l2_t2, "BuildIfElse", Wrappers.w_BuildIfElse);
			final Struct l4_t4 = Module_tree.f_setTree(l3_t3, "BuildWhile", Wrappers.w_BuildWhile);
			final Struct_SemanticActions l5_specialPegActions = (new Struct_SemanticActions(l4_t4));
			return ((Struct_NemoProg)Module_parsic.f_parsic(Module_driver.f_compilePegGrammar("prog = varDecl*:d ws body:b { NemoProg(:d, :b) };\n\nvarDecl = ws \"VAR\" ws char+$n ws \":\" ws type:t ws \";\" ws { VarDecl($n, :t) };\n\ntype  = int | array;\nint   =  ws \"INT\" ws                { bType(\"INT\") };\narray =  ws \"[\" ws type:t ws \"]\" ws { aType(:t) };\n\nbody = assign | print | iter | test | choice | seq | ifElse | while;\nassign = ws variable:v ws \":=\" ws exp:e                                                          { Assign(:v, :e) };\nprint = ws \"PRINT(\" exp:e \")\" ws                                                                 { Print(:e) };\niter = ws \"(\" ws body:op ws \")*\" ws                                                              { Iter(:op) };\ntest = ws \"(\" ws exp:e1 ws comparisonOp$op ws exp:e2 ws \")?\" ws                                  { Test($op, :e1, :e2) };\nchoice = ws \"(\" body:b choiceOp*:o \")\" ws                                                        { BuildChoice(:b, :o) };\nseq = ws \"(\" body:b seqOp*:o \")\" ws                                                              { BuildSeq(:b, :o) };\nifElse = ws \"IF\" ws exp:e1 comparisonOp$op exp:e2 ws \"THEN\" ws body:if ws \"ELSE\" ws body:else ws { BuildIfElse($op, :e1, :e2, :if, :else) };\nwhile = ws \"WHILE\" ws exp:e1 comparisonOp$op exp:e2 ws \"DO\" ws body:b ws                         { BuildWhile($op, :e1, :e2, :b)};\n\nexp = binaryOperator | const | app | upd | variable;\nbinaryOperator = ws \"(\" exp:e1 binaryOp$op exp:e2 \")\" ws                       { BinaryOp($op, :e1, :e2) };\nconst = ws digit+$d ws                                                         { Const(s2i($d)) };\napp  = ws \"(\" ws \"APP\" ws \"(\" exp:array \",\" exp:index \")\" ws \")\" ws            { App(:array, :index) };\nupd = ws \"(\" ws \"UPD\" ws \"(\" exp:array \",\" exp:index \",\" exp:val \")\" ws \")\" ws { Upd(:array, :index, :val) };\nvariable = ws char+$v ws                                                       { Var($v) };\n\ncomparisonOp = (\"==\" | \"<=\" | \">=\" | \"<\" | \">\" | \"!=\");\nbinaryOp = (\"+\" | \"*\" | \"/\" | \"-\" | \"%\");\nchoiceOp =  ws \"U\" body;\nseqOp = ws \";\" body;\n\nchar = 'a'-'z';\ndigit = '0'-'9';\nws = (' ' | '\\t' | '\\n' | '\\r')*;"), l0_str, l5_specialPegActions));
		}
}
