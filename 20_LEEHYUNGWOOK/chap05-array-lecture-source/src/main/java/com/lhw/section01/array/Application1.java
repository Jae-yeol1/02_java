package com.lhw.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /*배열 선언 할당*/
        int[] arr = new int[5];
        /* 인덱스를 반복문으로 처리할 수 있다.*/
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println("arr[i] = " + arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        /*for which
        * 향상된 for문
        * for (iter돌 값: 배열) {}
        *
        * 배열 인덱스에 접근하는게 아니라 표현값에 접근 -> index 필요 X*/
        for (int val :arr) {
            System.out.println(val);
        }
    }
}
