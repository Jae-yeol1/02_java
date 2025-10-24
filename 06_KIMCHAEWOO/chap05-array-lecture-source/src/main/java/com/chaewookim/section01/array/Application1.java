package com.chaewookim.section01.array;

public class Application1 {
    public static void main(String[] args) {

        // 배열의 선언 및 할당
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);

        // 향상된 for문
        // for( 한 번의 반복문에서 사용될 변수: 반복을 수행할 배열[] {}

        // 배열 인덱스에 담긴 값을 꺼내 int i 라는 변수로 옮겨 담아서 사용하는 맥락이므로
        // i 변수에 값을 대입하더라도 배열 인덱스의 값은 변경되지 않음
        // 따라서 배열 인덱스의 값을 변경하고자 할 때는 사용 불가
        for (int i : arr) {
            System.out.println("i = " + i);
        }

    }
}
