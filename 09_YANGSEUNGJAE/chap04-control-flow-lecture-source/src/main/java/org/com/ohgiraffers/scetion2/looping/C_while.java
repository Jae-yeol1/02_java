package org.com.ohgiraffers.scetion2.looping;

import java.util.Scanner;

public class C_while {
    public void testSimple() {
        int i = 0;
        while(i < 10) {
            System.out.println("출력 : " + (i + 1));
            i++;
        }
    }

    public void test(){
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("exit")){
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println(input);
        }

    }
}
