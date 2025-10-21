package com.lhw.section02.package_and_import; // 패키지

//import com.lhw.section02.package_and_import.test.Calculator;

// ↑↓ 각각의 패키지와 클래스의 위치를 바꾸면 안된다.
public class Application1 { //클래스 명

    public static void main(String[] args) {
//        Calculator calculator = new Calculator();

        com.lhw.section02.package_and_import.test.Calculator cal
                = new com.lhw.section02.package_and_import.test.Calculator();

//        논 스태틱 메소드 호출 ( pluaTwoNumber ,
        int add = cal.plusTwoNumbers(1, 20);
        System.out.println("add = " + add);
        java.lang.System.out.println();
//        스태틱 메소드 호출
        int maxR = com.lhw.section02.package_and_import.test.Calculator.maxNumberOf(1, 200);
//        => 매번 이렇게 쓰기 번거로움
    }
}
