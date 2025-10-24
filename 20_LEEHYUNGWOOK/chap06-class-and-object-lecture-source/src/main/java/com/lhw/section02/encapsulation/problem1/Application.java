package com.lhw.section02.encapsulation.problem1;

public class Application {



    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점 이해
        (왜 어떤 때는 public, 어떤 떄는 private를 써야 하는가?)
        *  1. */
        Monster m1 = new Monster(); // Heap에 m1(주소값) 올라감
        System.out.println("=====> " + m1.hashCode()); //주소값

        m1.name = "두치";
        m1.hp = 100;
        System.out.println("m1 = " + m1.name);
        System.out.println("m1.hp = " + m1.hp);

        Monster m2 = new Monster();
        System.out.println("=====> " + m2.hashCode());

        m2.name = "뿌꾸";
        m2.hp = -100;
        System.out.println("m2 = " + m2.name);
        System.out.println("m2.hp = " + m2.hp);

        /* hp는 음수값일 수 있다. => 필드에 올바르지 않은 값이 들어가도
        *  통제가 불가능 하다.
        * 직접 접근을 메소드를 통해 간접 접근할 수 있도록 수정해본다.*/
        Monster m3 = new Monster();
        m3.name = "드랴큘라";
        m3.setHp(-200);
        System.out.println("m3.name = " + m3.name);
        System.out.println("me.hp = " + m3.hp);

    }
}
