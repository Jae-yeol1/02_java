package com.sekong.section2.looping;

import java.util.Scanner;

public class While {
    public void testSimpleWhileStatement(){
        // 초기식
        int i = 0;
        // 조건식
        while(i<10) {
            // 반복할 내용
            System.out.println("출력 : " + (i+1));
            i++;
        }
    }
    public void testWhileExample() {
        /* 키보드로 문자열을 받고 */
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            System.out.print("문자열 입력: ");
            input = sc.nextLine();
            System.out.println("입력받은 값: "+ input);
        }
    }

}
