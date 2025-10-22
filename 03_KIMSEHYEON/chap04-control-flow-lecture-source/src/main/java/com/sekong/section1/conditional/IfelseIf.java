package com.sekong.section1.conditional;

import java.util.Scanner;

public class IfelseIf {
    public void testSimpleIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade  = "";
        if(score >= 90){
           grade = "A";
        } else if (score >= 80){
            grade = "B";
        }else if (score >= 70){
            grade = "C";
        }else if (score >= 60){
            grade = "D";
        }else {
            grade = "F";
        }

        System.out.println(name +" 학생의 점수는 " + score + "점이고, 등급은 "+grade+"입니다.");
    }
    public void testSimpleNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade  = "";
        if(score >= 90){
            if(score >= 95){
                grade = "A+";
            }else{grade = "A0";}
        } else if (score >= 80){
            grade = "B";
        if (score >= 85) grade += "+";
        }else if (score >= 70){
            if(score >= 75){
                grade = "C+";
            }
            else {grade = "C0";}
        }else if (score >= 60){
            if(score >= 65){
                grade = "D+";
            }else {grade = "D0";}
        }else {
            grade = "F";
        }

        System.out.println(name +" 학생의 점수는 " + score + "점이고, 등급은 "+grade+"입니다.");
    }
}
