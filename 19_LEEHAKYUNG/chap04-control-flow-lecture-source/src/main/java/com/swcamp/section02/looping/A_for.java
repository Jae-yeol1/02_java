package com.swcamp.section02.looping;

import java.util.Scanner;

public class A_for {
    // 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
    public void testSimpleForStatement() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
            String student1 = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student1 + "입니다.");
        }

        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public void test2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public void test3() {
        /*
        5 ~ 10 사이 난수를 발생시켜서
        1부터 발생한 난수까지의 합계를 구해보자.
        단, 반복문을 쓰지 말고!
         */
        int random = (int) (Math.random() * 6) + 5;
        int sum = (random * (random + 1)) / 2;
        System.out.println("sum = " + sum);
    }
}
