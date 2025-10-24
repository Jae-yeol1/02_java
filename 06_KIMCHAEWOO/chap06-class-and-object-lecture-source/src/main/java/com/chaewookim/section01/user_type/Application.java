package com.chaewookim.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // 사용자 정의 자료형 사용

        // 변수 선언 및 객체 생성
        // 클래스명 변수명 = new 클래스명();
        // 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체가 heap 영역에 생성
        Member member = new Member();

        // 필드에 접근하기 위해 레퍼런스변수명.필드명으로 접근
        // .은 참조 연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미
        // heap 영역은 JVM 기본 값으로 초기화
        member.age = 20;
        member.name = "김채우";
        member.id = "user01";
        member.pwd = "pwd01";
        member.gender = 'M';
        member.hobby = new String[] {"야구", "축구"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));

    }
}
