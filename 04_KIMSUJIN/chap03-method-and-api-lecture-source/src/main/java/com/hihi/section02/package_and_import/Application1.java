package com.hihi.section02.package_and_import;

import com.hihi.section02.package_and_import.test.Calculator;
// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lang 패키지를 의미한다.
// 워낙 기본이 되는 피키지이다보니, 생략해도 컴파일러가 알아서 실행할때 추가한다.
public class Application1 {
    public static void main(String[] args) {

//        Calculator cal = new Calculator(); --> import 필요
        com.hihi.section02.package_and_import.test.Calculator cal
                = new com.hihi.section02.package_and_import.test.Calculator();  //-> import 안하면 이렇게 길게 써야 함

        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println(plusResult);

        int maxResult = com.hihi.section02.package_and_import.test.Calculator.maxNumberOf(100, 50);
        System.out.println(maxResult);

    }
}
// import 안쓰면 static이건 아니건 호출 방법 동일