package com.ogiraffers.section01.method;

public class Application5 {


    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testMehod();
    }

    public void testMehod(){
        System.out.println("testMehod() 동작확인");
        return; // 메소드를 호출한 곳으로 돌아가기 위해서 return;을 작성 안해도 컴파일러가 자동으로 추가해준다.
    }
}