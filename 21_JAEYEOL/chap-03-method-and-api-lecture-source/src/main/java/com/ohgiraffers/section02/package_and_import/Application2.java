package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section02.package_and_import.test.Calculator.maxNumberof;
import static com.ohgiraffers.section02.package_and_import.test.Calculator.*;
//import static com.ohgiraffers.section02.package_and_import.test.Calculator.minNumberof;
//import static com.ohgiraffers.section02.package_and_import.test.Calculator.minNumberof;

public class Application2 {
    public static void main(String[] args) {

        //non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10,20);
        System.out.println("result = " + result);

        int result2 = cal.plusTwoNumbers(10,20);  // static 매서드 사용법1 ( 클래스 명으로 시작 )
        System.out.println("result2 = " + result2);

        int result3 = maxNumberof(10,20);
        System.out.println("result3 = " + result3); // static 매서드 사용법2 ( import static을 이용해서 )

        int result4 = minNumberof(10,20);
        System.out.println("result4 = " + result4);


        com.ohgiraffers.section01.method.Calculator cal2
                = new com.ohgiraffers.section01.method.Calculator();
        int result5 = cal2.plusTwoNumbers(10,20);
        System.out.println("result5 = " + result5);


    }


}
