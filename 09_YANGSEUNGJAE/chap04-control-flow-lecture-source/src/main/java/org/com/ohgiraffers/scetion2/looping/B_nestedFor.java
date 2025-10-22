package org.com.ohgiraffers.scetion2.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine() {
        for (int dan =2 ; dan <= 9 ; dan ++) {
            System.out.println("=========" + dan + "=========");
            for(int su = 1; su <= 9; su++){
                System.out.println(dan + " x " + su +" = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printstar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하세요 : ");
        int row = sc.nextInt();
        for (int i = 0; i < row ; i ++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
