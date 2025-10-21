package org.com.ohgiraffers.section01.method;

public class application2 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨");
        //객체를 생성
        application2 app = new application2();
        app.methodA();
        app.methodB();
        System.out.println("main() 종료됨");


    }
    public void methodA() {

        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }

    public void methodB() {

        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}

