package com.chaewookim.section3.branching;

public class A_break {

    public void testSimpleBreakStatement() {
        int sum = 0;

        int i = 1;

        while (true) {
            sum += i++;

            if (i > 100) {
                break;
            }
        }

        System.out.println("sum = " + sum);

    }

    public void testSimpleBreakStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=======" + dan + "단 ======");
            for (int su = 1; su <= 9; su++) {
                if (su > 5) break;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }

    public void testJumpBreak() {
        label:
        for (;;) {
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                if ( i == 3) break label;
            }
        }
    }

}
