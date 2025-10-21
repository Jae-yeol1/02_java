package com.ohgiraffers.section01.method;

public class Application05 {

    public static void main(String[] args) {
        Application05 app = new  Application05();
        app.testMethod();
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        System.out.println("testMethod() 종료 확인");
        return; // 메소드를 호출한 곳으로 돌아가기 위해 return; 작성 안해도 컴파일러가 자동으로 추가
    }
}
