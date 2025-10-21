package com.ohgiraffers.section02.package_and_import;
import com.ohgiraffers.section02.package_and_import.test.Calculator;
import static com.ohgiraffers.section02.package_and_import.test.Calculator.maxTwoNumber;
import static com.ohgiraffers.section02.package_and_import.test.Calculator.minNumberOf;



public class Application2 {
    public static void main(String[] args) {
        // non-static-method
        Calculator cal = new Calculator();
       int result = cal.plusTwoNumber(10,20);
        System.out.println("result : "+ result);

        int result2= maxTwoNumber(10,20);
        System.out.println("result2 : "+ result2);

        int result3= Calculator.maxTwoNumber(30,15);
        System.out.println("result3 : "+ result3);

        int result4=minNumberOf(10,20);
        System.out.println("result4 : "+ result4);

        com.ohgiraffers.section01.level01.basic.Calculator cal2
                = new com.ohgiraffers.section01.level01.basic.Calculator();
        int result5= cal2.multiTwoNumber2(10,20);
        System.out.println("result5 : "+ result5);


    }


}
