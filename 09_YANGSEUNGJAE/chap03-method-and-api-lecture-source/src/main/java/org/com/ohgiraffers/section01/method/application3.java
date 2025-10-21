package org.com.ohgiraffers.section01.method;

public class application3 {

    static int global = 10; //클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역변수

        System.out.println("global = " + global);
        System.out.println("local = " + local);
        test(global + local);

        application3 app = new application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int)12.35);
        app.testMethod(25 * 3);



    }

    public static  void test(int testValue){
        System.out.println("test = " + testValue);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}


