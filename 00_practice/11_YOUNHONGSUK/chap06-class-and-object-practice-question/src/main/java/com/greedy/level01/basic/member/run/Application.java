package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.BookDTO;
import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;
import com.greedy.level01.basic.member.model.dto.MemberDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MemberDTO m = new  MemberDTO();
        System.out.println(m.getId());
        System.out.println(m.getPwd());
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getGender());
        System.out.println(m.getPhone());
        System.out.println(m.getEmail());
        System.out.println("===========================");
        m.setId("id1");
        m.setPwd("2223");
        m.setName("사라 코너");
        m.setAge(23);
        m.setGender('F');
        m.setPhone("010-1234-5678");
        m.setEmail("깡통혐오자@로봇시러.com");
        System.out.println(m.getId());
        System.out.println(m.getPwd());
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getGender());
        System.out.println(m.getPhone());
        System.out.println(m.getEmail());

        BookDTO b = new BookDTO();
        BookDTO b1 = new BookDTO("name","pub","auth");
        BookDTO b2 = new BookDTO("name","pub","auth",123,10.0);

        b.getAll();
        b1.getAll();
        b2.getAll();



    }
}
