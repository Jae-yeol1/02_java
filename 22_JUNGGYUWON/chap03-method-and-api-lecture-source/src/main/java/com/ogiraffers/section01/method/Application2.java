package com.ogiraffers.section01.method;

public class Application2 {
    // static이 없는 메소드 호출 사용
    public static void main(String[] args) {
        System.out.println("main() 시작됨");

        Application2 application2 = new Application2();
        application2.methodA();


        System.out.println("main() 종료됨");
    }

    /***
     * static 키워드가 없는
     * non-static 메소드 사용
     */

    public void methodA() {
        System.out.println("methodA() 호출됨.");
        System.out.println("methodA() 종료됨.");
        methodB();
    }

    public void methodB() {
        System.out.println("methodB() 호출됨.");
        System.out.println("methodB() 종료됨.");
    }


}
