package com.sekong.section01.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // 원본 배열
        int[] origin = {1,2,3,4,5};

        // 얉은 복사
        int[] copy = origin;
        // 동일 주소
        System.out.println("origin.hashcode = " + origin.hashCode());
        System.out.println("copy.hashcode = " + copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        // 원본과 복사본 모두 바뀜
        copy[2] = 100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin);
        System.out.println("origin[0] = " + Arrays.toString(origin));

        int[] test = returnTest();
        System.out.println(Arrays.toString(test));
    }

    public static void test(int[] arr){
        // arr은 얕은 복사한 것
        System.out.println("arr.hashcode = " + arr.hashCode());
        arr[0] = 1000;
        System.out.println("arr[0] = " + arr[0]);

    }

    public static int[] returnTest(){
        return new int[]{1,2,3,4,5};
    }
}
