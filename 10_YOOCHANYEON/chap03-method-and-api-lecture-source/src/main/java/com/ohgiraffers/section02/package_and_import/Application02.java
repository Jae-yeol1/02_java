package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;
//import static com.ohgiraffers.section02.package_and_import.test.Calculator.maxTwoNumbers;
//import static com.ohgiraffers.section02.package_and_import.test.Calculator.minTwoNumbers;
import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;



public class Application02 {

    public static void main(String[] args) {

        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result : " + result);

        int result2 = maxTwoNumbers(10, 20); // static 메소드 사용 방법 1 (클래스 명으로 시작)
        System.out.println("result2 : " + result2);

        int result3 = maxTwoNumbers(10, 20); // static 메소드 사용방법 2 (import static을 이용해서)
        System.out.println("result3 : " + result3);

        int result4 = minTwoNumbers(10, 20);
        System.out.println("result4 : " + result4);

        com.ohgiraffers.section01.method.Calculator cal2
                = new com.ohgiraffers.section01.method.Calculator();

        int result5 = cal2.plusTwoNumbers(10, 20);
        System.out.println("result5 : " + result5);


    }

}
