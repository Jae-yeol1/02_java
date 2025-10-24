package com.ohgiraffers.section02.package_and_import;

// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lang 패키지를 의미한다.
// 워낙 기본이 되는 패키지이다보니, 생략해도 컴파일러가 알아서 실행할 때 추가한다.
import com.ohgiraffers.section02.package_and_import.test.Calculator;

public class Application1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println("plusResult = " + plusResult);

        int maxResult = Calculator.maxNumberOf(100, 50);
        System.out.println("maxResult = " + maxResult);
    }
}
