package com.sekong.section01.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 깊은 복사

        // 원본 배열
        int[] origin = {1,2,3,4,5};

        // 1. for문
        int[] copy = new int[10];
        for (int i = 0; i < origin.length; i++){
            copy[i] = origin[i];
        }
        System.out.println("===== origin =====");
        print(origin);
        System.out.println("===== copy =====");
        print(copy);

        /* 2. Objectt의 clone 메소드
        * 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성
        * */
        int[] copy2 = origin.clone();
        System.out.println("===== copy2 =====");
        print(copy2);
        /* 3. System의 arraycopy 메소드
        *  arraycopy(원본배열, (원본 배열)복사를 시작할 인덱스, 복사본 배열, (복사본 배열)복사한 내용을 넣기 시작할 인덱스, 복사할 길이)
        * */
        int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        print(copy3);

        /* 4. Arrays의 copyOf 메소드 : 원본의 처음부터만 가능*/
        int[] copy4 = Arrays.copyOf(origin,7);
        int[] copy5 = Arrays.copyOf(origin,3);
        System.out.println("===== copy4 =====");
        print(copy4);
        System.out.println("===== copy5 =====");
        print(copy5);
        System.out.println("origin.hashcode : " + Arrays.hashCode(origin));
        System.out.println("copy.hashcode : " + Arrays.hashCode(copy));
        System.out.println("copy2.hashcode : " + Arrays.hashCode(copy2));
        System.out.println("copy3.hashcode : " + Arrays.hashCode(copy3));
        System.out.println("copy4.hashcode : " + Arrays.hashCode(copy4));
        System.out.println("copy5.hashcode : " + Arrays.hashCode(copy5));



    }
    /* 전달받은 배열의 주소값, 값을 출력하는 용도의 메소드
     * @param arr 배열의 주소값
     * */
    public static void print(int[] arr){
        System.out.println("arr.length = " + arr.length);
        System.out.println(" arr = "+ Arrays.toString(arr));

    }

}
