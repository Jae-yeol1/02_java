package com.lhw.section02.encapsulation.problem1;

public class Monster {
       /* 접근 제한자
        * public
        * protected
        * (default)
        * private*/
    String name;
    int hp;

    /* Monster 객체의 변수를 변경하고 싶을 때 변수를 직접 수정하기 보다
    *  메소드를 통해 내가 원하는 조건에서 변경할 수 있다.
    * */
    public void setHp(int hp) {
        if (hp < 0) { // 뿌꾸의 HP 가 0보다 작는 상황.
            /*this : 인스턴스 변수가 생성 되었을 때
            * 자신의 주소를 저장하는 레퍼런스 주소*/
            this.hp = hp;
            System.out.println(
                             "양수값이 입력되어 몬스터의 체력을 " +
                             " 입력값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력되어 체력을 0으로 변경");
        }
    }
}
