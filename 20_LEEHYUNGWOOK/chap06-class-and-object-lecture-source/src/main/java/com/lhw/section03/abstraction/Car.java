package com.lhw.section03.abstraction;

public class Car {
    // 필드
    private boolean isOn = false; // 시작은 시동 OFF
    private int speed; // 속도

    // 시동걸기 / 전진 / 정지 / 시동끄기
    // 메소드
    public void startUp() {
        if (this.isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다.🚗");
        }
    }
    public void go() {
        if (isOn) {
            speed += 10;
            System.out.println("차가 앞으로 움직입니다..." + speed +"km/h");

        } else {
            // isOn : False
            System.out.println("go():차에 시동이 걸려 있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }
    public void stop() {
        if (isOn) {
            if (speed > 0) { //speed가 0보다 클 때
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            } else { // speed = 0
                System.out.println("차는 이미 멈춰 있는 상태입니다.");
            }
        } else {
            System.out.println("stop():차의 시동이 걸려 있지 않습니다.");
        }
    }
    public void turnOff() {
        if (isOn) {
            if (speed > 0) { //speed가 0보다 클 때
                speed = 0;
                System.out.println("달리는 상태에서 차를 멈출 수 없습니다. 차를 먼저 멈춰주세요.");
            } else { // speed = 0
                isOn = false;
                System.out.println("차의 시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
            }
        } else {
            System.out.println("turnOff():차의 시동이 걸려 있지 않습니다.");
        }
    }

}
