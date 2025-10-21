package com.lhw.section02.package_and_import;

import com.lhw.section02.package_and_import.test.Calculator;
// import com.lhw.section01.method.Calculator; 동일 이름 중복X

import static com.lhw.section02.package_and_import.test.Calculator.maxNumberOf;
import static com.lhw.section02.package_and_import.test.Calculator.minNumberOf;

public class Application2 {

    public static void main(String[] args) {


        Calculator cal = new Calculator();

        int result = cal.plusTwoNumbers(10, 20);  // non-static 호출
        System.out.println("result = " + result);

        //int staticCall = cal.max...
        int result2 = maxNumberOf(10, 20); // static 메소드 (클래스명으로시작)

        int result3 = maxNumberOf(10,20); // static 메소드 (import static)

        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        int result4 = minNumberOf(10,20);

        Calculator cal2 = new Calculator();
    }
}
