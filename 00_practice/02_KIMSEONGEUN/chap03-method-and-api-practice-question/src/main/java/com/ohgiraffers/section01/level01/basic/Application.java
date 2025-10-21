package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();
        calculator.sumTwoNumber(10, 20);
        calculator.multiTwoNumber(10, 20);
        calculator.multiTwoNumber2(10, 20);
    }
}
