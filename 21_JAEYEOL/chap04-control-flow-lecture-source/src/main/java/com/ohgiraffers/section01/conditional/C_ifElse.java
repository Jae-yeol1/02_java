package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// LSOutput import는 사용되지 않아 제거했습니다.

public class C_ifElse {

    // testIfElseifStatment 메소드 시작
    public void testIfElseifStatment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생이름: ");
        String name = sc.nextLine();
        System.out.print("학생성적: "); // println 대신 print를 사용하여 줄바꿈 방지
        int score = sc.nextInt();

        String grade = "";  // 지역변수로 선언 (전역변수가 아닙니다. 메소드 내부에 선언했기 때문)

        if (score >= 90) {
            grade ="A";
            // String grade1 = "A";  // 지역변수. 중괄호 안에서만
        }else if (score >= 80){
            grade ="B";
        }else if (score >= 70){
            grade ="C";
        }else if (score >= 60){
            grade ="D";
        }else {
            grade = "F" ;
        }
        System.out.println(name + "학생의 점수는 " + score +"점이며 학점은 " + grade + "입니다");
    }
    // testIfElseifStatment 메소드 끝

    // 🚨 testNestedIfElseifStatment 메소드는 반드시 클래스 중괄호 { } 안에 있어야 합니다.
    public void testNestedIfElseifStatment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생이름: ");
        String name = sc.nextLine();
        System.out.print("학생성적: ");
        int score = sc.nextInt();

        // 학생 성적 저장을 위한 변수 선언 및 초기화
        String grade = "";

        if (score >= 90) {
            grade ="A";
            if(score >= 95) grade +="+";

            // String grade1 = "A";  // 지역변수. 중괄호 안에서만
        }else if (score >= 80){
            grade ="B";
            if(score >= 85) grade +="+";
        }else if (score >= 70){
            grade ="C";
            if(score >= 75) grade +="+";
        }else if (score >= 60){
            grade ="D";
            if(score >= 65) grade +="+";
        }else {
            grade = "F" ;
        }
        System.out.println(name + "학생의 점수는 " + score +"점이며 학점은 " + grade + "입니다");
    }
    // testNestedIfElseifStatment 메소드 끝

} // C_ifElse 클래스 끝