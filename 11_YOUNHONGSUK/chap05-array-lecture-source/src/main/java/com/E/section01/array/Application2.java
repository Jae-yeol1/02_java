package com.E.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 배열의 선언: stack에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것
        * */

        int[] arr;
        double[] darr;

        //배열의 길이는 변경 할 수 없다

        arr = null;

        System.out.println(arr.hashCode());
        System.out.println(arr.length);

        /*
        * null 이라는 특수한 값을 참조하고 있을 경우참조 연산자 (.) 사용시
        * nullPointerException이 발생한다
        * */

    }
}
