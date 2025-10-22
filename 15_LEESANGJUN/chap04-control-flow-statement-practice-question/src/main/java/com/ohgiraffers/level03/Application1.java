package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        Scanner sc = new Scanner(System.in);

        // 두 정수 입력받기
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        // 연산 기호 입력받기
        System.out.print("연산 기호를 입력하세요 : ");
        char operator = sc.next().charAt(0);

        // 연산 결과를 저장할 변수
        int result = 0;
        boolean validOperator = true;

        // 연산 기호에 따른 계산
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                validOperator = false;
        }

        // 유효한 연산자인 경우에만 결과 출력
        if (validOperator) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        sc.close();
    }
}
