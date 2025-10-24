package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해 */

        /*
        * 필드에 직접 접근하면 필드의변경이 발생하였을 때 사요한 코드를 모두 수정해야한다.
        * 이는 유지보수적인 측면에서 악영향을 끼친다.
         */

        Monster m1 = new Monster();
        Monster m2 = new Monster();
        Monster m3 = new Monster();

//        m1.name = "두치";
        m1.setInfo("두치");
        m1.hp = 100;

//        m2.name = "뿌꾸";
        m2.setInfo("뿌꾸");
        m2.hp = -200;

        System.out.println("m1.name = " + m1.getInfo());
        System.out.println("m2.name = " + m2.getInfo());
        System.out.println("m1.hp = " + m1.hp);
        System.out.println("m2.hp = " + m2.hp);

        /*
         * hp는 음수값일 수 없다. => 필드에 올바르지않은 값이 들어와도 통제 불가능하다.
         * 직접 접근을 메소드를 통해서 간접 접근할 수 있도록 수정해본다.
         */

//        m3.name = "드라큘라";
        m3.setInfo("드라큘라");
//        m3.setHp(-200);

        System.out.println("m3.name = " + m3.getInfo());
        System.out.println("m3.hp = " + m3.hp);
    }
}
