package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 한 개를 입력해 주세요.");
        int num1 = sc.nextInt();

        ExampleTest exampleTest = new ExampleTest();
        exampleTest.evenOdd(num1);

        System.out.println();

        System.out.print("정수 두 개를 입력해 주세요.");
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        exampleTest.findMax(num2, num3);

        System.out.println();

        exampleTest.randomMathQuiz();
    }
}
