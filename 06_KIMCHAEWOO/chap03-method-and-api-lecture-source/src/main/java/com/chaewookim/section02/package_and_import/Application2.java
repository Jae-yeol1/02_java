package com.chaewookim.section02.package_and_import;

import com.chaewookim.section02.package_and_import.test.Calculator;

//import static com.chaewookim.section02.package_and_import.test.Calculator.maxNumberOf;
//import static com.chaewookim.section02.package_and_import.test.Calculator.minNumberOf;
import static com.chaewookim.section02.package_and_import.test.Calculator.*;

public class Application2 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 =  minNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        int result3 = maxNumberOf(10, 20);
        System.out.println("result3 = " + result3);

        Calculator cal2 = new Calculator();
    }
}
