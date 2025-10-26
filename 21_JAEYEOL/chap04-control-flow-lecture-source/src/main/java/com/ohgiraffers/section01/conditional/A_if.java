package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자하나 입력 : ");
        int num = sc.nextInt();
        //짝수만 체크하고싶으면 조건문 걸기
        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다");
        }
        System.out.println("프로그램을 종료합니다");
    }
    public void testNestedIfStatment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();
        if ( num > 0 ){ // 홀 , 짝인지 확인하기전에 음수인지 양수인지 확인
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다");
            }
            System.out.println("프로그램을 종료합니다");
        }

    }
}
