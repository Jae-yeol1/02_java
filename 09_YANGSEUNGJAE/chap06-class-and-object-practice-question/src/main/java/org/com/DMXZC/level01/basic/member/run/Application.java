package org.com.DMXZC.level01.basic.member.run;

import org.com.DMXZC.level01.basic.member.model.dto.MemberDto;

public class Application {
    public static void main(String[] args) {
        MemberDto md = new MemberDto();

        System.out.println(md.getId());
        System.out.println(md.getPwd());
        System.out.println(md.getName());
        System.out.println(md.getEmail());
        System.out.println(md.getGender());
        System.out.println(md.getPhone());
        System.out.println(md.getEmail());
        System.out.println();

        md.setId("user01");
        md.setPwd("pass01");
        md.setName("홍길동");
        md.setAge(20);
        md.setGender('M');
        md.setPhone("010-1234-5678");
        md.setEmail("hong123@greedy.com");

        System.out.println(md.getId());
        System.out.println(md.getPwd());
        System.out.println(md.getName());
        System.out.println(md.getEmail());
        System.out.println(md.getGender());
        System.out.println(md.getPhone());
        System.out.println(md.getEmail());
    }
}
