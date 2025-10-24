package com.ogiraffers.section3.abstraction;

public class CarRacer {

    /*
    CarRacer클래스가 Car클래스의 인스턴스를 멤버변수로 소유하고 있다.
    즉, CarRacer는 Car를 가지고 있다.
    CarRacer는 자동차의 기능을 직접 수행하는 것이 아니라 자신이 소유한Car객체에게 기능을 위임
    has-a관계(포함관계)
     */
    private final Car car=new Car();//final은 객체의 주소값에 final을 건거고
                                    // 속성값은 변경 가능함

    public void startUp(){
        car.startUp();
    }
    public void stepAccelator(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }

}
