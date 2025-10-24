package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
        // 초기식
        int i = 0;

        // 조건식
        while (i < 10) {

            // 반복할 내용
            System.out.println("출력 : " + (i + 1));
            // 증감식
            i++;
        }

        for(i = 0; i < 10; i++) {
            System.out.println("출력 : " + (i + 1));
        }

        // 반복할 내용

        // 증감식
    }

    public void testWhileExample() {

        /*
         *
         */

        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")) { // exit를 입력받기 전까지
            System.out.println("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값 : " + input);
        }

    }

    public void testSimpleDoWhileStatement() {

        do {
            System.out.println("조건이 false여도 최초 한 번은 무조건 동작한다.");
        } while(false);
    }


}
