package com.sekong.section1.conditional;

import java.util.Scanner;

public class Ifelse {
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나 입력: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("짝수 입니다.");
        }else {
            System.out.println("홀수 입니다.");

        }
    }
    public void testSimpleNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나 입력: ");
        int num = sc.nextInt();
        if(num > 0){
            if(num % 2 == 0) {
                System.out.println("짝수 입니다.");
            }else {
                System.out.println("홀수 입니다.");

            }

        }else{
            System.out.println("음수 입니다.");

        }
    }
}
