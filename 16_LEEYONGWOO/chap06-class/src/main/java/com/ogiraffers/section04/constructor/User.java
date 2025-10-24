package com.ogiraffers.section04.constructor;

import java.util.Date;

public class User {
    //필드 선언문
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    //생성장 선언부
    /*반환값이 없음
    접근제한자 클래스명([매개변수]){}
    */
    /*기본생성자 : 클래스내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본생성자를
    생성한다.
     */
    public User(){
        System.out.println("User 기본 생성자 동작함");
    }
    /**매개변수 생성자:
     * 초기화될 필드가 여러 개 일 경우 초기화하고 싶은 필드의 조합별로
     * 생성자를 여러개 작성 가능함
     */
    public User(String id,String pwd){
        this.id=id;
        this.pwd=pwd;
        System.out.println("User id, pwd초기화 생성자 동작함");
    }

    public String getInformation() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id=id;
//        this.pwd=pwd;
        this(id,pwd);
        this.name=name;
        this.enrollDate=enrollDate;
        System.out.println("user 모든 필드 초기화 생성자 동작함");
    }


}
