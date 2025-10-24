package com.ohgiraffers.section01;

import java.util.Scanner;

public class C_ifElseif {

    public void testIfElseifStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름이 뭐꼬?");
        String name = sc.nextLine();
        System.out.println("공부는 잘하나?");
        int score = sc.nextInt();

        String grade = "";      // 학생 성적 저장을 위한 변수 선언 및 초기화

        if(score >= 90){
            grade = "A";
            if(score >= 95) grade += "+";
        } else if(score >= 80){
            grade = "B";
            if(score >= 85) grade += "+";
        } else if(score >= 70){
            grade = "C";
            if(score >= 75) grade += "+";
        } else if(score >= 60){
            grade = "D";
            if(score >= 65) grade += "+";
        } else {
            grade = "F";
        }
        System.out.println(name + " 니 좀 치네 " + grade + "급");

    }
}
