package com.E.section05.typecasting;

public class Application1 {
    public static void main (String[] args) {

        byte b = 1;
        short s = b;
        int i = s;
        long l = i;

        float f = 1;
        double d = f;
        // 더 작은 자료형을 큰 자료형으로 바꾸는 것이기에 컴파일 에러가 없다

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);


    }
}
