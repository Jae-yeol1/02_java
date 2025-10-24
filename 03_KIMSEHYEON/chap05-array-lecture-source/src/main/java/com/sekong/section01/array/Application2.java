package com.sekong.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /* 베열의 선언 = stack에 배열의 주소를 보관할 **래퍼런스 변수** 공간을 만드는 것*/
        int [] iarr;
        double [] darr;

        // 선언한 레퍼런스 변수에 배열을 핼당하여 대입할 수 있다.
        // new 연산자는 heap여역에 공간을 할당하고 발생한 조수값을 반환한다.
        // 발생한 주소가 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조해 사용하기 때문에
        // 참조 자료형이라한다i.
        iarr = new int [5];
        darr = new double [10];

        /* heap 영역은 이름으로 접근하지 않고 주소값으로 접근하는 방식이다.
         * Stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
         */
        System.out.println("iarr : " + iarr);
        System.out.println("darr : " + darr);

        // hashcode() : 객체의 주소값을 10진수로 변황하여 생성한 객체의 고유 정수값을 반환하는 메소드
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        // 배열의 길이를 알 수 있는 필드를 제공한다.
        // string 클래스는 메소드로 제공하여 length()로 사용하는 점에서 유의한다.

        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        iarr[0] = 1;
        System.out.println("iarr[0] : " + iarr[0]);
        // 한 번 저장된 배열의 길이는 변경할 수 없다.
        // 새로운 배열을 생성하여 그 주소값을 레퍼런스 변수에 넣는다.
        iarr = new int [100];
        System.out.println("수정된 arr.hashCode() " + iarr.hashCode());
        System.out.println("수정된 iarr.length :  " + iarr.length);
        System.out.println("수정된 iarr[0] : " + iarr[0]);

        /*
         * 레퍼런스 변수가 아무런 주소도 참조하지 않는 상태를 Null이라고 한다.
         * 100개 짜리의 배열이 더 이상 참조되지 않으므로 GC(가비지 컬랙터)에 의해 제거된다.*/
        iarr = null;
        /*
        * null이라는 특수한 값을 참조하고 있을 경우 참조 연산자(.) 사용자
        * java.lang.NullPointerException이 발생한다.*/
        System.out.println("수정된 arr.hashCode() " + iarr.hashCode());
        System.out.println("수정된 iarr.length :  " + iarr.length);

    }
}
