package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         *
         * 힌트 : charAt()
         * 예시)
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
         *1,3 - 남자, 2,4 - 여자
         * ---출력----
         * 남자 입니다
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력해주세요(- 포함) : ");
        char ch = sc.next().charAt(8);

        String gender = "";
        if (ch == 1) {
            gender = "남자";
        } else if (ch == 3) {
            gender = "남자";
        } else if (ch == 2) {
            gender = "여자";
        } else if (ch == 4) {
            gender = "여자";
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        System.out.println(gender + " 입니다.");
    }
}

