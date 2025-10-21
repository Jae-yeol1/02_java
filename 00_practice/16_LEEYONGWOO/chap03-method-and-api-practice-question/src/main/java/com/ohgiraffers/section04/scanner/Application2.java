package com.ohgiraffers.section04.scanner;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 1. 개행 문자를 남기는 메소드 뒤에 nextLine()이 오면 개행 문자를 읽고 넘어가버리는 문제가 발생
        System.out.print("숫자입력");
        int num=sc.nextInt();
        System.out.println("num : " + num);

        sc.nextLine(); // nextInt()가 읽어가지 않은 개행 문자를 입력버퍼에서 제거하는 용도

        System.out.print("문자열 입력 : ");
        String str=sc.nextLine();
        System.out.println("str : " + str);

        /***
         * 2. next메소드로 읽어왔지만 공백이 있을경우에는 에러를 일으킨다. (next()는 공백을 기준으로 문자열을 구분)
         */
        System.out.print("문자열 입력 : ");
        String str2=sc.next(); //"공백 포함"이 예상되는 문자열은 nextLine()으로 입력받기
        System.out.println("str2 : " + str2);

        System.out.println("숫자 입력: ");
        int num2=sc.nextInt();
        System.out.println("num2 : " + num2);

    }
}
