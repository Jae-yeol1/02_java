package com.ohgirffers.section01.extend;

public class FireCar extends Car {
    /*car 클래스의 모든 멤버( 필드 , 메소드) 를 상송 받을 수 있다.
    * 단 , 생성자는 상속받지 못한다 . */
    public FireCar() {
        /* 모든 생성자 맨 첫줄에 .super() 를 컴파일러가 자동으로 추가한다
        * 부모의 기본생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능하다.*/
        super();
        System.out.println("Firecar 클래스 기본 생성자 호출 확인용");

    }
    /*soundHorn 매서드 재작성 : overriding
    * @Override 어노테이션 이라고함 : 오버라이딩 성립요건을 체크하여 성립되지 않는경우 컴파일 에러 발생*/

    // 그냥 메서드를 가져다가 붙이면 재정의 된건지 아닌지 모르니 override 로 표시해쥼
    @Override
    public void soundHorn() {
        super.soundHorn(); // 여기서 super 는 부모인 car 를 지정
        /*private 접근제어자가 붙은 필드는 상속은 받지만 자식이 접근할순 없다
        * protected 로 변경하면 자식이 접근할수 있다.
        * 현재 isRunning은 private 로 정의해서 접근이 안됨.
        * */
        if(isRunning()){
            System.out.println("빠아아아아아아아아아!!아아악!!!빠앙!!");
        } else {
            System.out.println("ㅅㅂ차가 앞으로 지나갑니다. 비키세요,안비키면 밀어버린다");
        }
    }
    /*상속은 자식 클래스가 부모클래스를 확장하는 것 이므로 FireCare만의 추가 기능도 작성 가능함*/

    public void sparyWate(){
        System.out.println("물을 뿌립니다💦💦💦💦💦💦");
    }

}
