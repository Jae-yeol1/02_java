package com.chaewookim.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // 원본 배열
        int [] origin = {1, 2, 3, 4, 5};

        // 얕은 복사
        int [] copy = origin;

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[1] = 20;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin);
        System.out.println(Arrays.toString(origin));

        int[] test = returnTest();
        System.out.println(Arrays.toString(test));
    }

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode(): " + arr.hashCode());
        arr[0] = 1004;
    }

    public static int[] returnTest() {
        return new int[] {1,2,3,4,5}; // 새 배열의 주소값 반환
    }

}
