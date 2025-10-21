package com.swcamp.section02.package_and_import.test;

public class Calculator {

    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int subTwoNumbers(int first, int second) {
        return first - second;
    }

    public static int minNumbersOf(int first, int second) {
        return (first < second) ? first : second;
    }

    public static int maxNumbersOf(int first, int second) {
        return (first > second) ? first : second;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Add: 10 + 20 = " + cal.plusTwoNumbers(10, 20));
        System.out.println("Sub: 10 - 20 = " + cal.subTwoNumbers(10, 20));
        System.out.println("The minimum number is " + minNumbersOf(10, 20));
        System.out.println("The maximum number is " + maxNumbersOf(10, 20));
    }
}
