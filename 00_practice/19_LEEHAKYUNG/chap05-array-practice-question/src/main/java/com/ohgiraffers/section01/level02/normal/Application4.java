package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        Scanner sc = new Scanner(System.in);
//        System.out.print("시작을 원하시면 아무키나 입력해주시고 종료를 원하시면 end를 입력하세요 : ");
//        String input1 = sc.nextLine();
//        if (input1.equals("end")){ return; }
        int[] historyLotto = new int[45];
        int count = 1;
        int Lotto = 0;

        while (count < 46) {
            System.out.print("시작을 원하시면 아무키나 입력해주시고 종료를 원하시면 end를 입력하세요 : ");
            String input2 = sc.nextLine();
            if (input2.equals("end")) {
                return;
            }
            Lotto = (int) (Math.random() * 45);
            if (historyLotto[Lotto] == 0) {
                System.out.println(Lotto + 1);
                count++;
                historyLotto[Lotto] = 1;
            }
            else {
                while (historyLotto[Lotto] != 0) {
                    Lotto = (int) (Math.random() * 45);
                }
                System.out.println("중복 발생 및 해결");
                historyLotto[Lotto] = 1;
                count++;
            }
        }
        System.out.println("보유한 공이 다 소진되었습니다.");
    }
}
