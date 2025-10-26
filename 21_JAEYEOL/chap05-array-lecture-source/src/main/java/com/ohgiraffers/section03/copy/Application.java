package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*원본 배열*/
        int[] origin = {1,2,3,4,5};

        /*얕은복사를  했다 = 같은 주소를 참조를했다 . hashcode 로 확인하기*/
        int[] copy = origin;
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        copy[2] = 100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        test(origin); // 주소값을 아래 클래스로 보냄
        System.out.println(Arrays.toString(origin));
        int[] test = returntest();
        System.out.println(Arrays.toString(test));

    }

    public static void test(int[] arr){
        System.out.println("arr의 hash 코드 :" + arr.hashCode());  // 얕은복사
        arr[0] = 1000;
        arr[1] = 1000;


    }
    public static int[] returntest(){
        return new int[]{1,2,3,4,9};
    }

}


