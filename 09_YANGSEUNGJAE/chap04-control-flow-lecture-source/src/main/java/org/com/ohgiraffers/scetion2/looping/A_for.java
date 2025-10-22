package org.com.ohgiraffers.scetion2.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void practice() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번쨰 학생의 이름은" + student);
        }
    }

    public void test() {
        int result = 0;
        for (int i = 0; i < 10 ;i++) {
            result += i+1;
        }
        System.out.println(result);
    }
    
    public void test2() {
        int random = (int) (Math.random() * 6) + 5;
        int sum = 0;
        for (int i = 0; i <= random; i++) {
            sum += i +1 ;
        }
        System.out.println("sum = " + sum);
    }
}
