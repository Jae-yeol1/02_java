package com.ohgiraffers.section05.typecastiong;

public class Application01 {
    public static void main(String[] args) {
        // 정수 : byte < short < int* < long
        // 실수 : float < double*
        // 문자 : char
        // 논리 : boolean
        byte bNum = 1;
        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);

        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println("result2 : " + result2);

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1); // 문자형은 int형으로 자동형변환 가능

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);


    }
}
