package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement(){

        int sum = 0;

        int i = 1;

        while(true) {
            sum += i++;
            // 중단 조건
            if (i > 35420) break;
        }

        System.out.println("sum = " + sum);
    }

    public void testSimpleBreakStatement2(){

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("[" + dan + "단]");
            for(int i =1; i <=9; i++){
                if(i > 5) break;
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println();
        }
    }

    public void testJumpBreak() {
        label:
        for(;;) {
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3) break label;
            }
        }
    }
}
