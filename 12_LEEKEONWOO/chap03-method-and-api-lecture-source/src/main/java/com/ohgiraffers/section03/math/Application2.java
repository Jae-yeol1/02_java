package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        // Random() > 0.0 >= 값 < 1.0
        //            0.0 * 10 >= 값 < 1.0 * 10
        //            0 >= 값 < 10 +++> 0~9
        // (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값

        // 0~9 까지의 난수를 생성 9 - 0 + 1 = 10
        int random1 = (int) (Math.random() * 10) + 0;
        System.out.println("random1: " + random1);

        // 1~10 까지의 난수 생성
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        //10~15 까지의 난수 생성
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        Random random = new Random();

        /* -128 부터 127까지의 난수 발생 */
        //int randomNumber4 = random.nextInt(256) - 128;
        int randomNumber4 = new Random().nextInt(256) - 128;		//객체를 생성하자마자 바로 메소드 호출도 할 수 있다.
        System.out.println("-128 부터 127 까지의 난수 : " + randomNumber4);
    }
}
