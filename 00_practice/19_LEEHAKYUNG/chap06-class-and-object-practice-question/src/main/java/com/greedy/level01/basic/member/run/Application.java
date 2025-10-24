package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {
        MemberDTO mbDTO = new MemberDTO();
        System.out.println("id : " + mbDTO.getId());
        System.out.println("pwd : " + mbDTO.getPwd());
        System.out.println("name : " + mbDTO.getName());
        System.out.println("age : " + mbDTO.getAge());
        System.out.println("gender : " + mbDTO.getGender());
        System.out.println("phone : " + mbDTO.getPhone());
        System.out.println("email : " + mbDTO.getEmail());

        mbDTO.setId("user01");
        mbDTO.setPwd("pass01");
        mbDTO.setName("홍길동");
        mbDTO.setAge(20);
        mbDTO.setGender('M');
        mbDTO.setPhone("010-1234-5678");
        mbDTO.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : " + mbDTO.getId());
        System.out.println("변경 후 pwd : " + mbDTO.getPwd());
        System.out.println("변경 후 name : " + mbDTO.getName());
        System.out.println("변경 후 age : " + mbDTO.getAge());
        System.out.println("변경 후 gender : " + mbDTO.getGender());
        System.out.println("변경 후 phone : " + mbDTO.getPhone());
        System.out.println("변경 후 email : " + mbDTO.getEmail());


    }
}
