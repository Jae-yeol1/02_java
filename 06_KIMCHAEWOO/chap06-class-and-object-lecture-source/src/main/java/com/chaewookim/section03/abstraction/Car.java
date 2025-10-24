package com.chaewookim.section03.abstraction;

public class Car {

    private boolean isOn = false; // 시작은 시동이 꺼져 있는 상태
    private int speed; // 속도

    // 시동 걸기, 앞으로 가기, 멈추기, 시동 끄기
    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동 걸려 있음");
        } else {
            this.isOn = true;
            System.out.println("시동 걸었음");
        }
    }
    public void go() {
        if (this.isOn) {
            this.speed += 10;
            System.out.println("차가 직진. 현재 속도는 " + this.speed);
        } else {
            System.out.println("차 시동부터 켜라");
        }
    }
    public void stop() {
        if (this.isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("급브레이크. 차 멈춤");
            } else {
                System.out.println("이미 멈춰 있음");
            }
        } else {
            System.out.println("차 시동부터 켜라");
        }
    }
    public void turnOff() {
        if (this.isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("차 우선 멈추고 꺼라.");
            } else {
                isOn = false;
                System.out.println("시동 끔");
            }
        } else {
            System.out.println("이미 꺼져 있음");
        }
    }

}
