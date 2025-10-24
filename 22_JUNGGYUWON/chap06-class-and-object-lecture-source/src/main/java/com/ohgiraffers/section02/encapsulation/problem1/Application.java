package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster();
        Monster m3 = new Monster();

        m1.name = "두치";
        m1.hp = 100;

        m2.name = "뿌꾸";
        m2.hp = -200;

        System.out.println("m1.name = " + m1.name);
        System.out.println("m2.name = " + m2.name);
        System.out.println("m1.hp = " + m1.hp);
        System.out.println("m2.hp = " + m2.hp);

        m1.setHp(300);
        m2.setHp(400);
        System.out.println("m1.hp = " + m1.hp);
        System.out.println("m2.hp = " + m2.hp);

        /*
         * hp는 음수값일 수 없다. => 필드에 올바르지않은 값이 들어와도 통제 불가능하다.
         * 직접 접근을 메소드를 통해서 간접 접근할 수 있도록 수정해본다.
         */

        m3.name = "드라큘라";
        m3.setHp(-200);

        System.out.println("m3.name = " + m3.name);
        System.out.println("m3.hp = " + m3.hp);
    }
}
