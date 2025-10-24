package com.swcamp.section05.overloading;

public class OverloadingTest {
    /*
    오버로딩 : 같은 클래스내에서 같은 이름의 메소드를 매개변수부만 다르게 하여 정의하는 것
    사용이유 : 매개 변수의 종률별로 메소드 내용은 다르게 작성해야 하는 경우
    동일 기능의 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 어려워지기 때문
    ex) System.out.println()

    메소드의 시그니처?
    public void method(int num) {} 이라면 메소드의 메소드명과 파라미터 선언부 부분을
    메소드의 시그니처(signature)라고 한다.
    e.g. "method(int num)" >>> 이게 시그니처

    오버로딩의 조건?
    매개변수의 타입, 개수, 순서를 다르게 작성하여 하나의 클래스 내에서 동일한 이름의 메소드를 여러개 작성할 수 있다.
    메소드의 헤드부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정되지 않는다.
     */

    public void test() {}

//    private void test() {}    // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 건들면 안됨.
//    public String test() { return "test"; } // 접근제한자, 반환값 등 변경 안됨.
    // 매개변수의 갯수가 달라지는 것은? --> Ok.
    public void test(int num) {}

    // 아래의 경우 미리 선언한 시그니처가 이미 있는 경우 변수명만 바꾼다해서 오버로딩이 되지 않음.
    public void test(int num1, int num2) {}
//    public void test(int num2, int num1) {}

    // 매개변수의 타입이 달라지는 것은? --> Ok.
    public void test(int num1, String str) {}

    // 매개변수의 순서가 달라지는 것은? --> Ok. 그러나 타입만은 고려해야 함!!
    public void test(String str, int num1) {}

}
