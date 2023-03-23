package org.example.parsing;

import static java.lang.String.format;

public class Subtraction extends Expression {
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " - " + right.toString();
    }
}
