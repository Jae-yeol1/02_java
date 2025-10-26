package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

public class Application1 {

    public static void main(String[] args) {

        // 1. 변수 이름을 'cal'과 같이 적절한 식별자로 수정
        Calculator cal
                = new Calculator();

        // 2. 정의된 변수 'cal'을 사용하여 인스턴스 메소드 호출
        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println("plusResult = " + plusResult);

        // 3. 정적 메소드는 클래스 이름으로 직접 호출 (현재 코드에선 이 부분은 이미 정확함)
        int maxResult = Calculator.maxNumberof(100, 50);
        System.out.println("maxResult = " + maxResult);
    }
}