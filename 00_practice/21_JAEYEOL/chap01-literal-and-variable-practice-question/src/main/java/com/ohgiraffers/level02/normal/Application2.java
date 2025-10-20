package com.ohgiraffers.level02.normal;

public class Application2 {
    /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
     * 총점과 평균을 정수 형태로 출력하세요
     *
     * -- 출력 예시 --
     * 총점 : 201
     * 평균 : 67
     *  */
    public static void main(String[] args) {
                double korean = 80.5;
                double math = 50.6;
                double english = 70.8;

                double totalDouble = korean + math+ english;

                // 총점을 정수 형태로 강제 형 변환하여 저장
                int totalInt = (int) totalDouble;

                // 평균 계산
                double averageDouble = totalDouble / 3;

                // 평균을 정수 형태로 강제 형 변환하여 저장 (소수점 이하 버림)
                int averageInt = (int) averageDouble;

                // 결과 출력
                System.out.println("총점 : " + totalInt);
                System.out.println("평균 : " + averageInt);
            }


    }

