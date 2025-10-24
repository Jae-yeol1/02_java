package com.hihi.section02.package_and_import;

import com.hihi.section02.package_and_import.test.Calculator;
import static com.hihi.section01.method.Calculator.*;

//import static com.hihi.section02.package_and_import.test.Calculator.minNumberOf;

public class Application2 {

    public static void main(String[] args) {

        //non-static-method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = Calculator.maxNumberOf(10, 20);   // static 메서드 사용방법 1 (클래스명으로 시작)
        System.out.println("result2 = " + result2);

        int result3 = Calculator.maxNumberOf(10, 20); // static 메소드 사용방법 2( import static 이용해서)
        System.out.println("result3 = " + result3);

        int result4 = minNumberOf(10, 20);

        com.hihi.section01.method.Calculator cal2 = new com.hihi.section01.method.Calculator();
        int result5 = cal2.plusTwoNumbers(10, 20);

    }}
