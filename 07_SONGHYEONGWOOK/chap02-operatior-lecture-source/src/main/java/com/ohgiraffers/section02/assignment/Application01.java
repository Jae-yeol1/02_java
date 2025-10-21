package com.ohgiraffers.section02.assignment;

public class Application01 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println("num = " + num);

        num += 3; // 공간(num) = 값(num) + 3
        System.out.println("num = " + num);
        
        num -= 5;
        System.out.println("num = " + num);
        
        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);
    }
}
