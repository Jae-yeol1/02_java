package com.lhw.section01.user_type;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /* 사용자 정의 자료형 사용하기*/

        /* 변수 선언 후 객체 생성
        *  객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로
        *  객체가 heap 영역에 생성(인스턴스화)된다.
        */
        Member member = new Member();
        System.out.println("=====> " + member.hashCode());

        /* 필드에 접근하기 위해 레퍼런스변수명.필드명으로 접근
        *  '.'은 참조 연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 것*/
        /* 객체는 heap에 저장되는데, 비어있는 값은 heap에 들어갈 수 없으므로,
        *  JVM 이 비어있는 값을 기본값으로 초기화 해준다.*/
        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));
        System.out.println("=====");

        member.id = "user01";
        member.name = "홍길동";
        member.pwd = "pass01";
        member.age= 20;
        member.gender = 'M';
//        member.hobby = {"야구", "코딩"};  // 이런식으로 배열 초기화 x
        member.hobby = new String[]{"야구", "코딩"}; // 명시해줘야함.

        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));

    }
}
