package com.sekong.section2.looping;

import java.util.Scanner;

public class For {

    public void test(){
        Scanner sc = new Scanner(System.in);
        for( int i = 1 ; i <=10 ; i++) {
            System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i+ " 번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("10명의 학생의 이름을 모두 출력했습니다.");
    }
    public void test1(){
        int sum = 0;
        for(int i = 1 ; i <=10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public void test2(){
        int random = (int) (Math.random()*6)+5;
        System.out.println("random = " + random);
        int sum = 0;
        for(int i = 1; i <= random; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
