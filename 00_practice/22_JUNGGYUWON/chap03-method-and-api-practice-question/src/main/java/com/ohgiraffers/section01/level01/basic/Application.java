package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        Calculator cal = new Calculator();

        cal.checkMethod();

        System.out.println(cal.sumTwoNumber(first, second));

        System.out.println(cal.multiTwoNumber(first, second));

        System.out.println(first + "과 " + second + "의 곱은 " + cal.multiTwoNumber2(first, second) + "입니다.");

    }
}
