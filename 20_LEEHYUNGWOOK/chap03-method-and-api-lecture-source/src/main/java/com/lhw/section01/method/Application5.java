package com.lhw.section01.method;

public class Application5 {

    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testMethod();
    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인");
        return; // void는 생략되어 있음 -> 컴파일러가 대신 해줌.
                // 메소드가 호출한 곳으로 돌아가기 위해 return;
    }
}
