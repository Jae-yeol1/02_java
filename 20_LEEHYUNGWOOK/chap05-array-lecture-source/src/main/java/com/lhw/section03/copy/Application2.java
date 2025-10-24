package com.lhw.section03.copy;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {

        /*깊은 복사*/

        /*원본 배열*/
        int[] origin = {1,2,3,4,5};

        /*1. for 문*/
        int[] copy = new int[10]; // 새로운 배열엔 공간이 10
        for (int i = 0; i<origin.length;i++) {
            copy[i] = origin[i];
        }
        System.out.println("====Origin====");
        print(origin);
        System.out.println("====copy====");
        print(copy);

        /*2. Object의 clone Method
        * 동일한 길이, 동일한 값을 가진 배열의 복제본이 생성된다
        */
        int[] copy2 = origin.clone();
        System.out.println("====Origin====");
        print(origin);
        System.out.println("====copy2====");
        print(copy2);

        /*3. System의 arrayCopy 메소드
        * Array의 시작점을 찾을 수도 있으며,
        * arraycopy(원본, 복사시작인덱스, 복사배열, 복사시작인덱스, 복사할길이)*/
        int[] copy3 = new int[10];
        System.arraycopy(origin, 0, copy3, 3, origin.length);
        print(copy3);

        /*4. Arrays의 copyOf 메소드*/
        int[] copy4 = Arrays.copyOf(origin, 7); //정하려는 배열의 길이
        print(copy4);
    }

    /* 전달 받은 배열의 주속밧, 값을 출력하는 용도의 메소드
    * @param arr 배열의 주소값
    */
    public static void print(int[] arr) {
        System.out.println("arr.hashCode() : " + arr.hashCode());
        System.out.println("arr : " + Arrays.toString(arr));
    }
}
