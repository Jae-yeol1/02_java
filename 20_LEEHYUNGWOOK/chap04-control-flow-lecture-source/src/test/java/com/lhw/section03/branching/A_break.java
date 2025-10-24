package com.lhw.section03.branching;

public class A_break {

    public void tsetSimleBreakStatement() {
        int sum = 0;

        int i = 1;

        while(true) {
            sum += i++;
            if (i > 100) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }

    public void testSimpleDoWhileStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                if(su>5) break;
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
    }

    public void testJumpBreak() {
        label:
        for(;;) { //무한루프
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                if(i == 3) break label;
            }
        }
    }
}
