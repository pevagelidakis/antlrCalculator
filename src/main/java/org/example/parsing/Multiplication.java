package org.example.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import static java.lang.String.format;

public class Multiplication extends Expression {
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("Multiplication",new JSONArray().put(1,left).put(2,right));
        return json;
    }

    public String toString(){
        return left.toString() + " * " + right.toString();
    }
}
