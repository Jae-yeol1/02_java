package com.lhw.section02.encapsulation.problem3;

public class Monster {
    /*접근제한자 설정*/
    /*String kinds;
    int hp;
    -> 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조 연산자로
    접근할 수 있는 범위를 제한하기 위한 키워드: 접근제한자
    */

    private String kinds;
    private int hp;
    // 이제 오직 setInfo와 getInfo를 통해서 내용 변경을 하겠다는 것.

    /*간접 접근 가능한 메소드를 정의하여 외부에선 메소드로만
    * 접근 가능하도록 한다.*/
    public void setInfo(String info){
        this.kinds = info;
    }

    public String getInfo() {
        return this.kinds;
    }

    public void setHp(int hp) {
//        this.hp = hp;
        this.hp = Math.max(hp, 0); //음수 예외처리
    }

    public int getHp() {
        return this.hp;
    }
}
