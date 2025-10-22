package com.sekong.section3.branching;

public class Break {
    public void testSimpleBreakStatement(){
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            i++;
            if(i>100)
                break;
        }
        System.out.println(sum);
    }
    public void printGugudanFromTwotoNine(){

        for(int dan = 2; dan <= 9; dan++){
            for(int i = 1; i <= 9; i++){
                if(i > 5) break;
                System.out.println(dan + " X " + i + " = " + (dan*i));
            }
        }
    }
    public void testJumpBreak(){
        label:
        for(;;){
            for(int i = 1; i <= 9; i++){
                System.out.println(i);
                if(i == 3) break label;

            }
        }
    }
}
