package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        arrayTest1(arr);
        arrayTest2(arr);
        arrayTest3(arr);
        arrayTest4(arr);
       arrayTest5(arr);
       arrayTest6(arr);
       arrayTest7(arr);

    }


    /**
     * 1 2 3 4
     * 5 6 7 8
     * 9 10 11 12
     * 13 14 15 16
     *
     * @param arr
     */
    public static void arrayTest1(int[][] arr) {
        System.out.println("test1");
        int num=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=num++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    public static void arrayTest2(int[][] arr) {

        System.out.println("test2");
        int num=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=num;
                System.out.print(arr[i][j]+" ");
                num+=4;
            }
            num=(i+2);
            System.out.println();
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
    public static void arrayTest3(int[][] arr) {
        System.out.println("test3");
        int num=1;
        for(int i=0; i<arr.length; i++){
           for(int j=arr.length-1; j>=0; j--) {
               arr[i][j] = num++;
           }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    public static void arrayTest4(int[][] arr) {

        System.out.println("test4");

        int num=1;
        int a=2;
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[i].length-1; j>=0; j--){
                arr[i][j]=num;
                num+=4;
            }
            num=a;
            a++;
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    public static void arrayTest5(int[][] arr) {

        System.out.println("test5");
        int num=1;
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=num++;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    public static void arrayTest6(int[][] arr) {
        System.out.println("test6");
        int num=1;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0; j<arr[i].length;j++){
                arr[j][i]=num++;
            }
        }


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
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
    public static void arrayTest7(int[][] arr) {
        System.out.println("test7");

        int num=1;

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length-1; j>=0; j--){
                if(num%3==0){
                    arr[j][i]=0;
                }else {
                    arr[j][i] = num;
                }
                num++;
            }
        }



        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public static void print(int[][] arr) {

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
