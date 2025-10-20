package com.ohgiraffers.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int num1 = 20;
        int num2 = 30;

        int addResult = num1 + num2;
        System.out.println("더하기 결과 : " + addResult);

        int subResult = num1 - num2;
        System.out.println("빼기 결과 : " + subResult);

        int mulResult = num1 * num2;
        System.out.println("곱하기 결과 : " + mulResult);

        int divResult = num1 / num2;
        System.out.println("나누기한 몫 : " + divResult);

        int modResult = num1 % num2;
        System.out.println("나누기한 나머지 : " + modResult);
        
    }
}
