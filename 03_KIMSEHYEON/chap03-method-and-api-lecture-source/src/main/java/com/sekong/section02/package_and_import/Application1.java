package com.sekong.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        // 사용해야하는 클래스의 패키지가 다른 경우 풀 클래스 이름을 사용해야 한다.

        // non-static 메소드
        com.sekong.section02.package_and_import.test.Calculator cal = new com.sekong.section02.package_and_import.test.Calculator();
        System.out.println(cal.plusTwoNumbers(10,20));

        // static 메소드
        int max = com.sekong.section02.package_and_import.test.Calculator.maxNumberOf(10,20);
        System.out.println(max);
    }
}
