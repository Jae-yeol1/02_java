package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class B {
    public void testSimpleIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if((num%2) ==0){
            System.out.println("짝수 입니다");
        }
        else{
            System.out.println("홀수 입니다");
        }
    }

    public void testNestedIfElseStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if((num%2) ==0){
            System.out.println("짝수 입니다");
        }
        else{
            System.out.println("홀수 입니다");
        }
    }
}
