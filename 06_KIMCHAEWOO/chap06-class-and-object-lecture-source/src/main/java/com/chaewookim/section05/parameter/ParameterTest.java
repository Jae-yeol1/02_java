package com.chaewookim.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값: " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iarr) {
        iarr[0] = 100;
        System.out.println("매개변수로 전달받은 값: " + Arrays.toString(iarr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String...str) {
        System.out.println("str = " + Arrays.toString(str));
    }

}
