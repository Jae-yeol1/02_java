package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
    //필드
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    //생성자
    public StudentVO(){}
    public StudentVO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    //메소드
    public void printInformation() {
        System.out.println("학년 : " + getGrade());
        System.out.println("반 : " + getClassroom());
        System.out.println("이름 : " + getName());
        System.out.println("키 : " + getHeight());
        System.out.println("성별 : " + getGender());
    }
    //setter

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //getter

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }
}
