package com.ohgiraffers.section04;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("hello");
        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환한다.
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        // 실수값 받기
        // nextDouble() : 입력받은 값을 double형으로 반환
//        System.out.print("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);

        // 논리형 입력 받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환 true/false만 받는다.
//        System.out.print("true or false 를 입력 : ");
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);

        // 문자열 입력받기
        // next() : 공백 또는 개행문자까지
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.println("name = " + name);
//        String name2 = sc.next();
//        System.out.println("name2 = " + name2);

        // nextLine() : 개행문자까지 다 가져온다. 공백포함
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.println("address = " + address);

        // 문자
        // 문자만 입력받는 메소드는 Scanner에서 제공하지 않으므로
        // String에서 제공하는 charAt(index) 메소드를 통해 문자를 분리해서 활용할 수 있다.
        System.out.print("아무 문자나 입력 : ");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);
        // 문자형 값 입력받기
        /* 아쉽게도 문자를 직접 입력 받는 기능을 제공하지는 않는다.
         * 따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
         * java.lang.String에 charAt(int index)를 사용한다.
         * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 형으로 반환해주는 기능을 한다.
         *
         * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용되는 방식이다.
         * 만약 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        sc.nextLine();		//이건 뒤에서 설명할 예정이다
        System.out.print("아무 문자나 입력 해주세요 : ");
        char ch2 = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch2 + "입니다.");
    }

}

