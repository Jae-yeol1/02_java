package com.sekong.section04.Scanner;
import java.util.Scanner;
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
//        System.out.print("숫자를 입력해주세요 : ");
//        int num2 = sc.nextInt();
//        System.out.println("num2 : " + num2);
//        sc.nextLine(); // 버퍼 채우기 용도
//        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
//
//        String str2 = sc.nextLine();
//        System.out.println("str2 : " + str2);

        // next 메소드로 읽어봤지만 "공백"을 포함한 문자열이어서 입력 버퍼에 남아 있게 되면
        // 이후의 메소드의 타입이 맞지않아 java.util.InputMismatchException 발생

        System.out.println("문자열 입력: ");
        String str3 = sc.next();// nextLine()으로 바꾸면
        System.out.println("str3 : " + str3);

        System.out.println("숫자 입력: ");
        int num3 = sc.nextInt();
        System.out.println("num3 : " + num3);
    }
}
