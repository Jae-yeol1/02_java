package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calcultor = new Calculator();
        calcultor.checkMethod();
        int num1 = 10;
        int num2 = 20;
        String result = calcultor.sumTwoNumber(num1, num2);
        System.out.println(num1 + "과" + num2 + " 의 합은 " + result + "입니다.");

        String result2 = calcultor.multiTwoNumber(num1, num2);
        System.out.println(num1 + "과" + num2 + " 의 곱은 " + result2 + "입니다.");

        int result3 = calcultor.multiTwoNumber2(num1, num2);
        System.out.println(num1 + "과" + num2 + " 의 곱은 " + result3 + "입니다.");

    }
}
