package com.ohgiraffers.section04.scanner;
import java.util.Scanner;

public class Application02 {

    public static void main(String [] args) {
        // Scanner 사용 시 유의 사항
        Scanner sc = new Scanner(System.in);

//        System.out.println("숫자 : ");
//        int num = sc.nextInt();
//        System.out.println("당신의 정신 연령 : " + num);
//
//        sc.nextLine();      // nextInt()가 읽어가지 않는 개행 문자를 입력 버퍼에서 읽어서 버리기 위함
//
//        System.out.println("말해봐");
//        String str = sc.nextLine();
//        System.out.println("뭐라고? " + str + "라고?");

        // 2. next() 메소드로 읽어왔지만 "공백"을 포함한 문자열이라 입력 버퍼에 남아있는 경우
        // 이후의 메소드의 타입이 맞지 않아 java.util.InputMismatchException 생성
        System.out.println("다시 말해봐");
        String str2 = sc.nextLine();    // "공백 포함"이 예상된느 문자열은 nextLine()으로 입력 받기
        System.out.println(str2 + "라고??");

        System.out.println("숫자 말해봐");
        int num2 = sc.nextInt();
        System.out.println(num2 + "살처럼 보여요");

    }
}
