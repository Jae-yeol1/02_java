package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 1. C_while 클래스의 객체(인스턴스) 생성
        c_while callWhile = new c_while();

        System.out.println("--- 1. testSimpleWhile 호출 (10번 반복) ---");
        // 2. 첫 번째 메소드 호출 (단순 반복문 실행)
        callWhile.testSimpleWhile();

        System.out.println("\n--- 2. testWhileExit 호출 (exit 입력 대기) ---");
        // 3. 두 번째 메소드 호출 (사용자 입력을 기다립니다)
        callWhile.testWhileExit();

        System.out.println("\n메소드 호출 및 실행 완료.");
    }
}
