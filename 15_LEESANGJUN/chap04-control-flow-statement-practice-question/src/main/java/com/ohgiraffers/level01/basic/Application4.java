package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 나이를 입력 받아 입력받은 수가 13세 이하이면 "어린이"출력, 13세 초과 ~ 19세 이하이면 "청소년" 출력, 19세 초과 "성인"을 출력하세요.
         * * 나이를 입력하세요 : 12
         * * ---- 출력 ----
         * 어린이
         * * 나이를 입력하세요 : 29
         * 성인
         * */

        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 2. "나이를 입력하세요 : " 문구 출력
        System.out.print("나이를 입력하세요 : ");

        // 3. 정수형으로 나이 입력 받기
        int age = sc.nextInt();

        // 4. 조건문(if-else if-else)을 사용하여 연령대 판단
        if (age <= 13) {
            // 13세 이하인 경우
            System.out.println("어린이");
        } else if (age <= 19) {
            // 13세 초과 19세 이하인 경우 (14 ~ 19세)
            System.out.println("청소년");
        } else {
            // 19세 초과인 경우 (20세 이상)
            System.out.println("성인");
        }

        // 5. Scanner 닫기
        sc.close();
    }
}