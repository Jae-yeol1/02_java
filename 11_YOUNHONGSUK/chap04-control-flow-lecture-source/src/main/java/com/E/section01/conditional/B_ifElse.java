package com.E.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testNestedifElse() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("짝짝짞짞짞");
            } else System.out.println("홀수잖아 에잇");
            System.out.println("장비를 정지합니다 어... 안 되잖아?");
        }
    }
}


