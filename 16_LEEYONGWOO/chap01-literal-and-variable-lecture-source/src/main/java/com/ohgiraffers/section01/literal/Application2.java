package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("=======정수와 정수의 연산 =========");
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("=======실수와 실수의 연산 =========");
        System.out.println(123.456 + 654.321);
        System.out.println(123.456 - 23.123);
        System.out.println(123.123 * 2.0);
        System.out.println(123.123 / 2.0);
        System.out.println(123.123 % 2.0);
        System.out.println("=======정수와 실수의 연산 =========");
        System.out.println(123 + 456.789);
        System.out.println(123.456 - 23);
        System.out.println(123 * 10.0);
        System.out.println(123 / 10.0);
        System.out.println(123 % 10.0);
        System.out.println("=======문자와 정수의 연산 =========");
        System.out.println('A' + 1);
        System.out.println('A' + 'B');
        System.out.println('0' + 1);
        System.out.println('0' + '1');
        System.out.println('A' + 32);
        System.out.println('a' - 32);
        System.out.println("=======문자열과 다른 타입과의 연산 =========");
        System.out.println("Hello" + "World");
        System.out.println("Hello" + 123);
        System.out.println("Hello" + 123.456);
        System.out.println("Hello" + 'A');
        System.out.println("Hello" + true);
        System.out.println("123" + 456);
        System.out.println("123" + 456.789);
        System.out.println("123" + 'A');
        System.out.println("123" + false);
        System.out.println("=======논리값과 다른 타입과의 연산 =========");
        System.out.println(true);
        System.out.println(false);
        System.out.println(true + "");
        System.out.println(false + "");
        System.out.println("Result: " + true);
        System.out.println("Result: " + false);
        System.out.println("=======복합 연산 =========");
        System.out.println("Result: " + (123 + 456));
        System.out.println("Result: " + (123 - 456));
        System.out.println("Result: " + (123.456 + 654.321));
        System.out.println("Result: " + ('A' + 1));
        System.out.println("Result: " + ('A' + 'B'));
        System.out.println("Result: " + ("Hello" + 123));
        System.out.println("Result: " + (true + ""));
        System.out.println("Result: " + (false + ""));
        System.out.println("=======연산 우선순위 =========");
        System.out.println(123 + 456 * 2);
        System.out.println((123 + 456) * 2);
        System.out.println(123 - 456 / 2);
        System.out.println((123 - 456) / 2);
        System.out.println(123 + 456 / 2 * 3 - 10 % 4);
        System.out.println((123 + 456) / 2 * (3 - 10 % 4));
        System.out.println("=======문자열 연결 연산자의 우선순위 =========");
        System.out.println("Result: " + 123 + 456);
        System.out.println("Result: " + (123 + 456));
        System.out.println("Result: " + 'A' + 1);
        System.out.println("Result: " + ('A' + 1));
        System.out.println("Result: " + "Hello" + 123);
        System.out.println("Result: " + ("Hello" + 123));
        System.out.println("Result: " + true + false);
        System.out.println('a');



    }
}
