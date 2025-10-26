package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwichiStatment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력");
        char op = sc.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':   // break 가 없으니 x로 쩜프
            case 'x':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            /* case 에서 일치 값을 찾지 못할 경우 수행할 구문을 작성할 수 있다

             */
        }
        System.out.println(first + " " + op + " " + second + '=' + result);
    }

}