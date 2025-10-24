package com.ohgiraffers.section02.package_and_import;
//import com.ohgiraffers.section01.method.Calculator;

public class Application1 {
    public static void main(String[] args){
        com.ohgiraffers.section02.package_and_import.test.Calculator cal
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();
        int plusResult = cal.plusTwoNumbers(100,50);
        System.out.println(plusResult);

        int maxResult =  com.ohgiraffers.section02.package_and_import.test.Calculator.maxNumberOf(100,50);
        System.out.println(maxResult);
    }
}
