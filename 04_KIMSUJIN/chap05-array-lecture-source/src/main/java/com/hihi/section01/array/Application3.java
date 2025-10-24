package com.hihi.section01.array;

public class Application3 {

    public static void main(String[] args) {
        int num;
//        System.out.println(num);

        int [] iarr = new int[10];
        for (int i = 0; i<iarr.length; i++){
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }

        String [] sarr = new String[10];
        for (int i = 0; i<sarr.length; i++){
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }

        char [] charr = new char[10];
        for (int i = 0; i<charr.length; i++){
            System.out.println("carr[" + i + "] : " + charr[i]);
        }

        /*
        * heap 영역에 할당 될 경우 자료형에 따른 초기값이 설정되어 할당된다.
        * 정수 : 0
        * 실수 : 0.0
        * 눈리 : false
        * 문자 :  |u 0000
        * 참조 (String, 클래스 ..) : null
        * */

        /*
        * 기본값 외의 값으로 초기화 하면서 배열을 생성하고 싷을 때*/
//        int [] iarr2 = new int[]{11, 22, 33, 44, 55,};
        int [] iarr2 = {11, 22, 33 ,44, 55,};       // -> 요렇게도 가능쓰

        int[] test = new int [5];
         test[0] = 11;
         test[2] = 22;

         //짜장면, 짬뽕, 탕수육, 삼겹살'
        String[] sarr2 = {"짜장면", "짬뽕", "탕수육", "삼겹살"};
    }
}
