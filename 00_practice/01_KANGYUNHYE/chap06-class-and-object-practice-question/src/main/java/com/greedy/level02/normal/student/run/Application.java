package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVO student = new StudentVO();

        System.out.print("학년 : ");
        student.setGrade(sc.nextInt());

        System.out.print("반 : ");
        student.setClassroom(sc.nextInt());

        System.out.print("이름 : ");
        student.setName(sc.next());

        System.out.print("키 : ");
        student.setHeight(sc.nextDouble());

        sc.nextLine();

        System.out.print("성별 :");
        student.setGender(sc.next().charAt(0));

        student.printInformation();



    }
}
