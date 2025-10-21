package com.swcamp.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /*
        Scanner 사용 시 유의 사항
         */
        Scanner sc = new Scanner(System.in);


        /* 1. 개행 문자를 남기는 메소드에 대해 */
//        System.out.print("숫자 입력: ");
//        int num = sc.nextInt();
//        System.out.println("num = " + num);   // println이 버퍼에 개행문자를 남김.

//        System.out.print("문자열 입력: ");
//        String str = sc.nextLine();         // nextLine이 버퍼에 있는 개행문자를 그냥 바로 가져옴
//        System.out.println("str = " + str);
//        sc.nextLine();
//        System.out.print("문자열 입력: ");
//        String str = sc.nextLine();
//        System.out.println("str = " + str);

        /* 2. next 메소드로 읽어왔지만 "공백"을 포함한 문자열이어서 입력 버퍼에 남아 있게 되면
              이후의 메소드 타입이 맞지 않아 java.util.InputMismatchException 발생
         */
        System.out.print("문자열 입력: ");
        String str2 = sc.next();            // 공백이 있을 것 같으면 nextLine()으로 입력받
        System.out.println("str2 = " + str2);
        System.out.print("숫자 입력: ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);


    }
}
