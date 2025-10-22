package com.sekong.section2.looping;

import java.util.Scanner;

public class NestLoop {
    public void printGugudanFromTwotoNine(){

        for(int dan = 2; dan <= 9; dan++){
            for(int i = 1; i <= 9; i++){
                System.out.println(dan + " X " + i + " = " + (dan*i));
            }
        }
    }

    public void trangleStar(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void trangleStar2(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
