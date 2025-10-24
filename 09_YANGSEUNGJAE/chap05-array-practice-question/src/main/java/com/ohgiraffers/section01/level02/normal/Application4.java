package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        Random rand = new Random();
        int[] num = new int[6];
        num[0] = rand.nextInt(45)+1;
        for (int i = 1; i < num.length; i++) {
            int rand1 = rand.nextInt(45) + 1;
            for(int j = 0; j < i   ; j++) {
                if( rand1 == num[j]) {
                    i-=1;
                    break;
                }
                num[i] = rand1;
            }


        }
        System.out.println(Arrays.toString(num));
    }
}
