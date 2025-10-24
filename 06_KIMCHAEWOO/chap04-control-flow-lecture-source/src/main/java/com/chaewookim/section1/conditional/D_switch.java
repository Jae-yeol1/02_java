package com.chaewookim.section1.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.print("연산자: ");
        String op = sc.next();

        int result = 0;

        switch (op) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*":
            case "x": result = first * second; break;
            case "/": result = first / second; break;
            case "%": result = first % second; break;

            default:
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int first = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int second = sc.nextInt();
        System.out.print("연산자: ");
        char op = sc.next().charAt(0);

        // 문장이 2개 이상일 때 {} 생략 불가능
        // yield라는 명령문으로 값 삽입
        int result = switch (op) {
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first + second;
            }
            case '-' -> first - second;
            case 'x', '*' -> first * second;
            case '%' -> first % second;
            case '/' -> first / second;

            default -> 0;
        };

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

}
