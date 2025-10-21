package com.ogiraffers.section01.method;

public class Application3 {
    static int global = 10;
    public static void main(String[] args) {

        int local = 20;
        System.out.println("local = " + local);
        System.out.println("global = " + global);
        test(local);

        Application3 application3 = new Application3();
        application3.testMethod(13);
        application3.testMethod(local);
        application3.testMethod(12.34);

    }

    public static void test(int testValue){
        System.out.println(testValue);
    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }

    public void testMethod(double age){
        System.out.println("당신의 나이는 " + (int)age + "세 입니다.");
    }
}
