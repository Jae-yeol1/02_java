package com.lhw.section03.branching;

public class B_continue {
    /*4의 배수이면서 5의 배수인 값 출력*/
    public void testSimpleContinueStatement() {
        for (int i = 0; i < 100; i++) {
            if ( i%4 != 0 || i%5 != 0) continue;

            System.out.println("4와5의공통배수: " + i);
        }
    }

    public void testSimpleContinueStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            for (int su = 1; su <= 9; su++) {
                if(su%2==0) continue; // if(su<5) break; 와의 차이점.
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
    }

    public void testJumpContinue() {
        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("============="+dan+"단=============");
            for (int su = 1; su <= 9; su++) {
                if(su==4) continue label; // if(su<5) break; 와의 차이점.
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println();
        }
    }
}
