package org.com.ohgiraffers.section1;

import java.util.Scanner;

public class B_ifelse {
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");

        }
        else {
            System.out.println("홀수입니다.");

        }
    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수입니다.");

            }
            else {
                System.out.println("홀수입니다.");

            }
        }
        else {
            System.out.println("양수가 아닙니다.");
        }
    }
}
