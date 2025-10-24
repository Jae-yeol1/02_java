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
        String[] chicken = {"양념","간장","후라이드"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String want = sc.next();
        switch(want){
            case "양념":
                System.out.println("양념 치킨 베딜 가능");
                break;
            case "간장":
                System.out.println("간장 치킨 베딜 가능");
                break;
            case "후라이드":
                System.out.println("후라이드 치킨 베딜 가능");
                break;
            default:
                System.out.println(want+"치킨은 없는 메뉴입니다.");

        }
//        for(int i=0;i<chicken.length;i++){
//            if(chicken[i].equals(str)){
//                System.out.println(chicken[i]+"치킨 베딜 가능");
//            }
//            else{
//                System.out.println(chicken[i]+"치킨은 없는 메뉴입니다.");
//            }
//        }


    }
}
