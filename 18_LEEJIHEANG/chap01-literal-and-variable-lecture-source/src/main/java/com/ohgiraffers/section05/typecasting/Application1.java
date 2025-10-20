package com.ohgiraffers.section05.typecasting;

public class Application1 {
    static void main() {
        // 정수 : byte < short < int* <long
        // 실수 : float < double*
        // 문자 : char
        // 논리 : boolean
        byte bNum =1;

        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1); //문자형은 자동으로 int형으로 변환
 // boolean byte char short int long float double

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
        // 작은 자료형이 큰 자료형을 따라간다.
    }
}
