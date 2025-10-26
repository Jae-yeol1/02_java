package com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args) {
        int num = 12;
        System.out.println("num1 = " + num);

        num = num + 3;// 공간 num = 값 num + 3
        System.out.println("num = " + num);

        num -= 5;
        System.out.println("num = " + num);

        num *= 2 ;
        System.out.println("num = " + num );

        num /= 2;
        System.out.println("num = " + num);

        num %= 2;
        System.out.println("num = " + num);

        // 주의
        num =- 5; //는
        // num =  -5 이다  equal(=) 기호 오른쪽은  대입 연산자가 아니라 마이너스 기호일 뿐이다
        System.out.println("num = " + num);
    }

}
