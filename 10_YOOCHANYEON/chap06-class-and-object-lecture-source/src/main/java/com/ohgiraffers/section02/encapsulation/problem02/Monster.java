package com.ohgiraffers.section02.encapsulation.problem02;

public class Monster {

    /* 접근 제한자 자료형 변수명;
    * 작성하지 않은 경우는 default( */
//    String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
        this.kinds = info;
//        this.name = info;
    }

    public String getInfo() {
//        return this.name;
        return this.kinds;
    }
}