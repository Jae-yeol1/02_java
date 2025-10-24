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
        String[] dak = {"뿌링클", "신호등", "망고", "메론"};
        System.out.println("예 java 치킨입니다. ");
        String order = sc.nextLine();

        switch(order) {
            case "뿌링클":
                System.out.println(dak[0] + " 치킨은 배달 가능"); break;
            case "신호등":
                System.out.println(dak[1] + " 치킨은 배달 가능"); break;
            case "망고":
                System.out.println(dak[2] + " 치킨은 배달 가능"); break;
            case "메론":
                System.out.println(dak[3] + " 치킨은 배달 가능"); break;
            default:
                System.out.println(order + " 메뉴는 없는 메뉴에여.. 빠잉");
        }
    }
}
