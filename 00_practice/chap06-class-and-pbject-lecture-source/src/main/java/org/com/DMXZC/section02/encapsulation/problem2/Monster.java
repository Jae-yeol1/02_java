package org.com.DMXZC.section02.encapsulation.problem2;

public class Monster {

    String name;
    String kinds;
    int hp;

    public void setInfo(String info){
        this.kinds = info;
        this.name = info;

    }

    public String getInfo(){
        return this.name;
    }
}
