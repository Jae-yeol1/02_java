package com.swcamp.section04.constructor;

import java.util.Date;

public class User {
    /*
    필드 선언문
     */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /*
    생성자 선언부
    접근제한자 클래스명([매개변수]) {}

    기본 생성자 : 클래스 내부에 작성된 생성자가 0개인 경우 컴파일러가 자동으로 기본 생성자를 생성한다.
     */
    public User() {
        System.out.println("User 기본 생성자 동작함");
    }

    /*
    매개변수 생성자:
    초기화될 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합별로
    생성자를 여러개 작성할 수 있다.
     */
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("Construct with Initializing User id, pwd");
    }

//    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;
//        System.out.println("All field of user is initialized and constructed");
//    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
    }
    public String getInformation() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }
}
