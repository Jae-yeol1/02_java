package com.sekong.section01.method;

public class Application5 {
    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testMethod("홍길동",20,'남');
    }
    public void testMethod(String name, int age, char gender){
        System.out.println("testMethod 동작 확인");
        return; // 메소드를 호출한 곳으로 돌아가기 위한 return;을 작성하지 않아도 컴파일러가 자동으로 추가해줌

    }
}
