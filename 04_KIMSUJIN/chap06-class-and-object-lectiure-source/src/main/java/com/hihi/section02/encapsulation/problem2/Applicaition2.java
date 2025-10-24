package com.hihi.section02.encapsulation.problem2;

public class Applicaition2 {

    public static void main(String[] args) {

        /*필드에 직접 접근하면 필드의 변경이 발생하였을 때 사용한 코드를 모두 수정해야 한다.
         * 유지보수에 안좋음*/
        Monster m1 =  new Monster(); //m1은 주소값 들어가있음
//    m1.name = "두치";
        m1.setInfo("두치");


//        m1.setHp(200);
//        System.out.println("m1.name = " + m1.name);
        System.out.println("m1.hp = " + m1.hp);
    }
}
