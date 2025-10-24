package com.hihi.section02.encapsulation.problem2;

public class Monster {

//    String name;        //type앞에 접근제한자 있음(아무것도 안쓰면 default)
    String kinds;
    int hp;

    public void setInfo(String info){
        this.kinds = info;
    }
    public String getInfo(){
//        return this.name;
        return this.kinds;
    }

}
