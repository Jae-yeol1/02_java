package com.lhw.section05.overloading;

public class OverloadingTest {

    /*
    ### 오버로딩more
    - 오버로딩: 같은 클래스 내에서 같은 이름의 메소드를 매개변수부분만 다르게 하여 정의하는 것
    - 사용이유: 매개 변수의 종류별로 메소드 내용은 다르게 작성해야 하는 경우
    ⇒ 동일 기능의 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 어려워지기 때문
    Ex) `System.out.println()`

    ### 메소드의 시그니쳐?
    `public void method(int num){}` 이라면 메소드의 메소드명과 파라미터 선언부
    부분을 메소드의 시그니쳐(signature) 라고 한다 (.⇒ `method(int num)` 요거

    ### 오버로딩의 조건
    매개변수의 타입, 갯수, 순서를 다르게 작성
    ↳ 하나의 클래스 내에서 동일한 이름의 메소드를 여러 개 작성할 수 있다. 메소드의
    헤드부에 있어 시그니쳐를 제외한 부분이 다르게 작성되는 것은 인정되지 않는다.
    */

    public void test() {}

    //private void test() {} // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지(접근제한자)는 무관 =-> 먼 뜻?
//    private String test() {
//        return "";
//    } /*자료형도 무관함.*/
    //private String test() {return "";} => 접근제한자, 자료형 모두 마찬가지.

    /* 매개변수의 갯수만 달라진다.*/
    public void test(int num) {} //오버로딩 적용 완
    public void test(int num, int num2) {} //오버로딩 적용 완
    public void test(int num, String str) {}
    public void test(String str, int num) {}




}
