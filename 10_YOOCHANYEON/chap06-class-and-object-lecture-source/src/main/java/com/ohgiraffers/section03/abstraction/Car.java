package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false;   // 시작은 시동이 꺼져 있는 상태
    private int speed;  //  속도

    // 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라

    public void startUp(){
        if(this.isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("부아아아앙~! 💨💨💨");
        }
    }
    public void go() {
        if(isOn) {
            this.speed += 80;
            System.out.println(speed + "km/h");
        } else {
            this.speed = 0;
            System.out.println(speed + "km/h");
        }
    }
    public void stop() {
        if(isOn) {
            if(speed > 0) {
                speed = 0;
                System.out.println("끼이익-!💨💨💨💨💨"  + speed + "km/h");
            } else {
                System.out.println(speed + "km/h");
            }
        } else {
            System.out.println(" ");
        }
    }
    public void turnOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("딸깍, 딸깍");
            } else {
                isOn = false;
                System.out.println("푸쉬익, 띵! 띵! 띵!");
            }
        } else {
            System.out.println("틱, 틱.");
        }
    }
}
