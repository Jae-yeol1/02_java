package com.hihi.section02.looping;

import java.util.Scanner;

public class BnestedFor {

    public void printGugudanFromTwoToNine(){

        for (int dan = 2; dan <= 9; dan++){
            System.out.println("======" + dan + "========");
            for (int su = 1; su <=9; su ++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }


    public void printTriangleStars(){
        System.out.println("출력할 줄 수를 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 0; i< row;  i ++){      //행
            for(int j = 0; j < i; j++){     //열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
