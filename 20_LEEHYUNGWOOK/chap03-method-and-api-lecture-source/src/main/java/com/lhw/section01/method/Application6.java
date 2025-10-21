package com.lhw.section01.method;

public class Application6 {

    public static void main(String[] args) {

        System.out.println("main() 시작..");
        String test = testMethod();
        System.out.println("test:" + test);
        System.out.println("testMethod() = " + testMethod());
        System.out.println("main() 종료..");
    }

    public static String testMethod() {
        System.out.println("testMethod() 실행..");
        return "test";
    }
}
