package com.sekong.section02.package_and_import;

import com.sekong.section02.package_and_import.test.Calculator;
// static메소드 호출 시
import static com.sekong.section02.package_and_import.test.Calculator.maxNumberOf;
import static com.sekong.section02.package_and_import.test.Calculator.*;
// import 등록을 생략해도 사용가능한 페키지가 있는데 java.lang패키지를 의미한다.
// 컴파일러가 알아서 추가
public class Application2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int plus = cal.plusTwoNumbers(10,20);
        System.out.println(plus);

        int max = maxNumberOf(10,20);
        System.out.println(max);

        // 다른 패키지에 있으나 클래스의 이름이 같은 경우 함께 임포트가 불가능하다. 직접 선언해줘야함.
        com.sekong.section01.method.Calculator cal2 = new com.sekong.section01.method.Calculator();
        System.out.println(cal2.plusTwoNumbers(10,20));
    }
}
