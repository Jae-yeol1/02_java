package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("[" + dan + "단]");
            for(int i =1; i <=9; i++){
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println();
        }
        System.out.println("구구단 ez");
    }

    public void printTriangleStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 줄?");

        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
