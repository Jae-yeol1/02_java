package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        String dept = sc.nextLine();

        String job = sc.nextLine();

        int age = sc.nextInt();
        sc.nextLine();

        char gender = sc.next().charAt(0);
        sc.nextLine();

        int salary = sc.nextInt();
        sc.nextLine();

        double bonusPoint = sc.nextDouble();
        sc.nextLine();

        String phone = sc.nextLine();

        String address = sc.nextLine();

        EmployeeDTO dto = new EmployeeDTO();
        dto.setNumber(number);
        dto.setName(name);
        dto.setDept(dept);
        dto.setJob(job);
        dto.setAge(age);
        dto.setGender(gender);
        dto.setSalary(salary);
        dto.setBonusPoint(bonusPoint);
        dto.setPhone(phone);
        dto.setAddress(address);

        System.out.println(dto.getNumber());
        System.out.println(dto.getName());
        System.out.println(dto.getDept());
        System.out.println(dto.getJob());
        System.out.println(dto.getAge());
        System.out.println(dto.getGender());
        System.out.println(dto.getSalary());
        System.out.println(dto.getBonusPoint());
        System.out.println(dto.getPhone());
        System.out.println(dto.getAddress());


    }
}
