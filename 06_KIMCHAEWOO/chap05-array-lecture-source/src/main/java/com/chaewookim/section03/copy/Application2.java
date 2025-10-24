package com.chaewookim.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 깊은 복사

        // 원본 배열
        int[] origin = {1,2,3,4,5};

        // for문
        int[] copy1 = new int[10];
        for (int i = 0; i < origin.length; i++) {
            copy1[i] = origin[i];
        }

        print(origin);
        print(copy1);

        // Object Class Method
        int[] copy2 = origin.clone();
        System.out.println("=====copy2=====");
        print(copy2);

        // System의 arraycopy Method
        // arraycopy(원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스 ,복사할 길이)
        int[] copy3 = new int[10];
        System.arraycopy(origin, 1, copy3, 3, 2);
        System.out.println(Arrays.toString(copy3));

        // Arrays.copyOf Method
        // 원본의 처음부터만 가능
        int[] copy4 = Arrays.copyOf(origin, 20);
        System.out.println(Arrays.toString(copy4));
    }

    public static void print(int[] arr) {
        System.out.println("arr.hashCode(): " + arr.hashCode());
        System.out.println("arr: " +  Arrays.toString(arr));
    }
}
