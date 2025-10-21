package com.swcamp.section01.method;

public class Application5 {

    public static void main(String[] args) {
        Application5 app5 = new Application5();
        app5.testMethod();
    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인");
        return;     // 컴파일러가 자동으로 return을 넣어 줌.
    }
}
