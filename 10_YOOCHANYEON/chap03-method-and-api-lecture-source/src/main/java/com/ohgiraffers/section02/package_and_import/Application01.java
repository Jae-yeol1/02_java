package com.ohgiraffers.section02.package_and_import;

// import 등록을 생략해도 사용 가능한 패키지 -> java.lang
// 워낙 기본이 되는 패키지이기 때문에, 생략해도 실행시에 컴파일러가 알아서 추가
public class Application01 {

    public static void main(String[] args){

        com.ohgiraffers.section02.package_and_import.test.Calculator cal
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int plustResult = cal.plusTwoNumbers(100, 50);
        System.out.println("plusResult : " + plustResult);

        int maxResult = com.ohgiraffers.section01.method.Calculator.maxTwoNumbers(100, 50);
        System.out.println("maxResult : " + maxResult);


    }
}
