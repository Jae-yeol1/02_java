package com.chaewookim.section03.abstraction;

public class CarRacer {

    /*
    * CarRacer 클래스가 Car 클래스의 인스턴스를 멤버 변수로 소유하고 있음
    * 즉 CarRacer는 Car를 가지고 있음
    * 즉, CarRacer는 자동차의 기능을 직접 수정하는 것이 아니라 자신이 소유한 Car 객체에게 기능을 위임
    * has-a 관계(포함 관계)
    * */
    private Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelerator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

}
