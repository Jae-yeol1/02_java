package com.ohgiraffers.section01.method;

public class Application3 {
    // 전역
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);

    }

    public static void test(int testValue){
        System.out.println(testValue);
    }

}
