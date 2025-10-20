package com.E.section03;

public class Application1 {
    public static void main(String [] args){
        int firstNum = 20;

        int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        //증가를 먼저 처리하고 난 뒤 다른 연산을 함

        System.out.println("result2 : " + ++secondNum * 3);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);

        int n = 10;
        int n2 = n++;
        System.out.println("n2 : " + n2);
        System.out.println("n : " + n);
        //n2에는 10을 넣고 이후에 +1 처리라 n만 11이 나옴

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;
        b = 2 * (-c + a++) - d;
        c *= 2;
        a = b++ + c;

        System.out.println("a = " + a);//-1
        System.out.println("b = " + b); //2
        System.out.println("c = " + c);//-2
        System.out.println("d = " + d); //7

        
    }
}
