package com.hihi.section01.conditional;

import java.util.Scanner;

public class Aif {

    public void testSimpleIfStatement(){

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num  = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다. "); // 출력 확인 용도
    }

    public void testNestedIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num > 0) {//짝수인지 홀수인지 판별 전에 양수인지 음수인지 체크용
            if(num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다.");}}
        System.out.println("프로그램을 종료합니다.");
    }
}
