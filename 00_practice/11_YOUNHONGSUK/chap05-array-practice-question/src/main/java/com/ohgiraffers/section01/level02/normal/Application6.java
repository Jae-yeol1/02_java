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
        String[] chicken = {"양념", "후라이드", "반반", "마늘간장"};

        boolean check = true;
        System.out.println("치킨을 주문해라 휴먼");
        Scanner sc = new Scanner(System.in);
        String order =  sc.nextLine();
        for(String  str : chicken){
            if(str.equals(order)){
                check = false;
                break;
            }
        }
        if(!check){
            System.out.println(order + " 배달 가능");
        }
        else System.out.println(order + " 배달 불가능");

    }
}
