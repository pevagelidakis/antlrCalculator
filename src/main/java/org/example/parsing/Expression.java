package org.example.parsing;

import static java.lang.String.format;

public abstract class Expression {
    int index;
    public String toJSONString(Expression expr){
        String result;
        if (expr instanceof NestedExpression){
            result = format("{NestedExpression: %s}",expr.toJSONString(expr));
        } else if (expr instanceof Multiplication) {
            result = format("{Multiplication: [%s, %s]}",expr.toJSONString(((Multiplication) expr).left), expr.toJSONString(((Multiplication) expr).right));
        } else if (expr instanceof Addition) {
            result = format("{Addition: [%s, %s]}",expr.toJSONString(((Addition) expr).left), expr.toJSONString(((Addition) expr).right));
        } else if (expr instanceof Division) {
            result = format("{Division: [%s, %s]}",expr.toJSONString(((Division) expr).left), expr.toJSONString(((Division) expr).right));
        } else if (expr instanceof Subtraction){
            result = format("{Subtraction: [%s, %s]}",expr.toJSONString(((Subtraction) expr).left), expr.toJSONString(((Subtraction) expr).right));
        } else if (expr instanceof Number){
            result = format("{Number: %d}",((Number) expr).num);
        } else result = format("{%s: %s}",expr.getClass().getName(), expr);
        return result;
    }
    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }

}



                    //MAKE IT JSON!