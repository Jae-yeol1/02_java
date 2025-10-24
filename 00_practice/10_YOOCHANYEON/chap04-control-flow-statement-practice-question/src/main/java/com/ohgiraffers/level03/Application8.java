package com.ohgiraffers.practice;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int input = sc.nextInt();

        for(int i = 1;i <= input;i++) {
            int sum = 0;
            int k = 1;
            while(k <= i) {
                sum = k + sum * 10;
                k++;
            }
            int j = i;
            while(j < input) {
                System.out.print(" ");
               j++;
            }

            System.out.println(sum + " x 8 + " + i + " = " + (sum * 8 + i));
        }
    }
}
