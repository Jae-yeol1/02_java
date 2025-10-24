package com.E.section02.dimensional;

public class Application1 {
    public static void main (String[] args){
        /*배열의 주소를 보관할 ref 변수 선언 (saved in stack)*/
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /*여러 개의 1차원 배열의 주소를 관리하는 배열 생성 (heap)
        * iarr1 = new int[][]; 크기를 지정하지 않으면 생성 불가
        * iarr1 = new int[][4]; 주소를 묶어서 관리할 배열의 크기를지정하지 않으면 생성 불가
        *
        * */

        iarr1 = new int[3][];
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];


    }
}
