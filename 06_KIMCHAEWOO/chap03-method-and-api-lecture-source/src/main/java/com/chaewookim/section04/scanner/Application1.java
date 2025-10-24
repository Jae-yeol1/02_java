package com.chaewookim.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {


        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
//
//        // 정수값 받기
//        // nextInt(): 입력받은 값을 int형으로 반환
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);
//
//        // 실수값 받기
//        // nextDouble(): 입력받은 값을 Double형으로 반환
//        System.out.print("키를 입력하세요: ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);
//
//        // 논리형 입력받기
//        // nextBoolean(): 입력받은 값을 boolean형으로 변환
//        // true/false만 받음
//        System.out.print("true or false를 입력: ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);
//
//        // 문자열 입력받기
//        // next(): 공백 또는 개행문자까지
//        System.out.print("이름을 입력하세요: ");
//        String name = sc.next();
//        System.out.println("name = " + name);
//        String name2 = sc.next();
//        System.out.println("name2 = " + name2);

        // nextLine(): 개행문자까지 공백문자 포함해서 가져옴
//        System.out.print("주소를 입력하세요: ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        // 문자
        // 문자만 입력받는 메소드는 Scanner에서 제공하지 않으므로
        // String에서 제공하는
        System.out.print("아무 문자나 입력: ");
        String string = sc.next();
        System.out.println("string = " + string.charAt(0));
    }
}
