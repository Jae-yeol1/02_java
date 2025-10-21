package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        int first=100;
        int second=50;
        Calculator cal =new Calculator();
        System.out.println("덧셈 결과: "+cal.plusTwoNumbers(first,second));
        System.out.println("뺄셈 결과: "+cal.minusTwoNumbers(first,second));
        System.out.println("최솟값: "+Calculator.minNumberOf(first,second));
        System.out.println("최댓값: "+Calculator.maxNumberOf(first,second));

    }
}
