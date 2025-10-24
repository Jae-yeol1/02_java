package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDTO memberDto = new MemberDTO();

        System.out.println(memberDto.getId());
        System.out.println(memberDto.getPwd());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getPhone());
        System.out.println(memberDto.getEmail());

        memberDto.setId("user01");
        memberDto.setPwd("pass01");
        memberDto.setName("홍길동");
        memberDto.setAge(20);
        memberDto.setGender('M');
        memberDto.setPhone("010-1234-5678");
        memberDto.setEmail("hong123@greedy.com");

        System.out.println(memberDto.getId());
        System.out.println(memberDto.getPwd());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getPhone());
        System.out.println(memberDto.getEmail());
    }
}
