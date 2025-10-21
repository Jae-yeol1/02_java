package com.E.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() called ");

        Application6 app = new  Application6();
        String a = tM("졸려");
        System.out.println("main() terminated");
        System.out.println(a);
    }

    public static String tM(String state){
        System.out.println("현재 매우" + state);
        return state;
    }
}
