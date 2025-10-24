package com.chaewookim.section2.looping;

public class B_nestedFor {

    public void printGugudanFromTwotoNine() {

        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=======" + dan + "단 ======");
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }

    }

    public void printTriangleStar() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
