package org.com.ohgiraffers.section02.package_and_import;

import org.com.ohgiraffers.section02.package_and_import.test.calculator;

//import static org.com.ohgiraffers.section02.package_and_import.test.calculator.maxNumberOf;
//import static org.com.ohgiraffers.section02.package_and_import.test.calculator.minNumberOf;
import static org.com.ohgiraffers.section02.package_and_import.test.calculator.*;

public class Application2 {
    public static void main(String[] args) {

        //non static-method
        calculator cal = new calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println("result = " + result);

        int result2 = calculator.maxNumberOf(10, 20); //static 메소드 사용방법(클래스명으로 시작)
        System.out.println("result2 = " + result2);

        int result3 = maxNumberOf(10, 20);
        System.out.println("result3 = " + result3); // import static 사용

        int result4 = minNumberOf(10, 20);
        System.out.println("result4 = " + result4);


    }
}
