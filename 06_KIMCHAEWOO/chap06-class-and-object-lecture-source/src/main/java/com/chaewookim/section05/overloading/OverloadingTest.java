package com.chaewookim.section05.overloading;

public class OverloadingTest {

    /*
    * 오버로딩: 같은 클래스 내에서 같은 이름의 메소드를 매개변수만 다르게 하여 정의하는 것
    * 사용 이유: 매개변수의 종류별로 메소드 내용은 다르게 작성해야 하는 경우
    * 동일 기능의 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 어려워지기 때문
    * ex) System.out.println()
    *
    * 메소드의 시그니처
    * public void method(int num){} 이라면 메소드의 메소드명과 파라미터 선언부 부분을 메소드의
    * 시그니처(signature)라고 함
    * --> method(int num) 요거
    *
    * 오버로딩의 조건
    * 매개변수의 타입, 개수, 순서를 다르게 작성하여 하나의 클래스 내에서 동일한 이름의 메소드를 여러 개 작성 가능
    * 메소드의 헤드부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정되지 않음
    * */

    public void test() {}

//    public void test() {}
//    public String test() {
//      return "something";
//    }

    // 매개변수의 개수 변경
    public void test(int a) {}
    public void test(int a, int b) {}

}
