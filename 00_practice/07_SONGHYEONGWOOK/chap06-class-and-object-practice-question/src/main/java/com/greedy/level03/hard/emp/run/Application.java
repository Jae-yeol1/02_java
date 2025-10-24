package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사원 번호 : ");
        int number = sc.nextInt();

        System.out.print("사원 이름 : ");
        String name = sc.next();

        System.out.print("부서 : ");
        String dept = sc.next();

        System.out.print("계급 : ");
        String job = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        System.out.print("월급 : ");
        int salary = sc.nextInt();

        System.out.print("보너스율 : ");
        double bonusPoints = sc.nextDouble();

        System.out.print("전화번호 : ");
        String phone = sc.next();

        System.out.print("자택 주소 : ");
        sc.nextLine();
        String address = sc.nextLine();

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setNumber(number);
        employeeDTO.setName(name);
        employeeDTO.setDept(dept);
        employeeDTO.setJob(job);
        employeeDTO.setAge(age);
        employeeDTO.setGender(gender);
        employeeDTO.setSalary(salary);
        employeeDTO.setBonusPoint(bonusPoints);
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
