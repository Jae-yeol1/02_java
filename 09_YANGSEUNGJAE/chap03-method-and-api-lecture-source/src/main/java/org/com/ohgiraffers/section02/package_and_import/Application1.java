package org.com.ohgiraffers.section02.package_and_import;
import org.com.ohgiraffers.section02.package_and_import.test.calculator;

// import 등록을 생략 가능한 패키지 java.lang : 기본 사용 패키지이다보니 생략해도 컴파일러가 알아서 실행할때 추가한다.

public class Application1 {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int result = cal.plusTwoNumbers(100,50);
        System.out.println("result = " + result);


    }
}
