package com.sekong.section3.branching;

public class Continue {
    // 4의 배수이면서 5의 배수인 값 출력
    public void testSimpleContinueStatement(){
        for(int i = 1; i<=100;i++){
            if(i % 4 == 0 && i % 5 == 0) System.out.println(i);
            continue;
        }
    }
    public void printGugudanFromTwotoNine(){

        for(int dan = 2; dan <= 9; dan++){
            for(int i = 1; i <= 9; i++){
                if(i % 2 == 0) continue;
                System.out.println(dan + " X " + i + " = " + (dan*i));
            }
        }
    }

    public void testJumpContinueJump(){
        label:
        for(int dan = 2; dan <= 9; dan++){
            for(int i = 1; i <= 9; i++){
                if(i % 2 == 0) continue label;
                System.out.println(dan + " X " + i + " = " + (dan*i));
            }
        }
    }
}
