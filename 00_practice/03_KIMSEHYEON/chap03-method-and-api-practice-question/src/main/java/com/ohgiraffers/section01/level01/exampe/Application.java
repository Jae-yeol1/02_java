package com.ohgiraffers.section01.level01.exampe;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExampleTest ex = new ExampleTest();
        System.out.print("정수 한 개를 입력하세요: ");
        int value = input.nextInt();
        ex.evenOdd(value);

        System.out.print("첫번째 수 입력: ");
        int first = input.nextInt();
        System.out.print("두번째 수 입력: ");
        int second = input.nextInt();

        ex.findMax(first, second);

        ex.randomMathQuiz();


    }
}
