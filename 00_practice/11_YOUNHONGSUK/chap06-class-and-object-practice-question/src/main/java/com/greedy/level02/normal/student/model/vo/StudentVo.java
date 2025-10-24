package com.greedy.level02.normal.student.model.vo;

public class StudentVo {

    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    public StudentVo() {
    }

    public StudentVo(int grade, int classroom, String name, double height, char gender) {
            this.grade = grade;
            this.classroom = classroom;
            this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void printInformation(){
        System.out.println(this.getGrade());
        System.out.println(this.getClassroom());
        System.out.println(this.getName());
        System.out.println(this.getHeight());
        System.out.println(this.getGender());
    }


}
