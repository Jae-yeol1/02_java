package com.lhw.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {
        /* 여전히 직접 접근이 "가능" 하다.
        *  메소드를 통해 간접 접근이 가능하지만 아직 부족.
        *  접근 제한자를 통해 강제화한다.
        *  ↳ 필드는 private, 메소드는 public => Encapsulation*/
        Monster m1 = new Monster();

        m1.setInfo("두치");
        m1.setHp(100);
        int hp1 = m1.getHp();
        System.out.println("hp1 = " + hp1);

        Monster m2 = new Monster();

        m2.setInfo("뿌꾸");
        m2.setHp(-100);
        System.out.println(m2.getHp());
    }
}
