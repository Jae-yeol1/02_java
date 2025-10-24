package com.chaewookim.section04.constructor;

import java.util.Date;

public class User {
    // 필드 선언문
    private String id;
    private String pwd;
    private String name;
    private Date enrolldate;

    // 생성자 선언부
    // 접근제한자 클래스명([매개변수]) {}
    // 기본생성자: 클래스 내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본 생성자 생성
    public User() {
        System.out.println("기본 생성자 동작");
    }

    // 매개변수 생성자
    // 초기화될 필드가 여러개일 경우 초기화하고 싶은 필드의 조합 별로 여러개의 생성자 작성 가능
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User_id, User_pwd 초기화 생성자 동작");
    }

    public User(String id, String pwd, String name, Date enrolldate) {
//        this.id = id;
//        this.pwd = pwd;
        /* 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        *  리턴되어 돌아오지만 리턴값은 존재하지 않으면 가장 첫 줄에 선언해야 함
        *  */
        this(id, pwd);

        this.name = name;
        this.enrolldate = enrolldate;
        System.out.println("User 모든 필드 초기화 생성자 동작");
    }

    public String getInformation() {
        return id + " " + pwd + " " + name + " " + enrolldate;
    }
}
