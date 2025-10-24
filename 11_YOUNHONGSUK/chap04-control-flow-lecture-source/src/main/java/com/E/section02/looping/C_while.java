package com.E.section02.looping;

import java.util.Scanner;

public class C_while {

    Scanner sc = new Scanner(System.in);

    public void testWhile(){

        int i = 0;
        while(i < 10) {
            System.out.println("잠이 너무 온다");
            i++;
        }
    }

    public void testWhileEx(){

        String key = "";
        key = sc.next();
        while(!key.equals("exit")){
            System.out.println("keep typing boi");
            key = sc.next();
        }
        System.out.println("exited");
    }



}
