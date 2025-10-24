package com.lhw.section03.copy;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

         /* 얕복 / 깊복*/
        /* 원본 배열*/
        int [] origin =  {1,2,3,4,5};

        /* 얕은 복사 -> Stack에서 주소값만 복사 -> 원본 공유용*/
        int [] copy = origin;
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        /* 얕은 복사의 값 변경 copy 가 바뀌면 원본도 바뀐다.*/
        copy[2] = 100;
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));


        /* 메소드 매개변수는 얕은 복사이다.*/
        System.out.println("main : " + origin.hashCode());
        test(origin); // 얕은 복사
        System.out.println(Arrays.toString(origin));

        /* return도 얕은 복사다.*/
        int[] test = returnTest();
        System.out.println(Arrays.toString(test));

        /*얕은 복사는 즉 주소값을 주고 받는 행위이다. */
    }

    /* 함수에 매개변수로 받아오는 배열은 "얕은 복사"를 통해 가져온다.
    * 즉, 다른 클래스여도 변경 사항이 공유가 된다는 것이다.*/
    public static void test(int[] arr) {
        System.out.println("test의 arr.hashCode() = " + arr.hashCode());
        arr[0] = 100000;
    }

    public static int[] returnTest() {
        return new int[] {1,2,3,4,5};
    }
}
