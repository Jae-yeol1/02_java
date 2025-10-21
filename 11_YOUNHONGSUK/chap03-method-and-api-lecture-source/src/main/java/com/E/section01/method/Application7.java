package com.E.section01.method;

public class Application7 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator calc = new Calculator();

        System.out.println("sum = " + calc.p2(first, second));
        System.out.println("diff = " + calc.s2(first, second));
        System.out.println("min = " + Calculator.min(first, second));
        System.out.println("max = " + Calculator.max(first, second));

        //static methods should be called on the class itself instead of creating a new object
    }
}
