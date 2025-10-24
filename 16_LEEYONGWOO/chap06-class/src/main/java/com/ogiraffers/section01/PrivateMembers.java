package com.ogiraffers.section01;

public class PrivateMembers {
    private String id;
    private String pwd;
    private int age;
    private String hobby;

    public PrivateMembers() {}

    public PrivateMembers(String id, String pwd, int age, String hobby) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.hobby = hobby;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPwd() { return pwd; }
    public void setPwd(String pwd) { this.pwd = pwd; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getHobby() { return hobby; }
    public void setHobby(String hobby) { this.hobby = hobby; }

    private void secretMethod() {
        System.out.println("비공개 정보 출력: pwd=" + pwd);
    }

    public void show() {
        System.out.println("PrivateMembers: id=" + id + ", age=" + age + ", hobby=" + hobby);
        secretMethod();
    }
}
