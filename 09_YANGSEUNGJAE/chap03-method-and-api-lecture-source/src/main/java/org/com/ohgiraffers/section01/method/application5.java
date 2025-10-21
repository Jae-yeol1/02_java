package org.com.ohgiraffers.section01.method;

public class application5 {
    public static void main(String[] args) {
        application5 app = new application5();
        app.testMethod();
    }

    public void testMethod() {
        System.out.println("testMethod 동작 확인");
        return; //메소드를 호출한 곳으로 돌아가기 위해서 return을 작성하지 않아도 컴파일러가 자동으로 추가 해 준다.
    }
}
