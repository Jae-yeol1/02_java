package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {


        // 반환값 : x
        // 메소드명 : checkMethod
        // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
        // Calculator.checkMethod();
        Calculator calculator = new Calculator();
        calculator.checkMethod();

        int a = 10;
        int b = 20;

        // 반환값 : String
        // 메소드명 : sumTwoNumber
        // 출력의 내용은 "10과 20의 합은 30입니다."
        Calculator.sumTwoNumbers(a, b);
        System.out.println(Calculator.sumTwoNumbers(a, b));

        // 반환값 : String
        // 메소드명 : multiTwoNumber
        // 출력의 내용은 "10과 20의 곱은 200입니다."
        Calculator.multiTwoNumbers(a, b);
        System.out.println(Calculator.multiTwoNumbers(a, b));

        // 반환값 : int
        // 메소드명 : multiTwoNumber2
        // 출력의 내용은 "10과 20의 곱은 200입니다."
        Calculator.multiTwoNumbers2(a, b);
        System.out.println(a + "과 " + b + "의 곱은 " + Calculator.multiTwoNumbers2(a, b) + "입니다.");

    }
}
