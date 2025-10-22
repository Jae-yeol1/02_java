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
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수 하나를 입력하세요 : 9
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나를 입력하세요 : ");
        int num = sc.nextInt();
        String str1="";
        String str2="";
        int last_num=9;
        int space = num-1;
        for(int i=1;i<=num;i++){
            for(int t=space;t>=0;t--){
                System.out.print(" ");
            }
            String str_num1=i+"";
            str1=(str1+str_num1);
            System.out.print(str1);
            System.out.print(" X 8 + ");
            System.out.print(i);
            System.out.print(" = ");
            String str_num2=last_num+"";
            str2=(str2+str_num2);
            System.out.print(str2);
            last_num--;
            space--;
            System.out.println();
        }

    }
}
