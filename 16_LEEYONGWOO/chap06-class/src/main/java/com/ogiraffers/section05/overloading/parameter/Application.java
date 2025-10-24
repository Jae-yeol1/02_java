package com.ogiraffers.section05.overloading.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();

        /**
         * 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
         * 리터럴 값(차모 주소값 x)을 전달해서 메소드를 호출 시에는 서로 다른 지역변수는 서로 영향x
         */
        int num = 20;
        System.out.println("call by value 전 : "+num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후 : "+num);

        // 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출
        int[] array=new int[4];
        System.out.println("call by reference 전 : "+ Arrays.toString(array));
        pt.testPrimitiveTypeParameter(array);
        System.out.println("call by reference 후 : "+Arrays.toString(array));

        // 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출
        Rectangle r=new Rectangle(22,12);
//        r.calArea();
//        r.calRound();
        pt.testClassTypeParameter(r);

        //4. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 웬만하면 권장)
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순","탁구");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "낚시", "독서"});

    }
}
