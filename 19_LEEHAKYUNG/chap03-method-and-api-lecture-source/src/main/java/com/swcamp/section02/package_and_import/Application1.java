package com.swcamp.section02.package_and_import;
//import com.swcamp.section02.package_and_import.test.Calculator;

// import 등록을 생략해도 사용 가능한 패키ㅣㅈ가 있는데, java.lang 패키지를 의미한다.
// 워낙 기본이 되는 패키지이다 보니, 생략해도 컴파일러가 알아서 실행할 때 추가한다.
public class Application1 {

    public static void main(String[] args) {

        // call non-static method not using import
        com.swcamp.section02.package_and_import.test.Calculator calc
                = new com.swcamp.section02.package_and_import.test.Calculator();
        int plusResult = calc.plusTwoNumbers(100, 36);
        System.out.println("plusResult = " + plusResult);

        // call static method not using import
        int maxResult = com.swcamp.section01.method.Calculator.maxNumbersOf(100, 3);
        System.out.println("maxResult = " + maxResult);


    }
}
