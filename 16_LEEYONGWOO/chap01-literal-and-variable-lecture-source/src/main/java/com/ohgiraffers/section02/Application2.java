package com.ohgiraffers.section02;

public class Application2 {
    public static void main(String[] args) {
        //1.정수를 취급하는 자료형
        byte bNum; //1byte
        short sNum;//2byte
        int iNum;//4byte
        long lNum;//8byte

        //2.실수를 취급하는 자료형
        float fNum;//4byte
        double dNum;//8byte
        //3.문자를 취급하는 자료형
        char ch;//2byte
        //4.논리값을 취급하는 자료형
        boolean bool; //1byte
        //5.문자열을 취급하는 자료형(참조자료형)
        String str;
        //자료형의 크기 확인
        System.out.println("byte 크기 : " + Byte.BYTES + "byte");
        System.out.println("short 크기 : " + Short.BYTES + "byte");
        System.out.println("int 크기 : " + Integer.BYTES + "byte");
        System.out.println("long 크기 : " + Long.BYTES + "byte");
        System.out.println("float 크기 : " + Float.BYTES + "byte");
        System.out.println("double 크기 : " + Double.BYTES + "byte");
        System.out.println("char 크기 : " + Character.BYTES + "byte");

        //자료형 별로 초기화
        bNum = 1;
        sNum=2;
        iNum=3;
        lNum=22000000000L;
        fNum=3.14f;
        dNum=-3.14;

        ch='A';
        ch=97;
        int sum=257;

    }
}
