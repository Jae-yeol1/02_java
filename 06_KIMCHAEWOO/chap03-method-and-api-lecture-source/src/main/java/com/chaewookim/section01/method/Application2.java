package com.chaewookim.section01.method;

public class Application2 {
    // static이 없는 메소드 호출 사용
    public static void main(String[] args) {

        Application2 app = new Application2();

        System.out.println("main() 시작됨");
        app.methodA();
        app.methodB();
        System.out.println("main() 종료됨");

    }

    /***
     * static 키워드 없는
     * non-static method 사용
     */
    public void methodA() {
        System.out.println("methodA() 호출");
        System.out.println("methodA() 종료");
    }

    public void methodB() {
        System.out.println("methodB() 호출");
        System.out.println("methodB() 종료");
    }
}
