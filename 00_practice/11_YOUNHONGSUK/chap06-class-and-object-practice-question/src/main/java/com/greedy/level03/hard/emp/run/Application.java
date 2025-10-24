package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter dept");
        String dept = sc.next();
        System.out.println("Enter job");
        String job = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        System.out.println("Enter bonusPoint");
        Double bp = sc.nextDouble();
        System.out.println("Enter phone");
        String phone = sc.next();
        System.out.println("Enter address");
        String address = sc.next();

        EmployeeDTO e = new EmployeeDTO();

        e.setNum(num);
        e.setName(name);
        e.setDept(dept);
        e.setJob(job);
        e.setGender(gender);
        e.setSalary(salary);
        e.setBonusPoint(bp);
        e.setPhone(phone);
        e.setAddress(address);

        System.out.println(e.getNum());
        System.out.println(e.getName());
        System.out.println(e.getDept());
        System.out.println(e.getJob());
        System.out.println(e.getGender());
        System.out.println(e.getSalary());
        System.out.println(e.getBonusPoint());
        System.out.println(e.getPhone());
        System.out.println(e.getAddress());


    }
}
