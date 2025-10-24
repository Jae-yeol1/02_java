package com.ohgiraffers.section02.encapsulation.problem02;

public class Application {

    public static void main(String[] args) {

        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점 이해 */

        /*
        * 필드에 직접 접근하면 필드의 변경이 발생햐였을 때 사용한 코드를 모두 수정해야 함
        * 이는 유지 보수적 측면에서 악영향
        * */

        Monster m1 = new Monster();

//        m1.name ="두치";
        m1.setInfo("두치");
        m1.hp = 200;


        System.out.println("m1.name = " + m1.getInfo());
        System.out.println("m1.hp = " + m1.hp);

        Monster m2 = new Monster();
//        m2.name = "뿌꾸";
        m2.hp = -200;
//        System.out.println("m2.name = " + m2.name);
        System.out.println("m2.hp = " + m2.hp);

        /*
        * hp는 음수 값일 수 없음 => 필드에 올바르지 않은 값이 들어가도 통제 불가능
        * 직접 접근을 메소드르 통해서 간접 접근할 수 있도록 수정해본다.
        * */

        Monster m3 = new Monster();
//        m3.name = "드라큘라";
//        m3.setHp(-200);
//        System.out.println("m3.name = " + m3.name);
        System.out.println("m3.hp = " + m3.hp);
    }
}
