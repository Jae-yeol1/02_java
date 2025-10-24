package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        * 탭 숫자 뭐시기 = 숫자
        * input = 9
        *
        * 탭 input-1개 i ~ = input
        * 탭 input-2개 i i+1 ~ = input input-1
        *             1 x 8 + 1 = 9             탭: input-1번             탭: input-i개     숫자: 1
        *            12 x 8 + 2 = 98            탭: input-2번                              숫자: 2
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321     탭: input-...번                             숫자: input
        * 정수 하나를 입력하세요 : 9
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int input = sc.nextInt();
        int tmp = input;

        for (int i = 1; i <= input; i++) {
            // 탭
            for (int j = input - i; j >= 0 ; j-- ) {
                System.out.print(" "); // 탭 input-1개 출력
            }

            // 숫자 순서대로 출력
            for (int j = 1; j <= i; j++) { // i번 실행
                System.out.print(j);
            }

            // 수식
            System.out.print(" x 8 + " + i + " = ");

            // input 역순 출력
            for (int j = 1; j <= i; j++) {
                System.out.print(input-j+1);
            }

            System.out.println();
        }
}
}
