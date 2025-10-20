package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {
        // 변수 : 변하는 값을 담는 공간 (시간의 흐름에 따라 값이 변한다.)
        // 상수 : 한번 정해준 값은 프로그램을 끄기전에 변경할 수 없다.

        final int AGE; // 상수의 변수명은 대문자로 표기 (암묵적)

        AGE = 18;
//        AGE = 20;

        System.out.println("AGE = " + AGE);

        int myAge = AGE;
        System.out.println("myAge = " + myAge);
    }
}
