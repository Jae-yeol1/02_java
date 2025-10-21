package com.swcamp.section01.method;

public class Application3 {
    // 전역
    static int global = 10;     // 클래스(static) 변수


    public static void main(String[] args) {

        int local = 20;         // 지역 변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(local);

        Application3 app = new Application3();
        app.testMethod((int) 12.98);

        // 객체 생성 안하고 일회용으로 쓰기 위해선..
        new Application3().testMethod(3 * 8);
    }

    public static void test(int testValue) {
        System.out.println(testValue);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
