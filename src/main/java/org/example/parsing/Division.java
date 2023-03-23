package org.example.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import static java.lang.String.format;

public class Division extends Expression {
    Expression left;
    Expression right;

    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public String toString(){
        return left.toString() + " / " + right.toString();
    }
}
