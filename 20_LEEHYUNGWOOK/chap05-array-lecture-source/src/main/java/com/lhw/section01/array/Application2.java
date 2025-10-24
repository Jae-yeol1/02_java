package com.lhw.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 배열의 선언 : Stack에 배열 주소 보관*/
        int[] iarr; //int i;
        double[] darr; //double d;

        iarr = new int[5];
        darr = new double[5];
        /*
         * 먼저 배열을 선언하고 레퍼런스 변수(iarr)에 배열 할당 가능
         * new -> head 영역 할당 & 주소 값 반환
         * 반환된 주소는 레퍼런스 주소(iarr)에 저장
         * => **참조 자료형**
        * */
        
        /*레퍼런스 변수*/
        System.out.println("iarr = " + iarr);
        System.out.println("darr = " + darr);

        /*Hashcode(): 주소값을 10진수로 변환하여 반환*/
        System.out.println("iarr.hashCode() : " +  iarr.hashCode());
        System.out.println("darr.hashCode() = " + darr.hashCode());

        /*배열의 길이를 알 수 있는 필드 제곧
        * String 클래스는 메소드로 제공되기 때문에 length사용 주의*/
        String sArr[] = new String[5];
        System.out.println("iarr.length = " + iarr.length);
        System.out.println("darr.length = " + darr.length);
        System.out.println("sArr.length = " + sArr.length);

        /*동일한 레퍼런스 변수에 덮어쓰기*/
        iarr = new int[100];    // 수정할 수 없고 새로 배정해야 됨.
        System.out.println("fixed iarr.hashCode() = " + iarr.hashCode());
        System.out.println("fixed iarr.length = " + iarr.length);

        /*원하는 레퍼런스변수를 초기화시키고 싶을 때*/
        iarr = null;
        System.out.println(iarr);
        /*주소값이 삭제된 상태이기 때문에 참조 연산자 (.) 사용이(Hashcode()) 접근이 불가하다*/
        System.out.println("deletd iarr.hashCode() = " + iarr.hashCode());

    }
}
