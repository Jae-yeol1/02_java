package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         * 힌트 : charAt()
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1
         *1,3 - 남자, 2,4 - 여자
         * 남자 입니다
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요(- 포함) : ");
        int ch = sc.next().charAt(8);
        if (ch == 1) {
            System.out.println("남자 입니다.");
        } else (ch == 2) {
            System.out.println("여자 입니다.");


        }
    }
}
