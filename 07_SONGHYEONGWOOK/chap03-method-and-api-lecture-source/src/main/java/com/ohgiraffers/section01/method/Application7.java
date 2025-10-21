package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + cal.plusTwoNumbers(first, second));

        // 뺄셈
        System.out.println("두 수의 차는? " + cal.subTwoNumbers(first, second));

        // 두 수 중에서 최대값 구하기
        System.out.println("두 수 중 큰 값은? " + Calculator.maxNumberOf(first, second));

        // 두 수 중에서 최소값 구하기
        System.out.println("두 수 중 작은 값은? " + Calculator.minNumberOf(first, second));

    }
}
