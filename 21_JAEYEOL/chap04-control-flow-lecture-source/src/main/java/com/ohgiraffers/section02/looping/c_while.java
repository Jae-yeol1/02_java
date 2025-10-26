package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class c_while {

    public void testSimpleWhile(){
        /*반복문에는
        초기식
        조건식
        증감식이 있다 .
        * */
        //
        int i = 0;
        //조건식
        while(i <10){
            System.out.println("출력 :"+ (i +1));
            //증감식
            i++;
        }
    }
    public void testWhileExit(){
    Scanner sc = new Scanner(System.in);
    String input = "";

        while(!input.equals("exit")){ // 문자열 exit 과 같지않은 > ! 부정
        System.out.print("문자열 입력");
        input = sc.nextLine();
        System.out.println("입력받은 값" + input);}
    }
}
