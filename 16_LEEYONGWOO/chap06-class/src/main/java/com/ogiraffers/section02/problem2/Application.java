package com.ogiraffers.section02.problem2;

public class Application {
    public static void main(String[] args) {
        Monster m1=new Monster();
//        m1.kinds="두치";
//        m1.hp=200; 직접 접근 불가
        m1.setInfo("두치");
        m1.setHp(100);
        System.out.println(m1.getInfo());
        System.out.println(m1.getHp());

        Monster m2 =new Monster();
        m2.setInfo("뿌꾸");
        m2.setHp(-100);
        System.out.println(m2.getInfo());
        System.out.println(m2.getHp());


    }
}
