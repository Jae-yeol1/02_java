package com.lhw.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if aif = new A_if();
        B_ifElse bif = new B_ifElse();
        C_ifElseif cif = new C_ifElseif();
        D_switch dif = new D_switch();

        //aif.testSimpleIfStatement();
        //aif.testNestedIfStatement();
        //bif.testSimpleIfElseStatement();
        //bif.testNestedIfElseStatement();
        //cif.testIfElseIfStatement();

        //dif.testSimpleSwitchStatement();
        dif.improveSimpleSwitchStatement();
    }
}
