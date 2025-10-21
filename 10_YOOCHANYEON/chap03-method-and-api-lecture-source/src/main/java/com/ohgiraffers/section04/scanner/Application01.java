package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        System.out.println("hello");
        // 1. Scanner 객체
        // System.err.println("hello");
        Scanner sc = new Scanner(System.in);

//        // 정수 값 받기
//        // nextInt() : 입력 받은 값을 int 형으로 반환
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("나이 : " + age + "살");
//
//        // 실수 값 받기
//        // nextDouble() : 입력 받은 값을 double 형으로 반환
//        System.out.println("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("키 : " + height + "cm");
//
//        // 논리형 입력 받기
//        // nextBoolean() : 입력 받은 값을 boolean 형으로 반환, true/false만 받음
//        System.out.println("그게 사실이야?");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue : " + isTrue);
//
//        // 문자형 입력 받기
//        // next() : 공백 또는 개행문자까지
//        System.out.println("키미노 나마에와? ");
//        String firstName = sc.next();
//        System.out.print(firstName + " ");
//        String lastName = sc.next();
//        System.out.println(lastName + " 데스");

        // nextLine() : 개행문자까지 다 가져옴, 공백 포함
//        System.out.println("느그 서장 어데 사노 ");
//        String address = sc.nextLine();
//        System.out.println("느그 서장 " + address + " 살제?");

        // 문자
        // 문자만 입력 받는 메소드는 Scanner에서 제공하지 않으므로
        // String에서 제공하는 charAt(index) 메소드를 통해 문자를 분리해서 활용 가능
        System.out.println("씨부리봐라");
        String ch =  sc.next();
        char ch1 = ch.charAt(0);
        System.out.println(ch + "의 " + ch1);
    }
}
