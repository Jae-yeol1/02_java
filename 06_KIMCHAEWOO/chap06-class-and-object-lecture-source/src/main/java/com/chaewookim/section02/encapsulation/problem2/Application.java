package com.chaewookim.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근 시 발생할 수 있는 문제점
        Monster monster1 = new Monster();

        monster1.setInfo("두치");
//        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1.name = " + monster1.getInfo());
        System.out.println("monster1.hp = " + monster1.hp);

//        Monster monster2 = new Monster();
//        monster2.name = "뿌꾸";
//        monster2.hp = 150;

        Monster monster3 = new Monster();
//        monster3.name = "드라큘라";
//        monster3.setHp(-200);
        monster3.setInfo("드라큘라");
        System.out.println("monster3.name = " + monster3.getInfo());
        System.out.println("monster3.hp = " + monster3.hp);
    }
}
