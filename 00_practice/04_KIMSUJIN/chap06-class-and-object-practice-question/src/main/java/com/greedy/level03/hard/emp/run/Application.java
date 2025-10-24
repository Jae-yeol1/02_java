package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeDTO empDto = new EmployeeDTO();

        System.out.print("사원번호 입력 : ");
        int number = input.nextInt();
        empDto.setNumber(number);
        System.out.println(empDto.getNumber());

        System.out.println("이름 : ");
        String name = input.next();
        empDto.setName(name);
        System.out.println(empDto.getName());

        System.out.println("부서 : ");
        String dept = input.next();
        empDto.setDept(dept);
        System.out.println(empDto.getDept());

        System.out.println("직무 :");
        String job = input.next();
        empDto.setJob(job);
        System.out.println(empDto.getJob());

        System.out.println("성별 :");
        char gender = input.next().charAt(0);
        empDto.setGender(gender);
        System.out.println(empDto.getGender());

        System.out.println("월급 : ");
        int salary = input.nextInt();
        empDto.setSalary(salary);
        System.out.println(empDto.getSalary());

        System.out.println("보너스 : ");
        double commission = input.nextDouble();
        empDto.setBonusPoint(commission);
        System.out.println(empDto.getBonusPoint());

        System.out.println("폰넘버 :");
        String phone = input.next();
        empDto.setPhone(phone);
        System.out.println(empDto.getPhone());

        System.out.println("주소 :");
        String address = input.next();
        empDto.setAdress(address);
        System.out.println(empDto.getAdress());
    }
}
