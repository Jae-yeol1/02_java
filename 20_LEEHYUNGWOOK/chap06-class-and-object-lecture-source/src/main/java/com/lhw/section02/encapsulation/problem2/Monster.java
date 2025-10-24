package com.lhw.section02.encapsulation.problem2;

public class Monster {

    //String name;
    String kinds; // 필드에 변경이 생겼을 때
    int hp;

    /*setInfo를 통해서 값을 넘겨줄 수 있다.*/
    public void setInfo(String info){
//        this.kinds = info;
//        this.name = info;
        this.kinds = info;
    }


    /*getInfo를 통해 name 리턴 -> 간접 접근*/
    public String getInfo() {
//        return this.name;
        return this.kinds;
    }

}
