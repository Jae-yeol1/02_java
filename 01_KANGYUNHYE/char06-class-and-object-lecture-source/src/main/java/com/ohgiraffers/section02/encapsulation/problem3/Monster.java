package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    /*
    *접근제한자
    * 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조 연산자로 접근할 수 잇는 범위를 제한하기 위한 키워드
    * public, protected(상속까지),default(패키지까지),private(클래스까지)
    * 단 클래스 선언 시에는 public, default만 사용가능
     */

    /* 필드는 클래스 내부에서만 접근 가능하도록 한다.(직접 접근 차단) */
    private String kinds;
    private int hp;

    /* 간접 접근 가능한 메소드를 정의하여 외부에서는 매소드를 통해 간접 접근하게 한다.*/
    public void setInfo(String info){
        this.kinds = info;
    }
    public String getInfo(){
        return this.kinds;
    }
    public void setHp(int hp){
        this.hp = Math.max(hp, 0);

    }
    public int getHp(){
        return this.hp;
    }

}
