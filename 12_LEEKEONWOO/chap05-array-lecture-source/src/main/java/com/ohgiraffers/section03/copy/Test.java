package com.ohgiraffers.section03.copy;

public class Test {

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode());
        arr[0] = 1004;
    }
}
