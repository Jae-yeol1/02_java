package org.com.ohgiraffers.section3.branching;

public class A_break {
    public void break1() {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i++;
            if (i > 100) break;
        }
        System.out.println("sum = " + sum);
    }

    public void break2() {
        for (int dan =2 ; dan <= 9 ; dan ++) {
            System.out.println("=========" + dan + "=========");
            for(int su = 1; su <= 9; su++){
                if(su > 5) break;
                System.out.println(dan + " x " + su +" = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void break3() {
        label:
        for (;;) {
            for(int i = 0; i < 10 ; i++){
                System.out.println(i);
                if (i == 3) break label;
            }
        }
    }
}

