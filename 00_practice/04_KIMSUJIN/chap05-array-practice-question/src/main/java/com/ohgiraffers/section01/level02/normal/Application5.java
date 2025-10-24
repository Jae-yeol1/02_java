package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
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
        Scanner sc = new Scanner(System.in);

        //문자열 입력받기
        System.out.print("문자열 하나 입력하시오 : ");
        String input = sc.nextLine();

        //문자 하나 입력받기
        System.out.print("문자 하나 입력하시오 : ");
        char ch = sc.next().charAt(0);

        char [] arr = new char[input.length()];

        // 입력받은 문자열 문자형으로 변환하여 arr에 저장
        for (int i=0; i < input.length();i++){
            arr[i] = input.charAt(i);
        }

        //for문으로 입력받은 문자 있는지 확인
        int cnt = 0;
        for (int i = 0;  i < input.length(); i++){
            if (arr[i] == ch){
                cnt++; //cnt 입력한 문자 몇개 있는지 저장
            }
        }
        //문자 인덱스 저장용 배열(cnt 숫자만큼)
        int [] index = new int[cnt];
        for (int i = 0;  i < cnt; i++){
            if (arr[i] == ch){
                index [i] = i;
            }
        }

        System.out.println(ch + "의 개수 :" + cnt);
        System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : ");
        System.out.print(Arrays.toString(index));
    }
}
