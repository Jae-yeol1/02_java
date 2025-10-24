package com.swcamp.section02.looping;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement() {
        int i = 1;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }
    }

    public void testWhileExample() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("입력하세요: ");
            input = scanner.nextLine();
            System.out.println("입력받은 값: " + input);
        }
    }

    public void testSimpleDoWhileTest() {
        int i = 3;
        do {
            System.out.println("i = " + i);
        } while (i < 3);
    }
}
