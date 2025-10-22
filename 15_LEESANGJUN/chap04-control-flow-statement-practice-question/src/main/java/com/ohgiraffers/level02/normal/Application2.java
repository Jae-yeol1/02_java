package com.ohgiraffers.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 2. 체중(kg) 입력 받기 (double형)
        System.out.print("체중(kg)을 입력하세요 : ");
        double weight = sc.nextDouble();

        // 3. 신장(m) 입력 받기 (double형)
        System.out.print("신장(m)을 입력하세요 (예: 1.7) : ");
        double height = sc.nextDouble();

        // 4. BMI 계산
        double bmi = weight / (height * height);

        // 5. BMI 값에 따른 결과 문자열 저장 변수
        String result;

        // 6. 조건문을 사용하여 BMI 판정
        if (bmi < 20) {
            result = "당신은 저체중 입니다.";
        } else if (bmi < 25) { // 20 <= bmi < 25
            result = "당신은 정상체중 입니다.";
        } else if (bmi < 30) { // 25 <= bmi < 30
            result = "당신은 과체중 입니다.";
        } else { // 30 <= bmi
            result = "당신은 비만 입니다.";
        }

        // 7. 결과 출력
        // System.out.println("당신의 BMI는 " + bmi + " 입니다."); // BMI 수치 확인 (선택 사항)
        System.out.println(result);

        // 8. Scanner 닫기
        sc.close();
    }
}