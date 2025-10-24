package com.E.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printMulttable(){

        for(int dan = 2; dan <=9; dan++){
            System.out.println("====== " + dan + "단 =========");
            for(int su = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su)) ;
            }
            System.out.println();
        }

    }

    public void printStars(){
System.out.print("how many lines");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0; i < row ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
