package com.ohgiraffers.section02.package_and_import.test;

public class Calculator {


    public int plusTwoNumbers(int first ,  int second){
        return first + second;
    }

    public int subTwoNumbers(int first , int second){
        return first - second;
    }

    // Static methods (클래스 메소드)
    public static int minNumberof(int first , int second){
        return (first > second)? second : first;
    }

    public static int maxNumberof(int first , int second){
        return (first > second)? first : second ;
    }

    // 실행을 위한 main 메소드 추가
    public static void main(String[] args) {

        // 1. 변수 선언 및 객체 생성은 메소드 내부에
        int first = 100;
        int second = 50;

        // non-static 메소드를 호출하기 위해 객체 생성
        Calculator calculator = new Calculator();

        // 덧셈 (Non-static 메소드 호출)
        System.out.println("두 수의 합은? "+calculator.plusTwoNumbers(first, second));

        //빼기
        System.out.println("두 수의 차는? "+calculator.subTwoNumbers(first, second));

        // 최댓값 (Static 메소드 호출)
        System.out.println("최댓값: " + Calculator.maxNumberof(first, second));
    }
}