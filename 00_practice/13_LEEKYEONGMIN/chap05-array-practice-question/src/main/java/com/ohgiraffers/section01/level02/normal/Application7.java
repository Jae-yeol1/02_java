package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */
        int arr[]= new int[10];

        for(int i=0;i<10;i++){
            int random = (int)(Math.random()*10)+1;
            arr[i]=random;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<10;i++) {
            if (arr[i - 1]>max) {
                max = arr[i - 1];
            }
        }
        for(int i=1;i<10;i++) {
            if (arr[i - 1]<min) {
                min = arr[i - 1];
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : "+ min);
    }
}
