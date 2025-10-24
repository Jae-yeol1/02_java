package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ExampleTest et = new ExampleTest();

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        et.evenOdd(num1);

        System.out.println("------------------------------");

        System.out.print("숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("숫자를 다시 입력해주세요 : ");
        int num3 = sc.nextInt();
        et.findMax(num2, num3);

        System.out.println("------------------------------");

        System.out.print("num1 + num2 = ? \n?는 뭘까 : ");
        int ans = sc.nextInt();
        et.randomMathQuiz(ans);



    }
}
