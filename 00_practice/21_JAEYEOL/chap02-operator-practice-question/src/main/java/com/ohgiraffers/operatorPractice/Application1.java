package com.ohgiraffers.operatorPractice;

public class Application1 {

    public static void main(String[] args) {
        int Num1 = 2;
        // Num1이 짝수인지 홀수인지 판별하는 삼항 연산자
        // 조건식: Num1 % 2 == 0 (나머지가 0이면 true, 짝수)
        String result = (Num1 % 2 == 0) ? "true (짝수)" : "false (홀수)";

        System.out.println(result);


    }
}



