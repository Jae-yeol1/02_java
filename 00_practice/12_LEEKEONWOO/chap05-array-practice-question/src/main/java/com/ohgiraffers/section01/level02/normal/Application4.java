package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] iarr = new int[6];


        for(int i = 0; i <= iarr.length; i++){
            iarr[i] = (int)(Math.random() * 45) + 1;
            if (iarr[i] == iarr[i+1]){
                iarr[i] = (int)(Math.random() * 45) + 1;
            }
            System.out.print(iarr[i] + " ");
        };

    }
}
