package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 시작함");
        Application1.methodA();
        System.out.println("main() 메소드 종료됨");
        Application1.methodB();
    }
    public static void methodA() {
        System.out.println("methodA() 호출됨...");
        methodB();
        System.out.println("methodA() 종료됨");
    }

    /***
     * methodB()입니다.
     */
    public static void methodB() {
        System.out.println(("methodB() 호출됨"));
        System.out.println("methodB() 종료됨");
    }

}
