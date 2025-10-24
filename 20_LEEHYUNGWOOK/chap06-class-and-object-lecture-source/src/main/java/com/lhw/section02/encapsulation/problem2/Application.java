package com.lhw.section02.encapsulation.problem2;

import com.lhw.section02.encapsulation.problem2.Monster;

public class Application {

    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점 이해
        (왜 어떤 때는 public, 어떤 떄는 private를 써야 하는가?)
        *  - 필드에 직접 접근 시 필드 수정이 생겼을 때 사용한 코드를 모두 수정해야 한다.
        * 이는 유지보수 측면에서 악영향을 끼친다.*/
        Monster m1 = new Monster(); // Heap에 m1(주소// 값) 올라감
        System.out.println("=====> " + m1.hashCode()); //주소값

//        m1.name = "두치";
        m1.setInfo("두치"); //
        m1.getInfo();

        System.out.println("m1.getInfo() = " + m1.getInfo());

    }
}
