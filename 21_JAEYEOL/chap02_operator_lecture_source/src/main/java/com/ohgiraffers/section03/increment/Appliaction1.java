package com.ohgiraffers.section03.increment;

public class Appliaction1 {
    public static void main(String[] args) {

        int firstnum = 20 ;
        System.out.println("num = " + firstnum);

        int result1 = firstnum++ * 3; // 다른연산을 처리하고 난 뒤 마지막에 증가
        System.out.println("result1 = " + result1);
        System.out.println("firstNum = " + firstnum);



        int secondNum = 20;
        int result2 = ++secondNum * 3; // 증가를 처리하고 연산을함

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++; // 10 (11)
        System.out.println("addNum : " + addNum);
        System.out.println("num1 = " + num1); // 이건 11

        int a = 3;
        int b= 5;
        int c = -1;
        int d = a + --b; //b의 값이 5에서 4가된다. //a= 3  b 가 앞에 붙어있으면 3+ 4(4)  : a = 3 b = 5 c= -1  d= 7
        b = 2*(-c + a++) - d;  // a = 3  . 2 * (-(-1 + 3 ) - 7
        c *= 2;  // a = 4 b = 1 , c = -2 , d = 7
        a = b++ + c;  // a = 1(2) + -(2)  = -1

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
