package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDto;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사번 : ");
        int num =  sc.nextInt();
        System.out.print("이름 : ");
        String b1 = sc.nextLine();
        String name = sc.nextLine();
        System.out.print("부서 : ");
//        String b2 = sc.nextLine();
        String dept =  sc.nextLine();
        System.out.print("직급 : ");
//        String b3 = sc.nextLine();
        String job = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        System.out.print("월급 : ");
        int salary = sc.nextInt();
        System.out.print("보너스 : ");
        double bonusPoint = sc.nextDouble();
        System.out.print("전화번호 : ");
        String b4 = sc.nextLine();
        String phone = sc.nextLine();
        System.out.print("주소 : ");
//        String b5 = sc.nextLine();
        String address = sc.nextLine();

        EmployeeDto emp1 = new EmployeeDto();

        emp1.setNum(num);
        emp1.setName(name);
        emp1.setDept(dept);
        emp1.setJob(job);
        emp1.setAge(age);
        emp1.setGender(gender);
        emp1.setSalary(salary);
        emp1.setBonusPoint(bonusPoint);
        emp1.setPhone(phone);
        emp1.setAddress(address);

        System.out.println(emp1.getNum());
        System.out.println(emp1.getName());
        System.out.println(emp1.getDept());
        System.out.println(emp1.getJob());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getGender());
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getBonusPoint());
        System.out.println(emp1.getPhone());
        System.out.println(emp1.getAddress());

    }
}
