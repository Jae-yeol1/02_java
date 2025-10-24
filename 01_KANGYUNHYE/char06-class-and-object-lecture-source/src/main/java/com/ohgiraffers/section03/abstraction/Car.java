package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false; //시동
    private int speed; //속도

    //시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라

    public void startUp(){
        if(this.isOn){
            System.out.println("이미 시동이 걸려 있습니다. 1등 하좌");
        }else{
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 고 막스");
        }
    }
    public void go(){
        if(isOn){
            this.speed += 10;
            System.out.println("차가 앞으로 잘 가고 있슴둥 현재 속도 : " + speed);
        }else{
            System.out.println("차의 시동이 걸려있지 않습니다. 차에 시동을 먼저 걸어주세요.");
        }
    }
    public void stop(){
        if(isOn){
            if(speed > 0){
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            }else{
                System.out.println("차는 이미 멈춰 있는 상태입니다.");
            }
        }else{
            System.out.println("차의 시동이 걸려있지 않습니다. 차에 시동을 먼저 걸어주세요.");
        }
    }
    public void turnOff(){
        if(isOn){
            if(speed > 0){
                speed = 0;
                System.out.println("차를 멈추세요 이 사람아");
            }else{
                System.out.println("시동 끌게욤");
            }
        }else{
            System.out.println("이미 시동 꺼졌는데여??");
        }
    }
}
