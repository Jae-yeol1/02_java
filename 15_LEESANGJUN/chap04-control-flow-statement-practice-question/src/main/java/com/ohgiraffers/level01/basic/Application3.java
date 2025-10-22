package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
         *
         * 힌트 : charAt()
         * 예시)
         * 주민등록번호를 입력해주세요(- 포함) : 881122-1234567
         * 1,3 - 남자, 2,4 - 여자
         * ---출력----
         * 남자 입니다
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요(- 포함) : ");

        // 주민등록번호 전체를 문자열로 입력받음
        String jumin = sc.next();

        // 하이픈 다음의 첫 번째 숫자(성별 코드) 추출
        char genderCode = jumin.charAt(7);

        // 성별 판별 (1,3 = 남자 / 2,4 = 여자)
        if (genderCode == '1' || genderCode == '3') {
            System.out.println("남자 입니다.");
        } else if (genderCode == '2' || genderCode == '4') {
            System.out.println("여자 입니다.");
        }

        sc.close();
    }
}
