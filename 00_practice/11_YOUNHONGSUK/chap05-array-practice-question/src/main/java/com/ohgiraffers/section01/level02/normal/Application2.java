package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("joo bun pls");
        String s =  sc.nextLine();
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
                ch[i] = s.charAt(i);
                System.out.println(s.charAt(i));
        }

        for(int i = 8; i < s.length(); i++){
            ch[i] = '*';
        }

        for(int i = 0; i < s.length(); i++){
            System.out.print(ch[i]);
        }

    }
}
