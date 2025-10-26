package com.ohgiraffers.section01.method;

public class Application2 {
    //static 없는 메소드 호출 사용
    public static void main(String[] args) {
        System.out.println("main() 시작됨");
        // 객체를생성
        Application2 app =  new Application2();
        app.methodA();
        app.methodB();

        System.out.println("main() 종로됨");
    }
    /*
    * static 키워드가 없는
    * non-static method 사용
    * 주 기억장치가 아직 인지하지못함
    * */
    public void methodA(){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 총료됨");

    }
    public void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 총료됨");
    }
}
