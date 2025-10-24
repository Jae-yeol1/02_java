package com.ohgiraffers.section01.level01.exampe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner input = new Scanner(System.in);
        System.out.println("======================");

        //홀짝 판정
        System.out.print("정수 하나 입력: ");
        int number = input.nextInt();
        ExampleTest.evenOdd(number);
        System.out.println("======================");

        //최댓값 찾기
        System.out.println("정수 입력");
        System.out.print("num1 = ");
        int first = input.nextInt();
        System.out.print("num2 = ");
        int second = input.nextInt();
        ExampleTest.findMax(first, second);
        System.out.println("======================");

        //덧셈 퀴즈
        ExampleTest.randomMathQuiz();

    }
}
