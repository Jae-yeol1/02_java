package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.student.model.vo.StudentVo;

import java.util.Scanner;

public class Application {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter grade");
    int grade = sc.nextInt();
    System.out.println("Enter classroom");
    int  classroom = sc.nextInt();
    System.out.println("name");
    String name = sc.next();
    System.out.println("height");
    double height = sc.nextDouble();
    System.out.println("gender");
    char g = sc.next().charAt(0);

    StudentVo s = new StudentVo(grade,classroom,name,height,g);
   s.printInformation();

}

}
