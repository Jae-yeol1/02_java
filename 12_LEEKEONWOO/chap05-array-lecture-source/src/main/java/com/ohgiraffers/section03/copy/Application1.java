package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copy = origin; // copy는 origin과 같은 값을 바라본다

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin)); // cmd + shift + i (미리보기), cmd + 더블클릭 (파일열기)
        System.out.println(Arrays.toString(copy));

        copy[2] = 100; // origin 값도 변경
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin);
        System.out.println(Arrays.toString(origin));

        Test.test(origin);
        System.out.println(Arrays.toString(origin));

        int[] test = returnTest();
        System.out.println(Arrays.toString(test));

    }

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode());
        arr[0] = 1000;
    }

    public static int[] returnTest() {
        return new int[] {1, 2, 3, 4, 5};
    }
}
