package com.lhw.section01.arithmatic;

public class Application1 {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        
        
        double testN = num1 / (double) num2;
        System.out.println("testN = " + testN);
        
        double resultNum = (int) testN / (double) 1000;
        System.out.println("resultNum = " + resultNum);
    }
}
