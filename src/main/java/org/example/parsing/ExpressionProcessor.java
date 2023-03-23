package org.example.parsing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.*;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String,Integer> values; /* symbol table */

    public ExpressionProcessor(List<Expression> list){
        this.list = list;
        values = new HashMap<>();
    }

    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();
        list.forEach(e->{
            e.setIndex(list.indexOf(e));
            String input = e.toString();
            int result = getEvalResult(e);
            evaluations.add(input +" is "+ result);
        });

        return evaluations;
    }

    private int getEvalResult(Expression e) {
        int result = 0;
        if(e instanceof Number){
            Number num = (Number) e;
            result = num.num;
        }else if(e instanceof Addition){
            Addition add = (Addition) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left + right;
        }else if(e instanceof Subtraction){
            Subtraction add = (Subtraction) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left - right;
        }else if(e instanceof Multiplication){
            Multiplication add = (Multiplication) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left * right;
        }else if(e instanceof Division){
            Division add = (Division) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = left / right;
        }else if(e instanceof Power){
            Power add = (Power) e;
            int left = getEvalResult(add.left);
            int right = getEvalResult(add.right);
            result = (int) Math.pow(left,right);
        }
        return result;
    }
}
