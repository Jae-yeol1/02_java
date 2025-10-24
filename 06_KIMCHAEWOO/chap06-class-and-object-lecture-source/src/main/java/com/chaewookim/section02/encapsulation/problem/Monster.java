package com.chaewookim.section02.encapsulation.problem;

public class Monster {

    String name;
    int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
            System.out.println("양수 값 입력으로 Monster의 체력 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력되어 Monster의 체력 0으로 변경");
        }
    }

}
