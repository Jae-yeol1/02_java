package com.ohgiraffers.level01.exampe;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ExampleTest exam=new ExampleTest();
        System.out.print("정수를 입력하세요 : ");
        int num=sc.nextInt();
        exam.evenOdd(num);

        System.out.print("두 정수를 입력하세요: ");
        int first=sc.nextInt();
        int second=sc.nextInt();
        exam.findMax(first,second);

        System.out.println("정수를 두개 입력하세요");
        first=sc.nextInt();
        second=sc.nextInt();
        exam.randomMathQuiz(first,second);
    }
}

