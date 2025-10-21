package com.ogiraffers.section01.arithmatic;

public class Application1 { new *

    public static void main(String[] args) { new *
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));


        System.out.println("testNum = " + testNum);
        double testNum = num1 / (double) num2;

        int a = 3;
        int addNum = num1++; // 10(11)
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b; // 3 + 4(4)  : a = 3, b=5, c = -1 d =// 7
        b = 2 * (-c + a++) = d; // a = 4, b =1, c = -1, d = 7
        c *= 2; // a = 4, b = 1, c = -2, d = 7
        a = b++ + c; // a = -1, b = 1(2), c = -2, d=7

        System.out.println("a = " + a); = -1
        System.out.println("b = " + b); = 2
        System.out.println("c = " + c); = -2
        System.out.println("d = " + d); = 7

    }
}
