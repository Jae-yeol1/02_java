package com.hihi.section01.conditional;

import java.util.Scanner;

public class BIfElse {

    public void testSimpleIfEelsStatement(){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(" 짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    public void testNestedIfEelsStatement(){
        Scanner sc=new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num >0) {
            if (num % 2 == 0) {
                System.out.println(" 짝수 입니다.");
            } else {
                System.out.println("홀수 입니다.");
            }
        }
        else {
            System.out.println("입력한 숫자 음수임");
        }
    }

}
