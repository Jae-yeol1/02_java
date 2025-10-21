package com.E.section01.method;

public class Application2 {
    public static void main(String[] args){
        System.out.println("main 시작 됨");

        Application2 app = new  Application2();
        app.methodA();
        app.methodA();

        System.out.println("main over");
    }

    /***
     * static이 없는 논-스태틱 메소드 사용 법
     */
    public void methodA() {
        System.out.println("method A called");
        System.out.println("methodA ended");
    }

    public void methodB() {
        System.out.println("methodB called");
        System.out.println("methodB ended");
    }

    public static void methodC (){
        System.out.println("methodC called");
        System.out.println("methodC ended");
    }
}
