package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 하나 입력하세요 : ");
        String inputString = sc.nextLine();

        System.out.print("찾고자 하는 문자 하나를 입력하세요 : ");
        char inputChar = sc.next().charAt(0);

        // 인덱스 저장할 배열 초기화
        int[] indexarr = new int[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            indexarr[i] = -1;
        }
        // 인덱스 찾기 + 카운트 하기
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                indexarr[i] = i;
                count++;
            }
        }
        System.out.println("문자열 : " + inputString);
        System.out.println("문자 : " + inputChar);
        System.out.print(inputString + "에 " + inputChar + "가 존재하는 위치(인덱스) : ");
        for (int i = 0; i < indexarr.length; i++) {
            if (indexarr[i] != -1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(inputChar + " 개수 : " + count);
        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */

    }
}
