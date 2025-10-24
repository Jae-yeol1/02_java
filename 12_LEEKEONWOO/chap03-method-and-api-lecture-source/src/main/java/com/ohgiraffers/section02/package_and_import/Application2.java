package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;

//import static com.ohgiraffers.section02.package_and_import.test.Calculator.maxNumberOf;
//import static com.ohgiraffers.section02.package_and_import.test.Calculator.minNumberOf;
// import static com.ohgiraffers.section02.package_and_import.test.Calculator.*; // static 메소드 안에 모든 클래스 사용
//import static com.ohgiraffers.section01.method.Calculator.*; // 클래스명이 같으면 사용 불가


public class Application2 {

    public static void main(String[] args) {

        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = Calculator.maxNumberOf(10, 20); // static 메소드 사용방법 1(클래스명으로 시작)
        System.out.println("result2 = " + result2);

        int result3 = maxNumberOf(10, 20); //import문 생성, static 메소드 사용방법 2(import static을 이용해서)
        System.out.println("result3 = " + result3);
        int result4 = minNumberOf(10, 20);

        com.ohgiraffers.section01.method.Calculator cal2
                = new com.ohgiraffers.section01.method.Calculator();
    }


}
