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
        int a = sc.nextInt();

        if(a < 1 || a > 12){
            System.out.println("invalid input");
        }
        else if(a == 3 || a == 4 || a == 5){
            System.out.println("spring");
        }
        else if(a == 6 || a == 7 || a == 8){
            System.out.println("summer");
        }
        else if(a == 9 || a == 10 || a == 11){
            System.out.println("fall");
        }
        else if(a == 12 || a == 1 || a == 2){
            System.out.println("winter");
        }

    }
}
