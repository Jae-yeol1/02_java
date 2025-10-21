package org.com.ohgiraffers.section04.scanner;
import java.util.Scanner;
public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("숫자를 입력하세요 : ");
//        int num = sc.nextInt();
//        System.out.println("num = " + num);
//        sc.nextLine(); // nextInt()가 읽어가지 않은 개행문자를 입력 버퍼에서 읽어서 버린다.
//        System.out.print("문자열을 입력하세요 : ");
//        String str = sc.nextLine();
//        System.out.println("str = " + str);

        //next 메소드로 읽어왔지만 "공백"을 포함한 문자열이여서 입력 버퍼에 남아있게되면
        //이후의 메소드의 타입이 맞지않아 java.util.InputMismatchException이 발생

        System.out.print("문자열 입력 : ");
        String str2 = sc.next();
        System.out.println("str2 = " + str2);

        System.out.print("숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

    }
}
