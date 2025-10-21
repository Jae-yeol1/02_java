package com.ohgiraffers.section04.scanner;
import java.util.Scanner;
public class Application1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int ans=scanner.nextInt();
        System.out.println("입력한 정수는 : " + ans);

        System.out.print("나이를 입력하세요");
        int age = scanner.nextInt();
        System.out.println("입력한 나이는 : " + age);

        System.out.print("아무 문자나 입력 : ");
        char ch =scanner.next().charAt(0);
        System.out.println("입력한 문자는 : " + ch);


        // 문자
        // 문자만 입력받는 메소드는 Scanner에서 제공하지 않음르로
        // String에서 제공하는 charAt(index)메소드를 통해 문자를 분리해서 저장

        scanner.close();


    }
}
