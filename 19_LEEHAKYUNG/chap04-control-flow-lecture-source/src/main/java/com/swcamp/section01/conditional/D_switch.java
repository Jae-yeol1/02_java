package com.swcamp.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력: ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case 'x':
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
        }
        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void improveSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력: ");
        char op = sc.next().charAt(0);
        int result = switch (op) {
            /* java 14부터 적용된 switch문*/
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first + second;
            }
            case '-' -> first - second;
            case 'x', '*' -> first * second;
            case '/' -> second / first;
            case '%' -> second % first;
            default -> 0;
        };
        System.out.println(first + " " + op + " " + second + " = " + result);

    }
}
