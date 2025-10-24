package com.lhw.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    // 메소드
    public void testPrimitiveTypeParameter(int num){ //기본자료형
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter1(int[] iarr){
        iarr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : "
                + Arrays.toString(iarr));
    }

    public void testPrimitiveTypeParameter(Rectangle rectangle) {
        rectangle.calArea();
        rectangle.calRound();
    }

    /*가변인자*/
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("str = " + Arrays.toString(str)); //배열로인지
    }
}

/*

private String name;
private int score;
public final double PI = 3.14;

public int sumScore() {}
 */
