package com.swcamp.section01.method;

public class Application6 {

    public static void main(String[] args) {
        System.out.println("main() 메서드 호출");
        String test = testMethod();
        System.out.println(test);

        System.out.println("result2 = " + testMethod());
        System.out.println("main() 메서드 종료");

    }

    public static String testMethod() {
        System.out.println("testMethod() 메서드 실행");
        return "test";
    }
}
