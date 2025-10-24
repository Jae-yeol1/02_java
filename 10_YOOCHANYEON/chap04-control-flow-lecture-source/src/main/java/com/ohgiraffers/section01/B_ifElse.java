package com.ohgiraffers.section01;

import java.util.Scanner;

public class B_ifElse {

//    public void testSimpleIfElseStatement() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자 하나 가 온나");
//        int num = sc.nextInt();
//
//        if(num%2==0){
//            System.out.println("마! 짝수 아이가!");
//        } else {
//            System.out.println("홀수제? 다 안다 임마");
//        }
//    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 가 온나!!!!!!!!!!!!!!!!!!");
        int num = sc.nextInt();

        if(num > 0) {
            if (num % 2 == 0) {
                System.out.println("마! 짝수 아이가!");
            } else {
                System.out.println("홀수제? 다 안다 임마");
            }
        } else {
            System.out.println("마이나쓰? 그런 거 모린다");
        }
    }
}
