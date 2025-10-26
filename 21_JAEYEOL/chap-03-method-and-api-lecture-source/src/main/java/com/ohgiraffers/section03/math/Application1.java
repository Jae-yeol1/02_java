package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args) {
        // 절대값 abs
        System.out.println("-12.4의 절대값" + Math.abs(-12.4)); // Math 라는 클래스를 사용
        System.out.println("10과 20 중 더 작은것은? " + Math.min(10,20));
        System.out.println("10과 20중 더 큰것은? "+ Math.max(10,20));

        System.out.println("난수값 발생" + Math.random());
    }
}
