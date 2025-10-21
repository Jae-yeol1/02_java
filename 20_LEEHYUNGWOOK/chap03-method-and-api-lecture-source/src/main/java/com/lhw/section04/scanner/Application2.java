package com.lhw.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /* Scanner 사용시 유의사항*/
        Scanner sc = new Scanner(System.in);

        // 유의사항 1 다른 입력 이후 nextLine()을 사용하면 Buffer에서 자기꺼 마냥 들고온다.
//        System.out.println("숫자 입력: ");
//        int num = sc.nextInt();
//        System.out.println("num = " + num);
//
//        System.out.println("문자열 입력: ");
//        String str = sc.nextLine(); //
//        System.out.println("str = " + str);

        // 해결방안
//        System.out.println("숫자 입력: ");
//        int num = sc.nextInt(); // buffer 채우기
//        System.out.println("num = " + num);
//
//        sc.nextLine(); // 담겨 있는 buffer 를 받고 buffer를 비운다.(Enter로 buffer 비우기)
//
//        System.out.println("문자열 입력: ");
//        String str = sc.nextLine(); // 다른 입력 이후 nextLine()을 사용하면 Buffer에서 자기꺼 마냥 들고온다.
//        System.out.println("str = " + str);

        /* 2. Next 메소드로 읽어왔지만, "공백"을 포함한 문자열이어서 입력 버퍼에 남아 있게 되면
        *   이후의 메소드의 타입이 맞지 않아 java.util.InputMistmatchException 발생
        * */
        System.out.println("문자열 입력: ");
        String str2 = sc.next();
        System.out.println("str2 = " + str2);

        System.out.println("숫자 입력: ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);
    }
}
