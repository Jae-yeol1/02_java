package com.lhw.section03.math;

import java.util.Random;

public class Application2 {

    public static void main(String[] args) {

        /* 난수의 활용 */
        /* Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
         * 원하는 범위의 난수를 구하는 공식
         *(int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */

        /* 0 ~ 9까지의 난수 발생 : 9 - 0 + 1 = 10 */
        int random1 = (int) (Math.random() * 10);
        System.out.println("0 부터 9 사이의 난수 : " + random1);

        /* 1 ~ 10까지의 난수 발생 */
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("1 부터 10 사이의 난수 : " + random2);

        double ranN = Math.random();
        System.out.println(ranN);
        double N = ranN;
        System.out.println(N*6);
        System.out.println(N*6+10);

        // java util random
        /* 10 ~ 15까지의 난수 발생 */ // 15-10+1 = 6 (구하려는 수의 (최대값) - (최소값) + 1 = (곱할값)
//                                     (... Math.random() * (곱할 값)) + (발생할 난수 개수);
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10 부터 15 사이의 난수 : " + random3);

        /* -128 ~ 127까지의 난수 발생 */ // 127+128+1 = 256
        //int random4 = (int) (Math.random() * 256) + (-128);
        int random4 = (int) (Math.random() * 256) - 128;
        System.out.println("-128 부터 127까지의 난수 발생 : " + random4);

        Random random = new Random();

        /* 0 부터 9까지 난수 발생 */
        int randomNumber1 = random.nextInt(10);
        System.out.println("0 부터 9 까지의 난수 : " + randomNumber1);

        /* 1부터 10까지 난수 발생 */
        int randomNumber2 = random.nextInt(10) + 1;
        System.out.println("1 부터 10 까지의 난수 : " + randomNumber2);

        /* 20 부터 45까지의 난수 발생 */
        int randomNumber3 = random.nextInt(26) + 20;
        System.out.println("20 부터 45 까지의 난수 : " + randomNumber3);

        /* -128 부터 127까지의 난수 발생 */
        //int randomNumber4 = random.nextInt(256) - 128;
        int randomNumber4 = new Random().nextInt(256) - 128;		//객체를 생성하자마자 바로 메소드 호출도 할 수 있다.
        System.out.println("-128 부터 127 까지의 난수 : " + randomNumber4);
    }
}
