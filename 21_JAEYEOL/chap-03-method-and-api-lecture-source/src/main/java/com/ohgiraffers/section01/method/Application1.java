package com.ohgiraffers.section01.method;

import javax.swing.*;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main() 시작함");
        methodA(); // 매서드 A 호출

    }
    public static void methodA(){
        System.out.println("methodA() 호출됨");
        methodB(); // 같은 클래스의 static 매소드는 클래스명 생략가능
        System.out.println("methodA() 종료됨");
    }


    public static void methodB(){
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
