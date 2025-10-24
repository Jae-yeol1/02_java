package com.ohgiraffers.section02.level03;

public class Application2 {

    public static void main(String[] args) {

        /*
        * System.arraycopy를 사용하여 배열 복사 합치기
        * */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9, 10};
        int[] d = new int[10];

        int[][] arr = {a, b, c};

        int count = 0;

        // 향상된 for문을 이용하여 위의 a, b, c의 배열의 값을 d의 배열에 합치기한 후 출력
        System.arraycopy(a, 0, d, 0, a.length);
        for (int[] target : arr) {
            System.arraycopy(target, 0, d, count, target.length);

            count += target.length;
        }

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
