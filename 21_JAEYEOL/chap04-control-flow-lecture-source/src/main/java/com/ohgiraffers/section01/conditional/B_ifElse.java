package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfStatment(){  // void 니까 값을 비게 두는것
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num % 2 == 0 ){
            System.out.print("짝수 입니다");
        }else {
            System.out.print("홀수입니다");
        }
    }

    public void testNestedIfStatment(){  // void 니까 값을 비게 두는것
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if(num > 0 ) {
            // 2. 내부 if/else 블록 시작
        }if(num % 2 == 0){
                System.out.print("양수이면서 짝수 입니다");
            }else {
                System.out.print("양수이면서 홀수입니다");
            }
    }
}
