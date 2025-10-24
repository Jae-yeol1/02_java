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
        System.out.println("give me a num");
        int n =  sc.nextInt();
        String str = "";

        int i = 12;

        for(int j = 1; j < n+1; j++){
            String space = " ";
            int temp = 13 - j;
            while(temp > 0){
                space+= " ";
                temp--;
            }
            str += j;
            int fin = Integer.parseInt(str);
            System.out.println(space + fin + " x " + "8" + " + " + j + " = " + (fin*8+j));
        }

//        for(int j = 1; j < n+1; j++){
//            space = " ".repeat(i);
//            str += j;
//            int fin = Integer.parseInt(str);
//            System.out.println(space + fin + " x " + "8" + " + " + j + " = " + (fin*8+j));
//            i--;
//        }

    }
}
