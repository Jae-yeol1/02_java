package com.swcamp.section02.increment;

public class Application2 {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;            // d = 7
        b = 2 * (-c + a++) - d;     // b = 1, a = 4
        c *= 2;                     // c = -2
        a = b++ + c;                // a = -1, b = 2

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
