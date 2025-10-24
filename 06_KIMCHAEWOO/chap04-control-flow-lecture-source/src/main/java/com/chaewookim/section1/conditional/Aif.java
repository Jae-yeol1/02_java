package com.chaewookim.section1.conditional;

import java.util.Scanner;

public class Aif {
    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나 입력: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력값은 짝수");
        }

        System.out.println("프로그램을 종료합니다");
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나 입력: ");
        int num = sc.nextInt();

        if (num > 0) { // 홀짝 확인 전에 양수음수 확인
            if (num % 2 == 0) {
                System.out.println("입력값은 짝수");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
