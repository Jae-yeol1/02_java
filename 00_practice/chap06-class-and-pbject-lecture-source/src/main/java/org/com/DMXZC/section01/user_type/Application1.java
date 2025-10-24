package org.com.DMXZC.section01.user_type;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // 사용자 정의 자료형 사용
        member member = new member(); // 객체 생성
        /*객체를 생성하게 되면 클래스에 정의한 필드(전역 변수)와 메소드 대로 객체가 heap 영역에 생성된다.*/


        /*필드에 접근하기 위해 레퍼런스 변수명, 필드명으로 접근한다.
        * '.'은 참조 연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가진다.
        * heap영역은 기본적으로 JVM초기값으로 초기화 된다.*/
        System.out.println(member.hashCode());

        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍금보";
        member.age = 20;
        member.gender = 'M';
        member.hobby = new String[] {"야구", "코딩"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));
    }
}
