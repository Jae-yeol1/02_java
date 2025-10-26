package com.ohgiraffers.section01.method;

public class Application3 {
    // 전역변수는  어디서든 호출할 수 있다!!
    static int global =10; // 클래스(static) 변수 // 변수를 선언하고 초기화 한것

    public static void main(String[] args){ //지역변수

        int local = 20 ;  // 이 지역변수는 선언한 메소드 블럭내부{} 안에서만 생성되고 끝나면 주기가 끝남
        System.out.println("global = " + global); // 전역변수이므로 어디서든 호출
        System.out.println("local = " + local);

        Application3 app =  new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod((int)12.35);
        app.testMethod(3*8);


    }

    public static void test(int testValue){ // 전역변수
        System.out.println(testValue);  //
    }
    public static void testMethod(int age){
        System.out.println("당신의 나이는"+ age + "세입니다");
    }
}
