package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {
        int num;

        String[] sarr = new String[10]; //  iarr 엔주소값이 들어가 있지만
        for(int i = 0; i < sarr.length; i++){
            System.out.println("sarr[ "+ i + "] : " + sarr[i]);
        }

        char[] carr = new char[10]; // 힙영역은 char sms 나오는 값들이 자료형의 기본값같음
        for(int i = 0; i < carr.length; i++){
            System.out.println("carr[ "+ i + "] : " + carr[i]);
        }
        /*heap 영역에 할당 될 경우 자료형에 따른 초기값이 설정되어 할당된다.
        * 정수:0
        * 실수:0.0
        * 논리:false
        * 문자:\u0000
        * 참조(String, 나중에는 클래스):null
        * 기본값은 jvm이 빈공간을 채워줌
        * */

        /*기본값 외의 값으로 초기화 하면서 배열을 생성하고 싶을때*/
        // int[] iarr2 = new int []{11,22,33,44,55};
        int[] iarr2 = {11,22,33,44,55} ; // 공간은 선언된 개수만큼 만들어짐 5개 만든것
        // 2가지 방법이 있는데 위 방법은 한번에 값을 여러개 넣는것 .
        // 아래 방법은 값을 추가할때 추가하면서 사용 가능.
        int[] iarr = new int [5];
        iarr[0] = 11;
        iarr[1] = 22;
        for(int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "] : " + iarr[i]);
        }
    }
}
