package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개 변수로 전달 받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] arr) {
        arr[0] = 100;
        System.out.println("매개 변수로 전달 받은 값 : " + Arrays.toString(arr));
    }

    public void testClassTypeParameter(Rectangle r) {

        r.calArea();
        r.calRound();
    }

    /* 가변 매개 변수의 경우 배열의 앞에만 사용 가능 */
    public void testVariableLengthArrayParameter(String str2, String... str/*, String str2*/) {
        System.out.println("str = " + Arrays.toString(str));
    }
}
