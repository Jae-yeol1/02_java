package org.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        //random() => 0.0 <= 값 < 1.0
        //(int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값

        int random1 = (int)(Math.random() * 10);
        System.out.println(random1);

        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println(random1);

        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println(random3);

        int random4 = (int)(Math.random() * 256) -128;
        System.out.println(random4);

        Random random = new Random();
        int random5 = random.nextInt(30) + 30;


    }

}
