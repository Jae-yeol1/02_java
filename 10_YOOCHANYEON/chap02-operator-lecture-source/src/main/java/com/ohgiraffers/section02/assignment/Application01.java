package com.ohgiraffers.section02.assignment;

public class Application01 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println("num = " + num);

        num = num + 3; // 공간(num) = 값(num) + 3
        System.out.println("num = " + num); // 15

        num += 3;
        System.out.println("num = " + num); // 18

        num -= 5;
        System.out.println("num = " + num); // 13

        num *= 2;
        System.out.println("num = " + num); // 26

        num /= 2;
        System.out.println("num = " + num); // 13

        num %= 10;
        System.out.println("num = " + num); // 3

        // 주의!!
        num =- 5;   // equl(=) 기호 오른쪽은 복합 대입 연산자가 x
        System.out.println("num = " + num);


    }
}
