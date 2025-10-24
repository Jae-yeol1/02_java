package com.lhw.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {


    public void testIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();
        String grade = "";

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
        System.out.println(name + " 학생의 점수는 " + score + "이고, 성적은 " + grade + "입니다.");
    }

    public void testNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();
        String grade = "";

        if (score >= 90) {
            grade = "A";
            if ( score >= 95) {
                grade += "+";
            }
        } else if (score >= 80) {
            grade = "B";
            if ( score >= 85) {
                grade = "B+";
            }
        } else if (score >= 70) {
            grade = "C";
            if ( score >= 75) {
                grade = "C+";
            }
        } else if (score >= 60) {
            grade = "D";
            if ( score >= 65) {
                grade = "D+";
            }
        } else {
            grade = "F";
        }

        if (score == 100 || score%10 == 5 && score >=60) {
            grade += "+";
        }
        System.out.println(name + " 학생의 점수는 " + score + "이고, 성적은 " + grade + "입니다.");
    }
}
