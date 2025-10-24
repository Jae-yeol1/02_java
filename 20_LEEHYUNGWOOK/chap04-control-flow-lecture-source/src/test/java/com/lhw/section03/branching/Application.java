package com.lhw.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break abreak = new A_break();
        //abreak.tsetSimleBreakStatement();
//        abreak.testSimpleDoWhileStatement2();
//        abreak.testJumpBreak();

        B_continue bcon =  new B_continue();
//        bcon.testSimpleContinueStatement();
//        bcon.testSimpleContinueStatement2();
        bcon.testJumpContinue();
    }
}
