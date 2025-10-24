package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /*  사용자 정의 자료형 사용하기 */

        /* 변수 선언 및 객체 생성
        * 클래스명 변수명 = new 클래스명(); <- 객체(instance)를 생성하는 구문
        * 객체를 생성하게 되면 클래스에 정의한 필드(전역 변수)와 메소드대로 객체가
        * heap 영역에 생성됨
        * */

        Member mem = new Member();
        System.out.println(mem.hashCode());

        /*
        * 필드에 접근하기 위해 레퍼런스 변수명.필드명으로 접근
        * '.'은 참조 연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미
        * heap 영역은 기본적으로 JVM 초기값으로 초기화됨
        * */

        mem.id = "user01";
        mem.pwd = "pass01";
        mem.name = "홍길동";
        mem.age = 15;
        mem.gender = 'M';
        mem.hobby = new String[] {"야구", "코딩"};

        System.out.println("mem.id = " + mem.id);
        System.out.println("mem.pwd = " + mem.pwd);
        System.out.println("mem.name = " + mem.name);
        System.out.println("mem.age = " + mem.age);
        System.out.println("mem.gender = " + mem.gender);
        System.out.println("mem.hobby = " + Arrays.toString(mem.hobby));
    }
}
