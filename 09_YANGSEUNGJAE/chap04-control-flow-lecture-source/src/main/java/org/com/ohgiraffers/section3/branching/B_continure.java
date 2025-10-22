package org.com.ohgiraffers.section3.branching;

public class B_continure {
    public void test1() {
        for (int i = 1 ; i <= 100; i ++){
            if (i % 4 != 0 || i % 5 != 0) continue;
            System.out.println(i);

        }
    }

    public void test2() {
        for (int dan =2 ; dan <= 9 ; dan ++) {
            System.out.println("=========" + dan + "=========");
            for(int su = 1; su <= 9; su++){
                if(su % 2 == 0) continue;
                System.out.println(dan + " x " + su +" = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void test3() {
        label2:
        for (int dan =2 ; dan <= 9 ; dan ++) {
            System.out.println("=========" + dan + "=========");
            for(int su = 1; su <= 9; su++){
                if(su % 2 == 0) continue label2;
                System.out.println(dan + " x " + su +" = " + (dan * su));
            }
            System.out.println();
        }
    }
}
