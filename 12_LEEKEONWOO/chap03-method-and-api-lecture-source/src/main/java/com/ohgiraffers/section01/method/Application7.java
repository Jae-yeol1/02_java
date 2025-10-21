package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator calculator = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + calculator.plusTwoNumbers(first, second));

        // 빼기
        System.out.println("두 수의 차는? " + calculator.subTwoNumbers(first, second));

        // 두 수중 최대값 구하기
        System.out.println("두 수 중 큰 값은? " + Calculator.maxNumberOf(first, second));
        System.out.println("두 수 중 큰 값은? " + calculator.maxNumberOf(first, second)); // 실행되긴 하나 권장하진 않는다.

        // 두 수중 최소값 구하기
        System.out.println("두 수중 작은 값은? " + Calculator.minNumberOf(first, second));
    }
}
