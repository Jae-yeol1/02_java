package com.ohgirffers.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
        super.run();
        System.out.println("레이싱카가 전속력으로 질주합니다");
    }

    @Override
    public void soundHorn() {
        super.soundHorn();
        System.out.println("레이싱카는 경적이 업다..");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("레이싱카가 멈춥니다");
    }

    public RacingCar() {
        System.out.println("RacingCar 기본 생성자 호출됨..");




    }
}
