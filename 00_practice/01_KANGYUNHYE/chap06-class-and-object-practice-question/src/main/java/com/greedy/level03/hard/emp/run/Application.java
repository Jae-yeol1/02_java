package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        EmployeeDTO employeeDTO = new EmployeeDTO();

        int n = sc.nextInt();
        String name =  sc.next();
        String dept = sc.next();
        String job = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int  salary = sc.nextInt();
        double bonusPoint = sc.nextDouble();
        sc.nextLine();
        String phone = sc.next();
        String address = sc.next();

        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoint);
        employeeDTO.setPhone(phone);
        employeeDTO.setAdress(address);

        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAdress());


    }
}
