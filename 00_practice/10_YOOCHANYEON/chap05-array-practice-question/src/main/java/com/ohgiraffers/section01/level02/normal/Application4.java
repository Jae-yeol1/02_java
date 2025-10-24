package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int[] lotto = new int[6];

        lotto[0] = (int)(Math.random() * 6 + 1);

        for(int i = 0; i < lotto.length; i++) {
            int a = (int)(Math.random()*6) + 1;

            for(int j = 0; j < i; j++) {
                if (a == lotto[j]) {
                    i--;
                    break;
                } else {
                    lotto[i] = a;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}

