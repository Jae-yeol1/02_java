package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator.checkMethod();
        int num1 = 10;
        int num2 = 20;
        String str = Calculator.sumTwoNumber(num1,num2);
        String str1 = Calculator.multiTwoNumber(num1,num2);
        int num = Calculator.multiTwoNumber2(num1,num2);
    }
}
