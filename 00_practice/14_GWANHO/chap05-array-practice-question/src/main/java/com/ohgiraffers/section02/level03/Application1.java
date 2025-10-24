package com.ohgiraffers.section02.level03;

public class Application1 {

    public static void main(String[] args) {

        Application1 app = new Application1();
        int[][] arr = new int[4][4];

        System.out.println("\n Array Test 1");
        app.arrayTest1(arr);

        System.out.println("\n Array Test 2");
        app.arrayTest2(arr);

        System.out.println("\n Array Test 3");
        app.arrayTest3(arr);

        System.out.println("\n Array Test 4");
        app.arrayTest4(arr);

        System.out.println("\n Array Test 5");
        app.arrayTest5(arr);

        System.out.println("\n Array Test 6");
        app.arrayTest6(arr);

        System.out.println("\n Array Test 7");
        app.arrayTest7(arr);
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

        int index = 1;
        for(int i =0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                arr[i][j] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i =0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                arr[j][i] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i = 0; i < 4; ++i) {
            for(int j = 3; j >= 0; --j) {
                arr[i][j] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i = 3; i >= 0; --i) {
            for(int j = 3; j >= 0; --j) {
                arr[j][i] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i = 3; i >= 0; --i) {
            for(int j = 0; j < 4; ++j) {
                arr[i][j] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i = 3; i >= 0; --i) {
            for(int j = 0; j < 4; ++j) {
                arr[j][i] = index++;
            }
        }

        print(arr);
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

        int index = 1;
        for(int i = 0; i < 4; ++i) {
            for(int j = 3; j >= 0; --j) {

                if(index % 3 != 0) {
                    arr[j][i] = index++;
                } else {
                    index++;
                    arr[j][i] = 0;
                }
            }
        }

        print(arr);
    }

    /***
     * 이차원 배열을 전달받아서 출력하는 메소드
     * @param arr
     */
    public void print(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
