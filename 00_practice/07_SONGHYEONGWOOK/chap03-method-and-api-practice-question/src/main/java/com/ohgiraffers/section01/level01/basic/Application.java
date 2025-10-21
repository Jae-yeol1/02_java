package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int first = 10;
        int second = 20;

        cal.chechMethod();

        String resultMessage = cal.sumTwoNumber(first, second);
        cal.sumTwoNumber(first, second);
        System.out.println(resultMessage);

        cal.multiTwoNumber(first, second);
        String resultMessage2 = cal.multiTwoNumber(first, second);
        System.out.println(resultMessage2);

        cal.multiTwoNumber2(first, second);
    }
}
