package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {


        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형(참조자료형)
         * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
         * 5. 가변인자
         * */

        Parametertest pt = new Parametertest();

        /*
        * 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
        * 리터럴 값(참조 주소값 x)을 전달해서 메소들르 호출시에는 서로 다른 지역변수는 서로 영향 x
        * */
        int num = 20;
        System.out.println("Before call : " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("After call : " + num);

        //

        int[] iarr = new int[]{1,2,3,4,5};
        System.out.println("before call by reference : "  + Arrays.toString(iarr));
        pt.testPrimitiveTypeArrayParameter(iarr);
        System.out.println("After call by reference : "  + Arrays.toString(iarr));

        Rectangle r = new Rectangle();
        pt.testClassTypeParameter(r);

        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "탁구");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "낚시", "독서"});


    }
}
