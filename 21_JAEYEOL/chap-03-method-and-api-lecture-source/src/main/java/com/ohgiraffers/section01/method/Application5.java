package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testMethod();


    }
    // non static method 이다 호출하려면 Application5에
    public void testMethod(){
        System.out.println("testMethod() 동작확인");
        return; // 메소드를 호출한곳으로 돌아가기 위해서 return 을 작성 안해도 컴파일러가 자동으로 추가해줌
    }
}
