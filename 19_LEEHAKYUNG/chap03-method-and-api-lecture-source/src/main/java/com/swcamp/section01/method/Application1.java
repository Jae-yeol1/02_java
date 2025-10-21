package com.swcamp.section01.method;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA();
        System.out.println("main() 종료됨");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨");
        methodB();          // 같은 클래스 내에서는 '클래스.' 생략 가능
    }


    /*
    methodB()
    */
    public static void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
