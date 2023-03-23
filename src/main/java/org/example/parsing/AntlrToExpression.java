package org.example.parsing;

import org.example.gen.*;

public class AntlrToExpression extends calculatorBaseVisitor<Expression>{

    public AntlrToExpression() {}

    @Override
    public Expression visitIntegers(calculatorParser.IntegersContext ctx) {
        return new Number(Integer.parseInt(ctx.getChild(0).getText()));
    }

    @Override
    public Expression visitNestedExpressions(calculatorParser.NestedExpressionsContext ctx) {
        Expression expr = visit(ctx.getChild(1));
        return new NestedExpression(expr);
    }

    @Override
    public Expression visitMultiplication(calculatorParser.MultiplicationContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Multiplication(left,right);
    }

    @Override
    public Expression visitAddition(calculatorParser.AdditionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Addition(left,right);
    }

    @Override
    public Expression visitSubtraction(calculatorParser.SubtractionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Subtraction(left,right);    }

    @Override
    public Expression visitDummyExpression(calculatorParser.DummyExpressionContext ctx) {
        return super.visitDummyExpression(ctx);
    }

    @Override
    public Expression visitDivision(calculatorParser.DivisionContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Division(left,right);    }

    @Override
    public Expression visitPower(calculatorParser.PowerContext ctx) {
        Expression left = visit(ctx.getChild(0));
        Expression right = visit(ctx.getChild(2));
        return new Power(left,right);    }

    @Override
    public Expression visitDummy(calculatorParser.DummyContext ctx) {
        return super.visitDummy(ctx);
    }
}