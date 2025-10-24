package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C {
        public void testIfElseifStatement() {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("학생 성적 : ");
            int score = sc.nextInt();

            String grade = ""; //학생성적 저장을 위한 변수 선언 및 초기화
            if (score >= 90 && score <= 100) {
                grade = "A";
            } else if (score >= 80 && score <= 100) {
                grade = "B";
            } else if (score >= 70 && score <= 100) {
                grade = "C";
            } else if (score >= 60 && score <= 100) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println(name+"학생의 점수는 "+score + "점이며 학점은 "+ grade+"입니다.");


}


}

