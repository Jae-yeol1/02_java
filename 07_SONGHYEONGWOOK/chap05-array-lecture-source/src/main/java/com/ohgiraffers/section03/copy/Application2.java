package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {
        /* 깊은 복사 */

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 1. for문 */
        int[] copy1 = new int[10];
        for (int i = 0; i < origin.length; i++) {
            copy1[i] = origin[i];
        }

        System.out.println("=============== origin =============== ");
        print(origin);
        System.out.println("=============== copy1 ================ ");
        print(copy1);

        /* 2. Object의 clone 메소드
         * > 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성된다. (제일 쉽고 간단한 방법)
         * */
        int[] copy2 = origin.clone(); // 주소값은 다르게 생성됨
        System.out.println("=============== copy2 ================ ");

        /* 3. System의 arraycopy 메소드
        * arraycopy(원본배열, 복사를 시작할 인덱스, 복사본배열, 붙여넣기를 시작할 인덱스, 복사할길이)
        * */
        int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 0, 5);
        System.out.println("=============== copy3 ================ ");
        print(copy3);

        /* 4. Arrays의 copyOf 메소드 : 원본의 처음부터만 가능
        * System.arraycopy를 응용한 메소드, copyOf는 0번째부터 시작되는 것이 차이점
        * arraycopy보다는 조금 더 많이 쓰임
        * */
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(origin, 3);
        System.out.println("=============== copy4 ================ ");
        print(copy4);
        System.out.println("=============== copy5 ================ ");
        print(copy5);
    }

    public static void print(int[] arr) {
        System.out.println("arr.hashCode() : " + arr.hashCode());
        System.out.println("arr : " + Arrays.toString(arr));
    }
}
