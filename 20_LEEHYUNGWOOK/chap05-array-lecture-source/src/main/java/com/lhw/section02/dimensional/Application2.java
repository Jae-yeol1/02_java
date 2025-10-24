package com.lhw.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {

        /* 2차원 가변 배열 선언/할당
        *
        *  가변 배열의 경우 인덱스별 1차원 배열을 따로 할당해야 함*/
        int [][] iarr = new int[3][]; //가변 배열

        System.out.println(iarr); // -> Stack 레퍼선스 배열 참조 주소값
//        System.out.println(iarr[0]); //heap 1차원 배열 참조 주소값: 현재:null
//        System.out.println(iarr[0][0]); // Null 참조했음:오류발생

        /* 가변 배열 선언*/
        iarr[0] = new int[3];
        iarr[1] = new int[2];
        iarr[2] = new int[5];

        int val = 0;
        for (int i = 0; i < iarr[0].length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = val++;
                System.out.print(iarr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
