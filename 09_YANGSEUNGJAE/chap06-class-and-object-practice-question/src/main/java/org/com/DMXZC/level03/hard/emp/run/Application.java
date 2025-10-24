package org.com.DMXZC.level03.hard.emp.run;

import org.com.DMXZC.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDTO emp = new EmployeeDTO();

        emp.setNumber(Integer.parseInt(sc.nextLine()));
        emp.setName(sc.nextLine());
        emp.setDept(sc.nextLine());
        emp.setJob(sc.nextLine());
        emp.setAge(Integer.parseInt(sc.nextLine()));
        emp.setGender(sc.nextLine().charAt(0));
        emp.setSalary(Integer.parseInt(sc.nextLine()));
        emp.setBonusPoint(sc.nextDouble());
        sc.nextLine();
        emp.setPhone(sc.nextLine());
        emp.setAddress(sc.nextLine());

        System.out.println(emp.getNumber());
        System.out.println(emp.getName());
        System.out.println(emp.getDept());
        System.out.println(emp.getJob());
        System.out.println(emp.getAge());
        System.out.println(emp.getGender());
        System.out.println(emp.getSalary());
        System.out.println(emp.getBonusPoint());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAddress());


    }
}
