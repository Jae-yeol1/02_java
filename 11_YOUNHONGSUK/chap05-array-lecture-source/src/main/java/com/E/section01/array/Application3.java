package com.E.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int num;
        int[] iarr = new int[10];
        for(int i = 0; i < iarr.length; i++){
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }

        char[] carr = new char[10];
        for(int i = 0; i < carr.length; i++){
            System.out.println("carr[" + i + "] : " + carr[i]);
        }

        /*
        * heap 영역에 할당 될 경우 자료형에 따른 초기값이 설정되어 할당된다
        * 정수: 0
        * 실수: 0.0
        * 논리: false
        * 문자: \u0000
        * 참조:
        * */

        /*기본값 외의 값으로 초기화 하면서 배열을 생성하고 싶을 떄*/
        int[] iarr2 = new int[] {11,22,33,44,55};
        int[] iarr3 = {11,22,33,44,55};
    }
}
