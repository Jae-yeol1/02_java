package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int[] lotto = new int[6];
        lotto[0] = (int) (Math.random() * 45) + 1;
        for (int i = 1; i < 6; i++) {
            boolean check = true;
            while (check) {
                int temp = (int) (Math.random() * 44) + 1;
                for (int j = 0; j <= i; j++) {
                    if (lotto[j] != temp) {
                        check = false;
                        lotto[i] = temp;
                        break;
                    }
                }
            }
        }
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}
