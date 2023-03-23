package org.example.parsing;

import org.example.gen.calculatorBaseVisitor;
import org.example.gen.calculatorParser;
import org.example.gen.calculatorVisitor;

public class AntlrToProgram extends calculatorBaseVisitor<Program> {
    @Override
    public Program visitProgram(calculatorParser.ProgramContext ctx) {
        Program prog =  new Program();
        AntlrToExpression antlrToExpression = new AntlrToExpression();
        for (var i = 0; i < ctx.getChildCount(); i++){
            if (i == ctx.getChildCount() - 1){
                
            }else {
                prog.addExpression(antlrToExpression.visit(ctx.getChild(i)));
            }
        }
        return prog;

    }
}
