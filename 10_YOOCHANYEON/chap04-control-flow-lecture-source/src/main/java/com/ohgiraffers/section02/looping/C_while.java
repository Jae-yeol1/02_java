package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
        // 초기식
        int i = 0;
        // 조건식
        while(i < 10) {

            //반복할 내용
            System.out.println("출력 : " + (i + 1));
            // 증감식
            i++;
        }
    }

    public void testWhileExample() {
        /*
        키보드로 문자열을 입력 받고 반복적으로 출력
        단, "exit"가 입력되면 반복을 종료
         */

        Scanner sc = new Scanner(System.in);

        String input = "";


        while (!input.equals("exit")) {
            System.out.println("계속 말해");
            input = sc.nextLine();
            System.out.println(input + "라고?");
        }
        System.out.println("잘 있어");
    }

    public void testDoWhileStatement() {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("조건이 false여도 한번은 무조건 동작");
        } while(false);
    }
}
