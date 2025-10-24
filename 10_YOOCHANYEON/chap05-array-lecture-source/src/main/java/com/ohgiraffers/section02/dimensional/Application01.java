package com.ohgiraffers.section02.dimensional;

public class Application01 {

    public static void main(String[] args) {

        /* 1. 배열의 주소를 보관할 레퍼런스 변수 선언 (stack) */
        int [][] iarr1;
        int iarr2 [][];
        int[] iarr3 [];

        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열 생성 (heap) */
//        iarr1 = new int[][];    -> 크기를 지정하지 않으면 생성 불가
//        iarr1 = new int[][4];   -> 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 생성 x
        iarr1 = new int[3][];
        System.out.println(iarr1[0]);

        /* 3. 주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당 (heap) */
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        System.out.println(iarr1[0]);   // 주소 값 출력

        /* 한번에 2차원 배열을 선언하고 할당 가능*/
        iarr2 = new int[3][5];  // 3행 5열의 배열 생성

        /* 4. 각 배열의 인덱스에 차례로 접근해서 값 출력*/
        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }

        char[][] iarr4 = new char[20][2];
        for (int i = 0; i < iarr4.length; i++) {
            for (int j = 0; j < iarr4[i].length; j++) {
                if(i % 2 == 0){
                    if(j == 0) {
                        iarr4[i][0] = ' ';
                    } else {
                        iarr4[i][1] = '4';
                    }
                } else {
                    if(j == 1) {
                        iarr4[i][1] = ' ';
                    } else {
                        iarr4[i][0] = '4';
                    }
                }
                System.out.print(iarr4[i][j] + " ");
            }
            System.out.println();
        }

    }

}
