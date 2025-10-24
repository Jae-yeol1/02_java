package com.lhw.section04.constructor;

import java.util.Date;

public class User {

    /* 필드 선언문 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부
    접근제한자 클래스명([매개변수]){} -> qks

    *   */
    public User(){
        System.out.println("User 기본 생성자 생성되었습니다");
    }

    /*
    매개변수 생성자
    초기화될 필드가 여러 개 일 경우 초기화하고 싶은 필드의 조합별로
    생성자를 여러개 작성할 수 있다.
    */
    /*생성자는 타입으로 구분한다. 이름이 다 똑같아서.*/

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작함");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = p|wd;
        /* 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        * 리턴 되어 돌아오지만 리턴값은 돌아오지 않으며 가장 첫 줄에 선언해야 한다.*/
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getInformation() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }
}
