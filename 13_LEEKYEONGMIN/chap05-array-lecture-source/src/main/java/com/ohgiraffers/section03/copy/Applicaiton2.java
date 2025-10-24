package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Applicaiton2 {
    public static void main(String[] args) {
        /* 깊은 복사 */

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 1. for문 */
        int[] copy1 = new int[10];
        for(int i = 0; i < origin.length; i++){ // copy1.length 쓰면 오류
            copy1[i] = origin[i];
        }
        System.out.println("========= origin =========");
        print(origin);
        System.out.println("========= copy1 =========");
        print(copy1);
        // -> 주소값 다르고, 값만 같음

        /* 2. Object의 clone 메소드
        > 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성됨
        */
        int[] copy2 = origin.clone();
        System.out.println("========= copy2 =========");
        print(copy2);

        /* 3. System의 arraycopy 메소드
        arraycopy(원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할길이)
         */
        int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        print(copy3);

        /* 4. Arrays의 copyOf 메소드*/
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(copy4, 3);

        System.out.println("========== copy4 ==========");
        print(copy4);
    }

    public static void print(int[] arr){
        System.out.println("arr.hashCode() : " + arr.hashCode());
        System.out.println("arr : " + Arrays.toString(arr));
    }



}
