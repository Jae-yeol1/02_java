package com.ohgiraffers.section02.package_and_import.test;

// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lang 패키지를 의미
// 워낙 기본이 되는 패키지이다보니, 생략해도 컴파일러가 알아서 실행할 때 추가한다.

public class Application1 {
    public static void main(String[] args){
        com.ohgiraffers.section02.package_and_import.test.Calculator cal
                =new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int plusResult = cal.plusTwoNumber(100,50);
        System.out.println("plusResult : " + plusResult);

        int maxResult=com.ohgiraffers.section02.package_and_import.test.Calculator.maxTwoNumber(200,150);
        System.out.println("maxResult : " + maxResult);


    }
}
