package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        Application1 app1 = new Application1();
        app1.arrayTest1(arr);
        System.out.println();
        app1.arrayTest2(arr);
        System.out.println();
        app1.arrayTest3(arr);
        System.out.println();
        app1.arrayTest4(arr);
        System.out.println();
        app1.arrayTest5(arr);
        System.out.println();
        app1.arrayTest6(arr);
        System.out.println();
        app1.arrayTest7(arr);
        System.out.println();
        app1.print(arr);
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
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = cnt;
                System.out.print(arr[i][j] + " ");
                cnt++;
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
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (i+1) + 4 * j;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
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
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 3; j < 0; j--) {
                arr[i][j] = cnt;
                cnt++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int i = 3; i < 0; i--) {
            for (int j = 3; j < 0; j--) {
                arr[j][i] = cnt;
                cnt++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j] + " ");
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
    public void arrayTest5(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int i = 3; i < 0; i++) {
            for (int j = 1; j < col; j++) {
                arr[i][j] = cnt;
                System.out.print(arr[i][j] + " ");
                cnt++;
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
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int j = 3; j < 0; j--) {
            for (int i = 0; i < row; i++) {
                arr[i][j] = cnt;
                cnt++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j] + " ");
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
        int row = arr.length;
        int col = arr[0].length;
        int cnt = 1;
        for (int j = 0; j < col; j++) {
            for (int i = 3; i < row; i++) {
                arr[i][j] = cnt;
                if (cnt%3 == 0) {
                    arr[i][j] = 0;
                }
                cnt++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
