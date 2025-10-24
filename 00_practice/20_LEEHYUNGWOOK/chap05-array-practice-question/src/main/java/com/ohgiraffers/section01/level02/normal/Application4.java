package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int lottoarr[] = new int[6];
        String lottoAnswer[] = {"", "","", "", "", ""};
        for (int i = 0; i < 6; i++) {
            // 0~99 의 난수 발생
            int lotto = (int) (Math.random()*100);
//            System.out.println("Lotto 생성 : " + lotto);
//            System.out.println(lotto);
            // 예외처리
            for (int lottonow:lottoarr) {
                if (lottonow == lotto) {
//                    System.out.println("중복 : "+ lotto);
                    --i;
                    continue;

                }
            }
            // 한자리 수 인 경우 앞에 '0' 추가
            String inputStr = ""+lotto;
            if (lotto < 10) {
                inputStr  =  "0" + inputStr;
//                System.out.println("한자리 수 : " + lotto);
            }
            lottoarr[i] = lotto;
            lottoAnswer[i] = inputStr;
        }
        System.out.println(Arrays.toString(lottoAnswer));
    }
}
