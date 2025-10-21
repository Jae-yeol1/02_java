package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {
        System.out.println("main() 메소드 호출");
        String result = testMethodA();
        System.out.println("result = " + result);

        System.out.println("result2 = " + testMethodA());

        System.out.println("main() 메소드 종료함");
    }

    public static String testMethodA(){
        System.out.println("testMethod()메소드 실행함");
        return "test";
    }

}
