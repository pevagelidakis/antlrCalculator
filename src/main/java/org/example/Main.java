package org.example;

import org.example.gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.parsing.AntlrToProgram;
import org.example.parsing.ExpressionProcessor;
import org.example.parsing.Program;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        CharStream charStream = CharStreams.fromFileName("./src/main/java/antlr/lib/calculatorTestCase.txt");
        calculatorLexer cqlLexer = new calculatorLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cqlLexer);
        calculatorParser calcParser = new calculatorParser(commonTokenStream);
        calcParser.setBuildParseTree(true);
        ParseTree parseTree = calcParser.prog();
        System.out.println(parseTree.toStringTree(calcParser));
        AntlrToProgram progVisitor = new AntlrToProgram();
        Program prog = progVisitor.visit(parseTree);
        prog.expressions.forEach(expr -> System.out.println((new JSONObject(expr.toJSONString(expr)).toString(4))));
//        ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
//        ep.getEvaluationResults().forEach(System.out::println);

        new calculatorBaseListener().exitProgram(new calculatorParser.ProgramContext(calcParser.prog()));
//        cqlParser.setBuildParseTree(true);
//        ParseTree tree = cqlParser.library();
    }
}