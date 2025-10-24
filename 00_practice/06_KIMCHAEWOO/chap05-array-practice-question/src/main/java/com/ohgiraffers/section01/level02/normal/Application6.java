package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */
        Scanner sc = new Scanner(System.in);
        String[] menu = {"양념치킨", "마늘치킨", "후라이드치킨", "왕큰치킨", "뼈치킨", "순살치킨", "안매운치킨", "비싼치킨"};

        System.out.print("치킨 이름 검색: ");
        String target = sc.nextLine();
        String input = target + "치킨";

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(input)) {
                System.out.println(input + " 배달 가능");
                break;
            } else {
                if (i == menu.length - 1) {
                    System.out.println(input + "은 없는 메뉴");
                }
            }
        }
    }
}
