package org.example.parsing;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Program{
    public List<Expression> expressions;
    public Program() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        new JSONObject(e.toJSONString(e));
        expressions.add(e);
    }
}