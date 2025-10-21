package com.E.section01.method;

public class Application3 {

    // static variable
    static int global = 10;

    public static void main(String[] args) {

        int local = 215;
        System.out.println(global);
        System.out.println(local);
        Application3 app = new Application3();
        app.age(local);

    }

    public void age (int x){
        System.out.println("you are " + x + "years old");

    }

}
