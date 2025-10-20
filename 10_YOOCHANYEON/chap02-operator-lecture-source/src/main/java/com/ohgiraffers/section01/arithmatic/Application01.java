package com.ohgiraffers.section01.arithmatic;

public class Application01 {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        double testNum = num1 / num2;
        System.out.println("testNum = " + testNum);
        System.out.println(">>>>" + (testNum * 1000));
        double resultNum = (int) (testNum * 1000) / (double) 1000;
        System.out.println("resultNum = " + resultNum);
    }
}
