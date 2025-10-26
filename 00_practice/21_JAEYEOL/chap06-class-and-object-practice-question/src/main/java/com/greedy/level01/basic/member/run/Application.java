package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {


        //getter를 이용해서 필드의 초기값 확인
        //setter를 이용해서 필드 값 변경
        //getter 를 이용해서 변경된 필드 값확인
        MemberDTO member = new MemberDTO();

        System.out.println(member.getId());
        System.out.println(member.getPwd());
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getGender());
        System.out.println(member.getPhone());
        System.out.println(member.getEmail());

        System.out.println("=====================");

        member.setId("user01");
        System.out.println("변경후 ID = " + member.getId());
        member.setPwd("pass01");
        System.out.println("변경후 pwd = " + member.getPwd());
        member.setName("홍길동");
        System.out.println("변경후 name =" +  member.getName());
        member.setAge(20);
        System.out.println("변경 후 age = " + member.getAge());
        member.setGender('M');
        System.out.println("변경후 gender = " +  member.getGender());
        member.setPhone("010-1234-5678");
        System.out.println("변경 후 phone = " + member.getPhone());
        member.setEmail("hong123@greedy.com");
        System.out.println("변경 후 email = " + member.getEmail());




    }
}
