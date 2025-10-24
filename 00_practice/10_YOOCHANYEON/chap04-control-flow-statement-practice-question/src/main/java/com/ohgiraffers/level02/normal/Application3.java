package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못 입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("달을 입력해주세요..(숫자만..)");
        int num =  sc.nextInt();

        switch (num) {
            case 1:
            case 2:
                System.out.println("추운 겨울.."); break;
            case 3:
            case 4:
            case 5:
                System.out.println("꽃가루.. 봄.."); break;
            case 6:
            case 7:
            case 8:
                System.out.println("무더운 여름..."); break;
            case 9:
            case 10:
            case 11:
                System.out.println("쓸쓸한 가을.."); break;
            case 12:
                System.out.println("추운 겨울..");

        }
    }
}
