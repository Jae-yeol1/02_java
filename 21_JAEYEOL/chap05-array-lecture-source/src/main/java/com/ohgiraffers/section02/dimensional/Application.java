package com.ohgiraffers.section02.dimensional;

public class Application {
    public static void main(String[] args) {
        //배열의 주소를 보관할 레퍼런스 변수 선언 (stack)
        int[][] iarr1;
        int iarr2 [][];
        int[] iarr3 []; // 3가지 방식 다 변수 선언 된다

        /*여러 개의 1차원 배열의 주소를 관리하는 배열 생성(heap)*/
        //iarr1 =  new int[][]; -> 크기를 지정하지 않으면 생성이 불가하다
        //iarr1 = new int[][4]; -> 주소를 묶어서  관리할 배열의 크기를 지정하지 않으면 생성불가
        iarr1 = new int [3][] ;  // 이건 가능 배열 3개를 만든다는 선언이라

        /* 3. 주소를 관리하는 배열의 인덱스마다 1차원 배열을 할당(heap)*/
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5]; // 여기서 출력하면 주소값이 나옴

        /* 한 번에 이차원 배열을 선언하고 할당할 수 있다.*/
        iarr2 = new int [3][5];

        /*4. 각 배열의 인덱스에 차례로 접근해서 값 출력*/
        for(int i = 0 ; i < iarr2.length; i++){ // 3
            for(int j = 0 ; j < iarr2[i].length; j++){ //5
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }




    }
}
