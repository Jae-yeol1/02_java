package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO();

        System.out.println(memberDTO.getId());
        System.out.println(memberDTO.getPwd());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getPhone());
        System.out.println(memberDTO.getEmail());

        memberDTO.setId("1");
        memberDTO.setPwd("pwd");
        memberDTO.setName("이름");
        memberDTO.setAge(15);
        memberDTO.setGender('M');
        memberDTO.setPhone("01011111111");
        memberDTO.setEmail("chaewookim@gmail.com");

        System.out.println(memberDTO.getId());
        System.out.println(memberDTO.getPwd());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getPhone());
        System.out.println(memberDTO.getEmail());

    }
}
