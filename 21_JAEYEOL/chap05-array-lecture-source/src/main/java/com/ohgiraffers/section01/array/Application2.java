package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /*배열의 선언: stack에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것*/
    int[] iarr; // int i
    double[] darr; // double




        /*선언한 레퍼런스 변수에 배열을 할당하여 대입가능
        * new 연산자는 heap 영역에 공간을 항당하고 발생한 주소값을 반환한다.
        * 발생한 주소가 레퍼런스 변수에 저정되고 이것을 참조하여 사용하기 때문에
        * 참조 자료형 이라고한다.*/

        iarr = new int[5];  // int 값을 5개 관리하기 위한 공간을 만들었다.
        darr = new double[10]; //double 값을 관리하기 위한 10개의 공간

        /*
        * heap 영역은 이름으로 접근하지 않고 주소값으로 접근하는  영역이다 .
        * stack 에 저장된 주소로 heap 에 할당 된 배열을 찾아갈 수 있다.
        * */
        System.out.println("iarr  =  "+ iarr);
        System.out.println("darr =  "+ darr);


        /*객체의 주소값을 10진수로 변환하여 생성한 객체의 고유 정수값을 반환하는 매소드 (hashcode)*/
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        /* 배열의 길이를 알 수 있는 필드를 제공한다
        * string 클래스는 메소드로 제공하여 length()로 사용하는 점에 유의한다.
        * */
        System.out.println("iarr.length  =  "+ iarr.length);
        System.out.println("darr.length  =  "+ darr.length);


        // 한번 지정한 배열의 길이는 변경할 수 없다.
        // 새로운 배열을 생성하여 그 주소값을 레퍼런스 변수에 담는다.
        iarr = new int [100];
        System.out.println(" 수정된 iarr hashcode =  "+ iarr.hashCode());
        System.out.println(" 수정된 iarr length =  "+ iarr.length);

        iarr =  null ;  // 배열 없애기 . 연결이 끊긴다 .
        /*레퍼런스가 아무런 주소를 참조하지않는 상태를 null이라고함
        * 100개 짜리 배열이더이상 참조되지 않으므로 GC(  가비지 컬렉터 ) 에의해 제거된다.*/


        /*null 이러눈 특수한 값을 참조하고 있을경우 참조 연산자 (.) 사용시 java.lang.NullpointerRxception이 발생한다*/
        System.out.println(" 수정된 iarr hashcode =  "+ iarr.hashCode());
        System.out.println(" 수정된 iarr length =  "+ iarr.length);
        // 애러가남

    }
}
