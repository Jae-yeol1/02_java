package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한개 입력 : ");
        int num = sc.nextInt();
        ExampleTest exampleTest = new ExampleTest();

        exampleTest.evenOdd(num);

        System.out.print("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int num2 = sc.nextInt();
        exampleTest.findMax(num1,num2);


        exampleTest.randomMathQuiz();

    }
}
