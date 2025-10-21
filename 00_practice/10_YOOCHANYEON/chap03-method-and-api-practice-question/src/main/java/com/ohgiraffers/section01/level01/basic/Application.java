package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.checkMethod();

        int a = 10;
        int b = 20;

        String resultSum = cal.sumTwoNumber(a, b);
        String resultMul = cal.multiTwoNumber(a, b);
        System.out.println(resultSum);
        System.out.println(resultMul);

        int result = cal.multiTwoNumber2(a, b);
        System.out.println(result);
    }
}
