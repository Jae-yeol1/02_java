package com.chaewookim.section02.dimensional;

public class Application1 {
    public static void main(String[] args) {

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

//        iarr1 = new int[][]; -> 크기를 지정하지 않으면 생성 불가
//        iarr1 = new int[][4]; -> 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 생성 불가
        iarr1 = new int[3][];

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        iarr2 = new int[3][5];

        System.out.println(iarr1[0]);

        for (int i = 0; i < iarr2.length; i++) {
            for (int j = 0; j < iarr2[i].length; j++) {
                System.out.print(iarr2[i][j]);
            }
            System.out.println();
        }
    }
}
