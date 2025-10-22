package com.sekong.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA();
        System.out.println("main() 종료함");
    }

    public static void methodA(){
        System.out.println("methodA() 호출됨. ");

        methodB();
        System.out.println("menuthod a 호출됨");

    }

    public static void methodB(){
        System.out.println("method() 호출됨");
        System.out.println("method() 호출정료됨");
    }
}
