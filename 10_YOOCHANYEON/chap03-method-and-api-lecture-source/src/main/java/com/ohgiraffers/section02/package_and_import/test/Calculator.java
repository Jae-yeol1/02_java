package com.ohgiraffers.section02.package_and_import.test;

public class Calculator {

    public int plusTwoNumbers(int first, int second){
        return first + second;
    }
    public int subTwoNumbers(int first, int second){
        return first - second;
    }
    public static int minTwoNumbers(int first, int second){
        return (first > second) ? second : first;
    }

    public static int maxTwoNumbers(int first, int second){
        return (first < second) ? second : first;
    }
}
