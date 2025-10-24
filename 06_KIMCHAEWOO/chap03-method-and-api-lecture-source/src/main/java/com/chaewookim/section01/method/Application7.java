package com.chaewookim.section01.method;

import com.chaewookim.section02.package_and_import.test.Calculator;

public class Application7 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합: " + cal.plusTwoNumbers(first, second));
        // 뺄셈
        System.out.println("두 수의 차: " + cal.subTwoNumbers(first, second));
        // 두 수 중 큰 수
        System.out.println("두 수 중 큰 수: " + Calculator.maxNumberOf(first, second));
        // 두 수 중 작은 수
        System.out.println("두 수 중 작은 수: " + Calculator.minNumberOf(first, second));

    }
}
