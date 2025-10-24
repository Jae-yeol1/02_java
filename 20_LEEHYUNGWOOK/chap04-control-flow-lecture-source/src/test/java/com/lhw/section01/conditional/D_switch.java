package com.lhw.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력: ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op ) {
            case '+': result = first + second; break;
            case '-': result = first - second; break;
            case '*': //break가 없으면 다음으로 넘어간다.
            case 'x': result = first * second; break;
            case '/': result = first / second; break;
            case '%': result = first % second; break;
            default:
        }
        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력: ");
        char op = sc.next().charAt(0);
        /*
        * 2개 이상의 명령문을 작정해야 하는 경우 {}을 생략하지 못하고 작성해ㅑㅇ 한다.
        * 반환값을 yield라는 명령문을 작성하여 명ㅅ히적으로 리턴한다.
        * */
        int result = switch (op ) {
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first + second;
            }
            case '-' -> first-second;
            case '*', 'x' -> first*second;
            case '/'-> first / second;
            case '%' -> first % second;
            default -> 0;
        };


        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
