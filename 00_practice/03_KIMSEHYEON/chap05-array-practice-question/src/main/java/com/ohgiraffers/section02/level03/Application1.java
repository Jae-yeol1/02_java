package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        int[][]arr2 = new int[3][5];
        Application1 app = new Application1();

        System.out.println("===1===");
        app.arrayTest1(arr);
        app.print(arr);
        System.out.println("===2===");
        app.arrayTest2(arr);
        app.print(arr);
        app.arrayTest2(arr2);
        System.out.println("===22===");
        app.print(arr2);
        System.out.println("===3===");
        app.arrayTest3(arr);
        app.print(arr);
        System.out.println("===4===");
        app.arrayTest4(arr);
        app.print(arr);
        System.out.println("===44===");
        app.arrayTest4(arr2);
        app.print(arr2);
        System.out.println("===5===");
        app.arrayTest5(arr);
        app.print(arr);
        System.out.println("===6===");
        app.arrayTest6(arr);
        app.print(arr);
        System.out.println("===66===");
        app.arrayTest6(arr2);
        app.print(arr2);
        System.out.println("===7===");
        app.arrayTest7(arr);
        app.print(arr);
        System.out.println("===77===");
        app.arrayTest7(arr2);
        app.print(arr2);



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
        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
        }

    }

    /**
     * 1 5 9 13
     * 2 6 10 14
     * 3 7 11 15
     * 4 8 12 16
     *
     * 1 4 7 10
     * 2 5 8 11
     * 3 6 9 12
     *
     * @param arr
     */
    public void arrayTest2(int[][] arr) {
        int i = 1;

        for(int col = 0; col < arr[0].length; col++){
            for(int row = 0; row < arr.length; row++){
                arr[row][col] = i++;
            }
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
        int i = 1;
        for(int row = 0; row < arr.length; row++){
            for(int col = arr[row].length - 1; col >= 0; col--){
                arr[row][col] = i++;

            }
        }


    }

    /**
     * 16 12 8 4
     * 15 11 7 3
     * 14 10 6 2
     * 13 9 5 1
     *
     * 12 9 6 3
     * 11 8 5 2
     * 10 7 4 1
     * @param arr
     */

    public void arrayTest4(int[][] arr) {
        int i = 1;
        for(int col = arr[0].length - 1; col >= 0; col--){
            for(int row = arr.length - 1; row >= 0; row--){
                arr[row][col] = i++;
            }
        }


    }
    public void arrayTest44(int[][] arr) {
        int value = 1;
        int index = 0;
        for(int col = arr[index].length -1;col >= 0; col -- ){
            for(int row = arr.length -1; row >=0; row --){
                arr[row][col] = value++;
            }

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
        int i = 1;
        for(int row = arr.length - 1; row >= 0; row--){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
            }
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
        int i = 1;
        for(int col = arr[0].length - 1; col >= 0; col--){
            for(int row = 0; row < arr.length; row++){
                arr[row][col] = i++;
            }
        }
    }

    /**
     * 4 8 0 16
     * 0 7 11 0
     * 2 0 10 14
     * 1 5 0 13
     *
     * 0 0 0 0
     * 2 5 8 11
     * 1 4 7 10
     *  3의 배수인 경우 continue;
     * @param arr
     */
    public void arrayTest7(int[][] arr) {
        int i = 1;
        for(int col = 0; col < arr[0].length; col++){
            for(int row = arr.length - 1; row >= 0; row--){
                if(i%3==0){
                    i++;
                    arr[row][col] = 0;
                    continue;
                }else {
                    arr[row][col] = i++;
                }
            }
        }

    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
