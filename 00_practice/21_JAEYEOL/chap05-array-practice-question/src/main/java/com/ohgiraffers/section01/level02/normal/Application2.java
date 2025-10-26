package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);
        //스캐너 값 선언
        System.out.print("주민번호를 입력하여 주세요 :");
        String id = sc.nextLine();  // 민번을 문자열로 받음

        char[] carr = new char[id.length()]; // 배열을 스캐너에서 받은 문자열 크기만큼 받는다

        for (int i = 0; i < id.length(); i++) {
            carr[i] = id.charAt(i);
        }
        // 7번째 배열부터 * 처리하기?
        for (int i = 8; i < carr.length; i++) {
            carr[i] = '*';

        }
        System.out.println(carr);









    }
}
