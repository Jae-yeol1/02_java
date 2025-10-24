package com.hihi.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /*원본 배열*/
        int[]  origin = {1, 2, 3, 4, 5};

        /*얕은 복사*/
        int[] copy = origin;

        // 같은 주소값 갖고 있음
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        //배열 값 출력용도
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[2] = 100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin);
        System.out.println(Arrays.toString(origin));

        int[] test = returnTest();
        System.out.println(Arrays.toString(test));
    }

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode());
        arr[0] = 1000;
    }

    public static int[] returnTest(){
         return new int[]{1,2,3,4,5};
    }

}
