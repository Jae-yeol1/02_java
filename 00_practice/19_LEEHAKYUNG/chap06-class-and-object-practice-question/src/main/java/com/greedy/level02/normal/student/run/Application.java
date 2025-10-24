package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentVO stdVO = new StudentVO();
        Scanner sc = new Scanner(System.in);

        System.out.print("학년 : ");
        int ip_grade = sc.nextInt();
        stdVO.setGrade(ip_grade);

        System.out.print("반 : ");
        int ip_classroom = sc.nextInt();
        stdVO.setClassroom(ip_classroom);

        System.out.print("이름 : ");
        String ip_name = sc.next();
        stdVO.setNam(ip_name);

        System.out.print("키 : ");
        double ip_height = sc.nextDouble();
        stdVO.setHeight(ip_height);

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        stdVO.setGender(gender);

        stdVO.printInformation();
    }
}
