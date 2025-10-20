package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수와 정수의 연산
        System.out.println("=============== 정수와 정수의 연산 =================");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10); //곱하기
        System.out.println(123/10); //나누기를 한 몫
        System.out.println(123%10); // 나누기를 한 나머지 값

        System.out.println("=============== 실수와 실수의 연산 =================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 10.0);  // 약간의 오차가 생긴다.

        // 언제나 정수와 실수의 연산의 결과는 항상 실수가 나온다.
        System.out.println("=============== 정수와 실수의 연산 =================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);

        //문자의 연산
        System.out.println("=============== 문자와 문자의 연산 =================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');


        System.out.println("=============== 문자와 실수의 연산 =================");
        System.out.println('a' + 1.0); // a-> 97
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        // 결론은 문자는 내부적으로 숫자 취급을 한다.
        // 결국 지금까지 숫자끼리의 연산을 확인한 것이다.

        // 문자열의 연산
        // 문자열과 문자열의 '+'연산만 가능하고, 연산 결과는 문자열 합치기(이어 붙이기)된다.
        System.out.println("=============== 문자열과 문자열의 연산 =================");
        System.out.println("Hello" + " world");
    //  System.out.println("Hello" * " world");
    //  System.out.println("Hello" / " world");
    //  System.out.println("Hello" % " world");
        System.out.println("=============== 문자열과 문자열의 연산 =================");
        System.out.println("hello" + 123);          // 문자열
        System.out.println("hello" + 123.456);      // 문자열
        System.out.println("hello" + 'a');          // 문자열
        System.out.println("hello" + true);

        // 논리연산은 모든 사칙연산이 안된다.
        // 논리값과 문자열의 + 연산만 사용가능하다.

        System.out.println("123"+"456");
        System.out.println("====================================================");
        System.out.println(9+9);
        System.out.println("9"+9);
        System.out.println(9+"9");
        System.out.println("9"+"9");

        System.out.println(9+9+"9");
        System.out.println(9+"9"+9);
        System.out.println("9"+9+9);
        System.out.println("9"+(9+9)); // 918
    }
}
