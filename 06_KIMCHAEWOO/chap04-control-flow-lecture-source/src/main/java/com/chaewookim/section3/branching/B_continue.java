package com.chaewookim.section3.branching;

public class B_continue {
    public void  testSimpleContinueStatement() {
        for (int i = 1; i <= 100; i++) {
            if (i % 4 != 0 || i % 5 != 0) continue;

            System.out.println("i = " + i);
        }
    }

    public void testSimpleContinueStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=======" + dan + "단 ======");
            for (int su = 1; su <= 9; su++) {
                if (su % 2 == 0) continue;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }

    public void testJumpContinue() {
        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=======" + dan + "단 ======");
            for (int su = 1; su <= 9; su++) {
                if (su % 2 == 0) continue label;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }
}
