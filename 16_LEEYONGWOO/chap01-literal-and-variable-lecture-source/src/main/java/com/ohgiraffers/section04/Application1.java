package com.ohgiraffers.section04;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("byte값의 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short값의 범위: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int값의 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long값의 범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float값의 범위: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double값의 범위: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        System.out.println("char값의 범위: " + (int)(Character.MIN_VALUE) + " ~ " + (int)(Character.MAX_VALUE));

        byte num1=126;
        num1++;
        num1++;
        //num1++;
        System.out.println(num1);

        // 언더플로우
        // 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상
        num1--;
        System.out.println(num1);

        int firtstNum=10000000;
        int secondNum=20000000;
        int mult=firtstNum*secondNum;
        System.out.println("multiplication : " + mult);
        long longMult=(long)firtstNum*secondNum;
        System.out.println("long multiplication : " + longMult);

        long asd=2147483647;
        System.out.println(asd);
}
}