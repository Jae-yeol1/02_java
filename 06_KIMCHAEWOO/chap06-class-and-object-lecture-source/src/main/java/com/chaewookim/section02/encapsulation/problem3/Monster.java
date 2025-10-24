package com.chaewookim.section02.encapsulation.problem3;

public class Monster {

    private String kinds;
    private int hp;

    public void setInfo(String info) {
        this.kinds = info;
    }

    public String getInfo() {
        return this.kinds;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getHp() {
        return this.hp;
    }

}
