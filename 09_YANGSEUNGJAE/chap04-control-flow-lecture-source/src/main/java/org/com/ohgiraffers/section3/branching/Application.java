package org.com.ohgiraffers.section3.branching;

import org.com.ohgiraffers.scetion2.looping.A_for;

public class Application {
    public static void main(String[] args) {
        A_break a = new A_break();
//        a.break1();
//        a.break2();
        B_continure b = new B_continure();
        b.test1();
        b.test2();
    }
}
