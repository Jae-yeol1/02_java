package com.lhw.section02.looping;

import java.util.Scanner;

public class A_for {
    // 1부터 10까지 1씩 증가시키며 i값을 출력
    public void testSimpleForStetement() {

    for (int i = 1; i<=10; i++) {
        System.out.println(i);
    }

    }

    public void test1() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=10; i++) {
            System.out.println(i + "번째 학생의 이름을 입력해 주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }
        System.out.println("학생 10명의 이름을 출력 완료 했습니다.");
    }

    public void test2(){
        int sum = 0;
        for (int i = 1; i<=10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void test3(){
        /*
        * 5 ~ 10 사이의 난수 발생
        * 1 부터 발생한 난수까지의 합계를 구해보자.
         */
        int randomN = (int) (Math.random() * 6) + 5;
        System.out.println("Random Num = " + randomN);

        int sum = 0;

        for (int i = 1; i<=randomN; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        System.out.println();
    }
}
