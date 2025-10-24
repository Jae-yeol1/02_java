package com.lhw.section05.parameter;

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
        /* 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
        리터럴 값(참조 주소값이 아님)을 전달해서 메소드를 호출 시에는
        서로 다른 지역 변수는 서로 영향을 주지 않는다.*/

        int num = 20;
        System.out.println("call by value 전 : " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후 : " +  num);

        /* 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 */
        int[] iArr = new int[] {1,2,3,4,5};//
        System.out.println("call by ref 전 : " + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter1(iArr);
        System.out.println("call by ref 후 : " + Arrays.toString(iArr));

        /*3. 클래스*/

        Rectangle rectangle = new Rectangle(20,10);
//        rectangle.calArea();
//        rectangle.calRound();
        pt.testPrimitiveTypeParameter(rectangle); //객체 주소값을 넘김

        /*5. 가변인자를 매개변수로 받는 메소드 호출*/
        //public static void main(String... args) {} => 가변인자
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("피자", "파스타", "돈까스");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "낚시","독서"});
    }
}
