package org.com.ohgiraffers.section1;

import java.util.Scanner;

public class C_ifElseif {

    public void testIfelseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : " );
        int score = sc.nextInt();

        String grade = "";

        if(score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        }
        else if(score >= 70) {
            grade = "C";
        }
        else if(score >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println(name + "학생의 점수는" + score + "점이며 학점은 " + grade +"입니다.");
    }

    public void testNestedIfelseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : " );
        int score = sc.nextInt();

        String grade = "";
        if(score == 100 || (score % 10 >= 5 && score >= 60)) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            grade += "+";
        }

        System.out.println(name + "학생의 점수는" + score + "점이며 학점은 " + grade +"입니다.");
    }
}
