package com.sekong.section1.conditional;

public class Application {
    public static void main(String[] args) {
        If1 if1 = new If1();
//        if1.testSimpleIfStatement();
//        if1.testNestedIfStatement();
        Ifelse ifelse = new Ifelse();
//        ifelse.testSimpleIfElseStatement();
//        ifelse.testSimpleNestedIfElseStatement();
        IfelseIf ifesleif = new IfelseIf();
//        ifesleif.testSimpleIfElseIfStatement();
        ifesleif.testSimpleNestedIfElseIfStatement();
    }
}
