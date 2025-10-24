package com.hihi.section01.method;

public class Application5 {

    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testMethod();
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        return; //return생략된 상태였음~~(compiler가 대신 return해주고 있었샴)
    }

}
