package com.ohgiraffers.section01.level01.exampel;

import com.ohgiraffers.section01.level01.exampel.ExampleTest;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExampleTest test = new ExampleTest();
        System.out.println("evenOdd");
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        test.evenOdd(num);

        System.out.println("findMax");
        System.out.print("첫번 째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번 째 숫자 입력 : ");
        int second = sc.nextInt();
        test.findMax(first, second);

        System.out.println("randomMathQuiz");
        test.randomMathQuiz();

        sc.close();

    }
}
