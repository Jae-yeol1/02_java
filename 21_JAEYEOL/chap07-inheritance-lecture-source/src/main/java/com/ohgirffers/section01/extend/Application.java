package com.ohgirffers.section01.extend;

public class Application  {
    public static void main(String[] args) {

        /*부모 클래스 생성*/
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 IS-A 관계로 구분되는 관계에서만 사용가능
        * 삼각형은 도형이다 (o).
        * 도형은 삼각형이다 (x).
        *
        * 소방차 , 레이싱카 모두 자동차 이다 . (o)
        * 모든 자동차는 소방차 혹은 레이싱카 혹은 스포츠카다 . (x)
        * */
        System.out.println("========== Firecar ==========");
        FireCar fireCar = new FireCar();

        //자식이 상속하려는데
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sparyWate();


        System.out.println("========== RacingCar ==========");
        RacingCar racingCar = new RacingCar();

        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

    }
}
