package com.swcamp.section03.branching;

public class B_continue {
    /* 4의 배수이면서 5의 배수인 값 출력 */
    public void testSimpleContinueStatement() {

        for (int i = 1; i <= 100; i++) {
            if ((i%4 != 0) || (i%5 != 0)) {
                continue;
            }
            System.out.println("4와 5의 공배수 = " + i);
        }
    }

    public void testSimpleContinueStatement2() {

        for (int i = 2; i < 10; i++) {
            System.out.println("=====" + i + "단" + "=====");
            for (int j = 1; j < 10; j++) {
                if (j%2 == 0) continue;
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {

        label:
        for (int i = 2; i < 10; i++) {
            System.out.println("=====" + i + "단" + "=====");
            for (int j = 1; j < 10; j++) {
                if (j%2 == 0) continue label;
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
