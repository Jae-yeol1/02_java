package com.E.section02.package_and_import;

//import com.E.section01.method.Calculator;

public class Application1 {
    public static void main (String[] args ){

        com.E.section02.package_and_import.test.Calculator calc =
                new com.E.section02.package_and_import.test.Calculator();

        int plusResult = calc.p2(100,50);
        System.out.println("plusResult = " + plusResult);

        int maxResult = com.E.section01.method.Calculator.max(100,50);
        System.out.println("maxResult = " + maxResult);
    }
}
