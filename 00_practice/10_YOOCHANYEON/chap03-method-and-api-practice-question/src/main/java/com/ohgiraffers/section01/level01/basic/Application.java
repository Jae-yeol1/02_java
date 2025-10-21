package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int a = 10;
        int b = 20;
        String result1 = cal.sumTwoNumber(a, b);
        String result2 = cal.multiTwoNumber(a, b);

        cal.checkMethod();
        System.out.println(result1);
        System.out.println(result2);
        int result = cal.multiTwoNumber2(a, b);
        System.out.println(result);

    }
}
