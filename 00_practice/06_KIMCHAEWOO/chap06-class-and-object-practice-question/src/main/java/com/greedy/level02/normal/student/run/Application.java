package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("grade: ");
        int grade = sc.nextInt();

        System.out.print("classroom: ");
        int classroom = sc.nextInt();
        sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("height: ");
        double height = sc.nextDouble();

        System.out.print("gender: ");
        char gender = sc.next().charAt(0);

        StudentVO studentVO = new StudentVO(grade, classroom, name, height, gender);

        studentVO.printInformation();
    }
}
