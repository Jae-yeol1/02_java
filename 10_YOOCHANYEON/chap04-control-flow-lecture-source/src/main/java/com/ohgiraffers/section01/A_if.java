package com.ohgiraffers.section01;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 가 온나");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수 아이가?");
        }
        System.out.println("됐다 치아라 마");
    }

    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 가 온나");
        int num = sc.nextInt();

        if (num > 0) {  // 짝수인지 홀수인지 확인 전에 양수/음수 확인
            if (num % 2 == 0) {
                System.out.println("짝수 맞제?");
            }
        }
        System.out.println("됐다 고마");
    }
}
