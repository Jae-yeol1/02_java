package com.E.section03.branching;

public class A_break {

    public void testeSimpleBreakStatement() {
        int sum = 0;
        int i = 1;
        while(true){
            sum += i++;
            if(i > 100) break;
        }
        System.out.println("sum = " + sum);
    }

    public void bTest(){
            for(int dan = 2; dan <=9; dan++){
                System.out.println("====== " + dan + "단 =========");
                for(int su = 1; su <= 9; su++){
                    if(su > 5) break;
                    System.out.println(dan + " * " + su + " = " + (dan * su)) ;
                }
                System.out.println();
            }
    }

    /*
    * break exits the nearest loop
    * we can exit a specific loop by giving a condition a name
    * and then giving a break statement a name for which loop to exit
    * */
    public void testJumpBreak(){
        label:
        for(;;){
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                if(i == 3) break label;
            }
        }

    }

}
