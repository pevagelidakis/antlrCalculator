package org.example.parsing;

import org.json.JSONArray;
import org.json.JSONObject;

import static java.lang.String.format;

public class NestedExpression extends Expression{
    Expression expr;
    public NestedExpression(Expression expr){
        this.expr = expr;
    }

    public String toJSONString(){
        return format("{NestedExpression: [%s]}",expr.toString());
    }
    public String toString(){
        return expr.toString();
    }

}
