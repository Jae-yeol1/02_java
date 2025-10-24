package com.hihi.section02.encapsulation.problem1;

public class Monster {

    String name;        //type앞에 접근제한자 있음(아무것도 안쓰면 default)
    int hp;

    public void setHp(int hp) {
        if(hp > 0){
            /* this : 인스턴스 변수가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 주소*/
            this.hp = hp;
            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
        }else{
            this.hp = 0;
            System.out.println("음수 값이 입력되어 몬스터의 체력을 0으로 변경");

        }
    }

}
