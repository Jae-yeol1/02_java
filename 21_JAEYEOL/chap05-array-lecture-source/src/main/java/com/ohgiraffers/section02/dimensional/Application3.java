package com.ohgiraffers.section02.dimensional;

public class Application3 {
    public static void main(String[] args) {
        /*2차원 배열의 선언과 할당 및 초기화를 동시에 할수 있음*/

        /*정변배열일때*/
        int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}} ; //3행 5열의 정변 배열

        /*가변 배열일때*/
        int[][] iarr2 = {{1,2,3},{4,5},{6,7,8,9,10 }};

        int [] arr1 = {1,2,3,4,5};;
        int [] arr2 = {6,7,8,9,10};
        int [][] iarr3 = {arr1,arr2};   // 1차원배열을 2차원 배열로 만들수 도있음

    }
}
