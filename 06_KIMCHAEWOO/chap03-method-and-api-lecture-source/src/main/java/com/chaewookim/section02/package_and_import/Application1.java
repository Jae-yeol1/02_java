package com.chaewookim.section02.package_and_import;

import com.chaewookim.section02.package_and_import.test.Calculator;

// import 등록을 생략해도 사용 가능한 패키지가 java.lang
// 기본 패키지라서 포함되어 있음
public class Application1 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println("plusResult = " + plusResult);


    }
}
