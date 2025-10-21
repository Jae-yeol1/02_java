package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num1 = input.nextInt();
        ExampleTest.evenOdd(num1);

        System.out.print("크기를 비교할 두 개의 숫자를 입력하세요: ");
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        ExampleTest.findMax(num2, num3);

        ExampleTest.randomMathQuiz();
    }
}
