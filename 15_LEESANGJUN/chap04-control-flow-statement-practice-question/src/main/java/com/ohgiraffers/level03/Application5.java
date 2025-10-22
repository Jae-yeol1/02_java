package com.ohgiraffers.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
         *
         * 예시) 입력 5일 때
         *         1 x 8 + 1 = 9
         *        12 x 8 + 2 = 98
         *       123 x 8 + 3 = 987
         *      1234 x 8 + 4 = 9876
         *     12345 x 8 + 5 = 98765
         *
         * 예시) 입력 9일 때
         *             1 x 8 + 1 = 9
         *            12 x 8 + 2 = 98
         *           123 x 8 + 3 = 987
         *          1234 x 8 + 4 = 9876
         *         12345 x 8 + 5 = 98765
         *        123456 x 8 + 6 = 987654
         *       1234567 x 8 + 7 = 9876543
         *      12345678 x 8 + 8 = 98765432
         *     123456789 x 8 + 9 = 987654321
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            StringBuilder asc = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                asc.append(j);
            }

            StringBuilder desc = new StringBuilder();
            for (int j = i; j >= 1; j--) {
                desc.append(j);
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            System.out.printf("%s x 8 + %d = %s%n", asc, i, desc);
        }

        sc.close();
    }
}
