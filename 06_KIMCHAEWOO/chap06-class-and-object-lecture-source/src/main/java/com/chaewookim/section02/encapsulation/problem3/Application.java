package com.chaewookim.section02.encapsulation.problem3;

import com.chaewookim.section02.encapsulation.problem3.Monster;

public class Application {
    public static void main(String[] args) {

        // 직접 접근이 아닌 메소드를 통한 간접 접근을 작성해 두더라도
        // 접근 제한자를 통해 강제화하지 않으면 직접 접근이 가능한 문제
        // 따라서 접근 제한자 설정
        // 필드는 private, 메소드는 public -> 캡슐화 적용

        Monster m1 = new Monster();
        m1.setInfo("두억시니");
        m1.setHp(100);
        System.out.println("m1.getInfo() = " + m1.getInfo());
        System.out.println("m1.getHp = " + m1.getHp());

        Monster m2 = new Monster();
        m2.setInfo("드라큘라");
        m2.setHp(-100);
        System.out.println("m2.getInfo() = " + m2.getInfo());
        System.out.println("m2.getHp() = " + m2.getHp());

    }
}
