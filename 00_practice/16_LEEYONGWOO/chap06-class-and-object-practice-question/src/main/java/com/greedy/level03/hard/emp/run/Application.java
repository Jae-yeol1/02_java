package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeDTO e = new EmployeeDTO();
        System.out.print("번호 : ");
        e.setNumber(sc.nextInt());
        System.out.print("이름 : ");
        e.setName(sc.next());
        System.out.print("부서 : ");
        e.setDept(sc.next());
        System.out.print("직무 : ");
        e.setJob(sc.next());
        System.out.print("나이 : ");
        e.setAge(sc.nextInt());
        System.out.print("성별 : ");
        e.setGender(sc.next().charAt(0));
        System.out.print("봉급 : ");
        e.setSalary(sc.nextInt());
        System.out.print("보너스 포인트 : ");
        e.setBonusPoint(sc.nextDouble());
        System.out.print("전화번호 : ");
        e.setPhone(sc.next());
        System.out.print("주소 : ");
        e.setAddress(sc.nextLine());


        System.out.println(e.getNumber());

        System.out.println(e.getName());

        System.out.println(e.getDept());

        System.out.println( e.getJob());

        System.out.println(e.getAge());

        System.out.println(e.getGender());

        System.out.println(e.getSalary());

        System.out.println(e.getBonusPoint());

        System.out.println(e.getPhone());

        System.out.println(e.getAddress());
    }
}
