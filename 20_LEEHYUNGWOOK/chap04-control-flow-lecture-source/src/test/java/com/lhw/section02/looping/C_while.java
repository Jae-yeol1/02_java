package com.lhw.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("입력해주세요.");
            String inputString = sc.nextLine();
            if (inputString.equals("exit")) { break; }
            System.out.println("입력값: " + inputString);
        }
    }

    public void testSimpleDoWhileStatement() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("Do it!" + i);
            i++;
        } while (i<10);
    }
}
