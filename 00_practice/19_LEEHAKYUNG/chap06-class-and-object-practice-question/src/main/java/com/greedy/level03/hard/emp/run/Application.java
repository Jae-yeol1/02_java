package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO empDTO = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("number : ");
        empDTO.setNumber(sc.nextInt());

        System.out.print("name : ");
        sc.nextLine();
        empDTO.setName(sc.nextLine());

        System.out.print("department : ");
        empDTO.setDept(sc.next());

        System.out.print("position : ");
        empDTO.setJob(sc.next());

        System.out.print("age : ");
        empDTO.setAge(sc.nextInt());

        System.out.print("gender : ");
        empDTO.setGender(sc.next().charAt(0));

        System.out.print("salary : ");
        empDTO.setSalary(sc.nextInt());

        System.out.print("bonus point : ");
        empDTO.setBonusPoint(sc.nextDouble());

        System.out.print("phone number(please include '-') : ");
        sc.nextLine();
        empDTO.setPhone(sc.nextLine());

        System.out.print("address : ");
        empDTO.setAddress(sc.nextLine());

        System.out.println("====== print information ======");
        System.out.println(empDTO.getNumber());
        System.out.println(empDTO.getName());
        System.out.println(empDTO.getDept());
        System.out.println(empDTO.getJob());
        System.out.println(empDTO.getAge());
        System.out.println(empDTO.getGender());
        System.out.println(empDTO.getSalary());
        System.out.println(empDTO.getBonusPoint());
        System.out.println(empDTO.getPhone());
        System.out.println(empDTO.getAddress());

    }
}
