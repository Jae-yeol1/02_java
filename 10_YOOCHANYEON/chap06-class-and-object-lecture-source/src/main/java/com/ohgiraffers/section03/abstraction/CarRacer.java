package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    /*
    * CarRacer 클래스가 Car 클래스의 인스턴스를 멤버 변수로 소유. 즉, CarRacer는 Car를 소유
    * ===> CarRacer는 자동차의 기능을 직접 수행 x, 자신이 소유한 Car 객체에게 기능을 위임
    * has-a 관계(포함 관계)
    * */
    private final Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

}
