// Generated from FracLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FracLangParser}.
 */
public interface FracLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FracLangParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FracLangParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FracLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FracLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(FracLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FracLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FracLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultDiv}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FracLangParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAddSub}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FracLangParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFractionNumDen}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFractionNumDen(FracLangParser.ExprFractionNumDenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFractionNumDen}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFractionNumDen(FracLangParser.ExprFractionNumDenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParent}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(FracLangParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParent}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(FracLangParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(FracLangParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnary}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(FracLangParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFractionNum}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFractionNum(FracLangParser.ExprFractionNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFractionNum}
	 * labeled alternative in {@link FracLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFractionNum(FracLangParser.ExprFractionNumContext ctx);
}