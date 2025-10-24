package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDto;

public class Application {

    public static void main(String[] args){

        MemberDto md = new MemberDto();

        System.out.println("id : " + md.getId());
        System.out.println("pwd : " + md.getPwd());
        System.out.println("name : " + md.getName());
        System.out.println("age : " + md.getAge());
        System.out.println("gender : " + md.getGender());
        System.out.println("phone : " + md.getPhone());
        System.out.println("email : " + md.getEmail());

        md.setId("id1");
        md.setPwd("pass1");
        md.setName("계백");
        md.setAge(33);
        md.setGender('M');
        md.setPhone("01012345678");
        md.setEmail("GB@baekjae.bj");

        System.out.println();

        System.out.println("변경 후 id : " + md.getId());
        System.out.println("변경 후 pwd : " + md.getPwd());
        System.out.println("변경 후 name : " + md.getName());
        System.out.println("변경 후 age : " + md.getAge());
        System.out.println("변경 후 gender : " + md.getGender());
        System.out.println("변경 후 phone : " + md.getPhone());
        System.out.println("변경 후 email : " + md.getEmail());
    }
}
