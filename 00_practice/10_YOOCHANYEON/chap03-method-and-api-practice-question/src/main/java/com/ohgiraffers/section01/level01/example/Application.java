package com.ohgiraffers.section01.level01.exampe;

import java.util.Scanner;
public class Application {

    public static void main(String[] args){
        ExampleTest exam = new ExampleTest();

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 하나 말해봐");
        int value = sc.nextInt();
        exam.evenOdd(value);

        String a = sc.nextLine();

        System.out.println("숫자 두 개 씨부려봐");
        int first = sc. nextInt();
        int second = sc. nextInt();
        exam.findMax(first,second);

        String b = sc.nextLine();

        exam.randomMathQuiz();
    }
}

