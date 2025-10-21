package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();
        String sum = calculator.sumTwoNumber(1,2);
        System.out.println(sum);
        String mul = calculator.multiTwoNumber(3,4);
        System.out.println(mul);
        calculator.multiTwoNumber2(2,2);
    }
}
