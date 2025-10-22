package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String result = testMethod();
        System.out.println("result = " + result);

        System.out.println("result2 = " + testMethod());
        System.out.println("main() 메소드 종료함");
    }

    public static String testMethod(){ // 호출을 하면 인자값은 아무것도 필요없는 메소드
        System.out.println("testMethod()메소드 실행함");
        return "test";
    }
}
