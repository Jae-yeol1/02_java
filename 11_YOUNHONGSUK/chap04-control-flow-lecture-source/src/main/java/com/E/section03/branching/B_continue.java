package com.E.section03.branching;

public class B_continue {

    public void testContinue(){
        for(int i = 0; i < 100; i++){
            if(i % 4 == 0 && i % 5 == 0){
                System.out.println(i);
            }
            else continue;
        }
    }
    public void cTest(){
        for(int dan = 2; dan <=9; dan++){
            System.out.println("====== " + dan + "단 =========");
            for(int su = 1; su <= 9; su++){
                if(su % 2 == 0) continue;
                System.out.println(dan + " * " + su + " = " + (dan * su)) ;
            }
            System.out.println();
        }
    }
}
