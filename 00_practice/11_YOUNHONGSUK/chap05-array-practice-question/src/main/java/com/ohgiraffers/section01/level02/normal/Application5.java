package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

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

        Scanner sc =  new Scanner(System.in);
        System.out.println("word");
        String s = sc.nextLine();
        char[] ch = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }

        System.out.println("letter");
        String letter = sc.nextLine();

        int count = 0;
        String ans = "";

        for(int i = 0;i<ch.length;i++){
            if(ch[i]==letter.charAt(0)){
                ans += i + " ";
                count++;
            }
        }
        System.out.println(s + "에" + letter + " 가 존재하는 위치(인덱스) : " + ans);
        System.out.println(letter + " 개수 : " + count);
    }

    }

