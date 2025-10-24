package com.ohgiraffers.section03.branching;

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.(1~9)");
        int num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            int sum = 0;
            for(int j = 1 ; j <= num1 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                sum = k + (sum * 10);
            }
            int result = sum * 8 + i;
            System.out.println(sum + " x 8 + " + i + " = " + result);
        }
    }
}
