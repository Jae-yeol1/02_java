package com.chaewookim.section05.parameter;

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

        ParameterTest pt = new ParameterTest();

        // 1. 기본 자료형을 매개변수로 전달받는 메소드 호출
        // 리터럴값(참조 주소값 x)을 전달해서 메소드를 호출 시에는 서로 다른 지역변수는 서로 영향 x
        int num = 20;
        System.out.println("call by value: " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value2: " + num);

        int [] iarr = new int[1];
        iarr[0] = 10;
        System.out.println("call by reference: " + Arrays.toString(iarr));
        pt.testPrimitiveTypeArrayParameter(iarr);
        System.out.println("call by reference2: " + Arrays.toString(iarr));

        Rectangle rec = new Rectangle(22 ,12);
//        rec.calArea();
//        rec.calRound();
        pt.testClassTypeParameter(rec);

        // 가변인자를 매개변수로 전달받는 메소드 호출(자바는 권장 x)
        pt.testVariableLengthArrayParameter("어우 피곤해");
        pt.testVariableLengthArrayParameter("아아", "에엥");
        pt.testVariableLengthArrayParameter("허억", "헤에", "히잉");
        pt.testVariableLengthArrayParameter(new String[]{"헉", "허억", "허어억"});
    }
}
