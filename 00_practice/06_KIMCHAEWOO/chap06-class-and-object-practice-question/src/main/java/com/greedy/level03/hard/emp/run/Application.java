package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        String name;
        String dept;
        String job;
        int age;
        char gender;
        int salary;
        double bonusPoint;
        String phone;
        String address;

        System.out.print("num: ");
        number = sc.nextInt();

        sc.nextLine();

        System.out.print("name: ");
        name = sc.nextLine();

        System.out.print("dept: ");
        dept = sc.nextLine();

        System.out.print("job: ");
        job = sc.nextLine();

        System.out.print("age: ");
        age = sc.nextInt();

        System.out.print("gender: ");
        gender = sc.next().charAt(0);

        System.out.print("salary: ");
        salary = sc.nextInt();

        System.out.print("bonusPoint: ");
        bonusPoint = sc.nextDouble();

        sc.nextLine();

        System.out.print("phone: ");
        phone = sc.nextLine();

        System.out.print("address: ");
        address = sc.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAddress(address);

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());



    }
}
