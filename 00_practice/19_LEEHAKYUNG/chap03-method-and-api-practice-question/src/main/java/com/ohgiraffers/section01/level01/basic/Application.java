package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.checkMethod();
        System.out.println(cal.sumTwoNumber(10, 35));
        System.out.println(cal.multiTwoNumber(25, 5));
        cal.multiTwoNumber2(4, 16);
    }
}
