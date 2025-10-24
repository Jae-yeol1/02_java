package com.ohgiraffers.section02.encapsulation.problem01;

public class Monster {

    /* 접근 제한자 자료형 변수명;
    * 작성하지 않은 경우는 default( */
    String name;
    int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            /* this : 인스턴스 변수가 생성되었을 때, 자신의 주소를 저장하는 레퍼런스 주소 */
            this.hp = hp;   /* this 쓴 이유 : 생성된 인스턴스의 변수를 명확하게 찾기 위해.
                                m1.hp = hp와 this.hp = hp 는 같은 의미(참조 변수) */
            System.out.println("양수 값이 입력되어 몬스터의 체력을 입력값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력되어 몬스터의 체력을 0으로 변경");
        }
    }
}
