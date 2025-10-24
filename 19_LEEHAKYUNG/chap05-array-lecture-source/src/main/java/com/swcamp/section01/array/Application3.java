package com.swcamp.section01.array;

public class Application3 {

    public static void main(String[] args) {

        // 지역 변수는 초기화 해야 하고, 그렇지 않으면 에러!
        // 전역 변수는 JVM이 초기화를 대신 해줌.
//        int num;
//        System.out.println(num);

        int[] iarr = new int[10];
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }   // 0으로 초기화 되어 있음

        String[] sarr = new String[10];
        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }   // null로 초기화 되어 있음

        char[] carr = new char[10];
        for (int i = 0; i < carr.length; i++) {
            System.out.println("carr[" + i + "] : " + carr[i]);
        }   // 비어 있는 상태?로 나온다고 함....

        /*
        heap 영역에 할당 될 경우(new) 자료형에 따른 초기 값이 설정되어 할당된다.
        정수 : 0
        실수 : 0.0
        논리 : false
        문자 : \u0000
        참조 : null
         */

        /*
        기본 값 이외의 갑으로 초기화 하면서 배열을 생성하고 싶을 때
         */
//        int[] iarr2 = new int[]{11, 22, 33, 44, 55};
        /* 기본값 외의 갑으로 초기화 하면서 배열을 생성하고 싶을 때 */
        int[] iarr2 = {11, 22, 33, 44, 55};

        String[] menu = {"짜장면", "짬뽕", "탕수육", "삼겹살"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println("menu[" + i + "] : " + menu[i]);
        }

    }
}
