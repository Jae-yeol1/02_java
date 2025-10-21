package com.lhw.section01.method;

public class Application3 {
    /*전역
    ** 여기 들어올 내용은 모두 정해져 있다.
    ** 비어 있는 값이 들어올 수 없다. 지역을 반드시 정해주어야 한다: {지역}
    * */
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {
        // 지역 -> 지역이 생성-소멸 될 때 까지만 존재한다.

        int local = 20; // 지역변수

        System.out.println("global = " + global);
        System.out.println("local = " + local);

        test(local);

        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int) 25.21309847239);
        app.testMethod(3 * 8);
        // app.메소드 : 재사용이 가능한 부분
        new Application3().testMethod(local); // 재사용 불가능한 다른 객체
    }

    public static void test(int testValue) {
        System.out.println("local = " + testValue); // 타지역 변수는 사용할 수 없다.
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

}
