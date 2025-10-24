package com.swcamp.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {
        for (int i = 2; i < 10; i++) {
            System.out.println("=====" + i + "단" + "=====");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
    public void printTriangleStars() {
        System.out.print("출력할 줄 수를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
