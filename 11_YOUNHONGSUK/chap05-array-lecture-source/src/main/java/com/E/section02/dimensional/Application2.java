package com.E.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        int iarr [][] = new int [3][]; // 가변배열

        System.out.println(iarr); // 참조 주소
        System.out.println(iarr[0]); // heap의 1차원 배열 참조 주소값

        // 직접 넣어주기
        iarr[0] = new int[3];
        iarr[1] = new int[2];
        //변수를 만들고 변수를 넣어주기
        int[] arr = new int[5];
        iarr[2] = arr;

        /*가변 배열도 반복문 사용이 가능하다*/
        int value = 0;
        for(int i = 0; i  < iarr.length; i++){
            for(int j = 0; j < iarr[i].length; j++){
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
