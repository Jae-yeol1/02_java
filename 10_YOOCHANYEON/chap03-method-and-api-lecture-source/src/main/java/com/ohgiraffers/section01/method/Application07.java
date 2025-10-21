package com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator calculator = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + calculator.plusTwoNumbers(first, second));
        // 뺄셈
        System.out.println("두 수의 차는? " + calculator.subTwoNumbers(first, second));
        // 두 수 중 최댓값 구하기
        System.out.println("두 수 중 큰 값은? " + Calculator.maxTwoNumbers(first, second));

    }
}
