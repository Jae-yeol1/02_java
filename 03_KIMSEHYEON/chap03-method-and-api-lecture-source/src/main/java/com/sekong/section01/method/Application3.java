package com.sekong.section01.method;

public class Application3 {
    // 전역
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {
        int local = 20; // 지역변수
        System.out.println("global: " + global);
        System.out.println("local: " + local);
        methodA(local);
        Application3 app = new Application3();
        app.methodB(13);
        app.methodB(local);
        app.methodB((int)12.34);




    }

    public static void methodA(int testValue) {
        System.out.println(testValue);
    }
    public void methodB(int age) {
        System.out.println("당신의 나이는 " + age +" 입니다.");
    }

}
