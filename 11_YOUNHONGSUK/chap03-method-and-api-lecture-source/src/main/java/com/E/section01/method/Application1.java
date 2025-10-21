package com.E.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA();
        Application1.methodB();
    }

    public static void methodA(){
        System.out.println("methodA() 호출함..");
    }

    public static void methodB(){

        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
