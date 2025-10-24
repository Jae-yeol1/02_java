package com.chaewookim.section2.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
    }

    public void testWhileExample() {
        /***
         * 키보드로 문자열을 입력받고 반복적으로 출력
         * 단, "exit"가 입력되면 반복 종료
         */

        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("입력: ");
            input = sc.nextLine();
            System.out.println(input);
        }
    }

    public void testSimpleDoWhileStatement() {
        int a = 0;

        do {
            System.out.println("그짓말이여 ");
        } while (a > 0);
    }

}
