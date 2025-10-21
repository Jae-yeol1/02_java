package com.chaewookim.section01.method;

public class Application3 {
    // 전역 변수 위치
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역 변수
        Application3 app = new Application3();

        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);
        app.testMethod(24);
        app.testMethod(local);
        app.testMethod((int) 12.35);
        app.testMethod(3 * 8);

        new Application3().testMethod(25);
    }

    public static void test(int testValue) {
        System.out.println(testValue);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
