package com.lhw.section03;

public class Application1 {

    public static void main(String[] args) {

        int firstNum = 20;

        int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;			//증가를 먼저 처리하고 난 뒤 다른 연산을 함

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b; //d = 7 / b= 4
        b = 2 * (-c + a++) - d;// 8-7 = 1 b = 1 / a=4
        c *= 2; // c : -2
        a = b++ + c; // 1+ -2 = -1 b:2 / a:-1

        System.out.println("a : " + a); // a = -1
        System.out.println("b : " + b); // b = 2
        System.out.println("c : " + c); // c = -2
        System.out.println("d : " + d); // d = 7

    }
}
