package com.ohgiraffers.section03;

public class Application1 {
    public static void main(String[] args) {

        final int AGE;  // 상수의 변수명은 대문자로 표기 (암묵적)

        AGE = 20;
        System.out.println("AGE = " + AGE);
//        AGE = 20;

        System.out.println("AGE = " + AGE);

        int myAge = AGE;
        System.out.println("myAge = " + myAge);

        
    }

}
