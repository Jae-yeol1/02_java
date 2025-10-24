package com.ohgiraffers.section05.dverloading;

public class OverloadingTest {
   /*

오버로딩 : 같은 클래스 내에서 같은 이름의 메소드를 매개변수부만 다르게 정의하는 것
사용 이유 : 매개 변수의 종류 별로 메소드 내용은 다르게 작성해야 하는 경우
동일 기능의 메소드를 매개 변수에 따라 다른 이름을 붙이면 관리가 어렵기 때문
ex) System.out.println()
메소드의 시그니처?
public void method(int num) {} 이라면 메소드의 메소드 명과 파라미터 선언부 부분을
메소드의 시그니처(signature)라고 함. (=> method(int num) 요거)
오버로딩의 조건
매개 변수의 타입, 개수, 순서를 다르게 작성하여 하나의 클래스 내에서
동일한 이름의 메소드를 여러 개 작성 가능
메소드의 head부에 있어 시그니처를 제외한 부분이 다르게 작성되는 것은 인정 x
*/

    public void test(){}

//    private void test1(){} // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 무관

//    public String test(){
//        return "test";
//    } // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 무관
//    private String test(){ return "test";}  // 메소드 오버로딩에서는 시그니쳐를 제외한 나머지는 무관

    // 매개변수의 갯수가 달라짐
    public void test(int num){

    }
    public void test(int num, int num2){

    }
//    public void test(int num2, int num1){
//
//    } // 매개변수명이 다른 것은 무관
    //매개변수의 타입이 달라짐
    public void test(int num1, String str){}
    // 매개변수의 순서가 달라짐(타입만 고려)
    public void test(String str, int num1){}

}
