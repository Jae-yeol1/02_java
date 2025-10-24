package com.swcamp.section03.copy;

import java.util.Arrays;
/////////////////////////////////////////////////////////
/// 얕은 복사 == Call by Reference
/////////////////////////////////////////////////////////
public class Application1 {
    public static void main(String[] args) {
        // 원본 배열
        int[] origin = {1, 2, 3, 4, 5};

        // 얕은 복사
        int[] copy = origin;
        System.out.println("origin : " + origin.hashCode());
        System.out.println("copy : " + copy.hashCode());
        /*
        origin과 copy 모두 stack에 생성되는 변수들이다. 이 때
         */
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        System.out.println("origin : " + origin.hashCode());
        System.out.println("copy : " + copy.hashCode());

    }
}
