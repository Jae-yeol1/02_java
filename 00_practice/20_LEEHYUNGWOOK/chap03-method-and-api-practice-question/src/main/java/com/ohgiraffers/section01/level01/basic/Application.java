package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.checkMethod();
        String sumTwoNum = calculator.sumTwoNumber(10,20);
        String mulTwoNum = calculator.multiTwoNumber(10,20);
        int mulTwoNum2 = calculator.multiTwoNumber2(10,20);
        System.out.println();
        System.out.println("sumTwoNum = " + sumTwoNum + ", Type = " + sumTwoNum.getClass().getName());
        System.out.println("mulTwoNum = " + mulTwoNum + ", Type = " + mulTwoNum.getClass().getName());
        System.out.println("mulTwoNum2 = " + mulTwoNum2 + ", Type = INT는 getClass() 호출 안됨");
    }
}
