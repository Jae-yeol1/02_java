package com.lhw.section03.math;

public class Application1 {

    public static void main(String[] args) {

        System.out.println("절대값: " + Math.abs(-12.145));
        System.out.println("최대값: " + Math.max(20, 40));
        System.out.println("최소값: " + Math.min(20, 40));

        System.out.println("원주율 : " + Math.PI);			//원의 둘레나 이런거 계산할 때 미리 정의된 값이니 그냥 불러다 쓰면 된다.

        /* 난수를 발생시키는 것도 있다
         * 0부터 1 전까지의 실수 형태의 난수를 발생시킨다.
         * 얘는 호출할 때마다 다른 값을 가진다.
         * */
        System.out.println("난수 발생 : " + Math.random());


    }
}
