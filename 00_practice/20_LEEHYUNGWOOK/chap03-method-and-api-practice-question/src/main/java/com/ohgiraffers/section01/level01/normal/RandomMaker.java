package com.ohgiraffers.section01.level01.normal;

import java.util.Random;

public class RandomMaker {
    // 기능형 클래스
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public static String tossCoin(){
        String front = "앞면";
        String back = "뒷면";

        double f_b = (Math.random() * 2);  // 1 - 0 + 1 = 23
        String answer = ((int) f_b == 1) ? front : back;
        System.out.println(answer);
        return answer;
    }
}
