package com.ohgiraffers.section02.looping;

public class B_nestedFor {
    public void printGugudanFromTwotoNine() {
        for (int dan = 2; dan <=9; dan++){
            System.out.println("========" + dan + "단 =========");
            for(int su  = 1; su <= 9; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }

    public void printTriangleStars(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
