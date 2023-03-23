package org.example.parsing;

import static java.lang.String.format;

public class Power extends Expression{
    Expression left;
    Expression right;

    public Power(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " ^ " + right.toString();
    }
}
