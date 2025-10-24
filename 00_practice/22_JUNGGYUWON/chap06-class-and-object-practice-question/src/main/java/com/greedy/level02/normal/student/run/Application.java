package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.nextLine();
        int classroom = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double height = sc.nextDouble();
        sc.nextLine();
        char gender = sc.next().charAt(0);
        sc.nextLine();

        StudentVO vo =  new StudentVO();
        vo.setGrade(grade);
        vo.setClassroom(classroom);
        vo.setName(name);
        vo.setHeight(height);
        vo.setGender(gender);

        vo.printInformation();
    }
}
