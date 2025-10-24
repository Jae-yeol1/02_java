package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    /* 필드 선언문 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부
    * 접근 제한자 클래스명([매개 변수]) {}
    * */
    /* 기본 생성자 : 클래스 내부에 작성된 생성자가 0개인 경우
    컴파일러가 자동으로 기본 생성자를 생성*/

//    public User() {
//        System.out.println("User 기본 생성자 동작 확인");
//    }

    /* 매개 변수 생성자 :
    * 초기화될 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합 별로
    * 생성자를 여러 개 작성 가능
    * */

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pw 초기화 생성자 동작 확인");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
        /* 동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        * 리턴되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫줄에 선언되어야 함*/
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("모든 필드 초기화 생성자 동작 확인");
    }

    public String getInfo() {
        return id + " " + pwd + " " + name + " " + enrollDate;
    }
}
