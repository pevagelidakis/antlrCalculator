package org.example.parsing;

import static java.lang.String.format;

public class Number extends Expression{
    int num;
    public Number(int num){
        this.num = num;
    }

    public String toJSONString(){
        return format("{Number: %d}",num);
    }

    public String toString(){
        return Integer.toString(num);
    }

}