package com.ohgiraffers.section01.method;

public class Application3 {
    static int global=10;
    public static void main(String[] args) {
        int local=20;// 지역변수
        System.out.println("global = "+ global);
        System.out.println("local = "+ local);
        Application3 app = new Application3();
        app.methodA(local);
        app.methodB(local);
    }


    public static void methodA(int b){
        System.out.println(b);
        global++;
    }

    public void methodB(int a) {
        System.out.println("당신의 나이는 "+ a + "살 이군요!");
        global++;

    }
}
