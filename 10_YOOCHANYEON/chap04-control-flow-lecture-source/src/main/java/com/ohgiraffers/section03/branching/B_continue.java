package com.ohgiraffers.section03.branching;

public class B_continue {

    /* 4의 배수이면서 5의 배수인 값을 출력 */
    public void testSimpleContinueStatement(){

        System.out.println("4와 5의 공배수 (1000 이하)");
        for(int i = 1; i <= 1000; i++){
            if(i % 4 ==0){
                if(i % 5 == 0){
                    System.out.println(i);
                }
            }
        }
        System.out.println("끗");
    }

    public void testSimpleContinueStatement2() {
        /*
        중첩 반복문 내 continue 사용에 대한 흐름
        continue는 모든 반복문을 뛰어 넘는 것이 아니라 가장 인접한 반복문의 실행만 건너뜀
         */
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("[" + dan + "단]");
            for(int i =1; i <=9; i++){
                if(i % 2 == 0) continue;
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println();
        }
    }

    public void tesJumpContinue() {
        label :
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("[" + dan + "단]");
            for(int i =1; i <=9; i++){
                if(i % 2 == 0) continue label;
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println();
        }
    }
}
