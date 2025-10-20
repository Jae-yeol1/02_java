package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {
        // 정수 : 1 byte < 2 short < 4 int(*) < 8 long
        // 실수 : 2 float < 4 double(*)
        // 문자 : 2 char
        // 논리 : 1 boolean
        byte bNum = 1;

        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1); // 문자형은 int형으로 자동형변환 가능

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
    }
}
