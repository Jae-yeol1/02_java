package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int Num2 = sc.nextInt();

        String season = ""; // 결과를 저장할 변수

        // 1. 유효성 검사 (1~12 사이의 숫자가 아닌 경우)를 가장 먼저 처리
        if (Num2 < 1 || Num2 > 12) {
            season = "잘못 입력하셨습니다";

            // 2. 봄 (3, 4, 5월) - 고객님이 제시한 범위 연산자 방식으로 처리
        } else if (Num2 >= 3 && Num2 <= 5) {
            season = "봄";

            // 3. 여름 (6, 7, 8월)
        } else if (Num2 >= 6 && Num2 <= 8) {
            season = "여름";

            // 4. 가을 (9, 10, 11월)
        } else if (Num2 >= 9 && Num2 <= 11) {
            season = "가을";

            // 5. 겨울 (12, 1, 2월) - 남은 유효한 모든 경우 (1, 2, 12월)
        } else {
            season = "겨울";
        }

        System.out.println(season);
        sc.close();
    }
}