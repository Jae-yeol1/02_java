package com.ohgiraffers.section02.level03;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /*
        * System.arraycopy를 사용하여 배열 복사 합치기
        * int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        print(copy3);
        * */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9, 10};
        int[] d = new int[10];

        // 향상된 for문을 이용하여 위의 a, b, c의 배열의 값을 d의 배열에 합치기한 후 출력
        //for(한번의 반복문에서 사용될 변수 : 반복을 수행할 배열){}


        System.arraycopy(a,0,d,0,a.length);
        System.arraycopy(b,0,d,a.length,b.length);
        System.arraycopy(c,0,d,(a.length+b.length),c.length);
//        for(int k=0;k<d.length;k++){
//            System.out.print(d[k]+" ");
//        }

        int index=0;
        for (int n : d) {
            System.out.print(d[index++] = n );
            System.out.print(" ");
        }

//        for(int i : a){
//            for(int j : b){
//                for(int k : c){
//                    System.out.print(i+" "+j+" "+k+" ");
//                }
//                System.out.println();
//            }
//
//        }


    }
}
