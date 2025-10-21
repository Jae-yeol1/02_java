package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator.checkMethod();

        System.out.println(Calculator.sumTwoNubmer(10, 20));

        System.out.println(Calculator.multiplyTwoNubmer(10, 20));

        int a = 10;
        int b = 20;
        System.out.println(a + "과 " + b + "의 곱은 " + Calculator.multiplyTwoNubmer2(10, 20) + "입니다.");
    }
}
