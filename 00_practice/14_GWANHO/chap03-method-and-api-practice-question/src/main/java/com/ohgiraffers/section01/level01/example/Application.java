package com.ohgiraffers.section01.level01.example;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExampleTest example = new ExampleTest();

        // 1
        Scanner sc = new Scanner(System.in);
        example.evenOdd(sc.nextInt());

        // 2
        example.findMax(sc.nextInt(), sc.nextInt());

        // 3
        example.randomMathQuiz();
    }
}
