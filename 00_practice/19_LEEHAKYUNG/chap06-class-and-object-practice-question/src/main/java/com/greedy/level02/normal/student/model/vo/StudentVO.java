package com.greedy.level02.normal.student.model.vo;

public class StudentVO {
    private int grade;
    private int classroom;
    private String nam;
    private double height;
    private char gender;

    public StudentVO() {}
    public StudentVO(int grade, int classroom, String nam, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.nam = nam;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public String getNam() {
        return nam;
    }
    public void setNam(String nam) {
        this.nam = nam;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printInformation() {
        System.out.println("====== print information ======");
        System.out.println("학년 : " + this.getGrade());
        System.out.println("반 : " + this.getClassroom());
        System.out.println("이름 : " + this.getNam());
        System.out.println("키 :" + this.getHeight());
        System.out.println("성별 : " + this.getGender());
    }
}
