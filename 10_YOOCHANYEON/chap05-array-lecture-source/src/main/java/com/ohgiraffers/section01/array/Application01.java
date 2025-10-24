package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args) {

        /* 배열의 선언 및 할당 */
        int [] arr = new int[5];
        System.out.println(arr);

        /*  하나의 이름으로 관리되는 연속된 메모리 공간
         *  해당 공간에 접근 시에는 인덱스를 사용 */

        /*  인덱스를 반복문으로 처리
         *  arr.length : 배열의 개수 확인 가능
         */
        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        int sum =  0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum : " + sum);

        /*
        향상된 for 문
        for(한번의 반복문에서 사용될 변수 : 반복을 수행할 배열) {}

        배열 인덱스에 담긴 값을 꺼내 int i 라는 변수로 옮겨 담아서 사용하는 맥락
        i 변수에 값을 대입하더라도 배열 인덱스 값은 변경 x
        따라서 배열 인덱스의 값을 변경하고자 할 때는 사용 x
         */
        for (int i : arr) {
            System.out.println("i = " + i);
            i = 0;
        }

        System.out.println();

        for (int i : arr) {
            System.out.println("i = " + i);
        }

        double[] darr = new double[4];  //  실수 배열 선언

        char[] carr = new char[4];      //  문자 배열 선언

        String[] sarr = new String[5];  // 문자열 배열 선언

        System.out.println();

        for(double d : darr){
            System.out.println("d = " + d);
        }
        System.out.println();
        for(char c : carr){
            System.out.println("c = " + c);
        }
        System.out.println();
        for(String s : sarr){
            System.out.println("s = " + s);
        }
    }
}
