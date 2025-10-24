package com.E.section01.conditional;

import java.util.Scanner;

public class A_if {
public void testSimpleIfStatement(){
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 내놓아라 인간");
    int num = sc.nextInt();
    if(num%2 == 0){
        System.out.println("짝짝짝");
    }
    else System.out.println("홀홀홀");

    System.out.println("장비를 정지합니다");
}

public void testNestedIfStatement() {
    Scanner sc = new Scanner(System.in);

    System.out.print("순순히 숫자를 내놓으시면 유혈사태는 일어나지 않을 것입니다");

    int num = sc.nextInt();
    if (num % 2 == 0) {
        System.out.println("짝짝짞짞짞");

    }
    System.out.println("장비를 정지합니다 어... 안 되잖아?");
}


}
