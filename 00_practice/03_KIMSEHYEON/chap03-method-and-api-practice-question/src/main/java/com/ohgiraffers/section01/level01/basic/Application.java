package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.checkMethod();

        int first = 10;
        int second = 20;

        System.out.println(calculator.sumTwoNumber(first, second));
        System.out.println( calculator.multiTwoNumber(first, second));
        int result = calculator.multiTwoNumber2(first, second);
        System.out.println(first + "과 " + second + "의 곱은 " + result +"입니다.");

    }
}
