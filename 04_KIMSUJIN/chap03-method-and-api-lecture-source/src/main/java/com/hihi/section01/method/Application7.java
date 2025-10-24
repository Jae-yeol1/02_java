package com.hihi.section01.method;

public class Application7 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator calculator = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + calculator.plusTwoNumbers(first, second));
        //빼기
        System.out.println("두 수의 차는? " + calculator.subTwoNumbers(first, second));

        // 두 수 중에 최대값 구하기
        System.out.println("두 수 중 큰 값은? " + Calculator.maxNumberOf(first, second));
        //System.out.println("두 수 중 큰 값은? " + calculator.maxNumberOf(first, second)); => 권장하는 방식 아님
        // static => 객체 없어도 호출 가능. 굳이 cal~(객체)안쓰고 바로 Cal(클래스) 호출로 고고싱
    }
}
