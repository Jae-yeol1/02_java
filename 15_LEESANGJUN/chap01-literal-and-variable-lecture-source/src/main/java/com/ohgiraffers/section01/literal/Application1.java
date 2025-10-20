package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) { // psvm
//         한줄 주석(커맨드 슬러쉬),  opt 쉬프트하고 위아래로하면 줄바꿈.

        /*  커맨드 쉬프트 슬러쉬
        *  여기도 주석
        *  아래도 주석
        *  여러줄 주석
        * */
        System.out.println("Hello World!"); //출력용 구문. sout
        System.out.println(); // ln은 줄바꿈 라인이다.


        // literal 여러가지 값의 형태를 출력할 수 있다.
        //  정수 형태의 값 출력
        System.out.println(123);

        //  실수 형태의 값 출력
        System.out.println(1.234);

        //  문자 형태의 값 출력
        System.out.println('a'); // 문자열 a
        System.out.println('1'); //문자 1
        System.out.println('\u0000');
//        System.out.println(''); //아무 문자도 기록되지 않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println(""); // 문자열은 빈 상태로도 가능하다.

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true"); //얘는 true라는 값 출력

        


    }
}
