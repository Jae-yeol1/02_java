package com.ohgiraffers.section01.level01.exampe;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        ExampleTest example = new ExampleTest();
        Scanner sc = new Scanner(System.in);
        /*
        메소드명 : evenOdd(int value)
        반환형 : void
        사용자로부터 정수하나를 입력받아
        해당 숫자가 짝수인지 홀수인지 판별하세요.

        --- 출력 예시 ---
        짝수입니다

        홀수입니다
        * */
        example.evenOdd(sc.nextInt());

        /*
         * 메소드명 : findMax(int first, int second)
         * 리턴타입 : void
         * 두 수중 더 큰수 찾기
         * 사용자로부터 정수 두개를 입력받아 더큰수를 출력
         * */
        System.out.println("정 수 두 개를 입력하시오.");
        example.findMax(sc.nextInt(), sc.nextInt());

        /*
         * 메소드명 randomMathQuiz(int num1, int num2)
         * 리턴타입 : void
         * 1~10 사이의 임의의 정수 2개를 생성
         * 사용자에게 "num1 + num2 = ?" 뭘까라고 질문
         * 사용자로부터 정답을 입력받는다.
         * 사용자의 답이 실제 정답과 일치하는지 판별하고 결과를 출려
         *
         * -- 출력 예시
         * 정답입니다!
         *
         * 틀렸습니다 정답은 2 입니다.
         * */

        int ranNum1 = (int)(Math.random() * 10);
        int ranNum2 = (int)(Math.random() * 10);
        System.out.println("ranNum1 = " + ranNum1);
        System.out.println("ranNum2 = " + ranNum2);
        example.randomMathQuiz(ranNum1, ranNum2);
    }

}
