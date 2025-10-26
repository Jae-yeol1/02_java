package com.ohgiraffers.section04.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Appliaction1 {
    public static void main(String[] args) {
        System.out.println("hello");
        // 1. Scanner 객체생성
        Scanner sc = new Scanner(System.in);
        /*//정수값 받기
        // nextInt() : 입력받은 값을 int 형으로 변환
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 컨트롤 알트 v 추론 sc 는 스캐너 클래스 , 스캐너는 자바  기본 입력문
        System.out.println("age = " + age);

        // 실수값 받기
        //  next double() 입력받은값을 double 형으로 반환
        System.out.print("키를입력하세요 : ");
        double height = sc.nextDouble();
        System.out.println("height = " + height);*/
        //논리형 입력받기
        //nextBoolean() : 입력받은 값을 boolean 형으로 변환 true/false 만  받는다.
//        System.out.print("true or false : ");
//        boolean istrue = sc.nextBoolean();
//        System.out.println("isture = "+ istrue);


        // 문자열 입력받기
        //next() : 공백또는 개행문자까지
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.println("name = "+ name);
//        String name2 = sc.next();
//        System.out.println("name2 = "+ name2);  // 임 재열 치면 네임 1 2 로 출력됨 버퍼와의 관계 생각하기

        //nextLine(): 개행문자까지 다 가져온다. 공백포함 임 재열 쳐도 한 행으로 출력됨
//        System.out.print("주소를 입력하세요 : ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        //문자
        //문자만 입력받는 메소드는 Scanner 에서 제공하지 않는다
        //String 에서 제공하는 charAt 메소드를 통해 문자를 분리해서 활용 가능.
        System.out.println("아무 문자나 입력");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch );


    }
}
