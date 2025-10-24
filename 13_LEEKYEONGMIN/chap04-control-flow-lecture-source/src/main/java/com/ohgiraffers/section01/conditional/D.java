package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D {
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();


        int result =0;
        switch (op){
            case '+' : result = first + second; break;
            case '-' : result = first - second; break;
            case '*' : result = first * second; break;
            case '/' : result = first / second; break;
            case '%' : result = first % second; break;
            // case에서 일치 값을 찾지 못할 경우 수행할 구문을 작성할 수 있다.
            default:
                System.out.println(first+" "+op+" "+second+"="+result);


        }
    }

    public void testComplexSwitchStatement() {
        int result = switch(op);
        case '+' -> first + second;
        case '-' -> first - second;
    }
}
