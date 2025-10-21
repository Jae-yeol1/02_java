package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int num1 = 10;
        int num2 = 20;
        cal.checkMethod();
        System.out.println(cal.sumTwoNumber(num1, num2));
        System.out.println(cal.multiTwoNumber(num1, num2));
        System.out.println(num1+ " 과 "+num2+ "의 곱은 "+cal.multiTwoNumber2(num1, num2)+"입니다.");
    }
}
