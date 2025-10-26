package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args){
        System.out.println("main () 메소드 호출함");
        String result = testMethod(); // alt +control+v 하면 추론해줌
        System.out.println("result = "+ result);
        System.out.println("main () 메소드 종료함");


    }
    // 호출을하면 반환을 1.문자열로 , 2.호출한 곳으로
    public static String testMethod(){
        System.out.println("testMethod() 실행함 ");
        return "test";
    }
}
