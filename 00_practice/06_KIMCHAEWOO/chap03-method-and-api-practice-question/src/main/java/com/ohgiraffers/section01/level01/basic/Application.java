package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int first = 5;
        int second = 8;

        cal.checkMethod();
        System.out.println(cal.sumTwoNumber(first, second));
        cal.multiTwoNumber(first, second);
        System.out.println(first + "와 " + second + "의 곱: " + cal.multiTwoNumber2(first, second));
    }
}
