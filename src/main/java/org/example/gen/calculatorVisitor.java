// Generated from java-escape by ANTLR 4.11.1
package org.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(calculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integers}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegers(calculatorParser.IntegersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedExpressions}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressions(calculatorParser.NestedExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(calculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(calculatorParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(calculatorParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DummyExpression}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummyExpression(calculatorParser.DummyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(calculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(calculatorParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#dummy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummy(calculatorParser.DummyContext ctx);
}