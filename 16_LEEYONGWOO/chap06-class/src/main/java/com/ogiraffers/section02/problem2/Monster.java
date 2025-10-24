package com.ogiraffers.section02.problem2;

public class Monster {
    /*
    접근제한자
    클래스 혹은 클래스의 멤버(필드,메소드)에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    public, protected, default, private
    단 클래스 선언 시에는 public, default
     */
    private int hp;
    public String name;
    public int level;
    private String kinds;

    public void setInfo(String info){
        this.kinds=info;
    }

    public String getInfo(){
        return this.kinds;
    }

    public void setHp(int hp){
        this.hp=Math.max(hp,0);
    }

    public int getHp(){
        return this.hp;
    }
}
