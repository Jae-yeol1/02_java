package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
         * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
         *
         * 인원 수 : 29
         * 사탕 개수 : 100
         *
         * 1인당 사탕 개수 : 3
         * 남는 사탕 개수 : 13
         * */

        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 2. 인원 수 입력 받기
        System.out.print("인원 수 : ");
        int people = sc.nextInt();

        // 3. 사탕 개수 입력 받기
        System.out.print("사탕 개수 : ");
        int candies = sc.nextInt();

        // 4. 1인당 사탕 개수 계산 (정수 나눗셈)
        int candiesPerPerson = candies / people;

        // 5. 남는 사탕 개수 계산 (나머지 연산)
        int remainingCandies = candies % people;

        // 6. 결과 출력
        System.out.println("1인당 사탕 개수 : " + candiesPerPerson);
        System.out.println("남는 사탕 개수 : " + remainingCandies);

        // 7. Scanner 닫기
        sc.close();
    }
}