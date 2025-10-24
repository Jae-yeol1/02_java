package com.swcamp.section02.encapsulation.problem2;

public class Monster {

    String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
        this.kinds = info;
    }

    public String getInfo() {
        return this.kinds;
    }
}
