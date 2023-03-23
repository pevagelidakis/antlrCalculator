// Generated from java-escape by ANTLR 4.11.1
package org.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(calculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(calculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegers(calculatorParser.IntegersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegers(calculatorParser.IntegersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpressions}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressions(calculatorParser.NestedExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpressions}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressions(calculatorParser.NestedExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(calculatorParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(calculatorParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(calculatorParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(calculatorParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(calculatorParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(calculatorParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DummyExpression}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDummyExpression(calculatorParser.DummyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DummyExpression}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDummyExpression(calculatorParser.DummyExpressionContext ctx) throws Exception;
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(calculatorParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(calculatorParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(calculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(calculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#dummy}.
	 * @param ctx the parse tree
	 */
	void enterDummy(calculatorParser.DummyContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#dummy}.
	 * @param ctx the parse tree
	 */
	void exitDummy(calculatorParser.DummyContext ctx);
}