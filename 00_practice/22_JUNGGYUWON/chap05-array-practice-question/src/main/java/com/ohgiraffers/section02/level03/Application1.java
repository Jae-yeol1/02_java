package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        Application1 app = new Application1();

        app.arrayTest1(arr);
        System.out.println();

        app.arrayTest2(arr);
        System.out.println();

        app.arrayTest3(arr);
        System.out.println();

        app.arrayTest4(arr);
        System.out.println();

        app.arrayTest5(arr);
        System.out.println();

        app.arrayTest6(arr);
        System.out.println();

        app.arrayTest7(arr);
        System.out.println();

        app.print(arr);
        System.out.println();
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
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp++;
                System.out.print(arr[i][j] + " ");
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
    public void arrayTest2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i+1;
            arr[i][0] = temp;
            System.out.print(arr[i][0] + " ");
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = temp+arr.length ;
                System.out.print(arr[i][j] + " ");
                temp+=arr.length;
            }
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
    public void arrayTest3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr.length*(i+1);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp--;
                System.out.print(arr[i][j] + " ");
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
    public void arrayTest4(int[][] arr) {
        int temp = arr.length * arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp-(arr.length*j);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            temp -=1;
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
        int temp = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp++;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
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
    public void arrayTest6(int[][] arr) {
        int temp = arr.length * arr.length;
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp-(arr.length*j);
            }
            temp -=1;
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
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
    public void arrayTest7(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp =  (arr.length - i) + (arr[i].length * j);

                if (temp % 3==0){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = temp;

                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
