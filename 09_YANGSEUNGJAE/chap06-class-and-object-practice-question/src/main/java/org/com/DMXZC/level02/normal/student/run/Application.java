package org.com.DMXZC.level02.normal.student.run;

import org.com.DMXZC.level02.normal.student.model.vo.StudentVo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentVo sv = new StudentVo();
        Scanner sc = new Scanner(System.in);

        sv.setGrade(sc.nextInt());
        sc.nextLine();
        sv.setClassroom(sc.nextInt());
        sc.nextLine();
        sv.setName(sc.nextLine());
        sv.setHeight(sc.nextDouble());
        sc.nextLine();
        sv.setGender(sc.nextLine().charAt(0));

        sv.printInformation();

    }
}
