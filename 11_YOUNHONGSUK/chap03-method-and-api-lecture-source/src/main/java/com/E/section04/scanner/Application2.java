package com.E.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("put number");
        int num = sc.nextInt();
        System.out.println("num = " + num);
// nextline이 nextInt같은 next다음에 오면 바로 전 next에서 받았던 enter를 가져온다
        // nextLine()을 사용해서 입력을 한 번 더 받게 함
        sc.nextLine();

        String str = sc.nextLine();

        System.out.println("str = " + str);
    }
}
