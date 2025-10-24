package com.ohgiraffers.section02.level03;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        Application1 ap = new Application1();

        ap.arrayTest1(arr);
        System.out.println(" ");
        ap.arrayTest2(arr);
        System.out.println(" ");
        ap.arrayTest3(arr);
        System.out.println(" ");
        ap.arrayTest4(arr);
        System.out.println(" ");
        ap.arrayTest5(arr);
        System.out.println(" ");
        ap.arrayTest6(arr);
        System.out.println(" ");
        ap.arrayTest7(arr);
        System.out.println(" ");
        ap.print(arr);
    }

    /**
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 16
     *
     * @param arr
     */
    public void arrayTest1(int[][] arr) {

        int a[][]= arr;

        int sum = 1;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum++;
            }
            System.out.println("");
        }
    }

    /**
     * 1 5 9 13
     * 2 6 10 14
     * 3 7 11 15
     * 4 8 12 16
     *
     * @param arr
     */
    public void arrayTest2(int[][] arr) {
        int a[][]= arr;

        for(int i=0;i<4;i++){
            int sum = 1+i;
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum+=4;
            }
            System.out.println("");
        }
    }

    /**
     * 4 3 2 1
     * 8 7 6 5
     * 12 11 10 9
     * 16 15 14 13
     *
     * @param arr
     */
    public void arrayTest3(int[][] arr) {

        int a[][]= arr;

        for(int i=0;i<4;i++){
            int sum = 4*(i+1);
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum--;
            }
            System.out.println("");
        }
    }

    /**
     * 16 12 8 4
     * 15 11 7 3
     * 14 10 6 2
     * 13 9 5 1
     *
     * @param arr
     */
    public void arrayTest4(int[][] arr) {
        int a[][]= arr;

        for(int i=0;i<4;i++){
            int sum = 16-(i);
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum-=4;
            }
            System.out.println("");
        }
    }

    /**
     * 13 14 15 16
     * 9 10 11 12
     * 5 6 7 8
     * 1 2 3 4
     *
     * @param arr
     */
    public void arrayTest5(int[][] arr) {
        int a[][]= arr;

        for(int i=0;i<4;i++){
            int sum = 13-(i*4);
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum++;
            }
            System.out.println("");
        }
    }

    /**
     * 13 9 5 1
     * 14 10 6 2
     * 15 11 7 3
     * 16 12 8 4
     *
     * @param arr
     */
    public void arrayTest6(int[][] arr) {

        int a[][]= arr;

        for(int i=0;i<4;i++){
            int sum = 13+i;
            for(int j=0;j<4;j++){
                a[i][j] = sum;
                System.out.print(a[i][j]+" ");
                sum-=4;
            }
            System.out.println("");
        }
    }

    /**
     * 4 8 0 16
     * 0 7 11 0
     * 2 0 10 14
     * 1 5 0 13
     *
     *  3의 배수인 경우 continue;
     * @param arr
     */

    public void arrayTest7(int[][] arr) {
        int a[][]= arr;

        int sum = 0;
        for(int i=0;i<4;i++){
            for(int j=3;j>=0;j--){
                sum++;

                a[j][i] = sum;

                if(a[i][j]%3==0){
                    a[i][j]=0;
                }

            }


            System.out.println("");
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
