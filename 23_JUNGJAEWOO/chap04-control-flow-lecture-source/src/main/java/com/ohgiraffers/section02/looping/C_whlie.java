package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_whlie {

    public void testSimpleWhileStatement() {
        // 초기식
        int i = 0;
        // 조건식
        while(i<10){
            // 반복할 내용
            System.out.println("출력 : " + (i+1));
            // 증감식
            i++;
        }
    }
    public void testSimpleWhileExample(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값: " + input);
        }
    }
}
