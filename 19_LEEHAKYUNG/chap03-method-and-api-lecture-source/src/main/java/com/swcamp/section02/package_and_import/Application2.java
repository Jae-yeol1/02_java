package com.swcamp.section02.package_and_import;

import com.swcamp.section02.package_and_import.test.Calculator;
//import static com.swcamp.section01.method.Calculator.maxNumbersOf;
//import static com.swcamp.section01.method.Calculator.minNumbersOf;
import static com.swcamp.section01.method.Calculator.*;

public class Application2 {

    public static void main(String[] args) {

        // non-static method
        Calculator cal =  new Calculator();
        int result = cal.plusTwoNumbers(10, 90);
        System.out.println("result = " + result);

        // static method
        int result2 = Calculator.maxNumbersOf(27, 64);
        System.out.println("result2 = " + result2);

        // static method2 by import static
        int result3 = maxNumbersOf(10, 20);
        System.out.println("result3 = " + result3);

        // use * with import
        int result4 = minNumbersOf(3, 30);
        System.out.println("result4 = " + result4);

        //
        com.swcamp.section01.method.Calculator cal2
                = new com.swcamp.section01.method.Calculator();
        int result5 = cal2.plusTwoNumbers(10, 20);
        System.out.println("result5 = " + result5);


    }
}
