package com.lhw.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {

        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
        }
    }

    public void downStairStar () {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 Star 층을 입력하세요");
        int inputNum = sc.nextInt();
        for (int i = 1; i<=inputNum ; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
